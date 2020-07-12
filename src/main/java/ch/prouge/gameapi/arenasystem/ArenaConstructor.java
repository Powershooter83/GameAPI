package ch.prouge.gameapi.arenasystem;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class ArenaConstructor {

    private ArrayList<Player> players;
    private Location lobby;
    private HashMap<String, ArrayList<Location>> teams;





    public ArenaConstructor(ArrayList<Player> players, Location lobby, HashMap<String, ArrayList<Location>> teams){
        this.players = players;
        this.lobby = lobby;
        this.teams = teams;


    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Location getLobby() {
        return lobby;
    }

    public void setLobby(Location lobby) {
        this.lobby = lobby;
    }

    public HashMap<String, ArrayList<Location>> getTeams() {
        return teams;
    }

    public void setTeams(HashMap<String, ArrayList<Location>> teams) {
        this.teams = teams;
    }
}
