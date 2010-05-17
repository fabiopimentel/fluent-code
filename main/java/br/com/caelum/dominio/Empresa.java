package br.com.caelum.dominio;

public class Empresa {
	
	private String nome;
	private Curso curso;
	
	public Empresa(String nome) {
		this.nome = nome;
	}
	public Empresa(){
		
	}
	public static Empresa deNome(String nome){
		Empresa empresa = new Empresa(nome);
		return empresa;
		
	}

	public Curso vende(String descricao){
		curso = new Curso(descricao);
		return curso;
		
	}
	
	@Override
	public String toString() {
		return "Empresa " +this.nome +" vende "+ curso.getDescricao() +" com valor de "+ curso.getPreco()+ " para "+ curso.getAluno().getNome()+ " que mora na "+ curso.getAluno().getEndereco();
	}

	
	
	
}
