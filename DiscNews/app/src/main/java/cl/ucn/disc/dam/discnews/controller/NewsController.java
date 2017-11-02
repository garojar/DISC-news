package cl.ucn.disc.dam.discnews.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

import cl.ucn.disc.dam.discnews.model.Article;
import cl.ucn.disc.dam.discnews.model.NewsApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Clase principal que contiene los metodos de acceso a las noticias
 * Created by Germán Rojo on 26-10-2017.
 */

public class NewsController {
    /**
     *
     */
    private static final Gson gson = new GsonBuilder().serializeNulls().create();
    /**
     *
     */
    private static final String url="https://newsapi.org/v1/articles?source=bbc-sport&sortBy=latest&apiKey=45bff26e73e5467e94bd6da72f9ec28f";

    /**
     * Cliente OkHttp
     */
    private static final OkHttpClient client = new OkHttpClient();

    /**
     * Obtencion de {@link Article} desde
     * @return
     */
    public static List<Article> getArticles() throws IOException {
        //Peticion
        final Request request = new Request.Builder()
                .url(url)
                .build();
        //Respuesta
        final Response response = client.newCall(request).execute();
        final String json = response.body().string();

        final NewsApi newsApi = gson.fromJson(json,NewsApi.class);
        return newsApi.getArticles();
    }

}
