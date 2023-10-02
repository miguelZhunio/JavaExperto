package javagenerics;

import interfaces.ejercicio.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class EjemploGenerico {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzman"));

        Cliente cliente = clientes.iterator().next();
    }
}
