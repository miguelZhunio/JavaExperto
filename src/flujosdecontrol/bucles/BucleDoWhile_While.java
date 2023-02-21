package flujosdecontrol.bucles;

public class BucleDoWhile_While {
    public static void Operaciones() {
        int i = 0;

        // Bucle While
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();
        // Bucle Do - While
        i = 0;
        do {
            System.out.println("i = " + i);
            ++i;
        } while (i <=5);
        
        
        
    }
}
