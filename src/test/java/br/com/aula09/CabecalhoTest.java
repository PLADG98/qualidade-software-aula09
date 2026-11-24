package br.com.aula09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CabecalhoTest {

    @Test
    void normalizaEspacosEMaiusculas() {
        assertEquals("application/json", Cabecalho.normalizar("  Application/JSON "));
    }

    @Test
    void cabecalhoNuloViraTextoVazio() {
        assertEquals("", Cabecalho.normalizar(null));
    }
}
