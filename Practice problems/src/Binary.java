/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Binary {
    public static boolean binarySearch(int[] a, int num, int low, int high){
        if(low > high){
            return false;
        }
        int mid = (high + low)/2 ;
        if(a[mid] == num){
            return true;
        }else if(a[mid] < num){
            return binarySearch(a, num, low, mid - 1);
        }else{
            return binarySearch(a, num, mid + 1, high);
        }
    }
}
