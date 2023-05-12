public class Endereco {
    String logradouro;
    int numero;
    String cep;
    String bairro;
    String cidade;
    String uf;

    public Endereco(String logradouro, int numero, String cep, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return this.logradouro + ", " + this.numero + ", " +
            this.bairro + " - " + this.cidade + "/" + this.uf +
            "\nCEP: " + this.cep;
    }
}
