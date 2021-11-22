package br.com.fiap.capsuledev.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Paciente {
	private Long codigo;
	private String nome;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date nascimento;
	private String nascimentoFormatado;
	private String rg;
	private String genero;
	private String nomeMae;
	private String endereco;
	private String contato;
	private String telefone;
	private String orgao;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date transplante;
	private String transplanteFormatado;
	private List<Monitoramento> monitoramentos = new ArrayList<Monitoramento>();
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getNascimentoFormatado() {
		return nascimentoFormatado;
	}
	public void setNascimentoFormatado(String nascimentoFormatado) {
		this.nascimentoFormatado = nascimentoFormatado;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public Date getTransplante() {
		return transplante;
	}
	public void setTransplante(Date transplante) {
		this.transplante = transplante;
	}
	
	public String getTransplanteFormatado() {
		return transplanteFormatado;
	}
	public void setTransplanteFormatado(String transplanteFormatado) {
		this.transplanteFormatado = transplanteFormatado;
	}
	public List<Monitoramento> getMonitoramentos() {
		return monitoramentos;
	}
	public void setMonitoramentos(List<Monitoramento> monitoramentos) {
		this.monitoramentos = monitoramentos;
	}
	
}
