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
public class Directory {
    String name;
    long pno;
    Directory next;
    
    public Directory(String name, long pno){
        this.name = name;
        this.pno = pno;
    }
    
    public void displayDirectory(){
        System.out.println(name + " " + pno);
    }
    
    
}
