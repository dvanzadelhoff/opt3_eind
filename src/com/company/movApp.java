package com.company;

public class movApp extends App{

    private String extension = ".mov";

    public movApp(String name, String location) {
        super(name, location);
    }

    public String printName()
    {
        return this.getName() + ".mov";
    }

}
