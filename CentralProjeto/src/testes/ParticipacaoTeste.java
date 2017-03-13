package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import participacao.Participacao;
import pessoa.Pessoa;
import projeto.PED;

public class ParticipacaoTeste {

	private Participacao participacao;
	private Participacao participacao2;
	private Calendar calendar;

	@Before
	public void setUp() throws Exception {

		calendar = Calendar.getInstance();
		participacao = new Participacao(calendar,6, 20, 10);

	}
	
	@Test
	public void testConstrutor() {
		
		try {

			participacao = new Participacao(calendar,6, 20, 10);

		} catch (Exception e) {
			Assert.fail("Não deveria ser lancada exception nesse caso");
		}
		
		try {

			participacao = new Participacao(calendar,0, 20, 10);
			Assert.fail("Lancamento de exception com quantidade de meses nula");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		try {

			participacao = new Participacao(calendar,-4, 20, 10);
			Assert.fail("Lancamento de exception com quantidade de meses negativa");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		try {

			participacao = new Participacao(calendar,6, 0, 10);
			Assert.fail("Lancamento de exception com quantidade de horas semanais nula");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		try {

			participacao = new Participacao(calendar,6, -38, 10);
			Assert.fail("Lancamento de exception com quantidade de horas semanais negativa");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		try {

			participacao = new Participacao(calendar,6, 20, 0);
			Assert.fail("Lancamento de exception com valor hora nulo");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		try {

			participacao = new Participacao(calendar,6, 20, -10);
			Assert.fail("Lancamento de exception com valor hora negativo");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		
	}

}
