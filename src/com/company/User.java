package com.company;

public class User
{

    private int id;
    private String name;
    private int maxBlock = 5;

    public User(int id, String name)
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    public int getMaxBlock()
    {
        return this.maxBlock;
    }

}
