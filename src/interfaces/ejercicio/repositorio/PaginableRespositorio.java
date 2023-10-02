package interfaces.ejercicio.repositorio;

import interfaces.ejercicio.modelo.Cliente;

import java.util.List;

public interface PaginableRespositorio {
    List<Cliente> listar(int desde, int hasta);

}
