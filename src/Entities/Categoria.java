package Entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Base{
    private String denominacion;
    private List<Articulo> articulos;
    private List<Categoria> subCategorias;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
        this.articulos = new ArrayList<>();
        this.subCategorias = new ArrayList<>();
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public List<Categoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(List<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }
    public void addSubCategoria(Categoria categoria){
        this.subCategorias.add(categoria);
    }
}
