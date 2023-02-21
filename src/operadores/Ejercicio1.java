package operadores;

import java.util.Scanner;

public class Ejercicio1 {
    public static void Operacion() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite el primer numero = ");
        int num1 = in.nextInt();
        System.out.println("Digite el segundo numero = ");
        int num2 = in.nextInt();

        System.out.println(num1 > num2? num1 + "-" +num2: num2 + "-" +num1);
    }
}
