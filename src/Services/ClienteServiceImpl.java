package Services;

import DAO.ClienteDAO;
import DAO.ClienteDAOImpl;
import Entities.Cliente;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO clienteDAO;

    public ClienteServiceImpl() {
        this.clienteDAO = new ClienteDAOImpl();
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        // Aquí podés hacer validaciones, por ejemplo:
        if (cliente.getNombre() == null || cliente.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente es obligatorio.");
        }
        clienteDAO.guardar(cliente);
    }

    @Override
    public Cliente obtenerClientePorId(Long id) {
        return clienteDAO.buscarPorId(id);
    }

    @Override
    public List<Cliente> listarClientes() {
        return clienteDAO.listarTodos();
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        clienteDAO.actualizar(cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteDAO.eliminar(id);
    }
}
