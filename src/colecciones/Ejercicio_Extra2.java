/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package colecciones;

import colecciones.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class Ejercicio_Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CantanteFamoso> exitos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean exit = true;
        exitos.add(new CantanteFamoso("santiago", 3000));
        exitos.add(new CantanteFamoso("Tekken", 5000));
        exitos.add(new CantanteFamoso("Sionic", 2000));
        exitos.add(new CantanteFamoso("Cabal", 1000));
        exitos.add(new CantanteFamoso("Ahamkara", 3000));

        do {
        System.out.println("MENU\n1.Agregar Cantante\n2.Mostrar Lista\n3.Eliminar Cantante\n4.Salir");

            switch (leer.nextInt()) {
                case 1:
                    System.out.println("Nombre");
                    String nombre = leer.next();
                    System.out.println("Cantidad de discos con mas ventas");
                    int cantidad = leer.nextInt();
                    exitos.add(new CantanteFamoso(nombre, cantidad));
                    break;
                case 2:
                    exitos.forEach((aux) -> {
                        System.out.println(aux);
            });
                    break;
                case 3:
                    Iterator<CantanteFamoso> it = exitos.iterator();
                    System.out.println("Diga el nombre q desea Eliminar");
                    String cantante = leer.next();
                    while (it.hasNext()) {
                        String elim = it.next().getNombre();
                        if (elim.equals(cantante)) {
                            it.remove();
                        }
                    }
                    break;
                case 4:
                    exit = false;
                    break;
            }
        } while (exit);

    }

}
