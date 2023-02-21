package flujosdecontrol.bucles;

public class BucleForEach {
    public static void Operaciones() {

        int[] impares = {1,3,5,7,9,11,13, 15};
        for (int num: impares) {
            System.out.println("num = " + num);
        }
        // No se puede modificar
        for (int num: impares) {
            num += 1;
        }
        for (int num: impares) {
            System.out.println("num = " + num);
        }
    }
}
