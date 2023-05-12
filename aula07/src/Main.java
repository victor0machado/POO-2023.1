import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        usoMap();
    }

    public static void usoArrays() {
        // não é redimensionável
        // não é muito eficiente
        // usado quando sabemos exatamente quantos elementos precisamos
        int numeros[] = new int[5];
        int idades[] = {10, 14, 18, 12};

        for (int idade : idades) {
            System.out.println(idade);
        }

        System.out.println(numeros.length);
        Arrays.sort(idades); // ordena
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros);
    }

    public static void usoArrayList() {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Civic"); // adiciona um elemento ao final do ArrayList
        carros.add("Polo");
        carros.add("Gol");
        System.out.println(carros);
        System.out.println(carros.get(1)); // exibir um elemento de índice 1
        carros.set(1, "Sandero"); // altera o elemento de índice 1
        System.out.println(carros);
        Collections.sort(carros); // ordena um ArrayList
        System.out.println(carros);
        carros.remove(1); // remove o elemento de índice 1
        System.out.println(carros.size()); // retorna o tamanho do ArrayList
        carros.clear(); // elimina todos os elementos do ArrayList
        System.out.println(carros);
    }

    public static void usoLinkedList() {
        LinkedList<Integer> idades = new LinkedList<Integer>();
        idades.push(10); // adiciona elemento no início da lista
        idades.add(12); // adiciona ao final da lista
        System.out.println(idades);
        idades.push(16);
        System.out.println(idades);
        System.out.println(idades.pop()); // remove o primeiro elemento da lista, sobe uma exceção se a lista está vazia
        System.out.println(idades);
        idades.poll(); // remove o primeiro elemento da lista, retorna null se a lista está vazia
        System.out.println(idades);
        idades.clear(); // limpa a LinkedList
        System.out.println(idades);

        LinkedList<String> frutas = new LinkedList<String>(List.of("maçã", "banana", "abacaxi"));
        System.out.println(frutas);
    }

    public static void usoQueue() {
        Queue<String> clientes = new LinkedList<String>();

        clientes.add("fulano"); // adiciona o elemento ao final da fila
        clientes.add("ciclano");
        System.out.println(clientes);

        clientes.remove(); // remove o primeiro elemento
        System.out.println(clientes);

        clientes.add("fulano de novo");
        System.out.println(clientes.peek()); // informa o primeiro elemento da fila
        System.out.println(clientes);

        clientes.clear();
        System.out.println(clientes);
    }

    public static void usoStack() {
        Stack<String> requisicoes = new Stack<String>();

        requisicoes.push("123"); // adiciona elemento na pilha
        requisicoes.push("456");
        System.out.println(requisicoes);

        requisicoes.pop(); // remove o último elemento inserido
        System.out.println(requisicoes);
    }

    public static void usoSet() {
        Set<String> frutas = new HashSet<String>();

        frutas.add("maçã");
        frutas.add("abacaxi");
        System.out.println(frutas);

        frutas.add("maçã"); // ignora se o elemento já foi adicionado
        System.out.println(frutas);
    }

    public static void usoMap() {
        Map<String,String> alunos = new HashMap<String,String>();

        alunos.put("1234", "fulano");
        System.out.println(alunos);

        alunos.put("5678", "ciclano");
        System.out.println(alunos);

        alunos.put("1234", "fulano de tal");
        System.out.println(alunos);

        System.out.println(alunos.get("1234"));
        System.out.println(alunos.containsKey("0123"));

        for (String chave : alunos.keySet()) {
            System.out.println(chave + ": " + alunos.get(chave));
        }
    }
}
