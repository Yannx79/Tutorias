
package com.nk.clase1;

public abstract class IEmpleado {

    // metodos con cuerpo
    public void trabajar() {
        this.preparar();
        this.iniciar();
        this.finalizar();
    }
    
    // metodos sin cuerpo
    // declar metodo sin implentar. Porque exiten clases que necesitan esos
    // metodos pero de diferente forma
    public abstract void preparar();
    
    public abstract void iniciar();
    
    public abstract void finalizar();
    
}
