package de.devsnx.statsapi.addon.file;

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

        cfg.addDefault("PLACEHOLDER.TOP.NOTAVAILABLE", "&cNo Stats Avaible!");
        cfg.addDefault("PLACEHOLDER.TOP.KILLS", "&f#%RANK% &b%PLAYERNAME% &8| &e%KILLS%");
        cfg.addDefault("PLACEHOLDER.TOP.DEATHS", "&f#%RANK% &b%PLAYERNAME% &8| &e%DEATHS%");
        cfg.addDefault("PLACEHOLDER.TOP.WINS", "&f#%RANK% &b%PLAYERNAME% &8| &e%WINS%");
        cfg.addDefault("PLACEHOLDER.TOP.GAMES", "&f#%RANK% &b%PLAYERNAME% &8| &e%GAMES%");
        cfg.addDefault("PLACEHOLDER.TOP.OPENCHESTS", "&f#%RANK% &b%PLAYERNAME% &8| &e%OPENCHESTS%");
        cfg.addDefault("PLACEHOLDER.TOP.PLACEDBLOCKS", "&f#%RANK% &b%PLAYERNAME% &8| &e%PLACEDBLOCKS%");
        cfg.addDefault("PLACEHOLDER.TOP.BREAKEDBLOCKS", "&f#%RANK% &b%PLAYERNAME% &8| &e%BREAKEDBLOCKS%");

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