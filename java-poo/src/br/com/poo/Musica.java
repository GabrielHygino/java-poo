package br.com.poo;

public class Musica extends Audio{
    private String artista;

    public String getArtista() {
        return artista;
    }

    public Musica(String titulo, String artista){
        this.getTitulo(titulo);
        this.artista = artista;
    }

    @Override
    public int getClassificacoes() {
        if (getTotalCurtidas() > 100){
            return 10;
        } else if(getTotalCurtidas() > 50) {
        return 5;
        } else {
            return 0;
        }
    }
}