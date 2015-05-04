/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQPackage;

/**
 *
 * @author Kevin
 */
public class PriorityQTest {
    public static void main(String[] args)
   {
   PriorityQ thePQ = new PriorityQ(5);
   thePQ.insert(30);
   thePQ.insert(50);
   thePQ.insert(10);
   thePQ.insert(40);
   thePQ.insert(20);

   while( !thePQ.isEmpty() )
      {
      long item = thePQ.remove();
      System.out.print(item + " ");  
      }  
   System.out.println("");
   }
}
//50 40 30 20 10 