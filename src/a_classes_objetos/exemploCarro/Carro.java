package a_classes_objetos.exemploCarro;

import javax.swing.JOptionPane;

public class Carro {
	String marca, cor;
	int ano;
	
	boolean cadastre () {
		marca = JOptionPane.showInputDialog("Informe a marca do carro:");
		cor = JOptionPane.showInputDialog("Informe a cor do carro:");	
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro:"));
		return validaCadastro ();
	}
	
	boolean validaCadastro () {
		if(marca.equals("")) {
			JOptionPane.showMessageDialog(null, "Marca é obrigatória!");
			return false;
		}
		if(cor.equals("")) {
			JOptionPane.showMessageDialog(null, "Cor é obrigatória!");
			return false;
		}
		if(ano < 1954 || ano > 2023) {
			JOptionPane.showMessageDialog(null, "Ano inválido!");
			return false;
		}
		return true;
	}
	
	String exibir () {
		return marca + '-' + cor + '-' + ano + "\n";
	}
	
}
