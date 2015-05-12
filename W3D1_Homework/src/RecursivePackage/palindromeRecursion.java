/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursivePackage;

/**
 *
 * @author Kevin
 */
public class palindromeRecursion {
    
    public static boolean isPalindrome(String s){
        if(s.length() < 2){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    
    public static void main(String[] args){
        System.out.println(isPalindrome("abcba"));
    }
}
//true