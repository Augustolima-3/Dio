public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        //primeiro verificar a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //depois de enviar, salva o histórico
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    //métodos privados, visíveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando conexão com a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagem");
    }
}
