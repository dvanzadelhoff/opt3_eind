package com.company;

public class ExeProgramma extends Programma{

    public ExeProgramma(String name, String location) {
        super(name, location);
    }

    public String getExtension()
    {
        return ".exe";
    }

}
