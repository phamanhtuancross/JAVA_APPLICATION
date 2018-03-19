/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamanhtuan
 */

class TrieNode{
    public TrieNode[] children = new TrieNode[DataSizeDefine.ALPHABET_SIZE];
    public boolean isEndOfWord;
    
    public TrieNode(){
        isEndOfWord = false;
        for(int indexOfChild  = 0; indexOfChild < DataSizeDefine.ALPHABET_SIZE; indexOfChild++){
            children[indexOfChild] = null;
        }
    }
    
    
}
public class Trie {
    
    public List<String> listWordAutoCompleted = new ArrayList<>();
    public TrieNode root;
    DataLetterDefine letters = new DataLetterDefine();
    public Trie() {
        root = new TrieNode();
    }
    
    
    public  void insert(String key){
        
       
        int level;
        int length = key.length();
        int index;
      
        TrieNode pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            
            //System.out.println("LETTER : " + key.charAt(level)+".");
            try {
                
                index = (int) letters.listLettersIndexs.get(key.charAt(level));

                //System.out.println("INDEX :" + index);
            
                if(index < DataSizeDefine.ALPHABET_SIZE){            

                    if (pCrawl.children[index] == null)
                        pCrawl.children[index] = new TrieNode();

                    pCrawl = pCrawl.children[index];
                }
            } catch (Exception e) {
                System.out.println("EXEPTION :" + key.charAt(level));
            }

        }
      
        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }
    
    public  boolean search(String key){
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
      
        for (level = 0; level < length; level++){
            
            index = (int) letters.listLettersIndexs.get(key.charAt(level));
      
            if (pCrawl.children[index] == null)
                return false;
      
            pCrawl = pCrawl.children[index];
        }
      
        return (pCrawl != null && pCrawl.isEndOfWord);
    }
    
    
    public boolean  isLastNode(TrieNode curentNode){
        for(int indexOfNode = 0; indexOfNode <DataSizeDefine.ALPHABET_SIZE; indexOfNode++){
            if(curentNode.children[indexOfNode] != null){
                return  false;
            }
        }
        return true;
    }
    
    public void suggestionsRec(TrieNode  currNode, String currPrefix)
    {
        // found a string in Trie with the given prefix
        if (currNode.isEndOfWord)
        {
            //System.out.println(currPrefix);
            listWordAutoCompleted.add(currPrefix);
        }

        // All children struct node pointers are NULL
        if (isLastNode(root))
            return;

        for (int i = 0; i < DataSizeDefine.ALPHABET_SIZE; i++)
        {
            if (currNode.children[i] != null)
            {
                
                // append current character to currPrefix string
                currPrefix += letters.listIndexsLetters.get(i);

                // recur over the rest
                suggestionsRec(currNode.children[i], currPrefix);
                StringBuilder temp = new StringBuilder(currPrefix);
                temp.deleteCharAt(temp.length() -1);
                currPrefix = temp.toString();
            }
        }

    }
    public List<String> getListWordsAutoSuggestions(String query){
        
        listWordAutoCompleted.removeAll(listWordAutoCompleted);
        TrieNode pCrawl = root;

        // Check if prefix is present and find the
        // the node (of last level) with last character
        // of given string.
        int level;
        int n = query.length();
        for (level = 0; level < n; level++)
        {
            if(letters.listLettersIndexs.get(query.charAt(level))!= null){

                int index = (int) letters.listLettersIndexs.get(query.charAt(level));
                // no string in the Trie has this prefix
                if(pCrawl.children[index] == null){
                    return listWordAutoCompleted;
                }


                pCrawl = pCrawl.children[index];
            }
        }

        // If prefix is present as a word.
        boolean isWord = (pCrawl.isEndOfWord == true);

        // If prefix is last node of tree (has no
        // children)
        boolean isLast = isLastNode(pCrawl);

        // If prefix is present as a word, but
        // there is no subtree below the last
        // matching node.
        if (isWord && isLast)
        {
            //System.out.println(query);
            listWordAutoCompleted.add(query);
            return listWordAutoCompleted;
        }

        // If there are are nodes below last
        // matching character.
        if (!isLast)
        {
            String prefix = query;
            suggestionsRec(pCrawl, prefix);
            return listWordAutoCompleted;
        }
        return listWordAutoCompleted;
    }
    
}
