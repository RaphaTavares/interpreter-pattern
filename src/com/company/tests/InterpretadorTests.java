package com.company.tests;

import com.company.InterpretadorGeral;
import com.company.Texto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterpretadorTests {

    @Test
    void deveRetornarString(){
        Texto texto = new Texto("raphael");
        InterpretadorGeral interpretador = new InterpretadorGeral(texto);

       assertEquals("repheil", interpretador.interpretar());
    }

    @Test
    void deveRetonarNumero(){
        Texto texto = new Texto("1001");
        InterpretadorGeral interpretador = new InterpretadorGeral(texto);

        assertEquals("9", interpretador.interpretar());
    }
}
