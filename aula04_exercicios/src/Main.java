public class Main {
    public static void main(String[] args) throws Exception {
        Ingresso ingresso = new Ingresso();
        IngressoVIP ingressoVip = new IngressoVIP();

        ingresso.valor = 45.0;
        System.out.println(ingresso);

        ingressoVip.valor = 50.0;
        ingressoVip.valorAdicional = 15.0;

        System.out.println(ingresso);

        Cinema cinema = new Cinema();
        Show show = new Show();
        Teatro teatro = new Teatro();

        cinema.nome = "John Wick";
        cinema.local = "Tijuca";
        cinema.capacidade = 100;
        cinema.cinema = "Kinoplex";
        cinema.sala = "03";
        cinema.genero = "Ação";
        cinema.gravar();
        System.out.println(cinema);

        show.nome = "Music of the Spheres";
        show.local = "Engenhão";
        show.capacidade = 30000;
        System.out.println(show.verificarCapacidade(100000));
        System.out.println(show.verificarCapacidade(10000));
        show.artista = "Coldplay";
        show.gravar();
        System.out.println(show);

        teatro.nome = "Mamma Mia";
        teatro.local = "Village Mall";
        teatro.capacidade = 200;
        teatro.gravar();
        System.out.println(teatro);
    }
}
