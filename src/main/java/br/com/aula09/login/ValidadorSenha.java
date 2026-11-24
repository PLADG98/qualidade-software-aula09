package br.com.aula09.login;

/** Regras de senha do login. */
public class ValidadorSenha {

    /**
     * Uma senha é válida se tiver pelo menos 8 caracteres, uma letra e um número.
     *
     * @param senha senha digitada
     * @return {@code true} se a senha atender às regras
     */
    public boolean validar(String senha) {
        if (senha == null || senha.length() < 8) {
            return false;
        }
        boolean temLetra = senha.chars().anyMatch(Character::isLetter);
        boolean temNumero = senha.chars().anyMatch(Character::isDigit);
        return temLetra && temNumero;
    }
}
