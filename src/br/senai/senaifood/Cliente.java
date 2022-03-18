package br.senai.senaifood;

import java.util.Map;

public class Cliente extends Pessoa {

	private String email;
	private Map<String, Endereco> enderecoPorApelido;
	
	public Cliente() {
		super(TipoPessoa.CLIENTE);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<String, Endereco> getEnderecoPorApelido() {
		return enderecoPorApelido;
	}

	public void setEnderecoPorApelido(Map<String, Endereco> enderecoPorApelido) {
		this.enderecoPorApelido = enderecoPorApelido;
	}

	@Override
	public String toString() {
		return this.nome + ":" + this.email;
	}
}
