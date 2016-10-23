package br.com.cristiana.listafilmesnetflix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class NetflixActivity extends AppCompatActivity {

    private ListView listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflix);


        listaFilmes = (ListView) findViewById(R.id.lstFilme);
        List<Filme> listaFilme = FilmeDAO.listar();

        ListAdapter adapter = new ArrayAdapter<Filme>(this, android.R.layout.simple_list_item_1, listaFilme);
        listaFilmes.setAdapter(adapter);
    }
}
