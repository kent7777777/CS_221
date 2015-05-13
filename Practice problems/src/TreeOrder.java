/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class TreeOrder {
    public class Node{
        int data;
        Node leftChild;
        Node rightChild;
        public Node(int data){
            this.data = data;
            leftChild = null;
            rightChild = null;
        }
    }
    public void inOrder(Node Iroot){
        if(Iroot != null){
            inOrder(Iroot.leftChild);
            System.out.print(Iroot.data + " ");
            inOrder(Iroot.rightChild);
        }
    }
}
