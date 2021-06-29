package com.company;

import java.util.ArrayList;

public class ProgrammaList {

    private ArrayList<Programma> bevat;
    private static ProgrammaList instance = null;

    private ProgrammaList()
    {
        this.bevat = new ArrayList<Programma>();

        Programma Word = new Programma("word", "Desktop/");
        Programma Steam = new Programma("steam", "Desktop/");
        Programma Discord = new Programma("discord", "Desktop/");
        Programma Epic = new Programma("epic games", "Desktop/");

        bevat.add(Word);
        bevat.add(Steam);
        bevat.add(Discord);
        bevat.add(Epic);
    }

    public static ProgrammaList getInstance()
    {
        if (instance == null)
        {
            instance = new ProgrammaList();
        }

        return instance;
    }

    private void addProgramma(Programma programma)
    {
        bevat.add(programma);
    }

    public Programma getProgramma(int nummer)
    {
        return bevat.get(nummer);
    }

    public void showProgramma()
    {
        System.out.println("=========================================");
        System.out.println("Alle Programmas:");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < bevat.size(); i++)
        {
            if(bevat.get(i).ispIsBlocked())
            {
                System.out.println(i + ". " + bevat.get(i).getpName() + " X");
            }

            else
            {
                System.out.println(i + ". " + bevat.get(i).getpName());
            }
        }

        System.out.println("=========================================");
    }

    public void showBlockedProgrammas()
    {
        System.out.println("Alle geblokkeerde programmas:");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < bevat.size(); i++)
        {
            if(bevat.get(i).ispIsBlocked())
            {
                System.out.println(i + ". " + bevat.get(i).getpName());
            }
        }

        System.out.println("=========================================");
    }

    public void showProgrammaLocation()
    {
        for (int i = 0; i < bevat.size(); i++)
        {
            if(bevat.get(i).ispIsBlocked())
            {
                System.out.println(i + ". " + bevat.get(i).getpName() + ": " + bevat.get(i).getpLocation());
            }
        }
    }

}
