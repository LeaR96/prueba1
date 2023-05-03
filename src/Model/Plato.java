package Model;

public class Plato {
    private String nombre;
    private Integer precio;

    public Plato(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Plato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
