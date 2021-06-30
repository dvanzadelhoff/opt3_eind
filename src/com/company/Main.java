package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println();//negeer dit, dit is zodat er een ruimte is tussen de tekst en de rotzooi bovenaan de console. mijn OCD kan dat niet hendelen

        //een normale user kan alleen 5 programma's blokkeren
        User u1 = new User(1, "dennis");

        //een Speciale user kan 10 programma's blokkeren
        User u2 = new SpecialeUser(2, "dennis");

        //een Speciale2 user kan 15 programma's blokkeren
        User u3 = new SpecialeUser2(3, "dennis");

        Overzicht o = new Overzicht(u1);

        o.addProgramma(new ExeProgramma("Steam", "desktop/"));
        o.addProgramma(new ExeProgramma("FFXIV", "desktop/Games/"));
        o.addProgramma(new ExeProgramma("Quake", "desktop/Games/"));
        o.addProgramma(new ExeProgramma("DOOM", "desktop/Games/"));
        o.addProgramma(new CplProgramma("AudioInstellingen", "desktop/"));
        o.addProgramma(new ExeProgramma("Draw.io", "desktop/"));
        o.addProgramma(new ExeProgramma("Minecraft", "desktop/"));
        o.addProgramma(new ExeProgramma("Apex", "desktop/"));
        o.addProgramma(new ExeProgramma("BDO", "desktop/"));
        o.addProgramma(new BestandAdapter("ToetsAntwoorden", "desktop/", "Word",100, ".docx"));
        o.addProgramma(new BestandAdapter("Cijfers", "desktop/", "excel",100, ".exc"));

        o.blockProgramma(0);
        o.blockProgramma(1);
        o.blockProgramma(2);
        o.blockProgramma(3);
        o.blockProgramma(4);

        o.clearBlocked();

        o.blockProgramma(5);
        o.blockProgramma(6);
        o.blockProgramma(7);
        o.blockProgramma(8);
        o.blockProgramma(9);
        o.blockProgramma(10);

        o.printAll();
        o.printBlocked();
    }
}