
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(50, 10);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(50, 102);
		Conta conta3 = new Conta(50, 101);
		
		System.out.println(Conta.getTotal());
	}
}
