package com.Jurnal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jurnal.model.Jurnal;
import com.Jurnal.repository.JurnalRepository;

@Service
public class JurnalService {
	@Autowired
	private JurnalRepository repo;

	public List<Jurnal> listAll() {
		return repo.findAll();
	}

	public void save(Jurnal std) {
		repo.save(std);
	}

	public Jurnal get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

}
