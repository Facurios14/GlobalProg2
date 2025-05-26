package Entities;

import java.util.ArrayList;
import java.util.List;

public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;
    private List<Cliente> clientes;
    private List<Sucursal> sucursales;

    public Domicilio(String calle, int numero, int cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
        this.clientes = new ArrayList<>();
        this.sucursales = new ArrayList<>();
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
}
