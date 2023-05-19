import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Métodos padrão da classe Object
         * Manipulação de String
         * Dados de data ou hora
         * Tratamento de exceções
         */

        Pessoa pessoa1 = new Pessoa("Victor", "1234", "1/1/2000");
        System.out.println(pessoa1);

        System.out.println(2 == 2);
        Pessoa pessoa2 = new Pessoa("Victor", "1234", "1/1/2000");
        System.out.println(pessoa1.equals(pessoa2));

        Pessoa pessoa3 = pessoa2.clone();

        pessoa2.nome = "Zé";
        System.out.println(pessoa3);

        System.out.println(pessoa2.getClass().getName());

        // String
        String nome;

        nome = "aaa";
        nome = "bbb";
        nome += "ccc";

        StringBuilder sb = new StringBuilder();
        sb.append("Olá,");
        sb.append(" ");
        sb.append("mundo!");

        System.out.println(sb.toString());
        System.out.println(sb.charAt(3));
        sb.delete(3, 6);
        System.out.println(sb.toString());
        System.out.println(sb.indexOf("d"));
        System.out.println(sb.reverse());

        System.out.println("------------------------");

        // dados de data e hora
        LocalDate data, hoje;
        LocalDateTime dataHora;
        LocalTime hora;

        data = LocalDate.of(2023, 4, 18);
        hoje = LocalDate.now();

        System.out.println(data);
        System.out.println(hoje);
        System.out.println(hoje.getDayOfYear());
        data = data.plusDays(18);
        System.out.println(data);
    }
}
