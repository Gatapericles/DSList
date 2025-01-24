package com.condoridev.DSlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.condoridev.DSlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
