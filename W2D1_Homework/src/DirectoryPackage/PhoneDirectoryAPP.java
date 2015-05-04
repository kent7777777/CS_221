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
public class PhoneDirectoryAPP {
    public static void main(String[] args){
        DirectoryOpr dir = new DirectoryOpr();
        dir.insertFirst("Kevin", 1);
        dir.insertFirst("Tedy", 2);
        dir.insertFirst("Yee Rick", 3);
        dir.deleteFirst();
        dir.displayList();
        System.out.println(dir.size());
        System.out.println(dir.find("Kevin").pno);
    }
}
/*
Tedy 2
Kevin 1
2
1
*/