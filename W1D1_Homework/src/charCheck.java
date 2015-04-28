


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class charCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        int num = (int)ch;
        if(num > 64 && num < 91){
            System.out.println("Uppercase");
        }else if(num > 96 && num < 123){
            System.out.println("Lowercase");
        }else if(num > 47 && num < 58){
            System.out.println("Number");
        }else{
            System.out.println("Special Character");
        }
    }
}

//Uppercase