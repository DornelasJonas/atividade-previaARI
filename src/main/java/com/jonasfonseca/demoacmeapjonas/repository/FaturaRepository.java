package com.jonasfonseca.demoacmeapjonas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasfonseca.demoacmeapjonas.domain.Fatura;
import com.jonasfonseca.demoacmeapjonas.domain.Instalacao;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

	public Optional<Fatura> findByCodigo(String codigo);
	public List<Fatura> findByInstalacao(Instalacao instalacao);
	
}
