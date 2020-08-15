package com.company;

public class Album extends Book {
    private double quality;

    public Album(double quality, String name, int pages){
        super(name, pages);
        this.quality = quality;
    }

    public String toString(){
        return "The name of the album is: " + name + ", " + "it has " + pages + " pages" + " with " + quality + " grade paper quality";
    }
}
