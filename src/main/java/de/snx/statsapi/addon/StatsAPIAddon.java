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

    @Override
    public void onEnable() {
        registerNewPlaceholders();
    }

    @Override
    public void onDisable() {
    }

    private void registerNewPlaceholders(){
        HologramsAPI.registerPlaceholder(api, "{test}", 30, new PlaceholderReplacer() {
            @Override
            public String update() {
                return "Hallo ich bin ein PlaceHolder!";
            }
        });
    }
}