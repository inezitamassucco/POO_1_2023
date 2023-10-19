package e_heranca_e_polimorfismo.exemploBanco;

import javax.swing.JOptionPane;

public class Conta {
	
	protected int numero;
	protected int agencia;
	protected String cliente;
	protected double saldo;

	@Override
	public String toString() {
		return getNumero()+"-"+getCliente()+"- R$"+getSaldo()+"\n";
	}
	
	public Conta() {
		this (0, 0, "", 0);
	}

	public Conta(int numero, int agencia, String cliente, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public void cadastro() {
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("nr:")));
		setAgencia(Integer.parseInt(JOptionPane.showInputDialog("ag:")));
		setCliente(JOptionPane.showInputDialog("Cliente:"));
		setSaldo(0);
	}
	
	public boolean deposito(double vlr) {
		saldo += vlr;
		return true;
	}
	
	public boolean saque(double vlr) {
		if(saldo >= vlr) {
			saldo -= vlr;
			//ARRUMAR ALGO
			return true;
		}
		return false;
	}
	
	public boolean transferencia(Conta destino, double vlr) {
		if(saque(vlr)) {
			if(destino.deposito(vlr)) {
				return true;
			} else {
				deposito(vlr);
				return false;
			}
		}
		return false;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
