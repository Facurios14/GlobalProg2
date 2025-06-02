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
public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private int cuil;
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuil=" + cuil +
                '}';
    }
}
