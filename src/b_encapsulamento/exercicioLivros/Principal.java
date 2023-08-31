package b_encapsulamento.exercicioLivros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		List<Livro> listaLivro = new ArrayList<>();

		while (Integer
				.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo livro?\n1 - Sim\n2 - Não")) == 1) {
			Livro livro = new Livro();
			livro.cadastrarLivro();
			listaLivro.add(livro);
		}

		if (Integer.parseInt(JOptionPane.showInputDialog("Deseja listar todos os livros?\n1 - Sim\n2 - Não")) == 1) {
			for (Livro livro : listaLivro) {
				JOptionPane.showMessageDialog(null, livro.exibirLivro());
			}
		}

		if (Integer.parseInt(
				JOptionPane.showInputDialog("Deseja procurar os livros de algum autor?\n1 - Sim\n2 - Não")) == 1) {
			String nome = JOptionPane.showInputDialog("Digite o nome do autor que deseja pesquisar: ");
			List<Livro> livrosAutor = pesquisaLivrosAutor(listaLivro, nome);

			if (livrosAutor.isEmpty()) {
				JOptionPane.showMessageDialog(null, "O autor digitado não tem nenhum livro!");
				return;
			}

			JOptionPane.showMessageDialog(null, "Os livros do autor digitado são: ");
			for (Livro livro : livrosAutor) {
				JOptionPane.showMessageDialog(null, livro.exibirLivro());
			}
		}

		if (Integer.parseInt(
				JOptionPane.showInputDialog("Deseja procurar os livros pelo sexo do autor?\n1 - Sim\n2 - Não")) == 1) {
			char sexo = JOptionPane.showInputDialog("Digite o sexo do autor que deseja pesquisar (M/F): ").toUpperCase()
					.charAt(0);
			List<Livro> livrosSexo = pesquisaLivrosSexo(listaLivro, sexo);

			if (livrosSexo.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não existe nenhum livro com o sexo digitado!");
				return;
			}

			JOptionPane.showMessageDialog(null, "Os livros com o sexo digitado são: ");
			for (Livro livro : livrosSexo) {
				JOptionPane.showMessageDialog(null, livro.exibirLivro());
			}
		}

		if (Integer.parseInt(JOptionPane
				.showInputDialog("Deseja procurar os livros por uma faixa de valor?\n1 - Sim\n2 - Não")) == 1) {
			double valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite a faixa de valor inicial: "));
			double valorFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a faixa de valor final: "));

			List<Livro> livrosValor = pesquisaLivrosValor(listaLivro, valorInicial, valorFinal);

			if (livrosValor.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não existe nenhum livro com a faixa de valor digitada!");
				return;
			}

			JOptionPane.showMessageDialog(null, "Os livros com a faixa de valor digitada são: ");
			for (Livro livro : livrosValor) {
				JOptionPane.showMessageDialog(null, livro.exibirLivro());
			}
		}

		if (Integer.parseInt(JOptionPane.showInputDialog(
				"Deseja procurar os livros em que o autor tenha até no máximo uma certa idade?\n1 - Sim\n2 - Não")) == 1) {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do autor que deseja pesquisar: "));

			List<Livro> livrosIdade = pesquisaLivrosIdade(listaLivro, idade);

			if (livrosIdade.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não existe nenhum livro para a faixa de idade digitada!");
				return;
			}

			JOptionPane.showMessageDialog(null, "Os livros com a faixa de idade digitada são: ");
			for (Livro livro : livrosIdade) {
				JOptionPane.showMessageDialog(null, livro.exibirLivro());
			}
		}
	}

	public static List<Livro> pesquisaLivrosIdade(List<Livro> livros, int idade) {
		List<Livro> livrosSelecionados = new ArrayList<>();

		for (Livro livro : livros) {
			boolean livroEncontrado = false;

			for (Autor autor : livro.getAutores()) {
				if (autor.getIdade() <= idade) {
					livroEncontrado = true;
					break;
				}
			}

			if (livroEncontrado) {
				livrosSelecionados.add(livro);
			}
		}

		return livrosSelecionados;
	}

	public static List<Livro> pesquisaLivrosValor(List<Livro> livros, double valorInicio, double valorFim) {
		List<Livro> livrosSelecionados = new ArrayList<>();

		for (Livro livro : livros) {
			boolean livroEncontrado = livro.getPreco() >= valorInicio && livro.getPreco() <= valorFim;

			if (livroEncontrado) {
				livrosSelecionados.add(livro);
			}
		}

		return livrosSelecionados;
	}

	public static List<Livro> pesquisaLivrosSexo(List<Livro> livros, char sexo) {
		List<Livro> livrosSelecionados = new ArrayList<>();

		for (Livro livro : livros) {
			boolean livroEncontrado = false;

			for (Autor autor : livro.getAutores()) {
				if (autor.getSexo() == sexo) {
					livroEncontrado = true;
					break;
				}
			}

			if (livroEncontrado) {
				livrosSelecionados.add(livro);
			}
		}

		return livrosSelecionados;
	}

	public static List<Livro> pesquisaLivrosAutor(List<Livro> livros, String nomeAutor) {
		List<Livro> livrosSelecionados = new ArrayList<>();

		for (Livro livro : livros) {
			boolean autorEncontrado = false;

			for (Autor autor : livro.getAutores()) {
				if (autor.getNome().equalsIgnoreCase(nomeAutor)) {
					autorEncontrado = true;
					break;
				}
			}

			if (autorEncontrado) {
				livrosSelecionados.add(livro);
			}
		}

		return livrosSelecionados;

	}

}
