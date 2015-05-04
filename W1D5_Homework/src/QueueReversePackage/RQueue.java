/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueReversePackage;

/**
 *
 * @author Kevin
 */
public class RQueue {
    private int maxSize;
    private long[] queArray;
    private int nItems;
    private int front;
    private int rear;

    public RQueue(int s)          
       {
       maxSize = s;
       queArray = new long[maxSize];
       nItems = 0;
       front = 0;
       rear = -1;
       }

    public void insert(long item){
        if(rear == maxSize-1){
            rear = -1;
        }
        queArray[++rear] = item;
        nItems++;
    }
    
    public long remove(){
        long temp = queArray[front++];
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    
    public void printAll(){
        for(long i : queArray){
            System.out.print(i);
        }
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public long[] getQueArray() {
        return queArray;
    }

    public void setQueArray(long[] queArray) {
        this.queArray = queArray;
    }

    public int getnItems() {
        return nItems;
    }

    public void setnItems(int nItems) {
        this.nItems = nItems;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }
    
   
}
