package com.company;

public class InterpretadorGeral implements InterpretadorTextoBinario {

    private Mensagem mensagem;

    public InterpretadorGeral(Texto contexto){
        if(contexto.getMensagem().matches("[a-zA-Z]+")) {
            String mensagemProvida = contexto.getMensagem();
            mensagemProvida = mensagemProvida.replaceAll("a", "@");
            mensagemProvida = mensagemProvida.replaceAll("u", "a");
            mensagemProvida = mensagemProvida.replaceAll("o", "u");
            mensagemProvida = mensagemProvida.replaceAll("i", "o");
            mensagemProvida = mensagemProvida.replaceAll("e", "i");
            mensagemProvida = mensagemProvida.replaceAll("@", "e");
            contexto.setMensagem(mensagemProvida);
            this.mensagem = new VogaisTrocadas(contexto);
        }
        if(contexto.getMensagem().matches("[0-1]+")){
            int numero = Integer.parseInt(contexto.getMensagem(), 2);
            contexto.setMensagem(String.valueOf(numero));
            this.mensagem = new Binario(contexto);
        }
    }

    public String interpretar(){
        return mensagem.interpretar();
    }
}
