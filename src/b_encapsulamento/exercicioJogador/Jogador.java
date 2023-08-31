package b_encapsulamento.exercicioJogador;

import javax.swing.JOptionPane;

public class Jogador {

	private String nome;
	private int camisa;
	private int gols;

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe o nome:"));
		setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da camisa:")));
		setGols(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantia de gols:")));
	}

	String exibir() {
		return getNome() + "-" + getCamisa() + "-" + getGols() + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

}
