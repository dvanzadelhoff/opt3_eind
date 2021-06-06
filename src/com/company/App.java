package com.company;

public abstract class App {

    private String name;
    private String location;
    private Boolean isBlocked = false;

    public App(String name, String location)
    {
        this.name = name;
        this.location = location;
    }

    public void vinkToggle()
    {
        this.isBlocked = !isBlocked;
    }

    public String printName()
    {
        return this.name;
    }

    public Boolean getIsBlocked()
    {
        return this.isBlocked;
    }

    public String getName()
    {
        return this.name;
    }

}
