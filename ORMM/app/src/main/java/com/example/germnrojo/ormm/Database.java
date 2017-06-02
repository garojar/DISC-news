package com.example.germnrojo.ormm;

/**
 * Created by Germán Rojo on 15-05-2017.
 */

@com.raizlabs.android.dbflow.annotation.Database(name = Database.NAME, version = Database.VERSION)
public class Database {
    /**
     * Key de la base de datos
     */
    public static final String NAME = "Database";
    /**
     * Version de la BD
     */
    public static final int VERSION = 1;
    /**
     * Tamanio del cache
     */
    public static final int CACHE_SIZE = 100;
}
