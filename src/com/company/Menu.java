package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void MainMenu()
    {
        System.out.println("kies een optie: \n1. laat alle applicaties zien \n2. laat alle geblokkeerde applicaties zien \n3. (De)blokkeer een applicatie");
        scanner.nextLine();
    }

}
