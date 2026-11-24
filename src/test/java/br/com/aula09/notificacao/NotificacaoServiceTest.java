package br.com.aula09.notificacao;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @Test
    void enviaParaEmailValido() {
        assertTrue(service.enviarEmail("aluno@fatec.sp.gov.br", "Bem-vindo"));
    }

    @Test
    void recusaEmailSemDominioCompleto() {
        assertThrows(IllegalArgumentException.class,
                () -> service.enviarEmail("aluno@fatec", "Bem-vindo"));
    }
}
