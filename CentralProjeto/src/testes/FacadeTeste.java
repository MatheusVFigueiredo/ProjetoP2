package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import centralprojeto.Facade;
import pessoa.PessoaController;

public class FacadeTeste {
	
	private PessoaController controllerPessoa;
	private Facade facade;
	private String stringGenerica;

	@Before
	public void setUp() throws Exception {
		
		controllerPessoa = new PessoaController();
		facade = new Facade();
		
	}

	@Test
	public void testCadastraPessoa() throws Exception {
		
		stringGenerica = facade.cadastraPessoa("024.685.014-52", "Dilma", "LulaLindo@gmail.com");
		Assert.assertEquals("024.685.014-52", stringGenerica);
	}

}
