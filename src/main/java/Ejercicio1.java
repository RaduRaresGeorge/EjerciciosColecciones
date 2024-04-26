import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {

        String[] array = {"Hola", "Mundo", "!", "Muna", "Mun", "Munito"};

        String string = "Mun";

        System.out.println("El array es: " + Arrays.toString(array));

        int count = 0;
        for(int i=0;i<array.length;i++){

            if(array[i].contains(string)){
                count++;
                System.out.println(array[i] + " ");
            }

        }

        System.out.println(count);
        String [] newArray = new String[count];
        int j = 0;
        for(int i=0;i<array.length;i++){

            if(array[i].contains(string)){
                newArray[j] = array[i];
                j++;
            }

        }

        for(String s : newArray){
            System.out.println(s + " ");
        }


    }



}
