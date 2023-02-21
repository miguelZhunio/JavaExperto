package operadores;

public class IncrementoDecremento {
    public static void Operadores() {
        int i = 1;
        int j = ++i; // Pre-incremento.

        System.out.println("j = " + j);
        
        // j++; Post-Incremento
        System.out.println("j++ = " + j++);

        System.out.println("i = " + i);
        System.out.println("--i = " + --i); // Pre-decremento
        System.out.println("i-- = " + i--);


    }
}
