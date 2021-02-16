
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(50, 10);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		
		// em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
	}
}
