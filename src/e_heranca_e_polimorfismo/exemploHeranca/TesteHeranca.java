package e_heranca_e_polimorfismo.exemploHeranca;

public class TesteHeranca {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		p.nome = "Kombi";
		p.preco = 5000;
		System.out.println(p.ehCaro());
		
		Livro l = new Livro();
		l.nome = "Livro Java";
		l.preco = 60;
		l.autor = "Elvis Presley";
		l.paginas = 250;
		System.out.println(l.ehCaro());
		
	}

}
