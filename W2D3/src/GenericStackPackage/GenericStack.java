/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericStackPackage;

/**
 *
 * @author Kevin
 */
public class GenericStack<E> {
    class Node{
        Node next;
        E data;
        public Node(E e){
            next = null;
            data = e;
        }
    }
    
    private Node first;
    
    public GenericStack(){
        first = null;
    }
    public void insert(E e){
        Node newNode = new Node(e);
        newNode.next = first;
        first = newNode;
    }
    
    public E delete(){
        E temp = first.data;
        first = first.next;
        return temp;
    }
    
    public void printStack(){
        Node current = first;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static void main(String[] args){
        GenericStack stack = new GenericStack();
        stack.insert("hi");
        stack.insert(1);
        stack.insert('i');
        stack.printStack();
    }
}
