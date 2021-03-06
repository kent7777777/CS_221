/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashPackage;

/**
 *
 * @author Kevin
 */
public class DoubleHash {
    class Item{
        private int key;
        
        public Item(int num){
            key = num;
        }
        
        public int getKey(){
            return key;
        }
    }
    private Item[] hashArray;
    private int arraySize;
    private Item nonItem;
    public DoubleHash(int size){
        arraySize = size;
        hashArray = new Item[size];
        nonItem = new Item(-1);
    }
    
    public void displayTable(){
        for(int i = 0; i < hashArray.length; i++){
            if(hashArray[i] != null){
                System.out.print(hashArray[i] + " ");
            }else{
                System.out.print("** ");
            }
            System.out.println();
        }
    }
    
    public int hashFunction1(int key){
        return key % arraySize;
    }
    
    
    
    public void insert(int key){
        int hashValue = hashFunction1(key);
        
        while(hashArray[hashValue] != null && hashArray[hashValue].getKey() != -1){
            hashValue = hashValue*hashValue;
            hashValue = hashValue % arraySize;
        }
        
        hashArray[hashValue] = new Item(key);
    }
    
    public Item delete(int key){
        int hashVal = hashFunction1(key);
    }
}
