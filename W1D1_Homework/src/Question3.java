/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Question3 {
    public static void main(String[] args){
        int num = 234958739;
        int odd = 0;
        int even = 0;
        int zero = 0;
        while(num > 0){
            if((num % 10) == 0){
                zero += 1;
            }else if((num % 10) % 2 == 0){
                even += 1;
            }else{
                odd += 1;
            }
            
            num = num/10;
        }
        System.out.println("Odds: " + odd);
        System.out.println("Evens: " + even);
        System.out.println("Zeros: " + zero);
    }
}
//Odds: 6
//Evens: 3
//Zeros: 0