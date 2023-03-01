package de.devsnx.statsapi.addon;

import de.devsnx.statsapi.addon.manager.FileManager;
import de.devsnx.statsapi.addon.manager.PlaceholdersManager;
import me.filoghost.holographicdisplays.api.HolographicDisplaysAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class StatsAPIAddon extends JavaPlugin {

    public static Plugin statsapi = Bukkit.getServer().getPluginManager().getPlugin("StatsAPI");
    public static HolographicDisplaysAPI api;
    public static StatsAPIAddon instance;
    public static FileManager fileManager;
    public static PlaceholdersManager placeholdersManager;

    @Override
    public void onEnable() {

        if (!Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays")) {
            getLogger().severe("*** HolographicDisplays is not installed or not enabled. ***");
            getLogger().severe("*** This plugin will be disabled. ***");
            this.setEnabled(false);
            return;
        }
        instance = this;
        fileManager = new FileManager();
        placeholdersManager = new PlaceholdersManager();

        this.api = HolographicDisplaysAPI.get(this);

        Bukkit.getConsoleSender().sendMessage("§4StatsAPI §cLoading placeholders...");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_kills}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_deaths}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_games}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_wins}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_openchests}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_placedblocks}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_breakedblocks}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_points}");
        Bukkit.getConsoleSender().sendMessage("§a - {statsapi-top<1-10>_elo}");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§4StatsAPI §aLoading Success!");
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

    public static StatsAPIAddon getInstance() {
        return instance;
    }

    public static HolographicDisplaysAPI getApi() {
        return api;
    }
}