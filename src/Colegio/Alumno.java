package Colegio;

import java.util.*;

public class Alumno {

    Set<Materia> listaMaterias = new HashSet<>();
    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m) {
        this.listaMaterias.add(m);
    }

    public int cantidadMaterias() {
        return listaMaterias.size();
    }
}
