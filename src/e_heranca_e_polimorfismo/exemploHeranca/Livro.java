package e_heranca_e_polimorfismo.exemploHeranca;

public class Livro extends Produto{
	
	public String autor;
	public int paginas;
	
	public boolean ehGrande() {
		return paginas > 200;
	}
	
	@Override
	public boolean ehCaro() {
		return preco > 50;
	}

}

