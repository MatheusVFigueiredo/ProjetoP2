package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import projeto.Extensao;
import projeto.Monitoria;

public class ExtensaoTeste {
	
	
	private Extensao projeto;
	private Extensao projeto2;
	private Calendar calendar;

	@Before
	public void setUp() throws Exception {

		calendar = Calendar.getInstance();
		projeto = new Extensao("Guardians", "guardar", calendar, 90, 1234, "Mudar o mundo", 5);

	}

	@Test
	public void test() {
		
		try {

			projeto2 = new Extensao("Guardians", "guardar", calendar, 90, 1234, "Mudar o mundo", 5);

		} catch (Exception e) {
			Assert.fail("Não deveria ser lancada exception nesse caso");
		}

		try {

			projeto2 = new Extensao("Guardians", "guardar", calendar, 90, 1234, null, 5);
			Assert.fail("Lancamento de exception com o objetivo nulo");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			projeto2 = new Extensao("Guardians", "guardar", calendar, 90, 1234, "", 5);
			Assert.fail("Lancamento de exception com o objetivo vazio");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			projeto2 = new Extensao("Guardians", "guardar", calendar, 90, 1234, "Mudar o mundo", 0);
			Assert.fail("Lancamento de exception com comunidade nula");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		try {

			projeto2 = new Extensao("Guardians", "guardar", calendar, 90, 1234, "Mudar o mundo", -4);
			Assert.fail("Lancamento de exception com comunidade nula");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
	}

}
