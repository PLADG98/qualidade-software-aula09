package br.com.aula09.notificacao;

import java.util.regex.Pattern;

/** Envio de notificações por e-mail. */
public class NotificacaoService {

    /** Usuário sem espaços + @ + domínio com pelo menos um ponto (ex.: aluno@fatec.sp.gov.br). */
    private static final Pattern EMAIL =
            Pattern.compile("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$");

    /**
     * Indica se o texto tem formato de e-mail válido.
     *
     * @param email texto a validar
     * @return {@code true} se o formato for válido
     */
    public boolean emailValido(String email) {
        return email != null && EMAIL.matcher(email).matches();
    }

    /**
     * Envia (simula o envio de) um e-mail.
     *
     * @param destinatario e-mail de destino
     * @param assunto assunto da mensagem
     * @return {@code true} quando o e-mail é enviado
     * @throws IllegalArgumentException se o e-mail for inválido ou o assunto estiver vazio
     */
    public boolean enviarEmail(String destinatario, String assunto) {
        if (!emailValido(destinatario)) {
            throw new IllegalArgumentException("E-mail inválido: " + destinatario);
        }
        if (assunto == null || assunto.isBlank()) {
            throw new IllegalArgumentException("O assunto é obrigatório");
        }
        System.out.println("E-mail enviado para " + destinatario + ": " + assunto);
        return true;
    }
}
