package com.company;

public class BestandAdapter extends Programma
{
    private Bestand bestand;

    public BestandAdapter(String name, String location, String Appname, int fileSize, String extension) {
        super(name, location);
        bestand = new Bestand(Appname, fileSize, extension);
    }

    public String getExtension()
    {
        return bestand.getExtension();
    }
}
