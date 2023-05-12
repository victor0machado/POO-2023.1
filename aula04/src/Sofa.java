public class Sofa extends Assento {
    byte numAlmofadas;
    byte numLugares;

    @Override
    public void montar() {
        System.out.println("Montando um sofá");
    }

    @Override
    public void limpar() {
        super.limpar();
        System.out.println("lavei o sofá");
    }
}
