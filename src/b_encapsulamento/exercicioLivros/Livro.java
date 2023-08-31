package b_encapsulamento.exercicioLivros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Livro {

	private String titulo;
	private double preco;
	private List<Autor> autores = new ArrayList<>();

	public void cadastrarLivro() {
		do {
			setTitulo(JOptionPane.showInputDialog("Qual o nome do livro?"));
			setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do livro?")));
		} while (!validarLivro(this));

		int resp = Integer
				.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um autor para o livro?\n1 - Sim\n2 - Não"));

		while (resp == 1 || autores.isEmpty()) {
			if (autores.isEmpty() && resp != 1) {
				JOptionPane.showMessageDialog(null, "Um livro precisa ter ao menos um autor!");
			}

			Autor autor = new Autor();
			autor.cadastrarAutor();
			adicionarAutor(autor);

			resp = Integer
					.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um autor para o livro?\n1 - Sim\n2 - Não"));
		}
	}

	public boolean validarLivro(Livro livro) {
		if (livro.getTitulo() == null || livro.getTitulo().equals("") || livro.getPreco() <= 0) {
			JOptionPane.showMessageDialog(null,
					"Os dados informados para o livro são inválidos, tente cadastrar novamente!");
			return false;
		}

		return true;
	}

	public void adicionarAutor(Autor autor) {
		if (autores.size() == 4) {
			JOptionPane.showMessageDialog(null, "Não é permitido ter mais de 4 autores em um livro!");
		}

		autores.add(autor);
	}

	public String exibirLivro() {
		String dados = "";

		dados += "Nome do livro: " + getTitulo() + "\nPreço do livro: R$" + getPreco() + "\n\n";
		dados += "Autores:\n";

		for (Autor autor : autores) {
			dados += "Nome: " + autor.getNome() + "\nIdade: " + autor.getIdade() + "\nSexo: " + autor.getSexo()
					+ "\n\n";
		}

		return dados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.toLowerCase();
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			JOptionPane.showMessageDialog(null, "Atenção, não é possível inserir um valor menor ou igual a zero!");
			return;
		}

		this.preco = preco;
	}

	public List<Autor> getAutores() {
		return autores;
	}

}
