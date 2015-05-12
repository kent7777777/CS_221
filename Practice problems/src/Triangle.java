/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Triangle {
    public static int tri(int n){
        if(n == 1){
            return 1;
        }else if(n == 0){
            return 0;
        }
        return n + tri(n-1);
    }
    
    public static void main(String[] args){
        System.out.println(tri(7));
    }
}
