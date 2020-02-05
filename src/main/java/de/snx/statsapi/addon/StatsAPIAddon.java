package de.snx.statsapi.addon;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import com.gmail.filoghost.holographicdisplays.api.placeholder.PlaceholderReplacer;
import com.gmail.filoghost.holographicdisplays.placeholder.PlaceholdersManager;
import com.gmail.filoghost.holographicdisplays.placeholder.PlaceholdersRegister;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;

public class StatsAPIAddon extends JavaPlugin {

    Plugin api = Bukkit.getServer().getPluginManager().getPlugin("HolograpicDisplays");
    Plugin statsapi = Bukkit.getServer().getPluginManager().getPlugin("StatsAPI");

    @Override
    public void onEnable() {
        registerNewPlaceholders();
        Bukkit.getConsoleSender().sendMessage("§4StatsAPI §cLoading placeholders...");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_kills}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_deaths}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_games}");
        Bukkit.getConsoleSender().sendMessage("§b - {statsapi-top<1-10>_wins}");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§4StatsAPI §aSuccessfully loading!");
    }

    private void registerNewPlaceholders(){
        HologramsAPI.registerPlaceholder(api, "{statsapi}", 30, new PlaceholderReplacer() {
            @Override
            public String update() {
                return "";
            }
        });
        for(int i = 0; i < 10; i++){
            HologramsAPI.registerPlaceholder(api, "{statsapi-top" + i + "_kills}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    return "";
                }
            });
        }
        for(int i = 0; i < 10; i++){
            HologramsAPI.registerPlaceholder(api, "{statsapi-top" + i + "_deaths}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    return "";
                }
            });
        }
        for(int i = 0; i < 10; i++){
            HologramsAPI.registerPlaceholder(api, "{statsapi-top" + i + "_games}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    return "";
                }
            });
        }
        for(int i = 0; i < 10; i++){
            HologramsAPI.registerPlaceholder(api, "{statsapi-top" + i + "_wins}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    return "";
                }
            });
        }
    }
}