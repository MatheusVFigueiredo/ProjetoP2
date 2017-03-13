package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import projeto.Monitoria;
import projeto.PED;

public class MonitoriaTeste {
	
	
	private Monitoria projeto;
	private Monitoria projeto2;
	private Calendar calendar;

	@Before
	public void setUp() throws Exception {

		calendar = Calendar.getInstance();
		projeto = new Monitoria("Guardians", "guardar", calendar, 90, 1234, "P2", "2016.1");

	}

	@Test
	public void testConstrutor() {
		
		try {

			projeto2 = new Monitoria("Guardians", "guardar", calendar, 90, 1234, "P2", "2016.1");

		} catch (Exception e) {
			Assert.fail("Não deveria ser lancada exception nesse caso");
		}

		try {

			projeto2 = new Monitoria("Guardians", "guardar", calendar, 90, 1234, "", "2016.1");
			Assert.fail("Lancamento de exception com nome da disciplina especifica vazio");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			projeto2 = new Monitoria("Guardians", "guardar", calendar, 90, 1234, null, "2016.1");
			Assert.fail("Lancamento de exception com nome da disciplina especifica nulo");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			projeto2 = new Monitoria("Guardians", "guardar", calendar, 90, 1234, "P2", "");
			Assert.fail("Lancamento de exception com o periodo vazio");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			projeto2 = new Monitoria("Guardians", "guardar", calendar, 90, 1234, "P2", null);
			Assert.fail("Lancamento de exception com o periodo nulo");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
	}

}
