package br.edu.projeto.modelo;

public class Violao extends Instrumento {
    private int numeroDeCordasEstruturadas;
    private String tipoDeCordasEstruturadas;

    public Violao(String nome, String fabricante, double preco, int anoFabricacao,
                  int numeroDeCordasEstruturadas, String tipoDeCordasEstruturadas) {
        super(nome, fabricante, preco, anoFabricacao);
        this.numeroDeCordasEstruturadas = numeroDeCordasEstruturadas;
        this.tipoDeCordasEstruturadas = tipoDeCordasEstruturadas;
    }

    @Override
    public String obterTipoDeSom() {
        return "Som melódico e harmônico de corda";
    }

    @Override
    public void tocar() {
        System.out.println("Tocando violão: " + getNome());
        System.out.println("Som: " + obterTipoDeSom());
    }

    public String afinarCordas() {
        return "Afinando " + numeroDeCordasEstruturadas + " cordas do violão...";
    }

    @Override
    public String toString() {
        return String.format("VIOLÃO [Nome=%s, Fabricante=%s, Preço=R$%.2f, " +
                "Ano=%d, Cordas=%d, Tipo de Corda=%s]",
                getNome(), getFabricante(), getPreco(), getAnoFabricacao(),
                numeroDeCordasEstruturadas, tipoDeCordasEstruturadas);
    }

    public int getNumeroDeCordasEstruturadas() {
        return numeroDeCordasEstruturadas;
    }

    public void setNumeroDeCordasEstruturadas(int numeroDeCordasEstruturadas) {
        this.numeroDeCordasEstruturadas = numeroDeCordasEstruturadas;
    }

    public String getTipoDeCordasEstruturadas() {
        return tipoDeCordasEstruturadas;
    }

    public void setTipoDeCordasEstruturadas(String tipoDeCordasEstruturadas) {
        this.tipoDeCordasEstruturadas = tipoDeCordasEstruturadas;
    }
}