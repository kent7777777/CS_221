/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class NodeOperation {
    private Node first;
    private Node last;
    public NodeOperation(){
        first = null;
        last = null;
    }
    
    public void insertFirst(String s){
        Node newNode = new Node(s);
        if(first == null){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }
    
    public String deleteFirst(){
        String temp = first.data;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }
    
    public void insertLast(String s){
        Node newNode = new Node(s);
        if(first == null){
            first = newNode;
        }else{
            last.next = newNode;
        }
        last = newNode;
    }
    
    public void displayAll(){
        Node current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public int find(String s){
        Node current = first;
        int i = 0;
        while(true){
            if(current.data == s){
                return i;
            }else if(current == null){
                return -1;
            }
            current = current.next;
        }
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
    
    
}
