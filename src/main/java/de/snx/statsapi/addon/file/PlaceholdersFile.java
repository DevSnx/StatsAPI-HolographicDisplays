package de.snx.statsapi.addon.file;

import de.snx.statsapi.file.FileBase;
import de.snx.statsapi.manager.other.RankedType;
import org.bukkit.configuration.file.FileConfiguration;

public class PlaceholdersFile extends FileBase {

    public PlaceholdersFile(){
        super("", "placeholders");
        writeDefaults();
    }

    private void writeDefaults(){
        FileConfiguration cfg = getConfig();

        cfg.addDefault("PLACEHOLDER.TOP.NOAVAIBLE", "&cNo Stats Avaible!");
        cfg.addDefault("PLACEHOLDER.TOP.KILLS", "&f#%RANK% &b%PLAYERNAME% &8| &e%KILLS%");
        cfg.addDefault("PLACEHOLDER.TOP.DEATHS", "&f#%RANK% &b%PLAYERNAME% &8| &e%DEATHS%");
        cfg.addDefault("PLACEHOLDER.TOP.WINS", "&f#%RANK% &b%PLAYERNAME% &8| &e%WINS%");
        cfg.addDefault("PLACEHOLDER.TOP.GAMES", "&f#%RANK% &b%PLAYERNAME% &8| &e%GAMES%");

        cfg.options().copyDefaults(true);
        saveConfig();
    }

    public String getPlaceholderMessage(String path){
        FileConfiguration cfg = getConfig();
        String message = "";
        if(cfg.getString(path) != null){
            message = cfg.getString(path);
        }else{
            message = cfg.getString("PLACEHOLDER.TOP.NOAVAIBLE");
        }
        message = message.replace("&", "§");
        return message;
    }
}