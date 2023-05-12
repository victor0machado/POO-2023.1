public class Main {
    public static void main(String[] args) throws Exception {
        Endereco end1 = new Endereco("Rua X", 100, "10000-000", "Barra", "Rio", "RJ");
        Endereco end2 = new Endereco("Rua Y", 10, "20000-000", "Tijuca", "Rio", "RJ");

        SalaOperacao sala = new SalaOperacao(2, "R1234");
        Consultorio consultorio = new Consultorio(end1, "Consultório do médico", "1234");
        Medico medico = new Medico("Carlos", end2, "456", consultorio);

        System.out.println(end1);
        System.out.println("-----");
        System.out.println(end2);
        System.out.println("-----");
        System.out.println(sala);
        System.out.println("-----");
        System.out.println(consultorio);
        System.out.println("-----");
        System.out.println(medico);

        consultorio.realizaPagamento();
    }
}
