package com.game.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.backend.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
