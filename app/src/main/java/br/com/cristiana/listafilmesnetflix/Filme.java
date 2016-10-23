package br.com.cristiana.listafilmesnetflix;

/**
 * Created by Cristiana on 23/10/2016.
 */

public class Filme {

    private int codigoFilme;
    private String nomeFilme;
    private int duracaoFilme;

    public Filme() {}

    public Filme(int codigoFilme, String nomeFilme, int duracaoFilme) {
        this.codigoFilme = codigoFilme;
        this.nomeFilme = nomeFilme;
        this.duracaoFilme = duracaoFilme;
    }

    @Override
    public String toString() {
        return "Filme='" + nomeFilme + '\'' +
                " - duração=" + duracaoFilme;
    }

    public int getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }
}
