public class UsuarioTv {

	public static void main(String[] args) throws Exception {

		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Canal atual: " +smartTv.canal);
		
		smartTv.mudarCanal(7);
		
		System.out.println("Canal atual: " +smartTv.canal);
		System.out.println("A Tv ligada: " +smartTv.ligada);
		System.out.println("Volume atual: " +smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status -> Tv ligada?" +smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> Tv ligada?" +smartTv.ligada);
		
	}

}
