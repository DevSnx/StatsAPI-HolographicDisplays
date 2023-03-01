package de.devsnx.statsapi.addon.manager;

import de.devsnx.statsapi.addon.file.PlaceholdersFile;

public class FileManager {

    public PlaceholdersFile placeholdersFile;

    public FileManager(){
        this.placeholdersFile = new PlaceholdersFile();
    }

    public PlaceholdersFile getPlaceholdersFile() {
        return placeholdersFile;
    }
}
