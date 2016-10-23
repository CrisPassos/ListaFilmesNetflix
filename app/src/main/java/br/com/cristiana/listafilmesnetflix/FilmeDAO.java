package br.com.cristiana.listafilmesnetflix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristiana on 23/10/2016.
 */

public class FilmeDAO {

    public static List<Filme> listar(){

        List<Filme> listaFilmes = new ArrayList<Filme>();
        listaFilmes.add(new Filme(1,"Como se fosse a primeira vez", 40));
        listaFilmes.add(new Filme(2,"Wall-E", 140));
        listaFilmes.add(new Filme(3,"Os miseráveis", 89));
        listaFilmes.add(new Filme(4,"O princípe do Egito", 100));
        listaFilmes.add(new Filme(5,"Madasgascar", 70));

        return listaFilmes;

    }
}
