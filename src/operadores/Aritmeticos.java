package operadores;

public class Aritmeticos {
    public static void Operaciones() {
        int a = 10, b = 30;

        int suma = a + b;
        System.out.println("suma: " + suma);
        System.out.println("(a+b) = " + (a+b));

        int resta = a - b;
        System.out.println("resta = " + resta);

        int multiplicacion = a * b;
        System.out.println("multiplicacion = " + multiplicacion);

        double division = (float) a / b;
        System.out.println("division = " + division);
        
        double resto = a % b;
        System.out.println("resto = " + resto);
    }
}
