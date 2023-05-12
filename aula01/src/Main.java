import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        * Este é um comentário de várias linhas.
        */
        System.out.println("olá, mundo"); // Este é um comentário de linha.

        // Tipos de dados
        // [visibilidade] <tipo> <nome_var> [= valor];
        byte num = 127;
        int numero = 145;
        long outroNumero = 129483587137l;

        float flutuante = 4.56f;
        double outroFlutuante = 10.457;

        char carac = 'b';
        String nome;

        nome = "Victor";

        boolean teste = false;

        System.out.println(num);
        System.out.println(numero);
        System.out.println(outroNumero);
        System.out.println(carac);
        System.out.println(nome);
        System.out.println(teste);
        System.out.println(flutuante);
        System.out.println(outroFlutuante);

        // type casting
        numero = (int) num;
        System.out.println(numero);

        numero = (int) flutuante;
        System.out.println(numero);

        // operadores
        int x = 9;
        int y, z;
        y = 4;
        z = 16;

        double a = 3.5;
        double b = 7.68;

        System.out.println("-------------------");
        System.out.println(x + y);
        System.out.println(y - z);
        System.out.println(x * z);
        System.out.println(x / z);
        System.out.println(a / x);
        System.out.println((double) x / z);
        System.out.println(z % x);

        x++; // x = x + 1, x += 1
        System.out.println(x);
        x--;
        System.out.println(x);

        System.out.println(x + 1);
        // sysout(x)
        // x++
        System.out.println(x);

        // Operadores relacionais
        // >, <, ==, !=, <=, >=

        // Operadores booleanos
        // AND &&, OR ||, NOT !
        boolean sim = true;
        boolean nao = false;
        System.out.println(!sim);
        System.out.println(sim && nao);
        System.out.println(sim || nao);

        // Estruturas de decisão
        System.out.println("---------------");
        if (x == 2) {
            System.out.println("x é igual a 2.");
        } else {
            System.out.println("x é diferente de 2.");
        }

        if (x == 2) {
            System.out.println("x é igual a 2.");
        } else if (x == 3) {
            System.out.println("x é igual a 3.");
        } else {
            System.out.println("x é diferente de 2 e de 3.");
        }

        // NÃO É UMA BOA PRÁTICA!!! NÃO USEM!!!
        if (x % 2 == 0)
            System.out.println("x é par.");

        x = 1;
        switch (x) {
            case 1:
                System.out.println("x é igual a 1.");
                break;
            case 2:
                System.out.println("x é igual a 2.");
                break;
            case 9:
                System.out.println("x é igual a 9.");
            default:
                System.out.println("nenhum dos dois.");
        }

        // Estruturas de repetição
        System.out.println("-----------------");
        x = 10;
        while (x > 0) {
            System.out.println(x--);
        }

        System.out.println("-----------------");
        x = 10;
        while (x > 0) {
            System.out.println(x--);
            if (x % 6 == 0) {
                System.out.println("x é divisível por 6");
                continue;
            } else if (x == 2) {
                System.out.println("x é igual a 2");
                break;
            }
            System.out.println("aaa");
        }
        System.out.println("acabou");

        System.out.println("-----------------");
        for ( int i = 0 ; i <= 10 ; i++ ) {
            System.out.println(i);
        }

        System.out.println("-----------------");
        // array
        int[] numeros = {1, 2, 3, 4};
        System.out.println(numeros[3]);

        for (int i : numeros) {
            System.out.println(i);
        }

        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(idade);
        System.out.println("Olá, " + nome);
        System.out.println("Idade: " + Integer.toString(idade));

        scanner.close();
    }
}