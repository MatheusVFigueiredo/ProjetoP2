package projeto;

import java.util.Calendar;

import util.Util;

public class Monitoria extends Projeto {
	private String discEspec;
	private String periodoLetivo;
	
	public Monitoria(String nome, String objetivo, Calendar data, int duracao, int codigo, String discEspec, String periodoLetivo) throws Exception{
		super(nome, objetivo, data, duracao, codigo);
		Util.validaString(discEspec);
		Util.validaString(periodoLetivo);
		this.discEspec = discEspec;
		this.periodoLetivo = periodoLetivo;
	}

	public String getDiscEspec() {
		return discEspec;
	}

	public void setDiscEspec(String discEspec) {
		this.discEspec = discEspec;
	}

	public String getPeriodoLetivo() {
		return periodoLetivo;
	}

	public void setPeriodoLetivo(String periodoLetivo) {
		this.periodoLetivo = periodoLetivo;
	}
	
	
}
