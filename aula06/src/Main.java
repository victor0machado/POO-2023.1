import entidades.funcionarios.Medico;

public class Main {
    public static void main(String[] args) throws Exception {
        Medico medico = new Medico("Zé");

        medico.mudaNome("Victor");
        System.out.println(medico);

        String[] nomes = {"abc", "def"};
        int[] idades = new int[10];

        System.out.println(nomes[0]); // abc
        System.out.println(idades[5]); // 0

        idades[0] = 16;
        idades[4] = 16;
        System.out.println(idades[4]);

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        for (int idade : idades) {  // for idade in idades:
            System.out.println(idade);
        }

        idades = append(idades, 20);
        System.out.println(idades[10]);
    }

    public static int[] append(int[] idades, int valor) {
        int[] novoArray = new int[idades.length + 1];

        for (int i = 0; i < idades.length; i++) {
            novoArray[i] = idades[i];
        }

        novoArray[novoArray.length - 1] = valor;

        return novoArray;
    }
}
