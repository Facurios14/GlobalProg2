package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Usuario usuario;
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Domicilio> domicilios = new HashSet<>();

    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    public void addDomicilio(Domicilio domicilio){
        this.domicilios.add(domicilio);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", usuario=" + (usuario != null ? usuario.getUsername() : "null") +
                '}';
    }

}
