package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;
    private Set<Promocion> promociones = new HashSet<>();
    private Set<Articulo> articulos = new HashSet<>();
    private Set<Categoria> categorias = new HashSet<>();

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
    public void addPromocion(Promocion promocion){
        this.promociones.add(promocion);
    }
    public void addCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", empresa=" + empresa +
                ", domicilio=" + domicilio +
                '}';
    }
}
