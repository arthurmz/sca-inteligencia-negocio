package com.sca.inteligencia_negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.inteligencia_negocio.model.SnapshotBI;
import com.sca.inteligencia_negocio.repository.SnapshotBIRepository;

@Service
public class SnapshotBIService {
	
	@Autowired
	private SnapshotBIRepository SnapshotBIRepository;
	
	@Transactional
	public SnapshotBI saveSnapshotBI(SnapshotBI SnapshotBI) {
		 SnapshotBI b = SnapshotBIRepository.save(SnapshotBI);
		 return b;
	}
	
	public List<SnapshotBI> findAll() {
		return SnapshotBIRepository.findAll();
	}

}
