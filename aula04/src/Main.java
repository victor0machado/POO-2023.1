public class Main {
    public static void main(String[] args) throws Exception {
        // Movel movel1 = new Movel();
        Armario armario1 = new Armario();

        // movel1.material = "Madeira";
        armario1.numPortas = 3;

        armario1.peso = 25.87;

        System.out.println(armario1.peso);

        Cadeira cadeira1 = new Cadeira();
        cadeira1.material = "Alumínio";

        System.out.println(cadeira1.material);

        // upcasting
        ((Movel)armario1).peso = 30.42;

        // downcasting
        // movel1 = new Cadeira();
        // ((Cadeira)movel1).numPernas = 3;
        // ((Sofa)movel1).numAlmofadas = 5; -> vai dar um erro

        Sofa sofa1 = new Sofa();
        sofa1.limpar();
        armario1.limpar();
        cadeira1.limpar();

        sofa1.montar();
        cadeira1.montar();
        armario1.montar();

        System.out.println(cadeira1);
    }
}
