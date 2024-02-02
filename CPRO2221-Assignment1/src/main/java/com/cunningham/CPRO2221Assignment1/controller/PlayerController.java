package com.cunningham.CPRO2221Assignment1.controller;

import com.cunningham.CPRO2221Assignment1.entity.Player;
import com.cunningham.CPRO2221Assignment1.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    // Creates a Player
    @PostMapping("/create")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    // Selects all Players
    @GetMapping("/all")
    public List<Player> allPlayers() {
        return playerService.getAllPlayers();
    }

    // Selects a player by ID
    @GetMapping("/view/{playerID}")
    public Player searchByID(@PathVariable int playerID) {
        return playerService.findById(playerID);
    }

    // Updates a Player
    @PutMapping("/update/{playerID}")
    public Player updatePlayer(@PathVariable int playerID, @RequestBody Player newPlayer) {
        return playerService.updatePlayer(playerID, newPlayer);
    }

    // Deletes a Player
    @DeleteMapping("/delete/{playerID}")
    public String deletePlayer(@PathVariable int playerID) {
        return playerService.deletePlayer(playerID);
    }
}
