package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import projeto.PED;
import projeto.PET;

public class PEDTeste {

	private PED projeto;
	private PED projeto2;
	private Calendar calendar;

	@Before
	public void setUp() throws Exception {

		calendar = Calendar.getInstance();
		projeto = new PED("Guardians", "guardar", calendar, 90, 1234, "Pesquisa");

	}

	@Test
	public void testConstrutor() {

		try {

			projeto2 = new PED("Guardians", "guardar", calendar, 90, 1234, "Pesquisa");

		} catch (Exception e) {
			Assert.fail("Não deveria ser lancada exception nesse caso");
		}

		try {

			projeto2 = new PED("Guardians", "guardar", calendar, 90, 1234, "");
			Assert.fail("Lancamento de exception com nome da modalidade vazio");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			projeto2 = new PED("Guardians", "guardar", calendar, 90, 1234, null);
			Assert.fail("Lancamento de exception com nome da modalidade nulo");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
	}

}
