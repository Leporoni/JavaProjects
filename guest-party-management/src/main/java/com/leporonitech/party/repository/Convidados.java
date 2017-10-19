package com.leporonitech.party.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leporonitech.party.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
