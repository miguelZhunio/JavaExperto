package interfaces.ejercicio;

import interfaces.ejercicio.modelo.Cliente;
import interfaces.ejercicio.modelo.ClienteListRepositorio;
import interfaces.ejercicio.repositorio.Direccion;
import interfaces.ejercicio.repositorio.GeneralFull;

import java.sql.SQLOutput;
import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        GeneralFull repositorio = new ClienteListRepositorio();
        repositorio.crearInstancia(new Cliente("Jack", "Marcio"));
        repositorio.crearInstancia(new Cliente("Erick", "Junio"));
        repositorio.crearInstancia(new Cliente("Maria", "Guima"));
        repositorio.crearInstancia(new Cliente("Mario", "Luzio"));

        List<Cliente> clientes = repositorio.listar();
        clientes.forEach(System.out::println);
        System.out.println("\n\n");

        List<Cliente> clientes_2 = repositorio.listar(1,2);
        clientes_2.forEach(System.out::println);

        System.out.println("\n\n");
        List<Cliente> clientes_3 = repositorio.listar("id", Direccion.DESC);
        clientes_3.forEach(System.out::println);

        System.out.println("---------- Actualizar -----------");
        Cliente actualizar = new Cliente("Bea", "Mena");
        actualizar.setId(2);
        repositorio.modificar(actualizar);
        Cliente nuevo = repositorio.porId(2);
        System.out.println(nuevo);

        System.out.println("---------- Eliminar -----------");
        repositorio.eliminar(2);
        (repositorio.listar()).forEach(System.out::println);

        System.out.println("******************* TOTAL *****************");
        System.out.println("Tal de registros: " + repositorio.count());



    }
}
