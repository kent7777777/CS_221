/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTablePackage;

/**
 *
 * @author Kevin
 */
public class StringHashTable {
    class Item{
        private String key;
        
        public Item(String num){
            key = num;
        }
        
        public String getKey(){
            return key;
        }
    }
    private Item[] hashArray;
    private int arraySize;
    private Item nonItem;
    public StringHashTable(int size){
        arraySize = size;
        hashArray = new Item[size];
        nonItem = new Item("");
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
    
    public int hashFunction1(String key){
        return key.charAt(0) % arraySize;
    }
    
    
    
    public void insert(String key){
        int hashValue = hashFunction1(key);
        
        while(hashArray[hashValue] != null && !"".equals(hashArray[hashValue].getKey())){
            hashValue = hashValue*hashValue;
            hashValue = hashValue % arraySize;
        }
        
        hashArray[hashValue] = new Item(key);
    }
    
    public Item delete(String key){
        int hashVal = hashFunction1(key);
        
        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].getKey().equals(key)){
                Item temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            hashVal = hashVal * hashVal;
            hashVal = hashVal % arraySize;
        }
        return null;
    }
    
    public Item find(String key){
        int hashVal = hashFunction1(key);
        
        while(hashArray !=  null){
            if(hashArray[hashVal].getKey().equals(key)){
                return hashArray[hashVal];
            }
            hashVal = hashVal * hashVal;
            hashVal %= arraySize;
        }
        return null;
    }
}
