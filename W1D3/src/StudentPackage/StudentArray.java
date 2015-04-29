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
public class StudentArray {
    private Student[] a;
    private int nElems;
    
    public StudentArray(int max){
        a = new Student[max];
        nElems = 0;
    }
    
    public Student find(int id){
        for(Student i : a){
            if(i.getId() == id){
                return i;
            }
        }
        return null;
    }
    
    public void insert(int id, String name, int mark){
        for(int i = 0; i < nElems; i++){
            if(a[i].getId() == id){
                return;
            }
        }
        a[nElems] = new Student(id, name, mark);
        nElems++;
    }
    
    public boolean delete(int id){
        int i;
        
        for(i = 0; i < nElems; i++){
            if(a[i].getId() == id){
                for(int j = i; j < (nElems - i); j++){
                    a[j] = a[j+1];
                    }
                    a[nElems] = null;
                    nElems--;
                    return true;
            }
        }
        return false;
    }
    
    public void displayAll(){
        for(int i = 0; i < nElems; i++){
            a[i].displayStudent();
        }
    }
    
}
