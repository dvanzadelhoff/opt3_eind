package com.company;

public class Main {

    public static void main(String[] args) {


        overzicht o1 = new overzicht(1);

        App Steam = new exeApp("Steam", "desktop/");
        App importantVideo = new movApp("importantVideo", "desktop/");

        Steam.vinkToggle();

        overzicht.showAll();
        overzicht.showBlocked();
    }
}
