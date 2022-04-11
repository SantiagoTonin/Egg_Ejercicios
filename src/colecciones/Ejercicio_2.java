/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.

 */
package colecciones;

import colecciones.entidades.ArrayListPerros;

/**
 *
 * @author Belltwon
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayListPerros perros = new ArrayListPerros();
        perros.razaPerro();
        //perros.mostrarPerros();
        perros.buscarEliminarPerro("LOLA");
        perros.mostrarPerros();
    }
    
}
