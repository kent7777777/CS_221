


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
public class Question2 {
    public static void main(String[] args){
        
        double num = 11.56;
        double total = num;
        int dollars = (int) (num - (num % 1));
        num = num - dollars;
        int quarters = (int) ((num - (num % .25))/.25);
        num = num - .25*(double) quarters;
        int dimes = (int) ((num - (num % .1))/.1);
        num = num - .1*(double) dimes;
        int nickels = (int) ((num - (num % .05))/.05);
        num = num - .05*(double) nickels;
       
        int pennies = (int) (num * 100);
        
        
        System.out.println("Your amount of " + total + " consists of");
        System.out.println(dollars);
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);
    }
}

//Your amount of 11.56 consists of
//11
//2
//0
//1
//1
