package com.company;

public class VogaisTrocadas extends Mensagem implements InterpretadorTextoBinario{

    private String x;

    public VogaisTrocadas (Texto mensagem){
        x = mensagem.getMensagem();
    }

    @Override
    public String interpretar(){
        return x;
    }
}
