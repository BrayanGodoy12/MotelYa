package model;

public class Habitacion {
    public String Nombre;
    public String Precio;
    public String imagenes;
    public int CantidadDisponible;

    public Habitacion(String nombre, String precio, String imagenes, int cantidadDisponible) {
        Nombre = nombre;
        Precio = precio;
        this.imagenes = imagenes;
        CantidadDisponible = cantidadDisponible;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public int getCantidadDisponible() {
        return CantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        CantidadDisponible = cantidadDisponible;
    }
}
