/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringArrayPackage;

/**
 *
 * @author Kevin
 */
public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private int size;
    private String[] strArray;
    
    public MyStringList(int max){
        strArray = new String[max];
        size = 0;
    }
    
    public void add(String s){
        if(strArray.length == size){
            System.out.println("List is full");
        }else{
            strArray[size] = s;
            size++;
        }
    }
    
    public String get(int i){
        return strArray[i];
    }
    
    public boolean find(String s){
        for(int i = 0; i < strArray.length; i++){
            if(strArray[i] == s){
                return true;
            }
        }
        return false;
    }
    
    public void insert(String s, int pos){
        if(strArray.length == size){
            System.out.println("List is full");
        }else{
            strArray[pos] = s;
            size++;
        }
    }
    
    public boolean remove(String s){
        int i = 0;
        for(i = 0; i < strArray.length; i++){
            if(strArray[i] == s){
                break;
            }
        }
        if(i == strArray.length){
            return false;
        }else{
            for(int j = i; j < (strArray.length - 1); j++){
                strArray[j] = strArray[j + 1];
            }
            return true;
        }
    }
    
    private void resize(){
        String[] temp = new String[strArray.length * 2];
        System.arraycopy(strArray, 0, temp, 0, strArray.length);
        strArray = temp;
    }
    
    public int size(){
        return size;
    }
    
    public void display(){
        for(int i = 0; i < strArray.length; i++){
            System.out.print(strArray[i] + " ");
        }
    }
    
    public static void main(String[] args){
        MyStringList obj = new MyStringList(10);
        obj.add("meep");
        obj.add("cat");
        obj.insert("hi", 5);
        obj.display();
        System.out.println(obj.get(5));
    }
}
//meep cat null null null hi null null null null hi