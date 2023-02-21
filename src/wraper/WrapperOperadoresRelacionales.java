package wraper;

public class WrapperOperadoresRelacionales {
    public static void Operadores() {
        Integer a = Integer.valueOf(-127); // Hasta 127 va a comprar con el valor.
        Integer b = 1278;

        System.out.println("b = " + b);
        System.out.println("a = " + a);

        System.out.println("Son iguales las instancias (a == b) ---> " + (a == b)); // Compara la instancia
        System.out.println("Son iguales las instancias (b.equals(a) = " + (b.equals(a)));
        System.out.println("(b.intValue() == a.intValue()) = " + (b.intValue() == a.intValue()));


        System.out.println("(b > a) = " + (b > a)); // <> Se puede utilizar sin ningun problema.


    }
}
