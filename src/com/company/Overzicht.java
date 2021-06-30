package com.company;

import java.util.ArrayList;

public class Overzicht
{

    private User Owner;
    private ArrayList<Programma> bevat;
    private ArrayList<Programma> blocked;

    public Overzicht(User user)
    {
        this.Owner = user;

        bevat = new ArrayList<>();
        blocked = new ArrayList<>();

    }

    public Programma getProgramma(int nummer)
    {
        return bevat.get(nummer);
    }

    public void addProgramma(Programma programma)
    {
        bevat.add(programma);
    }

    public void printAll()
    {
        System.out.println("\nAlle Programma's:\n");

        for (int i = 0; i < bevat.size(); i++)
        {
            System.out.println(i + ". " + bevat.get(i).getName() + bevat.get(i).getExtension());
        }
    }

    public void printBlocked()
    {
        System.out.println("\nGeblokkeerde Programma's:\n");

        for (int i = 0; i < blocked.size(); i++)
        {
            System.out.println("- " + blocked.get(i).getName() + blocked.get(i).getExtension());
        }
    }

    public void blockProgramma(int nummer)
    {
        if (blocked.size() < Owner.getMaxBlock())
        {
            blocked.add(bevat.get(nummer));
        }
        else
        {
            System.out.println(bevat.get(nummer).getName() + " kan niet toegevoegd worden aan de blacklist, je hebt je limiet bereikt");
        }
    }

    public void clearBlocked()
    {
        blocked.clear();
    }

}
