
package com.nk.clase2.dao;

import com.nk.clase2.dto.UsuarioDTO;
import com.nk.clase2.idao.IUsuarioDAO;
import java.util.List;
import java.sql.*;

public class UsuarioDAO implements IUsuarioDAO{

    @Override
    public boolean create(UsuarioDTO usuarioDTO) {
        boolean isCreated = false;
        try {
            Connection connection = CONEXION.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_CREATE);
            ps.setInt(1, usuarioDTO.getId());
            ps.setString(2, usuarioDTO.getNombres());
            ps.setString(3, usuarioDTO.getApellidoPaterno());
            ps.setString(4, usuarioDTO.getApellidoMaterno());
            ps.setInt(5, usuarioDTO.getEdad());
            ps.setBoolean(6, usuarioDTO.isEstaEliminado());
            if(ps.execute()) {
                isCreated = !isCreated;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return isCreated;
    }

    @Override
    public UsuarioDTO read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<UsuarioDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(UsuarioDTO usuarioDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
