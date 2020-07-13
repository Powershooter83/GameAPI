package ch.prouge.gameapi.arenasystem;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class ArenaConstructor {

    private ArrayList<Player> players;
    private Location lobby;
    private HashMap<String, ArrayList<Location>> teams;
    private HashMap<String, ArrayList<Player>> playersInTeams;




    public ArenaConstructor(ArrayList<Player> players, Location lobby, HashMap<String, ArrayList<Location>> teams,
                            HashMap<String, ArrayList<Player>> playersInTeams){
        this.players = players;
        this.lobby = lobby;
        this.teams = teams;
        this.playersInTeams = playersInTeams;


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

    public void setTeamsLocation(HashMap<String, ArrayList<Location>> teams) {
        this.teams = teams;
    }


    public void addPlayerToTeam(Player player, String team){
        if(this.getPlayersInTeams().containsKey(team)){
            this.getPlayersInTeams().get(team).add(player);
        }


    }

    public HashMap<String, ArrayList<Player>> getPlayersInTeams() {
        return playersInTeams;
    }
}
