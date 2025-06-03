package Entities;

import Enums.TipoPromocion;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Promocion {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Sucursal sucursal;
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", precioPromocional=" + precioPromocional +
                ", sucursal=" + (sucursal != null ? sucursal.getNombre() : "null") +
                '}';
    }

}

