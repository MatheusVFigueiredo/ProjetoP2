package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import projeto.Despesas;
import projeto.Monitoria;

public class DespesasTeste {

	private Despesas despesa;
	private Despesas despesa2;
	
	@Before
	public void setUp() throws Exception {

		
		despesa = new Despesas(300,"Descricao");

	}
	
	@Test
	public void testConstrutor() {
		
		try {


			despesa2 = new Despesas(300,"Descricao");

		} catch (Exception e) {
			Assert.fail("Não deveria ser lancada exception nesse caso");
		}

		try {

			despesa2 = new Despesas(300,"");
			Assert.fail("Lancamento de exception com descricao vazia");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			despesa2 = new Despesas(300,null);
			Assert.fail("Lancamento de exception com descricao nula");

		} catch (Exception e) {
			Assert.assertEquals("Nome nulo ou vazio", e.getMessage());
		}
		
		try {

			despesa2 = new Despesas(0,"Descricao");
			Assert.fail("Lancamento de exception com valor nulo");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
		
		try {

			despesa2 = new Despesas(-3,"Descricao");
			Assert.fail("Lancamento de exception com valor negativo");

		} catch (Exception e) {
			Assert.assertEquals("Valor invalido", e.getMessage());
		}
	}

}
