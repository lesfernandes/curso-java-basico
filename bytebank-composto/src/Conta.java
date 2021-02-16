

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}

		this.saldo -= valor;
		return true;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo < valor) {
			return false;
		}
		
		this.saca(valor);
		destino.deposita(valor);
		
		return true;
	}

	public double getSaldo() {
		return saldo;
	}

}
