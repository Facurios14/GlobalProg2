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
public class Imagen extends Base{
    private String denominacion;

    @Override
    public String toString() {
        return "Imagen{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
