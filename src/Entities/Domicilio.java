package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;
    @Builder.Default
    private Set<Cliente> clientes = new HashSet<>();
    private Set<Sucursal> sucursales = new HashSet<>();

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", cp=" + cp +
                ", localidad=" + localidad +
                '}';
    }
}
