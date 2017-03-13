package factory;

import pessoa.Pessoa;

public class FactoryPessoa {
	public Pessoa criaPessoa(String cpf, String nome, String email) throws Exception{
		Pessoa pessoa = new Pessoa(cpf, nome, email);
		return pessoa;
	}
}
