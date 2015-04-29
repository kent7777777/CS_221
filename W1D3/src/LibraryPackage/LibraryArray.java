/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryPackage;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class LibraryArray {
    public static void main(String[] args){
        ArrayList<Library> books = new ArrayList<>();
        books.add(new Library(100, "sapdof", "The King", 10000));
        books.add(new Library(101, "dfijfn", "The Queen", 10001));
        books.add(new Library(102, "aosdfh", "The Prince", .5));
        System.out.println(books.get(1).getBookName());
        books.remove(2);
        System.out.println(books.size());
        System.out.println(books.isEmpty());
        
    }
}

//The Queen
//2
//false
