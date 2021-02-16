package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		System.out.println();

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;

		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		System.out.println();
		
		primeiraConta.agencia = 146;

		System.out.println("Agência primeira conta: " + primeiraConta.agencia);
		System.out.println("Número primeira conta: " + primeiraConta.numero);
		System.out.println();
		
		segundaConta.agencia = 146;
		System.out.println("Agência segunda conta: " + segundaConta.agencia);
		System.out.println();
		

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("Contas diferentes!");
		}
		System.out.println();

		System.out.println("Referência primeira conta: " + primeiraConta);
		System.out.println("Referência segunda conta: " + segundaConta);
	}

}
