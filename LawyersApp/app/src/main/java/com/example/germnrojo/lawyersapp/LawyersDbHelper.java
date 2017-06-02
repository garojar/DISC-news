package com.example.germnrojo.lawyersapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Germán Rojo on 13-05-2017.
 */

public class LawyersDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Lawyer.db";
    public LawyersDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //COMANDOS SQL
        db.execSQL("CREATE TABLE" + LawyersContract.LawyerEntry.TABLE_NAME + " ("
                + LawyersContract.LawyerEntry._ID + " INTEGER PRIMARY KASE AUTOINCREMENT,"
                + LawyersContract.LawyerEntry.ID + "TEXT NOT NULL,"
                + LawyersContract.LawyerEntry.NAME + "TEXT NOT NULL,"
                + LawyersContract.LawyerEntry.SPECIALTY + "TEXT NOT NULL,"
                + LawyersContract.LawyerEntry.FONO + "TEXT NOT NULL,"
                + LawyersContract.LawyerEntry.BIO + "TEXT NOT NULL,"
                + LawyersContract.LawyerEntry.AVATAR + " TEXT,"
                + "UNIQUE (" + LawyersContract.LawyerEntry.ID + "))");


        //contenerdor de valores
        ContentValues values = new ContentValues();

        //pares clave-valor

        values.put(LawyersContract.LawyerEntry.ID, "L-001");
        values.put(LawyersContract.LawyerEntry.NAME, "german rojo");
        values.put(LawyersContract.LawyerEntry.SPECIALTY, "petero");
        values.put(LawyersContract.LawyerEntry.FONO, "133");
        values.put(LawyersContract.LawyerEntry.BIO, "comenzo a los 5 años como petero amateur");
        values.put(LawyersContract.LawyerEntry.AVATAR, "german_rojo.jpg");
        //insertamos los datos mi estimado german
        db.insert(LawyersContract.LawyerEntry.TABLE_NAME, null, values);

        //insertaremos mas datos fictisions a la base de datos perra
        mockData(db);
    }

    private void mockData(SQLiteDatabase db) {
        mockLawyer(db, new Lawyer(" vitor flores", "chanta", "1234", "un conchadesumadre que no sabe ni donde esta parado", "pene.jpg"));
        mockLawyer(db, new Lawyer(" rene roa", "chanta 2", "12345", "un conchadesumadre que no sabe ni donde esta parado y que inventa puras weas", "pene2.jpg"));
        mockLawyer(db, new Lawyer(" seba jara", "manipulado por roa", "12346", "sabe pero no nos quiere contar ¬¬", "pene3.jpg"));
        mockLawyer(db, new Lawyer(" germinator", "chupaPI", "123468", "SABEEE REEE SABEEE Y SABEE", "pene5.jpg"));
        mockLawyer(db, new Lawyer(" vitor Araya", "programador nivel DIOS", "12345678", "rata desde losinicios del nuevo mundo, acostumbra a comer queso jajaj es fan de bekios y urrutia", "vitoco.jpg"));
        mockLawyer(db, new Lawyer(" diego saavedra", "marihuanero", "007", "trabaja en las p y eso", "pene7.jpg"));

    //con esto ya puedo hacer consultas
    }

    private long mockLawyer(SQLiteDatabase db, Lawyer lawyer) {

        return db.insert(LawyersContract.LawyerEntry.TABLE_NAME, null, lawyer.toContentValues());
    }


    //SQLITEDATABASE ES EL MANEJADOR DE LA BASE DE DATOS
    //OLDVERSION INDICA LA VERSION ANTIGUA DE LA BD
    // NEWVERSION LA NUEVA PO TONTO QLO
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // NO HAY OPERACIONES
    }

    //se crea el metodo para guardar al puto abogado
    public long saveLawyer(Lawyer lawyer){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        return sqLiteDatabase.insert(LawyersContract.LawyerEntry.TABLE_NAME, null, lawyer.toContentValues());
    }
}//END LawyersDbHelper
