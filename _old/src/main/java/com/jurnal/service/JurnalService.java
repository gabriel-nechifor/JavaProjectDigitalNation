package com.jurnal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jurnal.model.Jurnal;
import com.jurnal.repository.JurnalRepository;

@Service
public class JurnalService {

	@Autowired
	private JurnalRepository repo;

	public List<Jurnal> listAll() {
		return repo.findAll();
	}


	public Jurnal get(long id) {
		return repo.findById(id).get();
	}


}
