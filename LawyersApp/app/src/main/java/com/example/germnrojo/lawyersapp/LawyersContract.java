package com.example.germnrojo.lawyersapp;

import android.provider.BaseColumns;

/**
 * Esquema de bases de datos para abogados "clase lawyer"
 */

public class LawyersContract {
    //lase interna para guardar los nombres de las columnas de la tabla
    //se da uso a la interfaz BaseColumns con el fin de agregar una columna extra
    public static abstract class LawyerEntry implements BaseColumns{
        //definimos la tabla de abogados
        public static  final String TABLE_NAME = "lawyer";

        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String SPECIALTY = "specialty";
        public static final String FONO = "fono";
        public static final String AVATAR = "avatar";
        public static final String BIO = "bio";
    }
}//end LAWYERCONtract
