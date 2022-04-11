/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
20
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros
 */
package colecciones;

import colecciones.entidades.Libreria;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class Ejercicio_Extra3 {
    public static void main(String[] args) {
        HashSet<Libreria> libros = new HashSet();
        Scanner leer = new Scanner(System.in);
        Libreria l1 = new Libreria();
        char op;
        do {       
            System.out.println("Ingrese el titulo del Libro");
            String tituloLibro = leer.next();
            System.out.println("Ingrese el nombre el autor del Libro");
            String autor = leer.next();
            System.out.println("Ingrese la cantidad de Ejemplares existen del libro");
            int cantidad = leer.nextInt();
            System.out.println("Ingrese la cantidad de Ejmplares prestados");
            int prestado = leer.nextInt();
            libros.add(new Libreria(tituloLibro, autor, cantidad, prestado));
                        
            System.out.println("Desea ingresar un nuevo libro: S/N");
             op = leer.next().charAt(0);
             op = Character.toUpperCase(op);
        } while (op == 'S');
        
        
        System.out.println("Que libro desea buscar");
        String buscar = leer.next();
        System.out.println(l1.prestamo(libros,buscar));
        System.out.println("Que libro desea devolver");
        String devolver  = leer.next();
        System.out.println(l1.devolver(libros, devolver));
        
        
        libros.forEach((aux)->{
            System.out.println(aux.toString());
    });
    }
}
