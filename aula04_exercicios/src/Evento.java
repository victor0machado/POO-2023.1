public abstract class Evento {
    String nome;
    String local;
    int capacidade;

    public abstract void gravar();

    public boolean verificarCapacidade(int numPessoas) {
        if (numPessoas <= this.capacidade) {
            return true;
        }
        return false;
    }
}