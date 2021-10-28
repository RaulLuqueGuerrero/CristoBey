package com.cristobay.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private List<Integer> id_articulo;
    private List<String> nombre_Articulo;
    private List<String> descripcion;
    private List<String> imagen;
    private ArrayList<String> arrayArticulo;

    public Articulo(){
        
    }
    public ArrayList<String> getArrayArticulo() {
        arrayArticulo.add(getNombre_Articulo());
        arrayArticulo.add(getDescripcion());
        arrayArticulo.add(getImagen());
        return arrayArticulo;
    }


    public int getId_articulo() {
        return id_articulo;
    }

    public String getNombre_Articulo() {
        return nombre_Articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }
}
