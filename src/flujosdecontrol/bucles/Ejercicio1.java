package flujosdecontrol.bucles;

public class Ejercicio1 {
    public static void Ejercicio1() {
        int[] numeros = {3,6,5,3,5,7,20, 30};
        int numeroMayor = 0;
        for (int i = 0 ; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
                continue;
            }
        }

        System.out.println("El numero mayor  es = " + numeroMayor);
    }
}
