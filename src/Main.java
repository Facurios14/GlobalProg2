import Entities.*;
import Services.ClienteService;
import Services.ClienteServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Config.Databaseconnection;


public class Main {
    public static void main(String[] args) {

        ClienteService clienteService = new ClienteServiceImpl();

        Cliente cliente = new Cliente();
        cliente.setNombre("Ana");
        cliente.setApellido("García");
        cliente.setTelefono("987654321");
        cliente.setEmail("ana@example.com");

        clienteService.registrarCliente(cliente);
        System.out.println("Cliente registrado desde Service.");
            /*prueba de conexion*/
            try (Connection conn = Databaseconnection.getConnection()) {
                if (conn != null) {
                    System.out.println("Conexión exitosa a XAMPP");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        String sql = "INSERT INTO cliente (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";

        try (Connection conn = Databaseconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "Juan");
            stmt.setString(2, "Pérez");
            stmt.setString(3, "123456789");
            stmt.setString(4, "juanperez@email.com");

            stmt.executeUpdate();
            System.out.println("Cliente insertado con éxito.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        /*---------*/
        Empresa empresa = Empresa.builder()
                .nombre("mercado libre")
                .razonSocial("clase A1")
                .cuil(222333)
                .build();
        Sucursal sucursal = Sucursal.builder().nombre("mendoza").build();
        empresa.addSucursal(sucursal);
        ArticuloInsumo articuloInsumo = ArticuloInsumo.builder()
                .denominacion("Aspiradora")
                .precioCompra(5.5)
                .sucursal(sucursal)
                .build();
        System.out.println(articuloInsumo);
    }
}