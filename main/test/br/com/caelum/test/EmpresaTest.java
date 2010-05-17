package br.com.caelum.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.dominio.Empresa;

public class EmpresaTest {

	private Empresa empresa;

	@Before()
	public void init() {

		empresa = Empresa.deNome("caelum");
		empresa.vende("curso abc").comValorDe(1000.0).paraAlunoDeNome("Fabio").moradorDa("R. Itabaiana");

	}

	@Test
	public void testaToString() {
		
		assertEquals("Empresa caelum vende curso abc com valor" +
				" de 1000.0 para Fabio que mora na R. Itabaiana",
				empresa.toString());
	}
}
