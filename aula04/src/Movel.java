public abstract class Movel {
    String material;
    double[] dimCaixa;
    double peso;

    public abstract void montar();

    public void limpar() {
        System.out.println("passei pano");
    }

    @Override
    public String toString() {
        return "Móvel\n" + this.material;
    }
}
