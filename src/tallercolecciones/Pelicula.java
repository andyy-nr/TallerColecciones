/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercolecciones;

import java.util.Objects;

/**
 *
 * @author Andrea, Lia, María Paula, Astrid
 */
public class Pelicula implements Comparable<Pelicula>{
    
    private String nombre, director;
    private int añoLanzamiento, codigo;
    private double duracion;

    public Pelicula(String nombre, String director, int añoLanzamiento, double duracion) {
        this.nombre = nombre;
        this.director = director;
        this.añoLanzamiento = añoLanzamiento;
        this.duracion = duracion;
    }

    public Pelicula(String nombre, String director, int añoLanzamiento, double duracion, int codigo) {
        this.nombre = nombre;
        this.director = director;
        this.añoLanzamiento = añoLanzamiento;
        this.codigo = codigo;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Pelicula peli) {
        return this.codigo - peli.getCodigo();
    }
    
    
}
