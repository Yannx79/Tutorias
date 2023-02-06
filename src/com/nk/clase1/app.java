
package com.nk.clase1;

// mitocode -> buenos cursos en youtube cortos
// pildora informatica -> cursos gratis extensos y teoricos
// practicar otro lenguaje: python or js
// practicar en pseudocodigo
// los errores de codigo son buenos
// los errores en tiempo de ejecucion son buenos
// los errores logicos es el problemas

// temas de herencias y abstraccion

public class app {
    
    public static void main(String[] args) {
        
        // 1 Primeros pasos
        // ctrl + space : autocompletado
        IEmpleado e = new Empleado();
        // mensajes del empleado
        e.trabajar();
        System.out.println(((Empleado) e).saludar());
        System.out.println("===================================");
        
        // 2 Declarar como IEmpleado pero instanciar como directivo
        IEmpleado e2 = new Directivo();
        e2.trabajar();
        // Ha se usa el casting
        System.out.println(((Empleado) e2).saludar());

        
        System.out.println("===================================");
        
//         ctrl + shift + c
        // 3 Declarar como un Empleado
        Empleado e3 = new Directivo();
        e3.trabajar();
        System.out.println(e3.saludar());
        
        
        System.out.println("====================================");
        
        // 4 Declar como un Directivo
        Directivo e4 = new Oficial();
        e4.trabajar();
        System.out.println(e4.saludar());
        System.out.println("========================================");
        
    }

}
