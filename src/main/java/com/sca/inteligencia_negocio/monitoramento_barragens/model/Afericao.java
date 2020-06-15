package com.sca.inteligencia_negocio.monitoramento_barragens.model;

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
public class Afericao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="data_hora_afericao")
	private LocalDateTime dataHoraAfericao;
	
	@ManyToOne
	@JoinColumn(name="id_sensor")
	private Sensor sensor;
	
	@Column(name="valor")
	private Double valor;
	
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

	public LocalDateTime getDataHoraAfericao() {
		return dataHoraAfericao;
	}

	public void setDataHoraAfericao(LocalDateTime dataHoraAfericao) {
		this.dataHoraAfericao = dataHoraAfericao;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
