/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Node {
    String data;
    Node next;
    Node(String data){
        this.data = data;
    }
    @Override
    public String toString(){
        String temp = " ";
        return temp + data;
    }
    
    
}

    

