package com.example.germnrojo.lawyersapp;

/**
 * Created by Germán Rojo on 13-05-2017.
 */

import android.content.ContentValues;

import java.util.UUID;

/**
 * entidad abogado: german qlo chupa la que cuelga
 */
public class Lawyer {
    private String id;
    private String nombre;
    private String especialidad;
    private String fono;
    private String biografia;
    private String avatar;//ni pico idea que es

    public Lawyer(String name,String especialidad, String fono, String bio, String avatar ){
        this.id= UUID.randomUUID().toString();
        this.nombre=name;
        this.especialidad=especialidad;
        this.fono=fono;
        this.biografia=bio;
        this.avatar=avatar;
    }

    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public String getFono() {
        return fono;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getAvatar() {
        return avatar;
    }

    public ContentValues toContentValues() {
        ContentValues values =  new ContentValues();
        values.put(LawyersContract.LawyerEntry.ID, id);
        values.put(LawyersContract.LawyerEntry.NAME, nombre);
        values.put(LawyersContract.LawyerEntry.SPECIALTY, especialidad);
        values.put(LawyersContract.LawyerEntry.FONO, fono);
        values.put(LawyersContract.LawyerEntry.BIO, biografia);
        values.put(LawyersContract.LawyerEntry.AVATAR, avatar);
        return values;

    }//end method toContentValues

}//end Lawyer "clase entidad abogado"
