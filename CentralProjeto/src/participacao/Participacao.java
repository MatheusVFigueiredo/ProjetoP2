package participacao;

import java.util.Calendar;

import util.Util;

public class Participacao {
	
	private Calendar dataInicio;
	private int qtdMeses;
	private int qtdHorasSemanais;
	private int valorHora;
	
	public Participacao(Calendar dataInicio, int qtdmeses, int qtdHorasSemanais, int valorHora) throws Exception{
		
		Util.validaData(dataInicio);
		Util.validaInt(qtdmeses);
		Util.validaInt(qtdHorasSemanais);
		Util.validaInt(valorHora);
		
		this.qtdMeses = qtdmeses;
		this.qtdHorasSemanais = qtdHorasSemanais;
		this.valorHora = valorHora;
		
	}
}
