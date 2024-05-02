package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.principal.modelos.Classificavel;
import br.com.alura.minhasmusicas.principal.modelos.Musicas;
import br.com.alura.minhasmusicas.principal.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Vem pro taboao");
        minhaMusica.setCantor("Mc Teteu");

        for (int i =0; i<1000; i++){
            minhaMusica.reproduz();
        }
        for (int i =0; i<1000; i++){
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setHost("Monark");
        meuPodcast.setTitulo("Monark Talks");

        for (int i =0; i<5000; i++){
            meuPodcast.reproduz();
        }
        for (int i =0; i<1000; i++){
            meuPodcast.curte();
        }

        Classificavel preferidas = new Classificavel();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
