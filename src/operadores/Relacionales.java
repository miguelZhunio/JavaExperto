package operadores;

public class Relacionales {
    public static void Operadores() {
        int a = 7;
        int i = 10;
        int j = 7;
        float k = 27e-2f;
        double l = 23.456;
        boolean result =  false;
        
        result = i > 7;
        System.out.println("(i > 7) = " + (i > j));
        System.out.println("(j > i) = " + (j > i));

        System.out.println("!(i==j) = " + !(i==j));
        System.out.println("(i != j) = " + (i != j));

        System.out.println("result == true = " + (result == true));
        System.out.println("result != false = " + (result != false));

        System.out.println("(i >= j) = " + (i >= a));
        System.out.println("(a <= i) = " + (a <= i));
        System.out.println("(k < l) = " + (k < l));
        
    }
}
