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
public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();

    public void addDomicilio(Domicilio domicilio){
        this.domicilios.add(domicilio);
    }
    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", provincia=" + provincia +
                '}';
    }
}
