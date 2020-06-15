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
public class ExecucaoAtividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="id_ordem_do_dia")
	private OrdemDoDia ordemDoDia;
	
	@Column(name="descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_atividade")
	private TipoAtividade tipoAtividade;
	
	@Column(name="localizacao")
	private String localizacao;
	
	@ManyToOne
	@JoinColumn(name="id_equipe_responsavel")
	private Equipe equipeResponsavel;
	
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

	public OrdemDoDia getOrdemDoDia() {
		return ordemDoDia;
	}

	public void setOrdemDoDia(OrdemDoDia ordemDoDia) {
		this.ordemDoDia = ordemDoDia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Equipe getEquipeResponsavel() {
		return equipeResponsavel;
	}

	public void setEquipeResponsavel(Equipe equipeResponsavel) {
		this.equipeResponsavel = equipeResponsavel;
	}
	

}
