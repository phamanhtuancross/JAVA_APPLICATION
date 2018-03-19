/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.io.Serializable;

/**
 *
 * @author phamanhtuan
 */
public class Word  implements Serializable{
    public String word;
    public DictionaryType typeOfDictionary;
    
    public  Word(){
        this.word = "";
        this.typeOfDictionary = null;
    }
    
    
    public Word(String word,DictionaryType tyeOfDictionary){
        this.word = word;
        this.typeOfDictionary = tyeOfDictionary;
    }
    
}
