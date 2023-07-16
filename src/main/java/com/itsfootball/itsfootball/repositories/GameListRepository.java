package com.itsfootball.itsfootball.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsfootball.itsfootball.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	
}
