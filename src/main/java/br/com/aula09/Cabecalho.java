package br.com.aula09;

/** Utilitário para tratar cabeçalhos (headers) de requisições. */
public final class Cabecalho {

    private Cabecalho() {
    }

    /**
     * Normaliza o valor de um cabeçalho: remove espaços nas pontas e deixa em minúsculas.
     *
     * @param valor valor recebido no cabeçalho
     * @return valor normalizado, ou texto vazio se o cabeçalho não vier na requisição
     */
    public static String normalizar(String valor) {
        if (valor == null) {
            return ""; // correção: cabeçalho ausente causava NullPointerException
        }
        return valor.trim().toLowerCase();
    }
}
