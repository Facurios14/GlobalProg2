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
public class DetallePedido extends Base{
    private int cantidad;
    private double subTotal;
    private Articulo articulo;
    private Pedido pedido;

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", articulo=" + articulo +
                ", pedido=" + pedido +
                '}';
    }
}
