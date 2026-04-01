package br.edu.projeto.modelo;

public abstract class Instrumento {
    private String nome;
    private String fabricante;
    private double preco;
    private int anoFabricacao;

    public Instrumento(String nome, String fabricante, double preco, int anoFabricacao) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public abstract String toString();

    public void tocar() {
        System.out.println("Tocando: " + nome);
    }

    public abstract String obterTipoDeSom();

    public String afinador() {
        return nome + " está sendo afinado...";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}