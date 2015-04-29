/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomNumberPackage;

/**
 *
 * @author Kevin
 */
public class RandomNumberArray {
    private int[] nums;
    private int size;
    
    public RandomNumberArray(){
        nums = new int[50];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) (Math.random() * 100);
            
            
        }
        size = 50;
    }
    
    
    
    public void RemoveDup(){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    for(int k = j; k < (size - 1); k++){
                        nums[k] = nums[k+1];
                    }
                    
                    size--;
                }
            }
            System.out.println(nums[i]);
        }
    }
    
    public void WIPE(){
        int[] temp = new int[50];
        nums = temp;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
    public int getValue(int index){
        return nums[index];
    }
    
    public int[] getSublist(int s, int e){
        int subLength = e - s;
        int[] subList = new int[subLength];
        for(int i = 0; i < subLength; i++){
            subList[i] = nums[i + s];
        }
        return subList;
    }
    
    
    
    public static void main(String[] args){
        RandomNumberArray rand = new RandomNumberArray();   
        System.out.println(rand.getValue(40));
        System.out.println(rand.getSize());
        
        rand.RemoveDup();
        System.out.println(rand.getSize());
    }
}
