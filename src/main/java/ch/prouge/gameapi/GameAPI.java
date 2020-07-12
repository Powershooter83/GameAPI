package ch.prouge.gameapi;

import ch.prouge.gameapi.arenasystem.ArenaLoader;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class GameAPI extends JavaPlugin {
    ArenaLoader arenaLoader;


    static Plugin plugin;
    @Override
    public void onEnable(){
        plugin = this;
        //Load File
        getConfig().options().copyDefaults(true);
        saveConfig();


        Bukkit.getConsoleSender().sendMessage("GAMEAPI ACTIVATED");
        //Events

        //Commands
        arenaLoader = new ArenaLoader();
        arenaLoader.loadArenas();
    }


    public static Plugin getInstance(){
        return plugin;

    }










}
