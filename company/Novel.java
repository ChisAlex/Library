package com.company;

public class Novel extends Book {
    private String type;

    public Novel(String type, String name, int pages){
        super(name, pages);
        this.type = type;
    }

    public String toString(){
        return "The name of the novel is: " + name + ", " + "it has "+ pages + " pages" + " " +  "and it is a "+ type;
    }
}
