package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		// primeiraConta é uma referência ao objeto do tipo Conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		// as variáveis no java nunca possuem um objeto dentro dela, e sim uma
		// referência
		Conta segundaConta = primeiraConta;
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}
	}

}
