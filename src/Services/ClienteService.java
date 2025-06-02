package Services;

import Entities.Cliente;
import java.util.List;

public interface ClienteService {
    void registrarCliente(Cliente cliente);
    Cliente obtenerClientePorId(Long id);
    List<Cliente> listarClientes();
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Long id);
}
