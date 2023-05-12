import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        String nome, data, local, nomeBusca;
        int ingressosInt, ingressosMeia;
        ArrayList<Partida> partidas = new ArrayList<Partida>();
        Partida partidaVenda;
        Ingresso ingresso = null;
        
        System.out.println("Sistema de compra de ingressos!");
        while (true) {
            System.out.println(opcoes());
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Insira as informações da partida:");
                    System.out.print("Nome da partida: ");
                    nome = scanner.nextLine();
                    System.out.print("Data da partida: ");
                    data = scanner.nextLine();
                    System.out.print("Local da partida: ");
                    local = scanner.nextLine();
                    System.out.print("Número de ingressos tipo inteira: ");
                    ingressosInt = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Número de ingressos tipo meia: ");
                    ingressosMeia = scanner.nextInt();
                    scanner.nextLine();
                    partidas.add(new Partida(nome, data, local, ingressosInt, ingressosMeia));
                    System.out.println("Partida criada!");
                    break;
                case 2:
                    if (partidas.size() > 0) {
                        System.out.println("Vendendo um ingresso!");
                        System.out.print("Informe o nome da partida que deseja comprar ingresso: ");
                        nomeBusca = scanner.nextLine();

                        partidaVenda = procuraPartida(partidas, nomeBusca);
                        if (partidaVenda != null) {
                            ingresso = venderIngresso(scanner, partidaVenda);
                        } else {
                            System.out.println("Erro! Partida com nome " + nomeBusca + " não encontrada!");
                        }
                        
                    } else {
                        System.out.println("Você precisa primeiro cadastrar uma partida!");
                    }
                    break;
                case 3:
                    if (partidas.size() > 0) {
                        System.out.println("Informações das partidas:");
                        for (Partida partida : partidas) {
                            System.out.println(partida);
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Você precisa primeiro cadastrar uma partida!");
                    }
                    break;
                case 4:
                    if (partidas.size() > 0) {
                        System.out.println("Ingressos disponíveis:");
                        for (Partida partida : partidas) {
                            System.out.println(partida.getNome() + ": " + partida.getIngressos());
                        }
                    } else {
                        System.out.println("Você precisa primeiro cadastrar uma partida!");
                    }
                    break;
                case 5:
                    if (ingresso != null) {
                        System.out.println("Informações sobre o último ingresso vendido:");
                        System.out.println(ingresso);
                    } else {
                        System.out.println("Você precisa primeiro vender um ingresso!");
                    }
                    break;
                default:
                    opcao = 0;
            }

            if (opcao == 0) {
                System.out.println("Saindo do programa...");
                break;
            }
        }

        scanner.close();
    }

    public static String opcoes() {
        String msg;

        msg = "\n------\n";
        msg += "Insira a opção desejada conforme o menu abaixo, ou digite outra mensagem para sair do programa:\n";
        msg += "1 - Cadastrar uma nova partida;\n";
        msg += "2 - Realizar a venda de um ingresso;\n";
        msg += "3 - Exibir informações da partida;\n";
        msg += "4 - Exibir o número de ingressos restantes;\n";
        msg += "5 - Exibir informações sobre o último ingresso vendido;\n";

        return msg;
    }

    public static Partida procuraPartida(ArrayList<Partida> partidas, String nomeProcurado) {
        for (Partida partida : partidas) {
            if (nomeProcurado.equals(partida.getNome())) {
                return partida;
            }
        }

        return null;
    }

    public static Ingresso venderIngresso(Scanner scanner, Partida partidaVenda) {
        String opcaoIngresso;
        char letraAssento;
        TipoIngresso tipo;
        Ingresso ingresso;
        int numeroAssento;
        Assento assento;
        final double VALOR_INGRESSO = 100.0;
        
        System.out.print("Letra do assento: ");
        letraAssento = scanner.next().charAt(0);
        System.out.print("Número do assento: ");
        numeroAssento = scanner.nextInt();
        scanner.nextLine();
        assento = new Assento(numeroAssento, letraAssento);

        System.out.print("O seu ingresso é meia (s/n)? ");
        opcaoIngresso = scanner.nextLine();

        if (opcaoIngresso.equals("s")) {
            tipo = TipoIngresso.MEIA;

            ingresso = new IngressoMeia(partidaVenda, assento, VALOR_INGRESSO / 2);
        } else {
            tipo = TipoIngresso.INTEIRA;

            ingresso = new IngressoInteira(partidaVenda, assento, VALOR_INGRESSO);
        }
        partidaVenda.venderIngresso(tipo);   
        return ingresso;
    }
}
