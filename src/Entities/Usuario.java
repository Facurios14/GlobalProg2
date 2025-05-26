package Entities;

import Enums.Rol;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Base{
    private String authOId;
    private String username;
    private Rol rol;
    private List<Sucursal> sucursales;

    public Usuario(String authOId, String username, Rol rol) {
        this.authOId = authOId;
        this.username = username;
        this.rol = rol;
        this.sucursales = new ArrayList<>();
    }

    public String getAuthOId() {
        return authOId;
    }

    public void setAuthOId(String authOId) {
        this.authOId = authOId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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
}
