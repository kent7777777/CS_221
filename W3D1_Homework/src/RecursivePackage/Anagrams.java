/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursivePackage;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Anagrams {
    public static boolean isAnagrams(String s1, String s2){
        String[] list1 = s1.split("");
        String[] list2 = s2.split("");
        String temp;
        for(int i = 0; i < (s1.length() - 1); i++){
            if(list1[i].charAt(0) > list2[i + 1].charAt(0)){
                temp = list1[i];
                list1[i] = list1[i + 1];
                list1[i + 1] = temp;
            }
            if(list2[i].charAt(0) > list2[i + 1].charAt(0)){
                temp = list2[i];
                list2[i] = list2[i + 1];
                list2[i + 1] = temp;
            }
        }
        if(list1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        System.out.println(isAnagrams("honey", "neyoh"));
    }
}
