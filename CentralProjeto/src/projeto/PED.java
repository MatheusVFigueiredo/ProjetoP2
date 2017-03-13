package projeto;

import java.util.Calendar;
import java.util.HashMap;

import util.Util;

public class PED extends Projeto{
	private String modalidade;
	private HashMap<String, Integer> produtividade;
	
	public PED(String nome, String objetivo, Calendar data, int duracao, int codigo, String modalidade) throws Exception{
		super(nome, objetivo, data, duracao, codigo);
		Util.validaString(modalidade);
		this.modalidade = modalidade;
		produtividade = new HashMap<>();
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public HashMap<String, Integer> getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(HashMap<String, Integer> produtividade) {
		this.produtividade = produtividade;
	}
	
	
}
