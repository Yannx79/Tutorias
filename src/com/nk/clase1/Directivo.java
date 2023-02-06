
package com.nk.clase1;

public class Directivo extends Empleado {

    // sobreescritura
    @Override
    public void preparar() {
        System.out.println("Preparandose como Directivo");
    }
 
    @Override
    public void iniciar() {
        System.out.println("Iniciando como directivo");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando como directivo");
    }
    
    @Override
    public String saludar() {
        return super.saludar() + "como Directivo: ";
    }
    
}
