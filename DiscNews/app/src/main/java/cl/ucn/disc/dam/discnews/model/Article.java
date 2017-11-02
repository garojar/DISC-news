package cl.ucn.disc.dam.discnews.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Builder;
import lombok.Getter;

/**
 * Clase generada via jsonschema2pojo.org
 * Created by Germán Rojo on 26-10-2017.
 */
@Builder
public final class Article {
    @Getter
    private String author;

    @Getter
    private String title;

    @Getter
    private String description;

    @Getter
    private String url;

    @Getter
    private String urlToImage;

    @Getter
    private String publishedAt;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
