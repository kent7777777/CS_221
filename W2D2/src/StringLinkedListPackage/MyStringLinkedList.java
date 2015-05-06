/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringLinkedListPackage;

/**
 *
 * @author Kevin
 */
public class MyStringLinkedList {
    public class Node{
        String value;
        Node next;
        Node previous;
        
        Node(String value){
            this.value = value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    Node first;
    Node last;
    
    public MyStringLinkedList(){
        first = null;
        last = null;
    }
    
    public void addFront(String item){
        Node temp = new Node(item);
        if(first != null){
            first.previous = temp;
        }else{
            last = temp;
        }
        temp.next = first;
        first = temp;
    }
    
    public void addLast(String item){
        Node temp = new Node(item);
        if(first == null){
            first = temp;
        }else{
            temp.previous = last;
            last.next = temp;
        }
        last = temp;
    }
    
    public int size(){
        Node current = first;
        int i = 0;
        while(current != null){
            i++;
            current = current.next;
        }
        return i;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public Node findLast(){
        return last;
    }
    
    public Node findItem(String str){
        Node current = first;
        while(current != null){
            if(current.toString().equals(str)){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    public void deleteNode(Node n){
        Node current = first;
        while(current != null){
            if(current.equals(n)){
                current.previous.next = current.next;
                current.next.previous = current.previous;
                return;
            }
            current = current.next;
        }
    }
    
    public void printReverse(){
        Node current = first;
        while(current != null){
            System.out.println(current.toString());
            current = current.next;
        }
    }
}
