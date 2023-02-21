package flujosdecontrol.bucles;

public class Ejercicio3 {
    public static void Ejercicio3() {
        int multiplicando = 3;
        int multiplicador = 2;
        int producto = 0;

        for (int i = 1; i <= multiplicador; i++) {
            producto += multiplicando;
        }

        System.out.println("El producto es producto = " + producto);
    }
}
