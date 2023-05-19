public class Operacao {
    double num1, num2;

    public Operacao(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double soma() {
        return this.num1 + this.num2;
    }

    public double divisao() {
        double resultado;
        try {
            resultado = this.num1 / this.num2;
        } catch (Exception e) {
            System.out.println("Erro de operação!");
            resultado = 0.0;
        } finally {
            System.out.println("Fim da operação.");
        }

        return resultado;
    }

    public double divisao2() throws Exception {
        return this.num1 / this.num2;
    }

    public double divisao3() throws ArithmeticException {
        if (this.num2 == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }

        return this.num1 / this.num2;
    }
}
