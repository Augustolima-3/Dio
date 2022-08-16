public class Aula10Operadores {

	public static void main(String[] args) {

		int numero1 = 10;
		int numero2 = 20;
		
		boolean simNao = numero1 == numero2;
		
		if(numero1 < numero2) {
			System.out.println("A nossa condição é verdadeira.");
		}
		
		System.out.println("Numero 1 é igual ao numero 2?" + simNao);
		
		simNao = numero1 != numero2;
		System.out.println("Numero 1 é diferente do numero 2?" + simNao);
		
		simNao = numero1 > numero2;
		System.out.println("Numero 1 é maior do que o numero 2?" + simNao);
		
		
		
	}

}
