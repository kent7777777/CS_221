/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingPackage;

/**
 *
 * @author Kevin
 */
public class GenericCounting<E> {
    public int countOccurrences(E[] ea, E e){
        int answer = 0;
        for(E a : ea){
            if(a.equals(e))
                answer++;
        }
        return answer;
    }
    
    public static void main(String[] args){
        String[] text = new String[] { "CA", "US", "MX", "HN", "GT","CA"};
	int count = countOccurrences(text,"CA");
	System.out.println("Number of counts of CA : " + count);  

        Integer[] it = new Integer[] {10,20,30,10,40,10,60};
	int count1 = countOccurrences(it,10);
	System.out.println("Number of counts of 10 : " + count1); 
    }
}
