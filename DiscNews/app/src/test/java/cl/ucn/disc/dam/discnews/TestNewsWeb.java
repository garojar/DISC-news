package cl.ucn.disc.dam.discnews;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

import cl.ucn.disc.dam.discnews.model.NewsApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Germán Rojo on 26-10-2017.
 */

public class TestNewsWeb {
    private static final Gson gson = new GsonBuilder().serializeNulls().create();
    @Test
    public void testConnection() throws IOException {

        final String url="https://newsapi.org/v1/articles?source=bbc-sport&sortBy=top&apiKey=45bff26e73e5467e94bd6da72f9ec28f";
        final OkHttpClient client = new OkHttpClient();
        Assertions.assertThat(client).isNotNull();

        final Request request = new Request.Builder()
                    .url(url)
                    .build();
        Assertions.assertThat(request).isNotNull();
        Response response = client.newCall(request).execute();
        final String json = response.body().string();

        Assertions.assertThat(json).isNotBlank();

        final NewsApi newsApi = gson.fromJson(json,NewsApi.class);
        System.out.println(newsApi);


    }
}
