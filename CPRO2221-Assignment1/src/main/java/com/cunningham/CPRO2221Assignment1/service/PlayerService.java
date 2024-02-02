package com.cunningham.CPRO2221Assignment1.service;

import com.cunningham.CPRO2221Assignment1.entity.Player;
import com.cunningham.CPRO2221Assignment1.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    // Saves the player
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    // Finds player by ID
    public Player findById(int id) {
        return playerRepository.searchId(id);
    }

    // Finds all Players
    public List<Player> getAllPlayers() {
        return playerRepository.getPlayerList();
    }

    // Updates a Player
    public Player updatePlayer(int id, Player newPlayer) {
        return playerRepository.updatePlayer(id, newPlayer);
    }

    // Deletes a Player
    public String deletePlayer(int id) {
        return playerRepository.deletePlayer(id);
    }
}
