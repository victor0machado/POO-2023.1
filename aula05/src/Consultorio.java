public class Consultorio implements Pagamento {
    Endereco endereco;
    String nome;
    String cnpj;

    public Consultorio(Endereco endereco, String nome, String cnpj) {
        this.endereco = endereco;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public void realizaPagamento() {
        System.out.println("Fazendo o pagamento da consulta.");
    }

    @Override
    public String toString() {
        return "Consultório " + this.nome +
            "\nCNPJ: " + this.cnpj + "\nEndereço:\n" + this.endereco;
    }
}
