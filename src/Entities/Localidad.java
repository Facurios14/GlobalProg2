package Entities;

import java.util.ArrayList;
import java.util.List;

public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;
    private List<Domicilio> domicilios;

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.domicilios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(List<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }
    public void addDomicilio(Domicilio domicilio){
        this.domicilios.add(domicilio);
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
