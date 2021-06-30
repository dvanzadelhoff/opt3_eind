package com.company;

public class TrialUser extends User
{

    private int maxBlock = 5;

    public TrialUser(int id, String name, int age) {
        super(id, name, age);
    }

    public int getMaxBlock()
    {
        return this.maxBlock;
    }
}
