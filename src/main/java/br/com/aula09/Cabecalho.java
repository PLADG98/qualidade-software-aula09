package br.com.aula09;

/** Utilitário para tratar cabeçalhos (headers) de requisições. */
public final class Cabecalho {

    private Cabecalho() {
    }

    /**
     * Normaliza o valor de um cabeçalho: remove espaços nas pontas e deixa em minúsculas.
     *
     * @param valor valor recebido no cabeçalho
     * @return valor normalizado
     */
    public static String normalizar(String valor) {
        return valor.trim().toLowerCase();
    }
}
