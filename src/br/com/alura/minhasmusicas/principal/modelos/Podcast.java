package br.com.alura.minhasmusicas.principal.modelos;

public class Podcast extends Audio {
    private String host;
    private String canal;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducao() >= 1000){
            return 10;
        } else {
            return 6;
        }
    }
}
