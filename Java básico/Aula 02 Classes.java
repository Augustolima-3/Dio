public class Aula02Classes {

	public static void main(String[] args) {
		String primeiroNome = "Augusto";
		String segundoNome = "Lima";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}

	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
}
