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

/**
 * Um problema não bloqueante é aquele que não impede o fluxo de trabalho de continuar.
 * Serve para registros de melhoria contínua do processo.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_inteligencia_negocio")
public class RegistroProblemaNaoBloqueante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="id_execucao_atividade")
	private ExecucaoAtividade execucaoAtividade;
	
	@Column(name="data_hora_problema")
	private LocalDateTime dataHoraProblema;
	
	@Column(name="descricao_problema")
	private String descricaoProblema;
	
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

	public LocalDateTime getDataHoraProblema() {
		return dataHoraProblema;
	}

	public void setDataHoraProblema(LocalDateTime dataHoraProblema) {
		this.dataHoraProblema = dataHoraProblema;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

}
