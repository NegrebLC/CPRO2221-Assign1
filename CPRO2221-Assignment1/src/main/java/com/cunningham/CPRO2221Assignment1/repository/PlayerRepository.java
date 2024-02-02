package com.cunningham.CPRO2221Assignment1.repository;

import com.cunningham.CPRO2221Assignment1.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {
    private final List<Player> playerList = new ArrayList<Player>();

    public List<Player> getPlayerList(){
        return playerList;
    }

    public Player searchId(int id) {
        for(Player player : playerList) {
            if(player.getId() == id) {
                return playerList.get(id);
            }
        }
        return null;
    }

    public Player savePlayer(Player player) {
        Player p = new Player();
        p.setId(player.getId());
        p.setName(player.getName());
        p.setTeamName(player.getTeamName());
        p.setJerseyNumber(player.getJerseyNumber());
        playerList.add(p);
        return p;
    }
}
