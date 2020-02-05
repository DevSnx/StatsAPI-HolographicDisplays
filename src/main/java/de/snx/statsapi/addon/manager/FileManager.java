package de.snx.statsapi.addon.manager;

import de.snx.statsapi.addon.file.PlaceholdersFile;

public class FileManager {

    public PlaceholdersFile placeholdersFile;

    public FileManager(){
        this.placeholdersFile = new PlaceholdersFile();
    }

    public PlaceholdersFile getPlaceholdersFile() {
        return placeholdersFile;
    }
}
