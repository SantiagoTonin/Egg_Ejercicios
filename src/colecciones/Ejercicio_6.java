/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas. 
 */
package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> tienda = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        
        do {
            System.out.println("MENU\n1.Agregar Producto\n2.Eliminar Producto\n3.Modificar Producto\n4.Ver Lista\n5.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Nombre y Precio del producto a Agregar");
                    System.out.print("Nombre: ");
                    String nombre = leer.next();
                    System.out.print("Precio: ");
                    Integer precio = leer.nextInt();
                    tienda.put(nombre, precio);
                    break;
                case 2:
                    System.out.println("Escriba el nombre para remover el elemento");
                    String elim = leer.next();
                    tienda.remove(elim);
                    break;
                case 3:
                    System.out.println("Escriba el Producto a Modificar");
                    System.out.print("Nombre: ");
                    nombre = leer.next();
                    System.out.print("Nuevo Precio: ");
                    precio = leer.nextInt();
                    tienda.replace(nombre, precio);
                    break;
                case 4:
                    for (Map.Entry<String, Integer> entry : tienda.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.println("Producto: "+ key+"\nPrecio: "+ value+"$");
                    }

                    break;

            }
        } while (opc != 5);
    }

}
