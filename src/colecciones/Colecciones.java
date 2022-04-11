/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package colecciones;

import colecciones.entidades.ArrayListPerros;

/**
 *
 * @author Belltwon
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayListPerros p1 = new ArrayListPerros();
        p1.razaPerro();
        p1.mostrarPerros();
    
    }
    
}
