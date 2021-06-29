package com.company;

public class Main {

    public static void main(String[] args) {

        ProgrammaList p1 = ProgrammaList.getInstance();

        //zorg ervoor dat je Word.toggleBlock kan doen
        p1.getProgramma(0).toggleBlock();
        p1.getProgramma(3).toggleBlock();

        Menu m = new Menu();

        m.MainMenu();

    }
}
