package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import factory.FactoryPessoa;
import pessoa.Pessoa;

public class FactoryPessoaTeste {

	private FactoryPessoa factory;
	private Pessoa pessoa;
	private Pessoa pessoa2;

	@Before
	public void setUp() throws Exception {
		pessoa = new Pessoa("024.685.014-52","Chiquinho","juleobar@gmail.com");
		factory = new FactoryPessoa();
	}

	@Test
	public void testCriaPessoa() throws Exception {
		pessoa2 = factory.criaPessoa("024.685.014-52","Chiquinho","juleobar@gmail.com");

		Assert.assertEquals(pessoa, pessoa2);

	}
		
}
