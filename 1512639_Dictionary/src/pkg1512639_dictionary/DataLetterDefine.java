/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author phamanhtuan
 */
public class DataLetterDefine {
    public Map listLettersIndexs = new HashMap();
    public Map listIndexsLetters  = new HashMap();
    
    private static  DataLetterDefine instance;

    public static DataLetterDefine getInstance() {
        if(instance == null){
            instance = new DataLetterDefine();
        }
        return instance;
    }

    public static void setInstance(DataLetterDefine instance) {
        DataLetterDefine.instance = instance;
    }
    
    
    public DataLetterDefine(){   
        int value = 0;
        for(int i = 0; i <  LetterDefine.letters.length(); i++){
            
            char character = LetterDefine.letters.charAt(i);
            listLettersIndexs.put(character, value);
            listIndexsLetters.put(value, character);
            
            if(!LetterDefine.spicialleters.contains(character+"")){
            
                ++value;
                char upperCharacter = Character.toUpperCase(character);
                listLettersIndexs.put(upperCharacter, value);
                listIndexsLetters.put(value, upperCharacter);
                
            }
            value++;
        }
        
        
    }
}
