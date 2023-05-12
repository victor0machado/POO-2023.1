public class Medico {
    String nome;
    Endereco endereco;
    String crm;
    Consultorio consultorio;

    public Medico(String nome, Endereco endereco, String crm, Consultorio consultorio) {
        this.nome = nome;
        this.endereco = endereco;
        this.crm = crm;
        this.consultorio = consultorio;
    }

    public void operar(SalaOperacao sala) {
        System.out.println("Realizando operação. " + sala);
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.crm + "\nEndereço:\n" + this.endereco +
            "\nAtende no consultório:\n" + this.consultorio;
    }
}
