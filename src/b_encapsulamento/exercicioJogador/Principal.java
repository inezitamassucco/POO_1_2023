package b_encapsulamento.exercicioJogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Time> lista = new ArrayList<Time>();

		String menu = "1 - Cadastrar jogadores e times\n" + "2 - Listar jogadores de um time\n"
				+ "3 - Artilheiro do campeonato\n" + "4 - Time com mais gols\n" + "5 - Sair";

		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				Time t = new Time();
				t.cadastrar();
				lista.add(t);
			}
			if (op == 2) {
				String questao = JOptionPane.showInputDialog(null, "Informe o time que deseja consultar:");
				String resp = "Jogadores no time: \n";

				for (Time t : lista) {
					if (questao.equalsIgnoreCase(t.getNome())) {
						resp += t.exibir();
					}
				}
				JOptionPane.showMessageDialog(null, resp);
			}
			if (op == 3) {
				String questao = JOptionPane.showInputDialog(null, "Informe o time para a consulta de artilheiro:");
				String resp = "Artilheiro do time: \n";

				for (Time t : lista) {
					if (questao.equalsIgnoreCase(t.getNome())) {
						Jogador artilheiro = t.artilheiroTime();
						resp += artilheiro.exibir();
					}
				}
				JOptionPane.showMessageDialog(null, resp);
			}
			if (op == 4) {
				Time timeComMaisGols = null;
				int maxGols = -1;

				for (Time t : lista) {
					int golsTime = t.getGolsTime();
					if (golsTime > maxGols) {
						maxGols = golsTime;
						timeComMaisGols = t;
					}
				}
				if (timeComMaisGols != null) {
					JOptionPane.showMessageDialog(null, "Time com mais gols: " + timeComMaisGols.getNome()
							+ " - Quantia total de Gols: " + maxGols);
				} else {
					JOptionPane.showMessageDialog(null, "Não foi possível listar o time com mais gols.");
				}
			}

		} while (op != 5);
	}
}
