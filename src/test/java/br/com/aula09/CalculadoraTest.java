package br.com.aula09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void divideDoisNumeros() {
        assertEquals(5, calculadora.divide(10, 2));
    }

    @Test
    void divisaoPorZeroLancaExcecaoComMensagemClara() {
        ArithmeticException erro =
                assertThrows(ArithmeticException.class, () -> calculadora.divide(10, 0));
        assertEquals("Divisor não pode ser zero", erro.getMessage());
    }
}
