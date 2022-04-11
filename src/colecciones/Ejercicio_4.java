/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
Nota: recordar el uso del Comparator para ordenar colecciones con objetos
 */
package colecciones;

import colecciones.entidades.Pelicula;
import colecciones.servicios.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> cine = new ArrayList<>();
        crearPeliculas(cine);
        System.out.println("En q orden desea mostrar la coleccion\n1.Como se ingreso\n2.Mayor a 1hs\n3.Duracion (Mayor a menor)"
                + "\n4.Duracion(Menor a mayor\n5.Alfabeticamente(Titulo)\n6.Alfabeticamente(director)");
        int opc = leer.nextInt();
        ordenar(cine, opc);

    }

    public static void crearPeliculas(ArrayList<Pelicula> arr) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char op;
        do {
            System.out.println("Titulo");
            String titulo = leer.next();
            System.out.println("Director:");
            String director = leer.next();
            System.out.println("Duracion (horas) :");
            Double duracion = leer.nextDouble();
            arr.add(new Pelicula(titulo, director, duracion));
            System.out.println("Desea ingresar otra Pelicula: S/N");
            op = leer.next().charAt(0);
            op = Character.toUpperCase(op);

        } while (op == 'S');

    }

    private static void mostrarPeli(ArrayList<Pelicula> cine) {
        cine.forEach((aux) -> {
            System.out.println(aux.toString());
        });

    }

    /*
    • Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
18
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public static void ordenar(ArrayList<Pelicula> cine, int opc) {
        switch (opc) {
            case 1:
                mostrarPeli(cine);
                break;
            case 2:
                for (int i = 0; i < cine.size(); i++) {
                    if (cine.get(i).getDuracion()>=1) {
                        System.out.println(cine.get(i));
                    }
                }
                    break;
            case 3:
                Collections.sort(cine, Comparadores.ordenAsc);
                mostrarPeli(cine);
                
                break;
            case 4:
                Collections.sort(cine, Comparadores.ordenDesc);
                mostrarPeli(cine);
                break;
            case 5:
                Collections.sort(cine, Comparadores.alfaTitle);
                mostrarPeli(cine);
                break;
            case 6:
                Collections.sort(cine,Comparadores.Alfabeticamente);
                mostrarPeli(cine);
                break;
        }
    }
}
