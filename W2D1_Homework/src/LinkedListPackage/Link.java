/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListPackage;

/**
 *
 * @author Kevin
 */
public class Link {
    public int iData;              // data item
	   public double dData;           // data item
	   public Link next;              // next link in list
	// -------------------------------------------------------------
	                            
	public Link(int id, double dd) {
		// TODO Auto-generated constructor stub
		iData = id;                 // initialize data
	      dData = dd; 
	}
	// -------------------------------------------------------------
	   public void displayLink()      // display ourself
	      {
	      System.out.print("{" + iData + ", " + dData + "} ");
	      }
}
