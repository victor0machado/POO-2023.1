import programa.Gestor;

public class App {
    public static void main(String[] args) throws Exception {
        Gestor gestor = new Gestor("clientes.txt");
        String opcao = "0";

        while (!(opcao.equals(""))) {
            gestor.exibeOpcoes();
            opcao = gestor.processaOpcoes();
        }
    }
}
