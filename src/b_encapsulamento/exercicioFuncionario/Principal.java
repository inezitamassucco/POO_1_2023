package b_encapsulamento.exercicioFuncionario;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Funcionario> listaFunc = new ArrayList<>();

		JOptionPane.showMessageDialog(null, "Requisitos: \nIdade mínima: " + Funcionario.getIdademin() + " anos");

		while (Integer.parseInt(
				JOptionPane.showInputDialog("Deseja cadastrar um novo funcionário?\n1 - Sim\n2 - Não")) == 1) {
			String nome;
			int idade;
			Funcionario func = new Funcionario();

			nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do funcionário: "));

			if (!listaFunc.isEmpty()) {
				boolean contAnt = false;

				for (Funcionario funcionario : listaFunc) {
					if (func.getNome().equalsIgnoreCase(nome)) {
						contAnt = true;
						break;
					}
				}

				if (contAnt) {
					JOptionPane.showMessageDialog(null, "Funcionário já cadastrado");
					continue;
				}
			}

			func.contratacao(nome, idade);
			listaFunc.add(func);
		}

		JOptionPane.showMessageDialog(null,
				"O total de funcionários na empresa é de " + Funcionario.getTotFunc() + " funcionários");

	}

}
