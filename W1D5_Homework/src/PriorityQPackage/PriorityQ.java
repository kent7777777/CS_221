/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQPackage;

/**
 *
 * @author Kevin
 */
public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s)          
       {
       maxSize = s;
       queArray = new long[maxSize];
       nItems = 0;
       }

    public void insert(long item)    
       {
       queArray[nItems++] = item;
       } 

    public long remove(){
        long answer = queArray[0];
        int current = 0;
        int j;
        for(int i = 0; i < nItems; i++){
            if(answer < queArray[i]){
                answer = queArray[i];
                current = i;
            }
        }
        for(j = current; j < nItems && j < (queArray.length - 1); j++){
                    queArray[j] = queArray[j + 1];
                }
        
        nItems--;
        return answer;
    }          
       

    public long peekMin()            
       { return queArray[nItems-1]; }

    public boolean isEmpty()        
       { return (nItems==0); }

    public boolean isFull()          
       { return (nItems == maxSize); }

}

