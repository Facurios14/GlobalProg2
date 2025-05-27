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
public class Categoria extends Base{
    private String denominacion;
    private Categoria padre;
    private Set<Articulo> articulos = new HashSet<>();

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", padre=" + padre +
                '}';
    }
}
