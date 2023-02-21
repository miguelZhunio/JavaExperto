package flujosdecontrol.bucles;

public class BucleFor {
    public static void Operacion() {
        for (int i = 0;i <= 10; i++) {
            System.out.println("i = " + i);

        }
        for(int i = 1 , j = 10; i <= 10 ; i++, j--) {
            System.out.printf("%12d|%12d%n", i, j);
        }

        System.out.println();
        for (int i = 0;i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }

        }
        // Ejemplos
        String[] listaNombres = {"Miguel", "Maria", "Ernesto", "Jose"};
        int count = listaNombres.length; // Para evaluar una sola vex
        for (int i = 0; i < count; i++) {
            if (listaNombres[i].equalsIgnoreCase("ernesto")){
                continue;
            }
            System.out.println("listaNombres["+i+"] = " + listaNombres[i]);
        }

    }
}
