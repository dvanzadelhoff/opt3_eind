package com.company;

public class CplProgramma extends Programma{

    public CplProgramma(String name, String location) {
        super(name, location);
    }

    public String getExtension()
    {
        return ".cpl";
    }

}
