package pessoa;

import java.util.HashMap;

public class RepositoryPessoa {
	
	private HashMap<String, Pessoa> pessoas;
	
	public RepositoryPessoa(){
		pessoas = new HashMap<>();
	}
	
	public void adicionaPessoa(Pessoa pessoa){
		pessoas.put(pessoa.getCpf(), pessoa);
	}
	
	public void removerPessoa(String cpf){
		pessoas.remove(cpf);
	}
	
	public boolean verificaCpfCadastrado(String cpf){
		return pessoas.containsKey(cpf);
	}
	
	public Pessoa getPessoa(String cpf){
		return pessoas.get(cpf);
	}
}
