package e_heranca_e_polimorfismo.exemploBanco;

public class Caixa {
	
	public static boolean depositar(Conta c, double vlr) {
		return c.deposito(vlr);
	}
	public static boolean sacar(Conta c, double vlr) {
		return c.saque(vlr);
	}
	public static boolean transferir(Conta origem, Conta destino, double vlr) {
		return origem.transferencia(destino, vlr);
	}
	

}
