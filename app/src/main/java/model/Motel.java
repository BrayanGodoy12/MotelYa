package model;

import java.util.ArrayList;

public class Motel {
    public String Nombre;
    public String Direccion;
    public String Imagen;
    public ArrayList<Habitacion> habitaciones;

    public Motel(String nombre, String direccion, String imagen, ArrayList<Habitacion> habitaciones) {
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.Imagen = imagen;
        this.habitaciones= habitaciones;
    }

    public Motel()  {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
