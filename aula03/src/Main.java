public class Main {
    public static void main(String[] args) throws Exception {
        Conta contaA;

        contaA = new Conta("Victor", 1);
        contaA.depositar(100.0);
        System.out.println(contaA.getSaldo());

        contaA.sacar(40.0);
        System.out.println(contaA.getSaldo());

        Conta contaB = new Conta("Pedro", 2);
        contaB.depositar(60.0);

        System.out.println(contaB.getSaldo());
        System.out.println(contaA == contaB);

        Conta contaC = contaA;

        System.out.println(contaA == contaC);
        contaC.sacar(20.0);
        System.out.println(contaA.getSaldo());

        System.out.println(contaA);
        System.out.println(contaC);
        System.out.println(contaB);

        Conta contaD = new Conta("Ana", 3, 250.0);
        System.out.println(contaD.getSaldo());
    }
}
