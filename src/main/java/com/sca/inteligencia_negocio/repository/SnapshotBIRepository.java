package com.sca.inteligencia_negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.inteligencia_negocio.model.SnapshotBI;

@Repository
public interface SnapshotBIRepository extends JpaRepository<SnapshotBI, Long>{

}
