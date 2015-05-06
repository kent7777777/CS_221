/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityLinkedList;

/**
 *
 * @author Kevin
 */
public class PriorityLink {
    class Link{
        int data;
        Link next;
        public Link(int data){
            this.data = data;
            next = null;
        }
    }
    
    Link first;
    
    public PriorityLink(){
        first = null;
    }
    
    public void add(int i){
        Link newLink = new Link(i);
        if(first == null){
            first = newLink;
        }else{
            Link current = first;
            while(current != null){
                if(current.data < newLink.data){
                    current.next.next = current.next;
                    current.next = newLink;
                }
                current = current.next;
            }
        }
    }
    
}
