package com.nk.clase1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

// linkedinlist => permite agregar mas facilmente
// arraylist => acceder facilmente a la ubicacion del indice
public class MetodosDeLista {

    public static void main(String[] args) {

        // Declara listas
        List<Empleado> employeerList = new LinkedList<>();
        Map<String, Empleado> employeerMap = new HashMap<>();

        // añadir: create
        employeerList.add(new Empleado("Mateo", "Santos"));
        employeerList.add(new Empleado("Juan", "Valdivia"));
        Empleado susana = new Empleado("Carmen", "Torivio");
        susana.setCodigo(10);
        employeerList.add(susana);
        employeerList.add(new Empleado("Susana", "Quiroz"));
        employeerList.add(new Empleado("Ana", "Sandoval"));

        for (Empleado e : employeerList) {
            employeerMap.put(e.getNombres(), e);
        }

        System.out.println("Accediendo a un elemetno de diccionario");
        System.out.println(employeerMap.get("Susana"));

        System.out.println("Creando elemento de lista");

        if (employeerList.isEmpty()) {
            System.out.println("Estoy vacio");
        } else {
            System.out.println("Tengo elmentos");
        }

        employeerList.forEach(System.out::println);

        // eliminar: remove
        for (Empleado e : employeerList) {
            if (e.getApellidos().equalsIgnoreCase("Quiroz")) {
                employeerList.remove(e);
                break;
            }
        }

        // recorrer: read
        // foreach
        for (Empleado e : employeerList) {
            System.out.println(e);
        }
        System.out.println("=========================");

        for (int i = 0; i < employeerList.size(); i++) {
            System.out.println(employeerList.get(i));
        }

        System.out.println("Inverso");
        for (int i = employeerList.size() - 1; i >= 0; i--) {
            System.out.println(employeerList.get(i));
        }

        System.out.println("=========================");

        // metodos de referencia
        // programacion funcional
        employeerList.forEach(System.out::println);

        System.out.println("=========================");

        // lista simple
        Iterator<Empleado> it = employeerList.iterator();
        while (it.hasNext()) { // boolean
            System.out.println(it.next());
        }
        System.out.println("=============================");

        // lista doble
        ListIterator<Empleado> it2 = employeerList.listIterator();
        while (it2.hasNext()) { // boolean
            it2.next();
        }
        System.out.println("========================");
        while (it2.hasPrevious()) { // boolean
            System.out.println(it2.previous());
        }
        System.out.println("=========================");

        System.out.println("Usando el getFirst propio de linkedList");
        System.out.println(((LinkedList<Empleado>) employeerList).getFirst());
        System.out.println(((LinkedList<Empleado>) employeerList).getLast());

        System.out.println("Usando el toArray");
        // usando el toArray
        Object[] miArray = employeerList.toArray();
        System.out.println(Arrays.toString(miArray));;

        employeerList.clear();

        if (employeerList.isEmpty()) {
            System.out.println("Estoy vacio insertamen datos");
        } else {
            System.out.println("Estoy con elementos te equivocaste");
        }

    }

}
