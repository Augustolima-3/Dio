try {
            String cepFormatado = formatarCep("14875500");
        }catch (CepInvalidoException e){
            System.out.println("O cep está inválido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() !=8)
            throw new CepInvalidoException();

        return "14.875-500";
