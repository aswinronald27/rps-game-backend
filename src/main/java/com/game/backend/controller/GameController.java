package com.game.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.backend.model.Game;
import com.game.backend.service.GameServices;

@RestController
@RequestMapping("/games")
@CrossOrigin(origins = "http://localhost:3000")
public class GameController {
	@Autowired
	private GameServices gameserv;
	
	@PostMapping
	public Game saveGame(@RequestBody Game game) {
		return gameserv.saveGame(game);
	}
	@GetMapping
	public List<Game> getAllGames(){
		return gameserv.getAllGames();
	}
	
	
}
