/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

/**
 *
 * @author Kevin
 */
public class Student {
    private int id;
    private String name;
    private int mark;
    
    public Student(int id, String name, int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    
    public void displayStudent(){
        System.out.println(name + " " + id + " Grade: " + mark);
    }
    public int getId(){
        return id;
    }
}
