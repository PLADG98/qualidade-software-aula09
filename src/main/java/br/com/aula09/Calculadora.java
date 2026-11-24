package br.com.aula09;

/** Calculadora simples. */
public class Calculadora {

    /**
     * Divide dois inteiros.
     *
     * @param a dividendo
     * @param b divisor
     * @return a / b
     * @throws ArithmeticException se o divisor for zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero"); // fail fast
        }
        return a / b;
    }
}
