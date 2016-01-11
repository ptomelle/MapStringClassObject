package it.marconivr.mapStringClassObjet;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe responsabile solo di leggere un file xml di property 
 * Strng , nome qualificato di una classe
 * e trasformarlo in una map  string obj istanza del nome della classe
 * @author ptom
 */
public class MapStringClassObject {
    
    public static Map<String,Object> mapStringClassObject ( String fileName) 
            throws FileNotFoundException, IOException, ClassNotFoundException, 
                   InstantiationException, IllegalAccessException      
    {
        Properties pro = new Properties();
        InputStream in = new FileInputStream(fileName);
        pro.loadFromXML(in);
        in.close();
        
        Map<String, Object> stringObject = new HashMap<>();
        // properties hanno già il keySet specializzato
        for (String nameSingleton : pro.stringPropertyNames()) {
            String classNameQualified = pro.getProperty(nameSingleton);
            Class c = Class.forName(classNameQualified);
            Object obj = c.newInstance(); // costruttore senza parametri
            stringObject.put(nameSingleton, obj);
        }
        
        return stringObject;
    }
            
    
    
}
