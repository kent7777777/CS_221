/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admissionPackage;

/**
 *
 * @author Kevin
 */
public class Admission {
    int adno;
    String name;
    String pno;
    
    public Admission(int adno, String name, String pno){
        this.adno = adno;
        this.name = name;
        this.pno = pno;
    }
    
    public void display(){
        System.out.println(adno);
        System.out.println(name);
        System.out.println(pno);
    }
}
