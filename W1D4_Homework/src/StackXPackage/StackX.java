/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackXPackage;

/**
 *
 * @author Kevin
 */
public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public StackX(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    
    public void push(long j){
        if(stackArray.length != top)
            stackArray[++top] = j;
    }
    
    public long pop(){
        if(top != -1)
            return stackArray[top--];
        return -1;
    }
    
    public long peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    
    public int size(){
        return (top + 1);
    }
    
    public boolean isIn(long l){
        for(long i : stackArray){
            if(i == l){
                return true;
            }
        }
        return false;
    }
    
    public void display(){
        for(long i : stackArray){
            System.out.print(i + " ");
        }
    }
    
    public void clear(){
        long[] temp = new long[stackArray.length];
        stackArray = temp;
    }
    
    
}
