/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercolecciones;

import java.util.*;

/**
 *
 * @author Andrea, Lia, María Paula, Astrid
 */
public class TallerColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demostracion HashSet
        Set<Pelicula> HS = new HashSet<>();
        HS.add(new Pelicula("Kiki: Entregas a domicilio", "Hayao Miyazaki", 1989, 1.42));
        HS.add(new Pelicula("Arriety y el mundo de los diminutos", "Hiromasa Yonebayashi", 2010, 1.34));
        HS.add(new Pelicula("El castillo ambulante", "Hayao Miyazaki", 2004, 1.42));
        HS.add(new Pelicula("El cuento de la princesa Kaguya", "Isao Takahata", 2013, 2.16));
        HS.add(new Pelicula("Arriety y el mundo de los diminutos", "Hiromasa Yonebayashi", 2010, 1.34));
        /*
        for (Pelicula peli: HS){
            System.out.println("Nombre: " + peli.getNombre());
            System.out.println("Director: " + peli.getDirector());
            System.out.println("Año de lanzamiento: " + peli.getAñoLanzamiento());
            System.out.println("Duracion: " + peli.getDuracion());
            System.out.println("\n");
        }*/
        
        // Demostración LinkedHashSet
        Set<Pelicula> LinkedHS = new LinkedHashSet<>();
        LinkedHS.add(new Pelicula("Ponyo y el secreto de la sirena", "", 2008, 1.43));
        LinkedHS.add(new Pelicula("Mi vecino Totoro", "Hiromasa Yonebayashi", 1988, 1.26));
        LinkedHS.add(new Pelicula("Nausicaa el valle del viento", "Hayao Miyazaki", 1984, 1.57));
        
        for (Pelicula peli: LinkedHS){
            System.out.println("Nombre: " + peli.getNombre());
            System.out.println("Director: " + peli.getDirector());
            System.out.println("Año de lanzamiento: " + peli.getAñoLanzamiento());
            System.out.println("Duracion: " + peli.getDuracion());
            System.out.println("\n");
        }
        
        // Demostración LinkedTreeSet
        Set<Pelicula> TreeSet = new TreeSet<>();
        TreeSet.add(new Pelicula("Susurros del corazón", "Yoshifumi Kondo", 1995, 1.51, 2));
        TreeSet.add(new Pelicula("La colina de las amapolas", "Yoshifumi Kondo", 2011, 1.31, 1));
        TreeSet.add(new Pelicula("Porco Rosso", "Hayao Miyazaki", 1992, 1.34, 3));
        TreeSet.add(new Pelicula("Porco Rosso", "Hayao Miyazaki", 1992, 1.34, 3));
        
        for (Pelicula peli: TreeSet){
            System.out.println("Nombre: " + peli.getNombre());
            System.out.println("Director: " + peli.getDirector());
            System.out.println("Año de lanzamiento: " + peli.getAñoLanzamiento());
            System.out.println("Duracion: " + peli.getDuracion());
            System.out.println("\n");
        }

    }
    
    
    
}
