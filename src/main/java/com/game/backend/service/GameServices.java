package com.game.backend.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.backend.model.Game;
import com.game.backend.repository.GameRepository;

@Service
public class GameServices {

	
	@Autowired
	private GameRepository gamerepo;
	
	public Game saveGame(Game game) {
		return gamerepo.save(game);
	}
	public List<Game> getAllGames() {
        return gamerepo.findAll();
    }
}
