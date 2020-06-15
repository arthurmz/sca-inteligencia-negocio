package com.sca.inteligencia_negocio.seguranca_comunicacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sca.inteligencia_negocio.model.SnapshotBI;

/**
 * Evento é o objeto recebido pelo módulo que informa o acontecimento de um problema em uma barragem que pode afetar
 * a segurança dos moradores próximos.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_seguranca_comunicacao")
public class IncidenteSeguranca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private Long dataCadastro;
	
	@Column(name="descricao")
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private TipoIncidente tipoIndicente;
	
	@ManyToOne
	@JoinColumn(name="id_snapshot_bi")
	private SnapshotBI snapshotBI;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Long dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoIncidente getTipoIndicente() {
		return tipoIndicente;
	}

	public void setTipoIndicente(TipoIncidente tipoIndicente) {
		this.tipoIndicente = tipoIndicente;
	}

	public SnapshotBI getSnapshotBI() {
		return snapshotBI;
	}

	public void setSnapshotBI(SnapshotBI snapshotBI) {
		this.snapshotBI = snapshotBI;
	}
	
	

}
