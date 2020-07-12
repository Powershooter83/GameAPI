package ch.prouge.gameapi.arenasystem;

import ch.prouge.gameapi.GameAPI;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class ArenaLoader {
    ArenaHASH arenaHASH;
    Plugin plugin = GameAPI.getInstance();
    public ArenaLoader(){
        arenaHASH = new ArenaHASH();
    }
    public void loadArenas(){
        File configFile = new File(plugin.getDataFolder(), "config.yml");
        if(configFile.exists()){
                for (String key : plugin.getConfig().getConfigurationSection("Arenas").getKeys(false)) {
                    HashMap<String, ArrayList<Location>> teams = new HashMap<>();
                    //Arena creation code where key = the arena section name.
                    //Example:
                    ConfigurationSection arenaSection = plugin.getConfig().getConfigurationSection("Arenas." + key);
                    for(String team : plugin.getConfig().getConfigurationSection("Arenas." + key + ".teams").getKeys(false)){
                        for(String locations : plugin.getConfig().getConfigurationSection("Arenas." + key + ".teams." + team).getKeys(false))
                            teams.put(team, (ArrayList<Location>) plugin.getConfig().get("Arenas." + key + ".teams." + team));
                    }
                    arenaHASH.arenas.put(key, new ArenaConstructor(new ArrayList<Player>(),
                            (Location) arenaSection.get("Lobby"),
                            teams));

            }

        }else{
            Bukkit.getConsoleSender().sendMessage("ERROR: config.yml doesn't exist!");
        }
    }


}
