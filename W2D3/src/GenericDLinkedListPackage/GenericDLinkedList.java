/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericDLinkedListPackage;

/**
 *
 * @author Kevin
 */
public class GenericDLinkedList<E> {
    class Link{
        E data;
        Link next;
        Link pre;
        public Link(E e){
            data = e;
            next = null;
            pre = null;
        }
    }
    Link first;
    Link last;
    
    public GenericDLinkedList(){
        first = null;
        last = null;
    }
    
    public void addFirst(E e){
        Link newLink = new Link(e);
        if(first == null){
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    
    public void addLast(E e){
        Link newLink = new Link(e);
        if(last == null){
            first = newLink;
        }
        newLink.pre = last;
        last = newLink;
    }
    
    public E deleteFirst(){
        E temp = first.data;
        first.next.pre = null;
        first = first.next;
        return temp;
    }
    
    public E deleteLast(){
        E temp = last.data;
        last.pre.next = null;
        last = last.pre;
        return temp;
    }
    
}
