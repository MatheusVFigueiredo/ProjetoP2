package projeto;

import util.Util;

public class Despesas {
	private double valor;
	private String descricao;

	public Despesas(double valor, String descricao) throws Exception {
		
		Util.validaString(descricao);
		Util.validaDouble(valor);
		
		this.valor = valor;
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
