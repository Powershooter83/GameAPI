package ch.prouge.gameapi.arenasystem;

import org.bukkit.entity.Player;

public class ArenaManager {
    ArenaHASH arenaHASH;
    public ArenaManager(){
        arenaHASH = new ArenaHASH();

    }

    public String getPlayerArena(Player player){
        for (String key : arenaHASH.arenas.keySet()) {
                if(arenaHASH.arenas.get(key).getPlayers().contains(player)){
                    return key;
                }
        }
        return null;
    }





}




