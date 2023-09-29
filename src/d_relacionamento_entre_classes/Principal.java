package d_relacionamento_entre_classes;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<>();
		Livro l = new Livro();
		
		l.Emprestar("ana");
		Bibliotecario b = new Bibliotecario();

	}

}
