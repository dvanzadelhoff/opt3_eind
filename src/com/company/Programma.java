package com.company;

public class Programma {

    private String name;
    private String location;
    private boolean isBlocked;

    public Programma(String name, String location)
    {
        this.isBlocked = false;
        this.location = location;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getLocation()
    {
        return this.location;
    }

    public boolean getIsblocked()
    {
        return this.isBlocked;
    }

    public String getExtension()
    {
        return "";
    }

}
