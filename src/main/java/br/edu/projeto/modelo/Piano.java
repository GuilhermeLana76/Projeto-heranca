package br.edu.projeto.modelo;

public class Piano extends Instrumento {
    private int numeroDeTeclas;
    private boolean ehGrande;

    public Piano(String nome, String fabricante, double preco, int anoFabricacao,
                 int numeroDeTeclas, boolean ehGrande) {
        super(nome, fabricante, preco, anoFabricacao);
        this.numeroDeTeclas = numeroDeTeclas;
        this.ehGrande = ehGrande;
    }

    @Override
    public String obterTipoDeSom() {
        return "Som de piano";
    }

    @Override
    public void tocar() {
        System.out.println("Tocando piano: " + getNome());
        System.out.println("Som: " + obterTipoDeSom());
    }

    public String regularAltura() {
        return "Regulando a altura das teclas do piano...";
    }

    @Override
    public String toString() {
        return String.format("PIANO [Nome=%s, Fabricante=%s, Preço=R$%.2f, " +
                "Ano=%d, Teclas=%d, Grande=%s]",
                getNome(), getFabricante(), getPreco(), getAnoFabricacao(),
                numeroDeTeclas, (ehGrande ? "Sim" : "Não"));
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public boolean isEhGrande() {
        return ehGrande;
    }

    public void setEhGrande(boolean ehGrande) {
        this.ehGrande = ehGrande;
    }
}
