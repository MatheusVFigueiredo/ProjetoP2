package pessoa;

import java.util.HashMap;

import exception.EntradaInvalidaException;
import projeto.Projeto;
import util.Util;

public class Pessoa {
	private String cpf;
	private String nome;
	private String email;
	private HashMap<String, Projeto> colecaoProjeto;

	public Pessoa(String cpf, String nome, String email) throws Exception {

		Util.validaCpf(cpf);
		Util.validaEmail(email);
		Util.validaString(nome);

		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		colecaoProjeto = new HashMap<>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String pessoa) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	

}
