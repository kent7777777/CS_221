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
public class decimalToBinary {
    public static String DTB(int num){
        if(num == 0 || num == 1){
            return "" + num;
        }
        return num%2 + DTB(num/2);
    }
    public static void main(String[] args){
        System.out.println(DTB(45));
    }
}
//101101