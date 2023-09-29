package d_relacionamento_entre_classes;

import java.util.ArrayList;

public class Autor {
	
	private String nome;
	private Livro livro;
	ArrayList<Livro> livros = new ArrayList<>();
	
	public void CadastrarAutor(String nome, Livro livros) {
		this.nome = nome;
		this.livro = livro;
	}
	
	public void AddLivro () {
		
	}
	
	public Autor(Livro livro) {
		this.livro = livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	

}
