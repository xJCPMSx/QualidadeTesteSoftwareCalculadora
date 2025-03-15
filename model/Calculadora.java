package model;

public final class Calculadora {
    /**
     * @return valor1 Descrição do parâmetro valor1.
     * @param valor1 Descrição do que o parâmetro valor1 representa.
      * @param valor2 Descrição do que o parâmetro valor2 representa.
     */
    public double somar(final double  valor1, final double valor2) {
        return valor1 + valor2;
    };
    /**
     * Subtrai dois números.
     * @param valor1 Descrição do que o parâmetro valor1 representa.
     *  @param valor2 Descrição do que o parâmetro valor2 representa.
     * @return subtracao
     */
    public double diminuir(final double valor1, final double valor2) {
        return valor1 - valor2;
    }
    /**
     * Multiplica dois números.
     * @param valor1 Descrição do que o parâmetro valor1 representa.
     * @param valor2 Descrição do que o parâmetro valor2 representa.
     * @return multiplicaçao
     */
    public double multiplicar(final double valor1, final double valor2) {
        return valor1 * valor2;
    };
    /**
     * Dividir dois números.
     * @param valor1 Descrição do que o parâmetro valor1 representa.
     * @param valor2 Descrição do que o parâmetro valor2 representa.
     * @return valor1 Descrição do parâmetro valor1.
     */
    public double dividir(final double valor1, final double valor2) {
        return valor1 / valor2;
    };

}
