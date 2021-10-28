/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristobay.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mague
 */
public class Conexion {
    private Connection conexion;
    private Statement realizaConexion;
    private ResultSet resultadosConexion;
    
    public Conexion(){
        
        try{
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3307/cristobay_db", "root", "");
            realizaConexion = conexion.createStatement();
            resultadosConexion = realizaConexion.executeQuery("");
            conexion.close();
        }catch(Exception e){
            System.out.println(e.getMessage()+" cnn");
        }
    }    

    public void setResultadosConexion(ResultSet resultadosConexion) {
        this.resultadosConexion = resultadosConexion;
    }

    public Statement getRealizaConexion() {
        return realizaConexion;
    }
    
        
}
