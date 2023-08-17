package a_classes_objetos;

import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	double peso, altura;
	char sexo;
	
	void cadastre ( ) {
	//**void não espera nenhum retorno
		nome = JOptionPane.showInputDialog("Informe o nome:");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		sexo = JOptionPane.showInputDialog("Sexo: F/M").toUpperCase().charAt(0);
	}
	
	double calculaimc() {
	//**nesse caso o método precisa de um retorno
		return peso/(altura*altura);
	}
	
	String avaliacao () {
		String avaliacao = "";
		double imc = calculaimc();
		if (sexo == 'M') {
			if (imc < 20.7) {
				avaliacao = "Abaixo do peso";
			} else if (imc >= 20.7 && imc < 26.4) {
				avaliacao = "Peso ideal";
			} else if (imc >= 26.5 && imc < 27.8) {
				avaliacao = "Pouco acima do peso";
			} else if (imc >= 27.9 && imc < 31.1) {
				avaliacao = "Acima do peso";
			} else {
				avaliacao = "Obesidade";
			}
		} else if (sexo == 'F') {
			if (imc < 19.1) {
				avaliacao = "Abaixo do peso";
			} else if (imc >= 19.1 && imc < 25.8) {
				avaliacao = "Peso ideal";
			} else if (imc >= 25.9 && imc < 27.3) {
				avaliacao = "Pouco acima do peso";
			} else if (imc >= 27.4 && imc < 32.3) {
				avaliacao = "Acima do peso";
			} else {
				avaliacao = "Obesidade";
			}
		}
		return avaliacao;
	}
	
	String exibirDados() {
		return nome + " - " + calculaimc() + " - " + avaliacao() + "\n";
	}
}
