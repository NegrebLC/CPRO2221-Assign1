package com.cunningham.CPRO2221Assignment1.repository;

import com.cunningham.CPRO2221Assignment1.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {
    // List of all Players
    private final List<Player> playerList = new ArrayList<Player>();

    // Gets all players in the list
    public List<Player> getPlayerList(){
        return playerList;
    }

    // Searches for a player by their ID
    public Player searchId(int id) {
        for(Player player : playerList) {
            if(player.getId() == id) {
                return playerList.get(id);
            }
        }
        throw new RuntimeException("Player not found with the id: " + id);
    }

    // Saves a player to the list
    public Player save(Player player) {
        Player p = new Player();
        p.setId(player.getId());
        p.setName(player.getName());
        p.setTeam(player.getTeam());
        p.setJerseyNumber(player.getJerseyNumber());
        playerList.add(p);
        return p;
    }

    // Updates a Player
    public Player updatePlayer(int playerId, Player newPlayer) {
        for(Player player : playerList) {
            if(player.getId() == playerId) {
                player.setName(newPlayer.getName());
                player.setTeam(newPlayer.getTeam());
                player.setJerseyNumber(newPlayer.getJerseyNumber());
                return player;
            }
        }
        throw new RuntimeException("Player not found with the id: " + playerId);
    }

    // Deletes a Player
    public String deletePlayer(int playerId) {
        playerList.removeIf(player -> player.getId() == playerId);
        return "Player with the following ID has been removed: " + playerId;
    }
}
