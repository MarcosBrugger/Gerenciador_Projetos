package br.edu.senai.springSA6.orm;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Projetos")
public class Projeto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String atividade;
	private String responsavel;
	private Date dataI;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private Date dataF;
	private Integer depende;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataI() {
		return dataI;
	}
	public void setDataI(Date dataI) {
		this.dataI = dataI;
	}
	public Date getDataF() {
		return dataF;
	}
	public void setDataF(Date dataF) {
		this.dataF = dataF;
	}
	public Integer getDepende() {
		return depende;
	}
	public void setDepende(Integer depende) {
		this.depende = depende;
	}

	
	
}
