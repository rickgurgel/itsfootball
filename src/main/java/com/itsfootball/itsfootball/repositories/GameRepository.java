package com.itsfootball.itsfootball.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsfootball.itsfootball.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	
}
