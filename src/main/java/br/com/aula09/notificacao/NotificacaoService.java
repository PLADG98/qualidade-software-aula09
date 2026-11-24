package br.com.aula09.notificacao;

import java.util.regex.Pattern;

/** Envio de notificações por e-mail. */
public class NotificacaoService {

    private static final Pattern EMAIL = Pattern.compile(".+@.+");

    /**
     * Envia (simula o envio de) um e-mail.
     *
     * @param destinatario e-mail de destino
     * @param assunto assunto da mensagem
     * @return {@code true} quando o e-mail é enviado
     */
    public boolean enviarEmail(String destinatario, String assunto) {
        if (!EMAIL.matcher(destinatario).matches()) {
            throw new IllegalArgumentException("E-mail inválido: " + destinatario);
        }
        System.out.println("E-mail enviado para " + destinatario + ": " + assunto);
        return true;
    }
}
