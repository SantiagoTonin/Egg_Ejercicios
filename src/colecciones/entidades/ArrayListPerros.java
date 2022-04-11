/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.

 */
package colecciones.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class ArrayListPerros {

    Scanner leer = new Scanner(System.in);
    String nombre;
    ArrayList<String> perros = new ArrayList();

    public ArrayListPerros() {
    }

    public void setPerros(ArrayList<String> perros) {
        this.perros = perros;
    }

    public ArrayList<String> getPerros() {
        return perros;
    }

    public void razaPerro() {
        String salida;
        do {
            System.out.println("Ingrese una raza de perros");
            nombre = leer.next();
            perros.add(nombre);
            System.out.println("Quiere agregar otra raza S/N");
            salida = leer.next();
            salida = salida.toUpperCase();
        } while (salida.equals("S"));

    }

    public void mostrarPerros() {
        for (String aux : perros) {
            System.out.println(aux);
        }
        System.out.println("Cantidad = " + perros.size());
        Collections.sort(perros); //Ordena la Lista
    }

    public void buscarEliminarPerro(String nombre) {
        Iterator<String> it = perros.iterator(); // hay 3 formas de recorrer la lista con un interator, fori, .forEach
        
        int h = 0;
        while (it.hasNext()) { // .hasNext revisa si el siguiente elemento existe en caso contrario lo vuelve false
            String aux = it.next(); // toma el nombre de la lista
            if (aux.equals(nombre)) {
                it.remove();
                System.out.println("Se a removido exitosamente: " + nombre);
                h++;
            }
        }
        if (h == 0) {

            System.out.println("El nombre no esta en la lista");

            
        }
    }
}
