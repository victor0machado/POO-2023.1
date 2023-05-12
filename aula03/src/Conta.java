public class Conta {
    // atributos
    String titular;
    int numero;
    double saldo;
    double limite;
    boolean contratouLimite;

    // métodos construtores
    Conta (String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
        this.contratouLimite = false;
        this.limite = 0;
    }

    Conta (String titular, int numero, double valorInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = valorInicial;
        this.contratouLimite = false;
        this.limite = 0;
    }

    // métodos
    public void contratarLimite(double limite) {
        this.contratouLimite = true;
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else if (this.contratouLimite && this.limite + this.saldo >= valor) {
            valor -= this.saldo;
            this.saldo = 0.0;
            this.limite -= valor;
            return true;
        }

        System.out.println("Erro! Saldo insuficiente!");
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    // getters e setters
    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
