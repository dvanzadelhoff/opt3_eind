package com.company;

public class ProUser extends User {

    private int maxBlock = 10;

    public ProUser(int id, String name, int age) {
        super(id, name, age);
    }

    public int getMaxBlock()
    {
        return this.maxBlock;
    }

}
