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
public class LinearRecursion {
    public static boolean linearSearch(int[] a, int num, int start){
        if(start == a.length - 1){
            return false;
        }
        if(a[start] == num){
            return true;
        }else{
            return linearSearch(a, num, start + 1);
        }
    }
    
    public static void main(String [] args){
        int[] b = {1, 2, 3, 4, 1, 4};
        System.out.println(linearSearch(b, 3, 0));
    }
}
//true