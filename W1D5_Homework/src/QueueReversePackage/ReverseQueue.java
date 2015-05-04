/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueReversePackage;

import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class ReverseQueue {
    public static void main(String[] arg){
        RQueue queue = new RQueue(10);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        long[] temp = new long[queue.getMaxSize()];
        for(int i = 0; i < queue.getnItems(); i++){
            temp[i] = queue.remove();
        }
        for(long i : temp){
            queue.insert(i);
        }
        queue.printAll();
    }
}
