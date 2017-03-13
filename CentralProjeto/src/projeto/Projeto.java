package projeto;

import java.util.Calendar;
import java.util.HashMap;

import participacao.Participacao;
import util.Util;

public abstract class Projeto {
	private String nome;
	private String objetivo;
	private Calendar data;
	private int duracao;
	private int codigo;
	private HashMap<String, Participacao> colecaoParticipacao;

	public Projeto(String nome, String objetivo, Calendar data, int duracao, int codigo) throws Exception {
		
		Util.validaString(nome);
		Util.validaString(objetivo);
		Util.validaInt(duracao);
		Util.validaInt(codigo);
		
		this.nome = nome;
		this.objetivo = objetivo;
		this.data = data;
		this.duracao = duracao;
		this.codigo = codigo;
		colecaoParticipacao = new HashMap<>();
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
