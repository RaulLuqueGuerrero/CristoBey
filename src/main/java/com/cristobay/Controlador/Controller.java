package com.cristobay.Controlador;
import com.cristobay.Modelo.*;
import com.cristobay.Vista.*;
import java.util.ArrayList;
public class Controller {
    public Controller(){
        Conexion connect = new Conexion();
        Articulo a = new Articulo();
        ClaseVista cv = new ClaseVista();
        ArrayList<String> arrayVista = cv.getArrayV();
        ArrayList<String> array = a.getArrayArticulo();
        array = arrayVista;
        
    }
    
}
