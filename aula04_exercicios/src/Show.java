public class Show extends Evento {
    String artista;

    @Override
    public void gravar() {
        System.out.println("Gravando um show!");
    }

    @Override
    public String toString() {
        String msg;
        msg = "Show de " + this.artista + "\n";
        msg += this.nome + "\n";
        msg += "local: " + this.local + "\n";
        msg += "capacidade do show: " + this.capacidade + " pessoas";

        return msg;
    }
}
