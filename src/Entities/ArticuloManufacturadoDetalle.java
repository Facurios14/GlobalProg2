package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ArticuloManufacturadoDetalle extends Base{
    private int cantidad;
    private ArticuloInsumo articuloInsumo;

    @Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "cantidad=" + cantidad +
                ", articuloInsumo=" + articuloInsumo +
                '}';
    }
}
