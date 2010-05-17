package br.com.caelum.dominio;

public class Aluno {
	
	private String nome;
	private String endereco;
	
	public Aluno(String nome) {
		this.nome= nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public Aluno moradorDa(String endereco){
		this.endereco=endereco;
		return this;
	}
	

}
