/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.marconivr.test;


import it.marconivr.mapStringClassObjet.MapStringClassObject;
import java.util.Map;
import static it.marconivr.mapStringClassObjet.MapStringClassObject.mapStringClassObject;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ptom
 */
public class MainTest {
    
    public static void  main () throws IOException, FileNotFoundException, 
                                        ClassNotFoundException, InstantiationException,
                                        IllegalAccessException {
    
       Map<String,Object> stringObj = MapStringClassObject.mapStringClassObject("controller.xml");
    
    
    }
}
