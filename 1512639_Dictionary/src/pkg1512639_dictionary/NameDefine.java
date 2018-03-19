/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.awt.Color;

/**
 *
 * @author phamanhtuan
 */
public class NameDefine {
   public static String NAME_FILE_ENGLISH_VIETNAMES_DICTIONARY = "Anh_Viet.xml";
   public static String NAME_FILE_VIETNAMES_ENGLISH_DICTIONARY = "Viet_Anh.xml";
   public static String NAME_FAVORITEWORDS = "Favorite_Words_Data.txt";
   public static String NAME_HISTORY_SEARCH = "History_Search.txt";
   
   
}

class TagNameDefine{
    public static String RECORD  = "record";
    public static String WORD    = "word";
    public static String MEANING = "meaning";
}

enum DictionaryType{
    ENGLISH_VIETNAMES,
    VIETNAMES_ENGLISH
}


class LetterDefine{
    public static String spicialleters = "-@!#$%^&*()_+{}/.,' 0123456789[]=<>:;?";
    public static String letters = "aảàáạãăẳằắặẵâẩầậẫbcdđeẻèéẹẽêểềếệễghiỉìíịĩklmnoỏòóọõôổồốộỗơởờớợỡpqrstuủùúụũưửừứựữvxyỷyỳýỵỹzwfjöəûấ" + spicialleters;
}
class DataSizeDefine{
    public static int ALPHABET_SIZE = LetterDefine.letters.length() * 2;
    public static char START_CHARACTER = ' ';
    
}

class ButtonColorDefine{
    public static Color TRANSLATE_BUTTON_COLOR = new Color(231, 37, 100,150);
    public static Color FAVORITE_BUTTON_COLOR = new Color(253, 151, 39,150);
    public static Color HISTORY_BUTTON_COLOR = new Color(50, 232, 183,150);
    public static Color DEFAULT_BUTTON_COLOR = new Color(0,0,0,50);
    public static Color CLICKED_BUTTON_COLOR = new Color(250,250,250,100);
    public static Color ENTERED_BUTTON_COLOR = new Color(52, 254, 254,100);
    public static Color PRESSED_BUTTON_COLOR = new Color(231, 37, 100,100);
}

enum ButtonType{
    TRANSLATE_BUTTON,
    FAVORITE_BUTTON,
    HISTORY_BUTTON
}
