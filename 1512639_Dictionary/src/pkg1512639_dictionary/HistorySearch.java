/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author phamanhtuan
 */
public class HistorySearch implements Serializable{
    
    public Word word;
    public int frequence = 0;
    public Date time = null;

    public HistorySearch() {
        this.word = new Word();
        this.time = new Date();
        this.frequence = 0;
    }
    
    public HistorySearch(Word _word, Date _time,int _frequence){
        this.word = _word;
        this.time = _time;
        this.frequence = _frequence;
    }
}
