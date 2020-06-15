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

@Entity
@Table(schema="sca_inteligencia_negocio")
public class AquisicaoInsumo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="id_insumo_disponivel")
	private InsumoDisponivel insumo;
	
	@Column(name="quantidade_adquirida")
	private Double quantidadeAdquirida;
	
	@Enumerated(EnumType.STRING)
	private UnidadeMedida unidadeMedida;
	
	@Column(name="id_protocolo_compra")
	private Long protocoloCompra;
	
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

	public InsumoDisponivel getInsumo() {
		return insumo;
	}

	public void setInsumo(InsumoDisponivel insumo) {
		this.insumo = insumo;
	}

	public Double getQuantidadeAdquirida() {
		return quantidadeAdquirida;
	}

	public void setQuantidadeAdquirida(Double quantidadeAdquirida) {
		this.quantidadeAdquirida = quantidadeAdquirida;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Long getProtocoloCompra() {
		return protocoloCompra;
	}

	public void setProtocoloCompra(Long protocoloCompra) {
		this.protocoloCompra = protocoloCompra;
	}

	

}
