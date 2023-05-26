package util;

import java.util.Scanner;

public class LeitoraDados {
    private Scanner scanner;

    public LeitoraDados() {
        this.scanner = new Scanner(System.in);
    }

    public String lerTexto() {
        return scanner.nextLine();
    }

    public String[] lerNovoCliente() {
        System.out.print("Informe o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        return new String[] {cpf, nome};
    }
}
