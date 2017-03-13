package util;

import java.util.Calendar;

import exception.CpfInvalidoException;
import exception.EntradaInvalidaException;
import exception.PessoaInvalidaException;
import exception.StringInvalidaException;
import pessoa.Pessoa;

public class Util {
	public static final String ERRO_NOME_NULO_VAZIO = "Nome nulo ou vazio";
	public static final String ERRO_CPF_NULO_VAZIO = "CPF nulo ou vazio";
	public static final String ERRO_EMAIL_NULO_VAZIO = "Email nulo ou vazio";
	public static final String ERRO_CPF_INVALIDO = "CPF invalido";
	public static final String ERRO_EMAIL_INVALIDO = "Email invalido";
	public static final String ERRO_CADASTRAR_PESSOA = "Erro no cadastro de pessoa: ";
	public static final String ERRO_ATUALIZAR_PESSOA = "Erra na atualiza��o de pessoa: ";
	public static final String ERRO_INT_DOUBLE = "Valor invalido";
	public static final String ERRO_ATUALIZACAO_PESSOA = "Erro na atualizacao de pessoa: ";
	public static final String ERRO_CADASTRO_PESSOA = "Erro no cadastro de pessoa: ";
	public static final String ERRO_CPF_NAO_ALTERA = "CPF nao pode ser alterado";
	public static final String ERRO_PESSOA_INEXISTENTE = "Pessoa nao encontrada";
	public static final String ERRO_CONSULTA_PESSOA  = "Erro na consulta de pessoa: ";
	public static final String ERRO_CPF_CADASTRADO = "Pessoa com mesmo CPF ja cadastrada";
	public static final String ERRO_PESSOA_NAO_ENCONTRADA = "Pessoa nao encontrada";

	private Util(){}

	public static void validaString(String string) throws StringInvalidaException{
		if(string == null || string.trim().isEmpty()){
			throw new StringInvalidaException(ERRO_NOME_NULO_VAZIO);
		}
	}
	
	public static void validaInt(int num) throws EntradaInvalidaException{
		if(num <= 0){
			throw new EntradaInvalidaException(ERRO_INT_DOUBLE);
		}
	}
	
	public static void validaDouble(double num) throws EntradaInvalidaException{
		if(num <= 0){
			throw new EntradaInvalidaException(ERRO_INT_DOUBLE);
		}
	}
	
	public static void validaCpf(String cpf) throws CpfInvalidoException {
		if(cpf == null || cpf.trim().isEmpty()){
			throw new CpfInvalidoException(ERRO_CPF_NULO_VAZIO);
		}
		String regex = "[0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9]-[0-9][0-9]";
		if(!cpf.matches(regex)){
			throw new CpfInvalidoException(ERRO_CPF_INVALIDO);
		}
	}
	
	public static void validaEmail(String email) throws StringInvalidaException{
		if(email == null || email.trim().isEmpty()){
			throw new StringInvalidaException(ERRO_EMAIL_NULO_VAZIO);
		}
		String regex = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+(.[A-Za-z]+)*";
		if(!email.matches(regex)){
			throw new StringInvalidaException(ERRO_EMAIL_INVALIDO);
		}
	}

	public static void verificaAtributo(String valor) throws EntradaInvalidaException{
		if(valor.equalsIgnoreCase("cpf")){
			throw new EntradaInvalidaException(ERRO_CPF_NAO_ALTERA);
		}
	}
	
	public static boolean validaData(Calendar data){
		if(data == null){
			return false;
		}
			return true;
	}
	
	public static void procuraPessoa(Pessoa pessoa) throws PessoaInvalidaException{
		if(pessoa==null){
			throw new PessoaInvalidaException(ERRO_PESSOA_NAO_ENCONTRADA);
		}
	}
	
	public static void cpfJaCadastrado(boolean funcao) throws CpfInvalidoException{
		if(funcao){
			throw new CpfInvalidoException(ERRO_CPF_CADASTRADO);
		}
	}
}
