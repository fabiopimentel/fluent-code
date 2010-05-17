package br.com.caelum.dominio;

public class Curso {
	
	private String descricao;
	private double preco;
	private Aluno aluno;
	
	
	public Curso(String descricao) {
		this.descricao = descricao;
	}
	
	public Curso comValorDe(double preco){
		this.preco = preco;
		return this;
	}
	public Aluno paraAlunoDeNome(String nome){
		aluno = new Aluno(nome);
		return this.aluno;
		
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public Aluno getAluno() {
		return aluno;
	}

}
