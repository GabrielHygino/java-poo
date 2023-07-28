package br.com.poo;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacoes;

    public void curte() {
        this.totalCurtidas++;
    };

    public void reproduz() {
        this.totalReproducoes++;
    }

    public void getTitulo(String titulo) {
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacoes() {
        return classificacoes;
    }

}
