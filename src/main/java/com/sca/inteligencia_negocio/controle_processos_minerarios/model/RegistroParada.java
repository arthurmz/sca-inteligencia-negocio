package com.sca.inteligencia_negocio.controle_processos_minerarios.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sca.inteligencia_negocio.model.SnapshotBI;

@Entity
@Table(schema="sca_inteligencia_negocio")
public class RegistroParada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="id_execucao_atividade")
	private ExecucaoAtividade execucaoAtividade;
	
	@Column(name="data_hora_parada")
	private LocalDateTime dataHoraParada;
	
	@Column(name="data_hora_retomada")
	private LocalDateTime dataHoraRetomada;
	
	@Column(name="descricao_parada")
	private String descricaoParada;
	
	@ManyToOne
	@JoinColumn(name="id_snapshot_bi")
	private SnapshotBI snapshotBI;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public ExecucaoAtividade getExecucaoAtividade() {
		return execucaoAtividade;
	}

	public void setExecucaoAtividade(ExecucaoAtividade execucaoAtividade) {
		this.execucaoAtividade = execucaoAtividade;
	}

	public LocalDateTime getDataHoraParada() {
		return dataHoraParada;
	}

	public void setDataHoraParada(LocalDateTime dataHoraParada) {
		this.dataHoraParada = dataHoraParada;
	}

	public LocalDateTime getDataHoraRetomada() {
		return dataHoraRetomada;
	}

	public void setDataHoraRetomada(LocalDateTime dataHoraRetomada) {
		this.dataHoraRetomada = dataHoraRetomada;
	}

	public String getDescricaoParada() {
		return descricaoParada;
	}

	public void setDescricaoParada(String descricaoParada) {
		this.descricaoParada = descricaoParada;
	}

}
