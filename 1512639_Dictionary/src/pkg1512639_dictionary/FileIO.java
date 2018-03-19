/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author phamanhtuan
 */
public class FileIO {

    public static HashMap<String,String> readListRecordsFromFileVietnamesEnglishDictionary(){
        return readXMLFileDictionary(NameDefine.NAME_FILE_VIETNAMES_ENGLISH_DICTIONARY);
    }
    
    public static HashMap<String,String> readListRecordsFromFileEnglishVietnamesDictionary(){
        return readXMLFileDictionary(NameDefine.NAME_FILE_ENGLISH_VIETNAMES_DICTIONARY);
    }
    
    
    private static  HashMap<String,String> readXMLFileDictionary(String nameOfFile){
        
        HashMap<String,String> listRecords = new HashMap<>();
        try {
            
            //impprt data form file xml
            File xmlFile = new File(nameOfFile);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            
            //import to list records
            NodeList records = doc.getElementsByTagName(TagNameDefine.RECORD);
            int numberOfRecords = records.getLength();
            
            for(int indexOfChidNode = 0; indexOfChidNode < numberOfRecords; indexOfChidNode++){
                
                Node currentNode = records.item(indexOfChidNode);
                if(currentNode.getNodeType() == Node.ELEMENT_NODE){

                    Element element = (Element) currentNode;
                    String word = element.getElementsByTagName(TagNameDefine.WORD).item(0).getTextContent();
                    String meaning = element.getElementsByTagName(TagNameDefine.MEANING).item(0).getTextContent();
                    listRecords.put(word, meaning);
                }
            }
        } 
        catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listRecords;
    }
    
    public static<T> List<T> readObjects(String nameFile){
        
        List<T> listWords = null;
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
            
        try {
           
            fis = new FileInputStream(new File(nameFile));
            ois = new ObjectInputStream(fis);
            
            listWords = (List<T>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(listWords == null){
            listWords = new ArrayList<>();
        }
        return listWords;
    }
    
    public static<T> void writeObjects(List<T> listFavoriteWords,String nameFile){
        try {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            
            fos = new FileOutputStream(new File(nameFile));
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(listFavoriteWords);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
