package br.com.aula09.login;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidadorSenhaTest {

    private final ValidadorSenha validador = new ValidadorSenha();

    @Test
    void senhaComLetrasNumerosE8CaracteresEhValida() {
        assertTrue(validador.validar("senha123"));
    }

    @Test
    void senhaCurtaEhInvalida() {
        assertFalse(validador.validar("abc12"));
    }

    @Test
    void senhaSemNumeroOuSemLetraEhInvalida() {
        assertFalse(validador.validar("somenteletras"));
        assertFalse(validador.validar("12345678"));
    }

    @Test
    void senhaNulaEhInvalida() {
        assertFalse(validador.validar(null));
    }
}
