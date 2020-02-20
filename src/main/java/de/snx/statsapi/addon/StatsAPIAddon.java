package de.snx.statsapi.addon;

import de.snx.statsapi.addon.manager.FileManager;
import de.snx.statsapi.addon.manager.PlaceholdersManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class StatsAPIAddon extends JavaPlugin {

    public static Plugin api = Bukkit.getServer().getPluginManager().getPlugin("HolograpicDisplays");
    public static Plugin statsapi = Bukkit.getServer().getPluginManager().getPlugin("StatsAPI");
    public static FileManager fileManager;
    public static PlaceholdersManager placeholdersManager;

    @Override
    public void onEnable() {
        fileManager = new FileManager();
        placeholdersManager = new PlaceholdersManager();
        Bukkit.getConsoleSender().sendMessage("§4StatsAPI §cLoading placeholders...");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_kills}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_deaths}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_games}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_wins}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_openchests}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_placedblocks}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_breakedblocks}");
        Bukkit.getConsoleSender().sendMessage(" ");
    }

    public static Plugin getApi() {
        return api;
    }

    public static Plugin getStatsapi() {
        return statsapi;
    }

    public static FileManager getFileManager() {
        return fileManager;
    }

    public static PlaceholdersManager getPlaceholdersManager() {
        return placeholdersManager;
    }
}