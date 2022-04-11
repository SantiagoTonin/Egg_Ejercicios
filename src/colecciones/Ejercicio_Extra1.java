/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class Ejercicio_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int cont = 0, num = 0;
        do {
            System.out.print("numero: ");
            numeros.add(leer.nextInt());
            cont++;
        } while (numeros.get(cont - 1) != -99);

        numeros.remove(numeros.get(cont - 1));
        cont--;
        //numeros.removeAll(Arrays.asList(2)); para remover todos los integer especificos en un array list

        for (Integer aux : numeros) {
            System.out.println(aux);
            num += aux;
        }
        System.out.println("Cantidad:"+cont+"\nSuma:"+num+"\nPromedio:"+num/cont);
    }

}
