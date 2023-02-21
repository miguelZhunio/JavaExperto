package cadenasCaracteres;

public class StringAarray {
    public static void DeStringAArray() {
        String word = "Espantapajaros";
        // System.out.println("word.toCharArray() = " + word.toCharArray());
        char[] arreglo = word.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

         String[] arr = word.split("a");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
