package DAO;

import Entities.Cliente;
import java.util.List;

public interface ClienteDAO {
    void guardar(Cliente cliente);
    Cliente buscarPorId(Long id);
    List<Cliente> listarTodos();
    void actualizar(Cliente cliente);
    void eliminar(Long id);
}

