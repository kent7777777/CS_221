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
public class main {
    public static void main(String[] args){
        MyStringLinkedList list = new MyStringLinkedList();
        list.addFront("a");
        list.addFront("b");
        list.addLast("x");
        list.addLast("z");
        
        list.printReverse();
        System.out.println(list.isEmpty());
    }
}
/*
b
a
x
z
false
*/