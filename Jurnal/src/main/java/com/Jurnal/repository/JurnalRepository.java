package com.Jurnal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Jurnal.model.Jurnal;

@Repository
	public interface JurnalRepository extends JpaRepository<Jurnal, Long>{

	}

	
	
	

