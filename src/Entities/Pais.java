package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Pais extends Base{
    private String nombre;
    @Builder.Default
    private Set<Provincia> provincias = new HashSet<>();

    public void addProvincia(Provincia provincia){
        this.provincias.add(provincia);
    }
    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
