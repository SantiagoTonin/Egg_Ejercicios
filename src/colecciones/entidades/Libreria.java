/*
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros
 */
package colecciones.entidades;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class Libreria {

    /*
    Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String tituloLibro;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrest;

    /*
    La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
     */
    public Libreria(String tituloLibro, String autor, int ejemplares, int ejemplaresPrest) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrest = ejemplaresPrest;
    }

    public Libreria() {
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrest() {
        return ejemplaresPrest;
    }

    public void setEjemplaresPrest(int ejemplaresPrest) {
        this.ejemplaresPrest = ejemplaresPrest;
    }

    @Override
    public String toString() {
        return "Libreria{" + "tituloLibro=" + tituloLibro + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrest=" + ejemplaresPrest + '}';
    }

    /*
    • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
20
     */
    public boolean prestamo(HashSet<Libreria> libro, String titlib) {
        int cont;
        for (Libreria aux : libro) {
            if (aux.getTituloLibro().equals(titlib)) { // se puede usar el metodo contain tmb para buscar
                System.out.println("Cuantas unidades para el prestamo");
                cont = leer.nextInt();
                int total = aux.getEjemplares() - cont;
                if (total > 0) {
                    aux.setEjemplares(total);
                    aux.setEjemplaresPrest(aux.getEjemplaresPrest() + cont); // 2 formas encasulando o poniendo el llamado +/- la cantidad
                    //System.out.println("El prestamo fue exitoso");
                    return true;
                } else {
                    //System.out.println("No hay suficientes ejemplares disponibles en estos momentos");
                    return false;
                }
            }
        }
        return false;
    }

    public boolean devolver(HashSet<Libreria> libro, String dev) {
        int cont;
        for (Libreria aux : libro) {
            if (aux.getTituloLibro().equals(dev)) {
                System.out.println("Cuantas unidades para el retorno");
                cont = leer.nextInt();
                int total = aux.getEjemplaresPrest() - cont;
                if (total > 0) {
                    aux.setEjemplaresPrest(total);
                    aux.setEjemplares(aux.getEjemplares() + cont);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;

    }

}
