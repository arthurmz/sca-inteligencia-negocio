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
public class ConsumoInsumo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_insumo_disponivel")
	private InsumoDisponivel insumo;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="quantidade_consumida")
	private Double quantidadeConsumida;
	
	@Enumerated(EnumType.STRING)
	private UnidadeMedida unidadeMedida;
	
	@Column(name="descricao_atividade_consumo")
	private String descricaoAtividadeConsumo;
	
	@ManyToOne
	@JoinColumn(name="id_snapshot_bi")
	private SnapshotBI snapshotBI;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InsumoDisponivel getInsumo() {
		return insumo;
	}

	public void setInsumo(InsumoDisponivel insumo) {
		this.insumo = insumo;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Double getQuantidadeConsumida() {
		return quantidadeConsumida;
	}

	public void setQuantidadeConsumida(Double quantidadeConsumida) {
		this.quantidadeConsumida = quantidadeConsumida;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getDescricaoAtividadeConsumo() {
		return descricaoAtividadeConsumo;
	}

	public void setDescricaoAtividadeConsumo(String descricaoAtividadeConsumo) {
		this.descricaoAtividadeConsumo = descricaoAtividadeConsumo;
	}

	
}
