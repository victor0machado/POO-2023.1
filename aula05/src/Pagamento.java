public interface Pagamento {
    // Atributos em interfaces são
    // públicos, estáticos e constantes
    public static final String mensagem = "exemplo de constante";

    // Métodos em interfaces são SEMPRE abstratos
    public abstract void realizaPagamento();
}
