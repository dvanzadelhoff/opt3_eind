package com.company;

import java.util.ArrayList;

public class overzicht {

    private int overzichtID;
    private ArrayList<App> bevat;

    public overzicht(int overzichtID)
    {
        this.overzichtID = overzichtID;
        this.bevat = new ArrayList<App>();
    }

    public void showAll()
    {
        System.out.println("Alle Programma's");
        System.out.println("==============================================");
        for (int i = 0; i < bevat.size(); i++)
        {
            if (bevat.get(i).getIsBlocked())
            {
                System.out.println(i + ". " + bevat.get(i).printName() + " x");
            }
            else
            {
                System.out.println(i + ". " + bevat.get(i).printName());
            }
        }
        System.out.println("==============================================");
    }

    public void showBlocked()
    {
        System.out.println("geblokkeerde Programma's");
        System.out.println("==============================================");
        for (int i = 0; i < bevat.size(); i++)
        {
            if (bevat.get(i).getIsBlocked())
            {
                System.out.println(i + ". " + bevat.get(i).printName());
            }
        }
        System.out.println("==============================================");
    }

    public void addApp(App app)
    {
        bevat.add(app);
    }

    public App getApp(int id)
    {
        return bevat.get(id);
    }

}
