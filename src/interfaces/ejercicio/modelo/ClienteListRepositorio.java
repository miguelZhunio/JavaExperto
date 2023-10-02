package interfaces.ejercicio.modelo;

import interfaces.ejercicio.repositorio.*;


import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio
        implements GeneralFull {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente enc = null;
        for (int i = 0; i < dataSource.size(); i++) {
            if (id == dataSource.get(i).getId() && dataSource.get(i).getId() != null) {
                enc = dataSource.get(i);
                break;
            }
        }
        return enc;
    }

    @Override
    public void crearInstancia(Cliente cliente) {
        dataSource.add(cliente);

    }

    @Override
    public void modificar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
                    int result = 0;
                    if (dir == Direccion.ASC) {
                        result = ordenar(a, b, campo);
                    } else {
                        result = ordenar(b, a, campo);
                    }
                    return result;
                }

        );
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(Cliente a , Cliente b, String campo) {
        int result = 0;
        switch (campo) {
            case "id" ->
                    result = a.getId().compareTo(b.getId());
            case "nombre" ->
                    result = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    result = a.getApellido().compareTo(b.getApellido());
        }
        return result;

    }


    @Override
    public int count() {
        return this.dataSource.size();
    }
}
