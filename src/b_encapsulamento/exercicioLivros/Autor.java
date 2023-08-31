package b_encapsulamento.exercicioLivros;

import javax.swing.JOptionPane;

public class Autor {

	private String nome;
	private char sexo;
	private int idade;

	public void cadastrarAutor() {
		do {
			setNome(JOptionPane.showInputDialog("Digite o nome do autor (apenas nome e sobrenome): "));
			setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do autor: ")));
			setSexo(JOptionPane.showInputDialog("Qual o sexo do autor? (M/F)").toUpperCase().charAt(0));
		} while (!validarCadastro(this));
	}

	public boolean validarCadastro(Autor autor) {
		String[] tamanhoNome = autor.getNome().trim().split(" ");

		if ((tamanhoNome.length != 2) || (autor.getSexo() != 'M' && autor.getSexo() != 'F')
				|| (autor.getIdade() <= 0)) {
			JOptionPane.showMessageDialog(null, "Os dados informados são inválidos, tente cadastrar novamente!");
			return false;
		}

		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
