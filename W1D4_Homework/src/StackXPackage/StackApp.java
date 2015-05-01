/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackXPackage;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class StackApp {
    public static void main(String[] args){
        StackX theStack = new StackX(10);
        StackX theStack2 = new StackX(10);
        StackX theStack3 = new StackX(10);
        theStack2.push(20);
        theStack2.push(40);
        theStack3.push(60);
        theStack3.push(80);
        for(long i = 0; i < theStack2.size(); i++){
            theStack.push(theStack2.pop());
        }
        
        for(long i = 0; i < theStack2.size(); i++){
            theStack.push(theStack3.pop());
        }
        
        Scanner in = new Scanner(System.in);
        String answer;
        
        while(!theStack.isEmpty()){
            System.out.println("push, pop, or peek");
            answer = in.nextLine();
            System.out.println(answer);
            if(answer.equals("push")){
                System.out.println("push what?");
                theStack.push(in.nextLong());
            }else if(answer.equals("pop")){
                System.out.println(theStack.pop());
            }else if(answer.equals("peek")){
                System.out.println(theStack.peek());
            }
        }
        System.out.println(" ");
    }
}

/*
run:
push, pop, or peek
push
push
push what?
10
push, pop, or peek

push, pop, or peek
pop
pop
10
push, pop, or peek
peek
peek
80
push, pop, or peek
*/