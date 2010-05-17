package br.com.caelum.test;

import br.com.caelum.dominio.Empresa;

public class Testa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Empresa empresa = Empresa.deNome("caelum");
		Empresa.deNome("caelum").vende("curso-fj11").comValorDe(1000.00).paraAlunoDeNome("Fábio Pimentel").moradorDa("R. Itabaiana");
		
		//System.out.println(empresa);
		

	}

}
