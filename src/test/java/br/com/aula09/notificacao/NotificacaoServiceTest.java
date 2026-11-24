package br.com.aula09.notificacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @ParameterizedTest
    @ValueSource(strings = {"aluno@fatec.sp.gov.br", "pedro.silva@gmail.com", "nome+tag@empresa.com.br"})
    void emailsValidos(String email) {
        assertTrue(service.emailValido(email));
        assertTrue(service.enviarEmail(email, "Bem-vindo"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"aluno@fatec", "aluno.fatec.com", "a b@c.com", "@fatec.com", "aluno@.com"})
    void emailsInvalidosSaoRecusados(String email) {
        assertFalse(service.emailValido(email));
        IllegalArgumentException erro = assertThrows(IllegalArgumentException.class,
                () -> service.enviarEmail(email, "Bem-vindo"));
        assertEquals("E-mail inválido: " + email, erro.getMessage());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"   "})
    void assuntoVazioEhRecusado(String assunto) {
        assertThrows(IllegalArgumentException.class,
                () -> service.enviarEmail("aluno@fatec.sp.gov.br", assunto));
    }

    @Test
    void enviaComAssunto() {
        assertTrue(service.enviarEmail("aluno@fatec.sp.gov.br", "Notas da Aula 09"));
    }
}
