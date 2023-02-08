
package com.nk.clase2.datasource;

import java.sql.*;

public interface IConexion {

    // no se puede modicar en otra parte de nuestro codigo
    // solo en dos lugares:
    // 1. en el constructor
    // 2. al instanciar o asignar valor
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql:://localhost:3306/db_tutorias";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    // static: todos los objetos van a compartir el mismo espacio de memoria
    // de atributos o metodos estaticos
    
    public abstract Connection getConnection();
    
    public abstract void closeConexion();
    
}
