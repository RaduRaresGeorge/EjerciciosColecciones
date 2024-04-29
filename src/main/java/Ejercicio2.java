import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase Ejercicio2 que contiene métodos para filtrar un ArrayList de cadenas.
 */
public class Ejercicio2 {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Crea un ArrayList de cadenas y una cadena, luego llama al método filterArrayList para filtrar el ArrayList.
     * Imprime el ArrayList original y el ArrayList filtrado.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String mainString = "Hola Mundo ! Muna Mun Munito";

        String[] stringSplit = mainString.split(" ");

        Collections.addAll(list, stringSplit);

        String excludedString = "Mun";

        ArrayList<String> filteredList = filterArrayList(list, excludedString);

        System.out.println("El ArrayList original es: " + list);
        System.out.println("El ArrayList filtrado es: " + filteredList);
    }

    /**
     * Método que filtra un ArrayList de cadenas.
     * Crea un nuevo ArrayList a partir del original y elimina las cadenas que contienen la cadena dada.
     *
     * @param list El ArrayList de cadenas a filtrar.
     * @param string La cadena a excluir en el ArrayList.
     * @return Un nuevo ArrayList que contiene solo las cadenas del ArrayList original que no contienen la cadena dada.
     */
    public static ArrayList<String> filterArrayList(ArrayList<String> list, String string) {
        ArrayList<String> newList = new ArrayList<>(list);
        newList.removeIf(s -> s.contains(string));
        return newList;
    }
}