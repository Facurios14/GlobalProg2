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
public class Provincia extends Base{
    private String nombre;
    private Pais pais;
    @Builder.Default
    private Set<Localidad> localidades = new HashSet<>();

    public void addLocalidad(Localidad localidad){
        this.localidades.add(localidad);
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                '}';
    }
}
