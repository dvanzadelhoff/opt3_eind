package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println();//negeer dit, dit is zodat er een ruimte is tussen de tekst en de rotzooi bovenaan de console. mijn OCD kan dat niet hendelen

        User u = new User(1, "dennis");
        Overzicht o = new Overzicht(u);

        o.addProgramma(new ExeProgramma("Steam", "desktop/"));
        o.addProgramma(new ExeProgramma("FFXIV", "desktop/Games/"));
        o.addProgramma(new ExeProgramma("Quake", "desktop/Games/"));
        o.addProgramma(new ExeProgramma("DOOM", "desktop/Games/"));
        o.addProgramma(new CplProgramma("AudioInstellingen", "desktop/"));
        o.addProgramma(new ExeProgramma("1", "desktop/"));
        o.addProgramma(new ExeProgramma("2", "desktop/"));
        o.addProgramma(new ExeProgramma("3", "desktop/"));
        o.addProgramma(new ExeProgramma("4", "desktop/"));
        o.addProgramma(new ExeProgramma("5", "desktop/"));
        o.addProgramma(new BestandAdapter("cijfers", "desktop/", "Word",100, ".docx"));

        o.blockProgramma(6);
        o.blockProgramma(7);
        o.blockProgramma(2);
        o.blockProgramma(10);

        o.printAll();
        o.printBlocked();
    }
}