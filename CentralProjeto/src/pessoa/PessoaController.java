package pessoa;

import java.util.HashMap;

import exception.CpfInvalidoException;
import exception.EntradaInvalidaException;
import exception.StringInvalidaException;
import factory.FactoryPessoa;
import util.Util;

public class PessoaController {
	
	private FactoryPessoa factoryPessoa;
	private RepositoryPessoa repositoryPessoa;
	
	public PessoaController(){
		factoryPessoa = new FactoryPessoa();
		repositoryPessoa = new RepositoryPessoa();
	}
	
	public Pessoa criaPessoa(String cpf, String nome, String email) throws Exception{
		return factoryPessoa.criaPessoa(cpf, nome, email);
	}
	
	public String cadastraPessoa(String cpf, String nome, String email) throws Exception{
		try{
			Util.cpfJaCadastrado(repositoryPessoa.verificaCpfCadastrado(cpf));
			repositoryPessoa.adicionaPessoa(criaPessoa(cpf, nome, email));
			return cpf;
		}catch(Exception e){
			throw new Exception(Util.ERRO_CADASTRO_PESSOA + e.getMessage());
		}
	}
	
	public void atualizaPessoa(String cpf, String atributo, String valor) throws Exception{
		try{
			Util.validaCpf(cpf);
			Util.validaString(atributo);
			Util.validaString(valor);
			Util.verificaAtributo(atributo);
			if(atributo.equals("Email")){
			Util.validaEmail(valor);
			}
			Pessoa pessoa = repositoryPessoa.getPessoa(cpf);
			alterarAtributo(pessoa, atributo, valor);
		}catch(Exception e){
			throw new Exception(Util.ERRO_ATUALIZACAO_PESSOA + e.getMessage());
		}
	}
	
	private void alterarAtributo(Pessoa pessoa, String atributo, String valor){
		if(atributo.equals("Email")){
			pessoa.setEmail(valor);
		}
		if(atributo.equals("Nome")){
			pessoa.setNome(valor);
		}
	}
	
	public void removePessoa(String cpf) throws EntradaInvalidaException{
		try{
			Util.validaCpf(cpf);
			Pessoa pessoa = repositoryPessoa.getPessoa(cpf);
			Util.procuraPessoa(pessoa);
			repositoryPessoa.removerPessoa(cpf);
		}catch(Exception e){
			throw new EntradaInvalidaException(e.getMessage());
		}
	}
	
	public String mostrarAtributoPessoa(String cpf, String atributo) throws Exception{
		try{
			Util.validaString(atributo);
			Util.validaCpf(cpf);
			Pessoa pessoa = repositoryPessoa.getPessoa(cpf);
			Util.procuraPessoa(pessoa);
			if(atributo.equals("Nome")){
				return pessoa.getNome();
			}
			else if(atributo.equals("Email")){
				return pessoa.getEmail();
			}else{
				return null;
			}
		}catch(Exception e){
			throw new Exception(Util.ERRO_CONSULTA_PESSOA + e.getMessage());
		}
	}
	
}
