package com.company;

public class Texto {

    private String mensagem;

    public Texto(String mensagem){
        this.mensagem = mensagem;
    }

    public String interpretar(){
        return mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
}
