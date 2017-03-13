package projeto;

import java.util.Calendar;
import java.util.HashMap;

import util.Util;

public class PET extends Projeto{
	private int comunidade;
	private int aprovacao;
	private HashMap<String, Integer> produtividade;
	
	public PET(String nome, String objetivo, Calendar data, int duracao, int codigo, int comunidade, int aprovacao) throws Exception{
		super(nome, objetivo, data, duracao, codigo);
		
		Util.validaInt(comunidade);
		Util.validaInt(aprovacao);
		
		this.comunidade = comunidade;
		this.aprovacao = aprovacao;
		produtividade = new HashMap<>();
	}

	public int getComunidade() {
		return comunidade;
	}

	public void setComunidade(int comunidade) {
		this.comunidade = comunidade;
	}

	public int getAprovacao() {
		return aprovacao;
	}

	public void setAprovacao(int aprovacao) {
		this.aprovacao = aprovacao;
	}

	public HashMap<String, Integer> getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(HashMap<String, Integer> produtividade) {
		this.produtividade = produtividade;
	}
	
	
	
}
