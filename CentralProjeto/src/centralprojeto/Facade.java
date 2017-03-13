package centralprojeto;

import easyaccept.EasyAccept;
import exception.EntradaInvalidaException;
import pessoa.PessoaController;

public class Facade {
	private PessoaController controllerPessoa;
	
	public void iniciaSistema(){};
	public void fechaSistema(){};
	public Facade(){
		controllerPessoa = new PessoaController();
	}
	
	public String cadastraPessoa(String cpf, String nome, String email) throws Exception{
		return controllerPessoa.cadastraPessoa(cpf, nome, email);
	}
	
	public void editaPessoa(String cpf, String atributo, String valor) throws Exception{
		controllerPessoa.atualizaPessoa(cpf, atributo, valor);
	}
	
	public void removePessoa(String cpf) throws EntradaInvalidaException{
		controllerPessoa.removePessoa(cpf);
	}
	
	public String getInfoPessoa(String cpf, String atributo) throws Exception{
		return controllerPessoa.mostrarAtributoPessoa(cpf, atributo);
	}
	public static void main(String[] args){
		args = new String[]{"centralprojeto.facade","acceptance_tests/us1_test.txt","acceptance_tests/us1_test_exception.txt"};
		EasyAccept.main(args);
	}
}
