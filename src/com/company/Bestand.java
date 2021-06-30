package com.company;

public class Bestand
{

    private String AppName;
    private int fileSize;
    private String extension;

    public Bestand(String name, int size, String extension)
    {
        this.AppName = name;
        this.fileSize = size;
        this.extension = extension;
    }

    public String getAppName()
    {
        return this.AppName;
    }

    public String getExtension()
    {
        return this.extension;
    }

    public int getFileSize()
    {
        return this.fileSize;
    }

}
