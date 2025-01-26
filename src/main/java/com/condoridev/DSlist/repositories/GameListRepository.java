package com.condoridev.DSlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.condoridev.DSlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}