package e_heranca_e_polimorfismo.exemploHeranca;

public class Produto {
	
	protected String nome;
	protected double preco;
	
	Produto (String nome) {
		
	}
	
	public boolean ehCaro() {
		return preco > 100;
	}
	
	@Override
	public String toString () {
		return nome + " - " + preco;
	}
}
