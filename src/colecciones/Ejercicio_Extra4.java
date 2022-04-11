/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Belltwon
 */
public class Ejercicio_Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> postal = new HashMap();

        postal.put(882906, "Canada");
        postal.put(410277, "Mexico");
        postal.put(73282, "Estados Unidos");
        postal.put(22549, "Argentina");
        postal.put(387, "Andorra");
        postal.put(39188, "Italia");
        postal.put(211349, "Portugal");
        postal.put(82464, "Alemania");
        postal.put(3042, "Albania");
        postal.put(219, "Cuba");
        mostrar(postal);
        ver(postal);
        agregarCiudades(postal);
        mostrar(postal);
        eliminar(postal);
        mostrar(postal);
    }

    public static void mostrar(HashMap<Integer, String> postal) {
        for (Map.Entry<Integer, String> mostrar : postal.entrySet()) {
            Integer key = mostrar.getKey();
            String value = mostrar.getValue();
            System.out.println("Pais: " + value + "\nPostal: " + key + "\n");
        }
    }

    public static void ver(HashMap<Integer, String> postal) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una postal");
        Integer llave = leer.nextInt();
        System.out.println(postal.get(llave));
    }

    public static void agregarCiudades(HashMap<Integer, String> postal) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un pais");
        String nombre = leer.next();
        System.out.println("Ingrese el codigo posta(CP)");
        Integer llave = leer.nextInt();
        postal.put(llave, nombre);

    }

    public static void eliminar(HashMap<Integer, String> postal) {
        Scanner leer = new Scanner(System.in);
        char op;
        do {
        System.out.println("Ingrese una postal q desee elimar (introdusca la llave)");
            Integer llave = leer.nextInt();
            postal.remove(llave);
            System.out.println("Desea ingresar otro codigo postal s/n");
            op = leer.next().charAt(0);
            op = Character.toUpperCase(op);
        } while (op == 'S');

    }
}
