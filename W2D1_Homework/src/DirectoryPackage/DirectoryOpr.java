/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DirectoryPackage;

/**
 *
 * @author Kevin
 */
public class DirectoryOpr {
    private Directory first;
    private Directory last;
    
    public DirectoryOpr(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }
    
    public void insertFirst(String name, long pno){
        Directory temp = new Directory(name, pno);
        if(first == null){
            last = temp;
        }
        temp.next = first;
        first = temp;
        
    }
    
    public void insertLast(String name, long pno){
        Directory temp = new Directory(name, pno);
        if(first == null){
            first = temp;
        }else{
            last.next = temp;
        }
        last = temp;
    }
    
    public Directory deleteFirst(){
        if(first == null){
            return null;
        }
        Directory temp = first;
        first = first.next;
        return temp;
    }
    
    public int size(){
        Directory current = first;
        int i = 0;
        while(current != null){
            i++;
            current = current.next;
        }
        return i;
    }
    
    public void displayList(){
        Directory current = first;
        while(current != null){
            current.displayDirectory();
            current = current.next;
        }
    }
    
    public Directory find(String key){
        Directory current = first;
        while(current != null){
            if(current.name == key){
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
