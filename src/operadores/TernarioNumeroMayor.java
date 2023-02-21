package operadores;

import java.util.Scanner;

public class TernarioNumeroMayor {
    public static void Ejercicio() {
        Scanner in = new Scanner(System.in);
        int max = 0;

        System.out.print("Ingrese el primer numero ---> ");
        int num1 = in.nextInt();
        System.out.print("Ingrese el segundo numero ---> ");
        int num2 = in.nextInt();
        System.out.print("Ingrese el tercer numero ---> ");
        int num3 = in.nextInt();

        max = num1 > num2? (num1 > num3?num1:num3):(num2 > num3? num2: num3);
        System.out.println("max = " + max);

    }
}
