/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main. 
 */
package colecciones;

import colecciones.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Belltwon
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
            ArrayList<Alumno> Alum = new ArrayList(); //ARRAY LIST DE OBJETOS
            ArrayList<Integer> nota = new ArrayList();
            
            char op;
        do {
            System.out.println("Nombre del Alumno");
            String nombre = leer.next();
            System.out.println("NOTA 1:");
            nota.add(leer.nextInt());
            System.out.println("NOTA 2:");
            nota.add(leer.nextInt());
            System.out.println("NOTA 3:");
            nota.add(leer.nextInt());
            Alum.add(new Alumno(nombre, nota));
            nota.clear();           
            System.out.println("Desea ingresar otro Alumno: S/N");
             op = leer.next().charAt(0);
             op = Character.toUpperCase(op);
        } while (op == 'S');
        
        Alum.forEach((Alumno) -> {
            System.out.println(Alumno.toString());
        });
        for (Alumno alumno : Alum) {
            System.out.println(alumno.toString());
        }
        
        System.out.println("Ingrese el nombre del alumno q desea buscar en la lista");
        String nom = leer.next();
        int h = 0;
        for (Alumno alumno : Alum) {
            if (alumno.getNombre().equals(nom)) {
                System.out.println("La nota del Alumno "+ nom +" es de: "+ alumno.notaFinal());
                h++;
            }
        }
            if (h==0) {
                
                System.out.println("El alumno no se encuentra en al lista");
            }
    }
    
    
}
