package d_relacionamento_entre_classes;

import java.util.ArrayList;

public class Bibliotecario {
	
	private String nome;
	private Livro livro;
	ArrayList<Livro> livros = new ArrayList<>();
	
	public void cadastrarLivro(String t, Autor a) {
		Livro l = new Livro();
		l.setAutor(a);
		l.setTitulo(t);
		livros.add(l);
	}
	
	public Bibliotecario() {
		this.livro = new Livro();
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
