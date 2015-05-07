/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericQueuePackage;
import java.lang.Object;
/**
 *
 * @author Kevin
 */
public class GenericQueue<E> {
    private int maxSize;
    private E[] queArray;
    private int front;
    private int rear;
    private int size;
    
    public GenericQueue(int s){
        maxSize = s;
        queArray = (E[]) new Object[s];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void insert(E e){
        if(rear == maxSize - 1){
            rear = -1;
        }
        queArray[++rear] = e;
        size++;
    }
    
    public E remove(){
        E temp = queArray[front++];
        if(front == maxSize){
            front = 0;
        }
        size--;
        return temp;
    }
}
