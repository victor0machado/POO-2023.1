import java.util.Objects;

public class Pessoa implements Cloneable {
    String nome;
    String cpf;
    String dataNascimento;

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.cpf + " - " + this.dataNascimento;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Pessoa) {
            Pessoa pessoa = (Pessoa) obj;
            return this.nome.equals(pessoa.nome) && this.cpf.equals(pessoa.cpf) &&
                this.dataNascimento.equals(pessoa.dataNascimento);
        }

        return false;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome, this.cpf, this.dataNascimento);
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        return (Pessoa) super.clone();
    }
}
