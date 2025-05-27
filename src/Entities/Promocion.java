package Entities;

import Enums.TipoPromocion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private Set<Articulo> articulos = new HashSet<>();

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", FechaDesde=" + FechaDesde +
                ", FechaHasta=" + FechaHasta +
                ", HoraDesde=" + HoraDesde +
                ", HoraHasta=" + HoraHasta +
                ", descripcionDescuento='" + descripcionDescuento + '\'' +
                ", precioPromocional=" + precioPromocional +
                ", tipoPromocion=" + tipoPromocion +
                ", sucursal=" + sucursal +
                '}';
    }
}

