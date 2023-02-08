package com.nk.clase2.datasource;
// es importante importar los objetos del paquete java.sql.*

import java.sql.*;

public class Conexion implements IConexion {

    private static Conexion conexion;
    private Connection connection;

    // patron singleton
    // dos caracteristicas:
    // 1 se crea un objeto estatico y privado de la misma clase
    // 2 se coloca el constructor como privado
    // 3 se define un metodo que me permita obtener la instancia
    private Conexion() {
        conexion = null;
        connection = null;
        try {
            // 1 asignas el class. forname
            Class.forName(DRIVER);
            // 2 obtener conexion
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // retorna (condicion) ? si es verdad se cumple esto 
    //: si es falso se cumple lo de aqui;
   public static Conexion getConexion() {
       return (conexion == null) ? new Conexion() : conexion;
   }
    
    @Override
    public void closeConexion() {
        Conexion.conexion = null;
    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }
    
    
    
    
}
