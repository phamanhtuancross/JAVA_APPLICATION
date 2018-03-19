/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.util.HashMap;

/**
 *
 * @author phamanhtuan
 */
public class DictionaryController {
    
    private HashMap<String,String> listRecordsOfEnglish_VietnamesDictionary = null;
    private HashMap<String,String> listRecordsOfVietnames_EnglishDictionary = null;

    public Trie listWordEnglishVietnames = new Trie();
    public Trie listWordVietnamesEnglish = new Trie();
    
    
    
    //Constructor
    public DictionaryController() {
        listRecordsOfEnglish_VietnamesDictionary = FileIO.readListRecordsFromFileEnglishVietnamesDictionary();
        listRecordsOfVietnames_EnglishDictionary = FileIO.readListRecordsFromFileVietnamesEnglishDictionary();
        
        initialTrieWord(DictionaryType.ENGLISH_VIETNAMES);
        initialTrieWord(DictionaryType.VIETNAMES_ENGLISH);
        
    }
    
    public void initialTrieWord(DictionaryType typeOfDictionary){
        switch(typeOfDictionary){
            case ENGLISH_VIETNAMES:
            {
                for(String key : listRecordsOfEnglish_VietnamesDictionary.keySet()){
                    //System.out.println(key);
                    listWordEnglishVietnames.insert(key);
                }
                break;
            }
            case VIETNAMES_ENGLISH:
            {
                for(String key : listRecordsOfVietnames_EnglishDictionary.keySet()){
                    //System.out.println(key);
                    listWordVietnamesEnglish.insert(key);
                }
                break;
            }
            default: break;
        }
        
    }
    
    public String getMeanOfWord(String word,DictionaryType typeOfDictionary){
        
        String resultString = null;
        
        switch(typeOfDictionary){
            case ENGLISH_VIETNAMES:{
                if(listRecordsOfEnglish_VietnamesDictionary.containsKey(word)){
                    resultString = listRecordsOfEnglish_VietnamesDictionary.get(word);
                }
                break;
            }
            
            case VIETNAMES_ENGLISH:{
                if(listRecordsOfVietnames_EnglishDictionary.containsKey(word)){
                    resultString = listRecordsOfVietnames_EnglishDictionary.get(word);
                }
                break;
            }
            
            default: break;
        }
        
        return resultString;
    }
}
