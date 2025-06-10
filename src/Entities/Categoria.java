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
public class Categoria extends Base{
    private String denominacion;
    private Categoria padre;
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
    private Set<Categoria> subCategorias = new HashSet<>();

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public void addsubCategorias(Categoria subCategoria){
        this.subCategorias.add(subCategoria);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", padre=" + padre +
                '}';
    }
}
