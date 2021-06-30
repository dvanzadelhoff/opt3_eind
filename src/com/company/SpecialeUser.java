package com.company;

public class SpecialeUser extends User{

    private int maxBlock = 10;

    public SpecialeUser(int id, String name) {
        super(id, name);
    }

    public int getMaxBlock()
    {
        return this.maxBlock;
    }
}
