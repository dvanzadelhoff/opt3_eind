package com.company;

public class Programma {

    private String pName;
    private String pLocation;
    private boolean pIsBlocked;

    public Programma(String name, String location)
    {
        this.pIsBlocked = false;
        this.pLocation = location;
        this.pName = name;
    }

    public void toggleBlock()
    {
        pIsBlocked = !pIsBlocked;
    }

    public String getpName()
    {
        return this.pName;
    }

    public String getpLocation()
    {
        return this.pLocation;
    }

    public boolean ispIsBlocked()
    {
        return this.pIsBlocked;
    }
}
