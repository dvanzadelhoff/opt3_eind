package com.company;

public class exeApp extends App{

    public exeApp(String name, String location) {
        super(name, location);
    }

    public String printName()
    {
        return this.getName() + ".exe";
    }
}
