import java.util.Arrays;

/**
 * Clase Ejercicio1 que contiene métodos para filtrar un array de cadenas.
 */
public class Ejercicio1 {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Crea un array de cadenas y una cadena, luego llama al método filterArray para filtrar el array.
     * Imprime el array original y el array filtrado.
     *
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     */
    public static void main(String[] args) {

        String[] array = {"Hola", "Mundo", "!", "Muna", "Mun", "Munito"};

        String string = "Mun";

        System.out.println("El array original es: " + Arrays.toString(array));

        String[] result = filterArray(array, string);

        System.out.println("El array filtrado es: " + Arrays.toString(result));

    }

    /**
     * Método que filtra un array de cadenas.
     * Cuenta cuántas cadenas en el array contienen la cadena dada.
     * Crea un nuevo array con ese tamaño y llena el nuevo array con las cadenas que contienen la cadena dada.
     *
     * @param array El array de cadenas a filtrar.
     * @param string La cadena a buscar en el array.
     * @return Un nuevo array que contiene solo las cadenas del array original que contienen la cadena dada.
     */
    public static String[] filterArray(String[] array, String string) {
        int count = 0;
        for (String item : array) {

            if (item.contains(string)) {
                count++;
            }

        }

        String [] newArray = new String[count];
        int j = 0;
        for (String value : array) {
            if (value.contains(string)) {
                newArray[j] = value;
                j++;
            }

        }

        return newArray;
    }

}