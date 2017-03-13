package projeto;

import java.util.Calendar;

import util.Util;

public class Extensao extends Projeto{
	
	private String objetivoDaExtensao;
	private int comunidade;
	
	public Extensao(String nome, String objetivo, Calendar data, int duracao, int codigo, String objetivoDaExtensao, int comunidade) throws Exception{
		super(nome, objetivo, data, duracao, codigo);
		Util.validaString(objetivoDaExtensao);
		Util.validaInt(comunidade);
		this.objetivoDaExtensao = objetivoDaExtensao;
		this.comunidade = comunidade;
	}

	public String getObjetivoDaExtensao() {
		return objetivoDaExtensao;
	}

	public void setObjetivoDaExtensao(String objetivoDaExtensao) {
		this.objetivoDaExtensao = objetivoDaExtensao;
	}

	public int getComunidade() {
		return comunidade;
	}

	public void setComunidade(int comunidade) {
		this.comunidade = comunidade;
	}
	
	
}
