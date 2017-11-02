package cl.ucn.disc.dam.discnews;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

import cl.ucn.disc.dam.discnews.controller.NewsController;
import cl.ucn.disc.dam.discnews.model.AdaptadorNews;
import cl.ucn.disc.dam.discnews.model.Article;

public class MainActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(android.R.id.list);

        List<Article> list = null;
        try {
            list = NewsController.getArticles();
        } catch (IOException e) {
            Log.d("ERROR ARTICLES","ERROR AL CAPTURAR LOS ARTICLES");
        }
        AdaptadorNews adapter = new AdaptadorNews(list,this);

        listView.setAdapter(adapter);




    }
}
