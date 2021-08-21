package com.company;

public class Binario extends Mensagem implements InterpretadorTextoBinario {
    private String x;

    public Binario (Texto mensagem){
        x = mensagem.getMensagem();
    }

    @Override
    public String interpretar(){
        return x;
        //return String.valueOf(Integer.parseInt(x, 2));
    }
}
