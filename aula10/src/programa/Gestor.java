package programa;

import java.io.IOException;

import dao.ClienteDAO;
import util.LeitoraDados;

public class Gestor {
    LeitoraDados leitora;
    ClienteDAO clienteDAO;

    public Gestor(String caminho) throws IOException {
        this.leitora = new LeitoraDados();
        this.clienteDAO = new ClienteDAO(caminho);
    }

    public void exibeOpcoes() {
        System.out.println("Selecione um número, ou aperte qualquer outro valor para sair:");
        System.out.println("1 - Cadastrar um cliente;");
        System.out.println("2 - Remover um cliente;");
        System.out.println("3 - Exibir todos os clientes;");
    }

    public String processaOpcoes() throws IOException {
        String opcao = this.leitora.lerTexto();
        switch (opcao) {
            case "1":
                clienteDAO.adicionar(this.leitora.lerNovoCliente());
                break;
            case "2":
                System.out.print("Digite o CPF do cliente a ser removido: ");
                String cpfRemover = this.leitora.lerTexto();
                if (clienteDAO.consultar(cpfRemover) == null) {
                    System.out.println("Cliente não encontrado!");
                } else {
                    clienteDAO.excluir(cpfRemover);
                    System.out.println("Cliente removido com sucesso!");
                }
                break;
            case "3":
                System.out.println(clienteDAO);
                break;
            default:
                clienteDAO.exportar();
                System.out.println("Volte sempre!");
                opcao = "";
        }

        return opcao;
    }
}
