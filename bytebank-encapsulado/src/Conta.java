

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
	}

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
	
	public static int getTotal() {
		return Conta.total;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menos ou igual à 0.");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menos ou igual à 0.");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
