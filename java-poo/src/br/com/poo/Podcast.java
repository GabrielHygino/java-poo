package br.com.poo;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public Podcast(String titulo, String host, String descricao) {
        this.getTitulo(titulo);
        this.host = host;
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getClassificacoes() {
        if (getTotalCurtidas() > 50){
            return 10;
        } else if(getTotalCurtidas() > 25) {
            return 5;
        } else {
            return 0;
        }
    }
}
