package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private Categoria categoria;
    private Sucursal sucursal;
    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", categoria=" + categoria +
                ", sucursal=" + sucursal +
                '}';
    }
}
