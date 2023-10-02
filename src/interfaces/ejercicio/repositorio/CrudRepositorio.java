package interfaces.ejercicio.repositorio;

import interfaces.ejercicio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crearInstancia(Cliente cliente);
    void modificar(Cliente cliente);
    void eliminar(Integer id);
}
