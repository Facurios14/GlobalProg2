package Entities;

import java.util.ArrayList;
import java.util.List;

public class Provincia extends Base{
    private String nombre;
    private Pais pais;
    private List<Localidad> localidades;

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.localidades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidad> localidades) {
        this.localidades = localidades;
    }
    public void addLocalidad(Localidad localidad){
        this.localidades.add(localidad);
    }
}
