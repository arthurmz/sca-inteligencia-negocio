package com.sca.inteligencia_negocio.cadastro_ativos.model;

import java.time.LocalDateTime;

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
 * Quantidade de insumo disponível por tipo
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_inteligencia_negocio")
public class InsumoDisponivel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="id_insumo_disponivel")
	private TipoInsumo tipo;
	
	@Column(name="quantidade_insumo")
	private Double quantidadeInsumo;
	
	@Column(name="localizacao")
	private String localizacao;
	
	@Enumerated(EnumType.STRING)
	private UnidadeMedida unidadeMedida;
	
	@ManyToOne
	@JoinColumn(name="id_snapshot_bi")
	private SnapshotBI snapshotBI;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoInsumo getTipo() {
		return tipo;
	}

	public void setTipo(TipoInsumo tipo) {
		this.tipo = tipo;
	}

	public Double getQuantidadeInsumo() {
		return quantidadeInsumo;
	}

	public void setQuantidadeInsumo(Double quantidadeInsumo) {
		this.quantidadeInsumo = quantidadeInsumo;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	

}
