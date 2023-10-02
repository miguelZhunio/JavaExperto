package interfaces.ejercicio.repositorio;

import interfaces.ejercicio.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);



}
