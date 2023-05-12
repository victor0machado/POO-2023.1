package entidades;

public class IngressoMeia extends Ingresso {
    public IngressoMeia(Partida partida, Assento assento) {
        super(partida, TipoIngresso.MEIA, assento);
        this.preco = this.partida.getValorIngresso() / 2;
    }
}
