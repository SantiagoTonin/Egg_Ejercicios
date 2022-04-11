/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario. 
 */
package colecciones.entidades;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Belltwon
 */
public class Pais implements Comparable<Pais>{

    Scanner leer = new Scanner(System.in);
    private String pais;
    TreeSet<String> nombres = new TreeSet<>(); // los treeset y hashset no aceptan duplicados

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + '}';
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public Pais() {
    }

    public void ingresePaises() {
        char op;
        do {
            System.out.println("Ingrese un pais");
            pais = leer.next();
            nombres.add(pais);
            System.out.println("Desea ingresar otro pais");
            op = leer.next().charAt(0);
            op = Character.toUpperCase(op);
            

        } while (op == 'S');

    }

    public void mostrarLista() {
        nombres.forEach((aux) -> {
            System.out.println(aux);
        });

    }

    @Override
    public int compareTo(Pais t) {
        return t.getPais().compareTo(pais); // ordena  de forma Alfabetica
    }
    
    public void eliminarPais(String elim){
    Iterator<String> it = nombres.iterator(); // la lista es la q se usa como variable
    int h=0;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(elim)) {
                it.remove();
                h++;
            }
        }
        if (h==0) {
            System.out.println("El nombre no se encontro en la lista");
        }
    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.leer); // compara objetos para saber si son iguales 
        hash = 83 * hash + Objects.hashCode(this.pais);
        hash = 83 * hash + Objects.hashCode(this.nombres);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.leer, other.leer)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        return true;
    }
    
}
