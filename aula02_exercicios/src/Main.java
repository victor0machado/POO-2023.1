import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ex1();
        // ex4();
        // ex7();
        // ex9();
        // ex9Outro();
        // ex10();
        // ex11();
        // ex12();
        interfaceTexto();
    }

    static void ex1() {
        System.out.println("Hello, World!");
    }

    static void ex4() {
        double jan, fev, mar;
        double total;

        jan = 15000.0;
        fev = 23000.0;
        mar = 17000.0;
        total = jan + fev + mar;

        System.out.println("O total gasto no trimestre foi " + total);
    }

    static void ex7() {
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
    }

    static void ex9() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    static void ex9Outro() {
        for (int i = 3; i < 100; i += 3) {
            System.out.println(i);
        }
    }

    static void ex10() {
        for (int i = 1; i < 11; i++) {
            int fat = 1;

            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            System.out.println(i + "! = " + fat);
        }
    }

    static void ex10Outro() {
        int fat = 1;
        for (int i = 1; i < 11; i++) {
            fat *= i;
            System.out.println(i + "! = " + fat);
        }
    }

    static void ex11() {
        int fibo;
        int ultimo, penultimo;
        fibo = 2;
        ultimo = 2;
        penultimo = 1;

        System.out.println(1);
        System.out.println(1);
        System.out.println(2);

        while (fibo <= 100) {
            fibo = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = fibo;
            System.out.println(fibo);
        }
    }

    static void ex12() {
        for (int i = 2; i < 101; i++) {
            boolean ePrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ePrimo = false;
                    break;
                }
            }

            if (ePrimo) {
                System.out.println(i + " é primo");
            }
        }
    }

    /*
     * Montar um código para gerar uma interface de texto
     * O programa pede para o usuário inserir uma opção numérica,
     * e o programa responde executando uma determinada instrução
     */
    static void interfaceTexto() {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe uma opção de 1 a 3, ou 4 para sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1");
                    break;
                case 2:
                    System.out.println("Opção 2");
                    break;
                case 3:
                    System.out.println("Opção 3");
                    break;
                case 4:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (opcao == 4) {
                break;
            }
        }
        scanner.close();
    }
}
