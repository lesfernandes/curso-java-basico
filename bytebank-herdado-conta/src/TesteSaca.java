
public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 321);
		cc.deposita(200);
		
		try {
			cc.saca(300);
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		System.out.println(cc.getSaldo());
	}

}
