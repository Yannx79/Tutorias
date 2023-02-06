package com.nk.clase1;

public class Oficial extends Directivo {

    // sobreescritura
    @Override
    public void preparar() {
        System.out.println("Preparandose como Oficial");
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando como Oficial");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando como Oficial");
    }

    @Override
    public String saludar() {
        return super.saludar() + "como Oficial";
    }

}
