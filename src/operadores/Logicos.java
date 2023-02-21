package operadores;

public class Logicos {
    public static void Operadores() {

        System.out.println("(1 ==1) && (1 > 0) = " +  (1 ==2 && 6 > 5)); // Operador AND
        System.out.println("(1 > 0 || 1 ==0) = " + (1 > 0 || 1 ==0)); // Operador OR
        System.out.println("(3 == 7 && 5 > 8 || true == false) = " + (3 == 7 && 5 > 8 || true == false));
        
        // Precedencia de estos operadores.
        System.out.println("6 > 5 || 4 < 3 = " + (6 > 5 || 3 < 4 && true == true));

        System.out.println("true || true && false = " + ((true || true) && false));


    }
}
