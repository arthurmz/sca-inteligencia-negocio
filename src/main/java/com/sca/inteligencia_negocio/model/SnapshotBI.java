package com.sca.inteligencia_negocio.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sca.inteligencia_negocio.cadastro_ativos.model.AquisicaoInsumo;
import com.sca.inteligencia_negocio.cadastro_ativos.model.ConsumoInsumo;
import com.sca.inteligencia_negocio.cadastro_ativos.model.InsumoDisponivel;
import com.sca.inteligencia_negocio.controle_processos_minerarios.model.ExecucaoAtividade;
import com.sca.inteligencia_negocio.controle_processos_minerarios.model.RegistroParada;
import com.sca.inteligencia_negocio.controle_processos_minerarios.model.RegistroProblemaNaoBloqueante;
import com.sca.inteligencia_negocio.monitoramento_barragens.model.Afericao;
import com.sca.inteligencia_negocio.seguranca_comunicacao.model.IncidenteSeguranca;

/**
 * Objeto que representa a sumarização dos eventos diários de produção na mineradora.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_inteligencia_negocio")
public class SnapshotBI {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	//Lista de aquisições realizadas no dia
	@OneToMany(mappedBy="snapshotBI")
	private List<AquisicaoInsumo> listaAquisicaoInsumo;
	
	//Lista de consumo de insumos realizados no dia
	@OneToMany(mappedBy="snapshotBI")
	private List<ConsumoInsumo> listaConsumoInsumo;
	
	//Lista com a situação atual de todos os tipos de insumo
	@OneToMany(mappedBy="snapshotBI")
	private List<InsumoDisponivel> listaInsumoDisponivel;
	
	//Lista de atividades que sofreram alteração de status
	@OneToMany(mappedBy="snapshotBI")
	private List<ExecucaoAtividade> listaExecucaoAtividade;
	
	//Lista de registro de paradas que ocorreram no dia
	@OneToMany(mappedBy="snapshotBI")
	private List<RegistroParada> listaRegistroParada;
	
	//Lista de registrode problemas não bloqueantes que ocorreram no dia.
	@OneToMany(mappedBy="snapshotBI")
	private List<RegistroProblemaNaoBloqueante> listaRegistroProblemaNaoBloqueante;
	
	//Lista de afericoes de sensores realizados no dia.
	@OneToMany(mappedBy="snapshotBI")
	private List<Afericao> listaAfericao;
	
	//Lista de incidentes de segurança reportados no dia.
	@OneToMany(mappedBy="snapshotBI")
	private List<IncidenteSeguranca> listaIncidenteSeguranca;

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

	public List<AquisicaoInsumo> getListaAquisicaoInsumo() {
		return listaAquisicaoInsumo;
	}

	public void setListaAquisicaoInsumo(List<AquisicaoInsumo> listaAquisicaoInsumo) {
		this.listaAquisicaoInsumo = listaAquisicaoInsumo;
	}

	public List<ConsumoInsumo> getListaConsumoInsumo() {
		return listaConsumoInsumo;
	}

	public void setListaConsumoInsumo(List<ConsumoInsumo> listaConsumoInsumo) {
		this.listaConsumoInsumo = listaConsumoInsumo;
	}

	public List<InsumoDisponivel> getListaInsumoDisponivel() {
		return listaInsumoDisponivel;
	}

	public void setListaInsumoDisponivel(List<InsumoDisponivel> listaInsumoDisponivel) {
		this.listaInsumoDisponivel = listaInsumoDisponivel;
	}

	public List<ExecucaoAtividade> getListaExecucaoAtividade() {
		return listaExecucaoAtividade;
	}

	public void setListaExecucaoAtividade(List<ExecucaoAtividade> listaExecucaoAtividade) {
		this.listaExecucaoAtividade = listaExecucaoAtividade;
	}

	public List<RegistroParada> getListaRegistroParada() {
		return listaRegistroParada;
	}

	public void setListaRegistroParada(List<RegistroParada> listaRegistroParada) {
		this.listaRegistroParada = listaRegistroParada;
	}

	public List<RegistroProblemaNaoBloqueante> getListaRegistroProblemaNaoBloqueante() {
		return listaRegistroProblemaNaoBloqueante;
	}

	public void setListaRegistroProblemaNaoBloqueante(
			List<RegistroProblemaNaoBloqueante> listaRegistroProblemaNaoBloqueante) {
		this.listaRegistroProblemaNaoBloqueante = listaRegistroProblemaNaoBloqueante;
	}

	public List<Afericao> getListaAfericao() {
		return listaAfericao;
	}

	public void setListaAfericao(List<Afericao> listaAfericao) {
		this.listaAfericao = listaAfericao;
	}

	public List<IncidenteSeguranca> getListaIncidenteSeguranca() {
		return listaIncidenteSeguranca;
	}

	public void setListaIncidenteSeguranca(List<IncidenteSeguranca> listaIncidenteSeguranca) {
		this.listaIncidenteSeguranca = listaIncidenteSeguranca;
	}
	
	

}
