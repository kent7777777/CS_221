/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashPackage;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Kevin
 */
public class preDefined {
    public static void main(String[] args){
        Hashtable<Integer, String> hash = new Hashtable<>();
        hash.put(10, "hi");
        hash.put(1, "bye");
        hash.put(2, "me");
        Enumeration em = hash.keys();
        
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
    }
}
