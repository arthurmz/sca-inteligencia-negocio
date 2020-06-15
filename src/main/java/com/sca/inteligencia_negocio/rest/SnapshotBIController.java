package com.sca.inteligencia_negocio.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.inteligencia_negocio.model.SnapshotBI;
import com.sca.inteligencia_negocio.repository.SnapshotBIRepository;
import com.sca.inteligencia_negocio.service.SnapshotBIService;

@RestController
@RequestMapping("/snapshotsBI")
public class SnapshotBIController {
	
	@Autowired
	private SnapshotBIService snapshotBIService;
	
	@Autowired
	private SnapshotBIRepository snapshotBIRepository;
	
	@GetMapping
	public List<SnapshotBI> getAllSnapshotBIs(){
		return snapshotBIService.findAll();
	}
	
	@GetMapping("{id}")
	public SnapshotBI getSnapshotBI(@PathVariable Long id) {
		return snapshotBIRepository.getOne(id);
	}
	
	@PostMapping()
	public SnapshotBI saveSnapshotBI(@RequestBody SnapshotBI snapshotBI) throws Exception {
		return snapshotBIService.saveSnapshotBI(snapshotBI);
	}
	
	@PutMapping()
	public SnapshotBI alteraSnapshotBI(@RequestBody SnapshotBI snapshotBI) throws Exception {
		return snapshotBIService.saveSnapshotBI(snapshotBI);
	}

}
