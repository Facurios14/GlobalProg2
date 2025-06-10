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
public abstract class Articulo extends Base{
    protected String denominacion;
    protected double precioVenta;
    protected UnidadMedida unidadMedida;
    protected Imagen imagen;
    @Builder.Default
    protected Set<Promocion> promociones = new HashSet<>();

    public void addPromocion(Promocion promocion){
        this.promociones.add(promocion);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", unidadMedida=" + unidadMedida +
                ", imagen=" + imagen +
                '}';
    }
}
