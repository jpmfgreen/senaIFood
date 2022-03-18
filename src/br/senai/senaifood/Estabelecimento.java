package br.senai.senaifood;

import java.util.Set;

public class Estabelecimento {

	private String cnpj;
	private String nome;
	private int previsaoMinima;
	private int previsaoMaxima;
	private Set<Produto> produtos;
	private CategoriaEstabelecimento categoria;
	
	public Estabelecimento() {
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrevisaoMinima() {
		return previsaoMinima;
	}

	public void setPrevisaoMinima(int previsaoMinima) {
		this.previsaoMinima = previsaoMinima;
	}

	public int getPrevisaoMaxima() {
		return previsaoMaxima;
	}

	public void setPrevisaoMaxima(int previsaoMaxima) {
		this.previsaoMaxima = previsaoMaxima;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public CategoriaEstabelecimento getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEstabelecimento categoria) {
		this.categoria = categoria;
	}
	
}
