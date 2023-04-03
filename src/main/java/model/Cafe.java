package model;

public class Cafe {
    private Acompanhamento acompanhamento;
    private String tipoCafe;
    private int quantidade;
    private int temperaturaAtual;
    private int temperaturaMaxima;
    private boolean estoque;

    public Cafe() {

    }

    public Cafe(Acompanhamento acompanhamento, String tipoCafe, int quantidade, int temperaturaAtual, int temperaturaMaxima, boolean estoque) {
        this.acompanhamento = acompanhamento;
        this.tipoCafe = "cappuccino";
        this.quantidade = 1;
        this.temperaturaAtual = 0;
        this.temperaturaMaxima = temperaturaMaxima;
        this.estoque = false;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public boolean isEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "acompanhamento=" + acompanhamento +
                ", tipoCafe='" + tipoCafe + '\'' +
                ", quantidade=" + quantidade +
                ", temperaturaAtual=" + temperaturaAtual +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", estoque=" + estoque +
                '}';
    }
}


