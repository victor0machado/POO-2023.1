package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Cliente;
import util.Arquivo;

public class ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();
    private String caminho;

    public ClienteDAO(String caminho) throws IOException {
        this.caminho = caminho;
        this.importar();
    }

    public void adicionar(String[] dadosCliente) {
        Cliente cliente = new Cliente(dadosCliente[0], dadosCliente[1]);
        if(!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
        }
    }

    public void alterar(String[] dadosCliente) {
        Cliente cliente = new Cliente(dadosCliente[0], dadosCliente[1]);
        int posicao = this.clientes.indexOf(cliente);
        if (posicao >= 0) {
            this.clientes.set(posicao, cliente);
        }
    }

    public void excluir(String cpf) {
        Cliente cliente = new Cliente(cpf);
        if (this.clientes.contains(cliente)) {
            this.clientes.remove(cliente);
        }
    }

    public Cliente consultar(String cpf) {
        Cliente clientePesquisado = new Cliente(cpf);
        for (Cliente cliente : this.clientes) {
            if (cliente.equals(clientePesquisado)) {
                return cliente;
            }
        }

        return null;
    }

    public List<Cliente> listar() {
        return Collections.unmodifiableList(this.clientes);
    }

    public void exportar() throws IOException {
        List<String> linhas = new ArrayList<>();

        for (Cliente cliente : this.clientes) {
            linhas.add(cliente.toString());
        }

        Arquivo.escrever(this.caminho, linhas);
    }

    public void importar() throws IOException {
        List<String> linhas = Arquivo.ler(this.caminho);

        for (String linha : linhas) {
            String[] dadosCliente = linha.split(" - ");
            this.adicionar(dadosCliente);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : this.clientes) {
            sb.append(cliente);
            sb.append("\n");
        }

        return sb.toString();
    }
}
