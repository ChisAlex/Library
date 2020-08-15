package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> libraryItems = new ArrayList<Book>();

        libraryItems.add(new Novel("fantasy", "Harry Potter", 540));
        libraryItems.add(new Novel("mystery", "LOTR", 220));
        libraryItems.add(new Novel("thriller", "Blind", 180));
        libraryItems.add(new Novel("crimes", "Seven", 250));
        libraryItems.add(new Novel("mystery", "Witcher", 350));


        libraryItems.add(new Album(9.0, "Andrei", 220));
        libraryItems.add(new Album(5.7, "Mihai", 540));
        libraryItems.add(new Album(3.9, "Alvey", 230));
        libraryItems.add(new Album(8.9, "Bili", 180));
        libraryItems.add(new Album(4.0, "Ray", 250));
        libraryItems.add(new Album(7.7, "Donovan", 350));

        // System.out.println(libraryItems);

        for(Book item : libraryItems){
            System.out.println(item);
        }

        //libraryItems.remove(0);
        //System.out.println();
        //System.out.println(libraryItems);

    }
}
