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
public class LinkList {
    private Link first;            // ref to first link on list

		// -------------------------------------------------------------
		   public LinkList()              // constructor
		      {
		      first = null;               // no links on list yet
		      }
		// -------------------------------------------------------------
		   public boolean isEmpty()       // true if list is empty
		      {
		      return (first==null);
		      }
		// -------------------------------------------------------------
		                                  // insert at start of list
		   public void insertFirst(int id, double dd)
		      {                           // make new link
		      Link newLink = new Link(id, dd);
		      newLink.next = first;       // newLink --> old first
		      first = newLink;            // first --> newLink
		      }
		// -------------------------------------------------------------
		   public Link deleteFirst()      // delete first item
		      {                           // (assumes list not empty)
		      Link temp = first;          // save reference to link
		      first = first.next;         // delete it: first-->old next
		      return temp;                // return deleted link
		      }
		// -------------------------------------------------------------
		   public void displayList()
		      {
		      System.out.print("List (first-->last): ");
		      Link current = first;       // start at beginning of list
		      while(current != null)      // until end of list,
		         {
		         current.displayLink();   // print data
		         current = current.next;  // move to next link
		         }
		      System.out.println("");
		      }
                   public int size(){
                       Link current = first;
                       int i = 0;
                       while(current != null){
                           i++;
                           current = current.next;
                       }
                       return i;
                   }
                   
                   public int find(double n){
                       Link current = first;
                       int i = 0;
                       while(true){
                           if((((double)current.iData) == n) || (current.dData == n)){
                               break;
                           }else if(current == null){
                               break;
                           }
                           i++;
                           current = current.next;
                       }
                       return i;
                   }
                   public int greatest(){
                       Link current = first;
                       int answer = current.iData;
                       while(current != null){
                           if(current.iData > answer){
                               answer = current.iData;
                           }
                           current = current.next;
                       }
                       return answer;
                   }
                   public int smallest(){
                       Link current = first;
                       int answer = current.iData;
                       while(current != null){
                           if(current.iData < answer){
                               answer = current.iData;
                           }
                           current = current.next;
                       }
                       return answer;
                   }
}
