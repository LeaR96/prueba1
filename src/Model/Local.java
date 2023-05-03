package Model;

import java.util.ArrayList;

public class Local {
    private String nombre;
    private ArrayList <Plato> platos;
    private ArrayList <TiposDePagos> tiposDePago;

    public Local(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<Plato>();
        this.tiposDePago = new ArrayList<TiposDePagos>();
    }

    public Local() {
        this.platos = new ArrayList<Plato>();
        this.tiposDePago = new ArrayList<TiposDePagos>();
    }

    public void agregarTiposDePago(TiposDePagos tipo){
        tiposDePago.add(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
