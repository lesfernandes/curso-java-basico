
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("222555111-51");
		nico.setSalario(2590.50);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
