package model;

public class Sorvete {
    private Acompanhamento acompanhamento;
    private String tipoSorvete;
    private int quantidade;
    private int temperaturaAtual;
    private int temperaturaMaxima;
    private boolean estoque;

    public Sorvete(){

    }

    public Sorvete(Acompanhamento acompanhamento, String tipoSorvete, int quantidade, int temperaturaAtual, int temperaturaMaxima, boolean estoque) {
        this.acompanhamento = acompanhamento;
        this.tipoSorvete = "palito";
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

    public String getTipoSorvete() {
        return tipoSorvete;
    }

    public void setTipoSorvete(String tipoSorvete) {
        this.tipoSorvete = tipoSorvete;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Sorvete{" +
                "acompanhamento=" + acompanhamento +
                ", tipoSorvete='" + tipoSorvete + '\'' +
                ", quantidade=" + quantidade +
                ", temperaturaAtual=" + temperaturaAtual +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", estoque=" + estoque +
                '}';
    }
}

