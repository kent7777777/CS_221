/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryPackage;

/**
 *
 * @author Kevin
 */
public class Library implements Comparable {
    int bookID;
    String ISBN;
    String bookName;
    double price;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Library(int bookID, String ISBN, String bookName, double price){
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Library Aobj = (Library)o;
        if(this.price > Aobj.price){
            return 1;
        }else if(this.price < Aobj.price){
            return -1;
            
        }else{
            return 0;
        }
    }
}
