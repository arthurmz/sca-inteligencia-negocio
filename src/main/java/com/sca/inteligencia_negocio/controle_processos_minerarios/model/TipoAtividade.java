package com.sca.inteligencia_negocio.controle_processos_minerarios.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipo da atividade executada.
 * Pode ser detalhado em modo amplo como em modo mais restrito.
 * Exemplo: Um tipo de atividade genérico pode ser: Lavra
 * 			Um outro tipo de atividade pode ser a Lavra por explosão, Lavra por escavadeira, etc.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_inteligencia_negocio")
public class TipoAtividade {
	
	public static final Long LAVRA = 100L;
	public static final Long TRANSPORTE = 200L;
	public static final Long ESTERIL = 300L;
	public static final Long BRITAGEM = 400L;
	public static final Long SEPARACAO = 500L;
	public static final Long CONCENTRACAO = 600L;
	public static final Long RECICLAGEM = 700L;
	public static final Long EMPILHAMENTO = 800L;
	public static final Long FERROVIA = 900L;
	public static final Long DESCOMISSIONAMENTO = 1000L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="descricao")
	private String descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
