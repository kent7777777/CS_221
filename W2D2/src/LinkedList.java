/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class LinkedList{
    public class Link{
        int data;
        Link next;
        Link pre;
        public Link(int data){
            this.data = data;
            next = null;
        }
        
    }
    private Link first;
    private Link last;
    public LinkedList(){
        first = null;
        last = null;
    }
    
    public void insertFirst(int i){
        Link temp = new Link(i);
        if(first != null){
            first.pre = temp;
        }else{
            last = temp;
        }
        temp.next = first;
        first = temp;
        
    }
    
    public void insertLast(int i){
        Link temp = new Link(i);
        if(first == null){
            first = temp;
        }else{
            temp.pre = last;
            last.next = temp;
        }
        last = temp;
    }
    
    public int deleteFirst(){
        int temp = first.data;
        first.next.pre = null;
        first = first.next;
        return temp;
    }
    
    public int deleteLast(){
        int temp = last.data;
        last.pre.next = null;
        last = last.pre;
        return temp;
    }
    
    public void insertAfter(int i, int j){
        Link newLink = new Link(i);
        Link current = first;
        while(current != null){
            if(current.data == j){
                newLink.next = current.next;
                newLink.pre = current;
                current.next = newLink;
                newLink.next.pre = newLink;
                
            }
            current = current.next;
        }
    }
    
    public void insertBefore(int i, int j){
        Link newLink = new Link(i);
        Link current = first;
        while(current != null){
            if(current.data == j){
                newLink.next = current;
                newLink.pre = current.pre;
                current.pre = newLink;
                newLink.pre.next = newLink;
            }
            current = current.next;
        }
    }
    
    public void delete(int key){
        Link current = first;
        while(current != null){
            if(current.data == key){
                current.pre.next = current.next;
                current.next.pre = current.pre;
            }
            current = current.next;
        }
    }
    
    public void displayForward(){
        Link current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void displayBackward(){
        Link current = last;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.pre;
        }
        System.out.println();
    }
    
   
    
    public void printFront(){
        Link current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
    

