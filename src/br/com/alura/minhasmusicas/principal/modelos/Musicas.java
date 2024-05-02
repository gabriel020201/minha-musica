package br.com.alura.minhasmusicas.principal.modelos;

public class Musicas extends Audio {
    private String cantor;
    private String album;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() >= 1000){
            return 10;
        } else {
            return 6;
        }
    }
}

