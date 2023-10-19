package e_heranca_e_polimorfismo.exemploBanco;

public class ContaUniversitaria extends Conta {

	public ContaUniversitaria() {
		super();
	}

	public ContaUniversitaria(int numero, int agencia, String cliente, double saldo) {
		super(numero, agencia, cliente, saldo);
	}
	
	@Override
	public boolean deposito(double vlr) {
		if(saldo + vlr < 2000) {
			return super.deposito(vlr);	
		}
		return false;
	}
}
