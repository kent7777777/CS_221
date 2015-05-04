/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admissionPackage;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kevin
 */
public class AdmissionsMain {
    public static void main(String[] args){
        Queue<Admission> queue = new LinkedList<>();
        queue.offer(new Admission(1, "bob", "a"));
        queue.offer(new Admission(2, "jack", "b"));
        queue.offer(new Admission(3, "jill", "c"));
        queue.offer(new Admission(4, "bobby", "d"));
        queue.offer(new Admission(5, "jane", "e"));
        queue.peek().display();
        System.out.println(queue.size());
        for(int i = 0; i < queue.size(); i++){
            System.out.println(queue.remove());
        }
        System.out.println(queue.isEmpty());
    }
}
/*
1
bob
a
5
admissionPackage.Admission@5ad557c2
admissionPackage.Admission@6c74b024
admissionPackage.Admission@60d8431c
false
*/