package com.itsfootball.itsfootball.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itsfootball.itsfootball.dto.GameListDTO;
import com.itsfootball.itsfootball.dto.GameMinDTO;
import com.itsfootball.itsfootball.entities.Game;
import com.itsfootball.itsfootball.entities.GameList;
import com.itsfootball.itsfootball.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}