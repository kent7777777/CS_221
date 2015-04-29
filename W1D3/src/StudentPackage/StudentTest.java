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
public class StudentTest {
    public static void main(String[] args){
        StudentArray students = new StudentArray(10);
        students.insert(100, "Kevin", 100);
        students.insert(101, "Tosha", 80);
        students.insert(102, "Tedy", 90);
        students.insert(103, "Yee Rick", 80);
        students.find(100).displayStudent();
        students.delete(101);
        students.displayAll();
    }
}


//Kevin 100 Grade: 100
//Kevin 100 Grade: 100
//Tedy 102 Grade: 90
//Yee Rick 103 Grade: 80