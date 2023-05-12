public class SalaOperacao {
    int numero;
    String ramal;

    public SalaOperacao(int numero, String ramal) {
        this.numero = numero;
        this.ramal = ramal;
    }

    @Override
    public String toString() {
        return "Sala de operações número " + this.numero + ", ramal " + this.ramal;
    }
}
