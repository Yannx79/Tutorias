
package com.nk.clase2.idao;

import com.nk.clase2.datasource.Conexion;
import com.nk.clase2.dto.UsuarioDTO;
import java.util.List;


// es una interfaz que define metodos necesarios para operar sobre mi base de datos
public interface IUsuarioDAO{

    public static final String SQL_CREATE = "INSERT INTO tb_usuarios"
            + " parametos(id, nombres, apellidos, etc) values (?,?,?,?)";
    public static final String SQL_READ = "SELECT * tb_usuarios";
    public static final String SQL_READ_ALL = "";
    public static final String SQL_UPDATE = "";
    public static final String SQL_DELETE = "";
    public static final Conexion CONEXION = Conexion.getConexion();
    
    public abstract boolean create(UsuarioDTO usuarioDTO);
    
    public abstract UsuarioDTO read();
    
    public abstract List<UsuarioDTO> readAll();
    
    public abstract boolean update(UsuarioDTO usuarioDTO);

    // nosostros no eliminamos solo cambiamos el estado
    // la llave si cambia dependiendo al cual es: String, int, long
    public abstract boolean delete(int key);
    
}
