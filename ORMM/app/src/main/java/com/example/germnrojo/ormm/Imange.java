package com.example.germnrojo.ormm;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

/**
 * Created by Germán Rojo on 15-05-2017.
 */
@Table(
        database = Database.class,
        cachingEnabled = false,
        orderedCursorLookUp = true, // https://github.com/…/DBFl…/blob/develop/usage2/Retrieval.md…
        cacheSize = Database.CACHE_SIZE
)

public class Imange {
    @Column
    private String nombre;
    @Column
    @PrimaryKey
    private int size;
    public Imange(String nombre, int size){
        this.nombre=nombre;
        this.size=size;
    }
    public Imange(){}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
