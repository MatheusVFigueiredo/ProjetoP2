package testes;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pessoa.Pessoa;
import projeto.PET;

public class PETTeste {

	private PET projeto;
	private PET projeto2;
	private Calendar calendar;

	@Before
	public void setUp() throws Exception {

		calendar = Calendar.getInstance();
		projeto = new PET("Guardians", "guardar", calendar, 90, 1234, 8, 6);

	}

	@Test
	public void testConstrutor() {

		try {

			projeto2 = new PET("Guardians", "guardar", calendar, 90, 1234, 8, 6);

		} catch (Exception e) {
			Assert.fail("Não deveria ser lancada exception nesse caso");
		}

		try {

			projeto2 = new PET("Guardians", "guardar", calendar, 90, 1234, 0, 6);
			Assert.fail("Lancamento de exception com comunidade nula");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}

		try {

			projeto2 = new PET("Guardians", "guardar", calendar, 90, 1234, -5, 6);
			Assert.fail("Lancamento de exception com comunidade negativa");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}

		try {

			projeto2 = new PET("Guardians", "guardar", calendar, 90, 1234, 8, 0);
			Assert.fail("Lancamento de exception com aprovacao nula");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}

		try {

			projeto2 = new PET("Guardians", "guardar", calendar, 90, 1234, 8, -7);
			Assert.fail("Lancamento de exception com aprovacao negativa");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}

	}

}
