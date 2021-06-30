package com.company;

public class SpecialeUser2 extends User{

    private int maxBlock = 15;

    public SpecialeUser2(int id, String name) {
        super(id, name);
    }

    public int getMaxBlock()
    {
        return this.maxBlock;
    }

}
