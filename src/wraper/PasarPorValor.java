package wraper;

public class PasarPorValor {
    public static void PorValor() {
        int i = 100; // Pasar argumento por valor
        System.out.println("iniciamos el main = " + i);
        test(i);
        System.out.println("Finalizamos el main = " + i);

        Integer I = 100; // Son inmutables
        System.out.println("iniciamos el main = " + I);
        test(i);
        System.out.println("Finalizamos el main = " + I);
    }

    public static void test(Integer i) {
        System.out.println("iniciamos el metodo test --->  = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test = " + i);
    }
}
