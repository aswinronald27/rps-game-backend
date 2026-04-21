package com.game.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String player1;
	private String player2;
	private int scoreP1;
	private int scoreP2;
	private String winner;
	
	public Game() {
		super();
	}
	
	
	public Game(Long id, String player1, String player2, int scoreP1, int scoreP2, String winner) {
		super();
		this.id = id;
		this.player1 = player1;
		this.player2 = player2;
		this.scoreP1 = scoreP1;
		this.scoreP2 = scoreP2;
		this.winner = winner;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public int getScoreP1() {
		return scoreP1;
	}
	public void setScoreP1(int scoreP1) {
		this.scoreP1 = scoreP1;
	}
	public int getScoreP2() {
		return scoreP2;
	}
	public void setScoreP2(int scoreP2) {
		this.scoreP2 = scoreP2;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	
	
}
