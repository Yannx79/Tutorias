
package com.nk.clase1;

import java.io.Serializable;

// bean: atributos privados, getters and setters, implentar la interfaz
// serializable, contructor vacio
public class Empleado extends IEmpleado implements Serializable{
    
    private String nombres;
    private String apellidos;
    private int codigo;

    // sobrecargar: usar el mismo metodo con diferentes parametros
    public Empleado() {
        
    }

    public Empleado(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }  

    @Override
    public void preparar() {
        System.out.println("Preparandonos como empleados");
    }

    // sout + ctrl + space
    @Override
    public void iniciar() {
        System.out.println("Iniciando como empleado");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando como empleado");
    }
    
    public String saludar() {
        return "Buenos dias como Empleado: ";
    }
    
}
