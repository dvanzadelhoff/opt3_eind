package com.company;

abstract class User {

    private int id;
    private String name;
    private int age;
    private int maxBlock;

    public User(int id, String name, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
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
