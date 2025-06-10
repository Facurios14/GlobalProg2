package Entities;

import Enums.Rol;
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

public class Usuario extends Base{
    private String authOId;
    private String username;

    @Override
    public String toString() {
        return "Usuario{" +
                "authOId='" + authOId + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
