package d_relacionamento_entre_classes;

import javax.swing.JOptionPane;

public class Livro {
	
	private String titulo;
	private Autor autor;
	private Bibliotecario bibliotecario;
	private String nome;
	
	public void CadLivro(Autor autor, Bibliotecario bibliotecario) {
		this.autor = autor;
		this.bibliotecario = bibliotecario;
	}
	
	public void Emprestar(String nome) {
		this.nome = nome;
		String mensagem = nome +  ", você pegou este livro emprestado :D";
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
}
