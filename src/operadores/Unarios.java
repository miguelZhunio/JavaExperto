package operadores;

public class Unarios { // Solo sirven para cambiar el signo de un numero
    public static void Operadores() {
        // Unario Menos (-) y unario Mas (+)
        int i = -6;
        int j = +i;
        System.out.println("j = +i ---> " + j);

        int k = -i;
        System.out.println("k =  -i ---> " + k);

        i = 5;
        j = -i;
        System.out.println("j = -i ---> " + j);
    }
}
