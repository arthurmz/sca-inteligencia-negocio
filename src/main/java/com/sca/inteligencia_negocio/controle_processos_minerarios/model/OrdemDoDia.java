package com.sca.inteligencia_negocio.controle_processos_minerarios.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Representa o fluxo de trabalho programado para um determinado dia.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_inteligencia_negocio")
public class OrdemDoDia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="data_execucao")
	private LocalDateTime dataExecucao;
	
	@OneToMany(mappedBy="ordemDoDia")
	private List<ExecucaoAtividade> atividades;

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

	public LocalDateTime getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(LocalDateTime dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public List<ExecucaoAtividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<ExecucaoAtividade> atividades) {
		this.atividades = atividades;
	}
	
	

}
