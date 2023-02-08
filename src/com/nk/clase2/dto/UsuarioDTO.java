
package com.nk.clase2.dto;

// dto {data transfer object} <> objeto de transferencias

import java.io.Serializable;

// persistir se almacene en nuestrad db
public class UsuarioDTO implements Serializable {

    private int id;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private boolean estaEliminado; // 0: no esta eliminado, 1: esta eliminado
    // db: nosotros nunca eliminado un dato

    public UsuarioDTO() {
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", edad=" + edad + ", estaEliminado=" + estaEliminado + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstaEliminado() {
        return estaEliminado;
    }

    public void setEstaEliminado(boolean estaEliminado) {
        this.estaEliminado = estaEliminado;
    }
    
    
    
}
