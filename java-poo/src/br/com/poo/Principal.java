package br.com.poo;

public class Principal {
    public static void main(String[] args) {
        Musica CasaAssombrada = new Musica("CasaAssombrada","Fresno");
        Podcast Nerdcast = new Podcast("Nerdcast", "Jovem Nerd & Azaghal","o maior podcast de cultura pop do Brasil");

        //Fábrica de plays e curtida :p
        for (int i = 0; i < 150; i++){
            CasaAssombrada.reproduz();
            CasaAssombrada.curte();
        }

        for (int i = 0; i < 100; i++){
            Nerdcast.reproduz();
            Nerdcast.curte();
        }


        System.out.println("Casa Assombrada do artista " + CasaAssombrada.getArtista() + " tem " + CasaAssombrada.getTotalCurtidas() + " curtidas e " + CasaAssombrada.getTotalReproducoes() + " reproduções " + "com uma classificação de " + CasaAssombrada.getClassificacoes());
        System.out.println("Nerdcast é o " + Nerdcast.getDescricao() + ", apresentado por " + Nerdcast.getHost() + " e tem " + Nerdcast.getTotalCurtidas() + " curtidas e " + Nerdcast.getTotalReproducoes() + " reproduções " + "com uma classificação de " + Nerdcast.getClassificacoes());

    }
}
