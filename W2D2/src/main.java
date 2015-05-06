/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertAfter(10, 2);
        list.insertAfter(111, 4);
        list.delete(10);
        list.displayForward();
        list.deleteFirst();
        list.deleteLast();
        list.displayBackward();
    }
}
