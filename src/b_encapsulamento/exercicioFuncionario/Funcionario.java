package b_encapsulamento.exercicioFuncionario;

import javax.swing.JOptionPane;

public class Funcionario {

	private String nome;
	private int idade;
	private static int totFunc;
	private final static int idadeMin = 18;

	public void contratacao(String nome, int idade) {
		if (idade < idadeMin) {
			JOptionPane.showMessageDialog(null,
					"Não é possível efetuar a contratação, o candidato não atingiu a idade mínima: " + idadeMin);
			return;
		}
		setNome(nome);
		setIdade(idade);
		totFunc += 1;
		JOptionPane.showMessageDialog(null, "Cadastro de funcionário concluído!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static int getTotFunc() {
		return totFunc;
	}

	public static void setTotFunc(int totFunc) {
		Funcionario.totFunc = totFunc;
	}

	public static int getIdademin() {
		return idadeMin;
	}

}
