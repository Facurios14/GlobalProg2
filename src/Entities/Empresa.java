package Entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private int cuil;
    private List<Sucursal> sucursales;
    private List<Promocion> promociones;

    public Empresa(String nombre, String razonSocial, int cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.sucursales = new ArrayList<>();
        this.promociones = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal (Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    public List<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }
    public void addPromocion(Promocion promocion){
        this.promociones.add(promocion);
    }
}
