package com.nk.clase3.app;

import com.nk.clase3.dao.ClienteDAO;
import com.nk.clase3.dto.ClienteDTO;
import java.util.List;
import java.util.Scanner;

public class App {

    // stackoverflow
    // github
    // cheatsheet de tema
    // youtube
    // foros
    public static void main(String[] args) {

        // 1. usar la lectura individual
//        testConsultarUnCliente("46464578");
        // 2. usar la lectura total
//        testLecturaClientes();
        // 3. crear
//        testCrearCliente();
        // 4. actualizar 
//        testActualizarCliente();
        // 5. eliminar
        testEliminarCliente("73171689");
    }

    public static void testEliminarCliente(String dni) {
        ClienteDAO clienteDAO = new ClienteDAO();
        Scanner s = new Scanner(System.in);
        System.out.println("Esta seguro de eliminar al cliente?");
        System.out.println("1. Confirmo");
        System.out.println("2. Deniego");
        System.out.println("¿Cual es tu elección?");
        int valor = s.nextInt();
        if (valor == 1) {
            if (clienteDAO.delete(dni)) {
                System.out.println("Cliente eliminado de nuestra base de datos");
            } else {
                System.out.println("Cliente no eliminado");
                System.out.println("Revisa tu codigo");
            }
        } else {
            System.out.println("Ha cancelado la operacion");
        }
    }

    public static void testActualizarCliente() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setApellidos("Cevallos Guitierrez");
        clienteDTO.setNombres("Maria Juana");
        clienteDTO.setDni("78541278");
        clienteDTO.setEliminado(0);
        clienteDTO.setTelefono("4564642");
        if (clienteDAO.update(clienteDTO)) {
            System.out.println("He sido actualizada correctamente");
            System.out.println("El Cliente esta activo en la empresa!");
            System.out.println("Gracias por el registros");
            System.out.println("==================== INFO RESUMIDA =============0");
            System.out.println("Mi nombre es: " + clienteDTO.getNombres());
            System.out.println("Mi apellido es: " + clienteDTO.getApellidos());
            System.out.println("============ TODA LA INFO ===============");
            System.out.println(clienteDTO);
        } else {
            System.out.println("Algo ha fallado en tu codigo revisalo nuevamente");
        }
    }

    public static void testCrearCliente() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setApellidos("Vargaz Bonifacio");
        clienteDTO.setNombres("Raul Alejandro");
        clienteDTO.setDni("54123798");
        clienteDTO.setEliminado(0);
        clienteDTO.setTelefono("787845562");
        if (clienteDAO.create(clienteDTO)) {
            System.out.println("Cliente registrados en la base de datos exitosamente");
            System.out.println("El Cliente esta activo en la empresa!");
            System.out.println("Gracias por el registros");
            System.out.println("==================== INFO RESUMIDA =============0");
            System.out.println("Mi nombre es: " + clienteDTO.getNombres());
            System.out.println("Mi apellido es: " + clienteDTO.getApellidos());
            System.out.println("============ TODA LA INFO ===============");
            System.out.println(clienteDTO);
        } else {
            System.out.println("Algo ha fallado revisa tu codigo");
        }
    }

    public static void testConsultarUnCliente(String dni) {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteDTO clienteDTO = clienteDAO.read(dni);
        if (clienteDTO.getEliminado() == 0) {
            System.out.println("El Cliente esta activo en la empresa!");
            System.out.println("==================== INFO RESUMIDA =============0");
            System.out.println("Mi nombre es: " + clienteDTO.getNombres());
            System.out.println("Mi apellido es: " + clienteDTO.getApellidos());
            System.out.println("============ TODA LA INFO ===============");
            System.out.println(clienteDTO);
        } else {
            System.out.println("El cliente se ha desafiliado!");
        }

    }

    public static void testLecturaClientes() {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<ClienteDTO> clienteList = clienteDAO.readAll();
        for (ClienteDTO c : clienteList) {
            System.out.println(c);
        }
        System.out.println("Cambiamos la estructura");
        for (int i = 0; i < clienteList.size(); i++) {
            System.out.println((i + 1) + ". Mi nombres es "
                    + clienteList.get(i).getNombres()
                    + " y mi telefono es el siguiente: " + clienteList.get(i).getTelefono());
        }
    }

}
