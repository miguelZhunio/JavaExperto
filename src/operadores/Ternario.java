package operadores;

import java.util.Scanner;

public class Ternario {
    public static void Operadores() {
        Scanner in = new Scanner(System.in);
        // Siempre retorna un valor
        String vari = 7 == 7 ? "Si es verdadero": "Es falso";
        System.out.println("vari = " + vari);

        String estado = "";
        double promedio = 0;
        double ciencia;
        double historia;
        double matematica;

        System.out.print("Ingrese la nota de  ciencia (0 a 7) ---> ");
        ciencia = in.nextDouble();
        System.out.print("Ingrese la nota de historia (0 a 7) ---> ");
        historia = in.nextDouble();
        System.out.print("Ingrese la nota de matematica (0 a 7) ---> ");
        matematica = in.nextDouble();

        promedio = (ciencia + historia + matematica)/3;

        estado = promedio >= 7 ? "Aprobastes": "Reprobado";
        System.out.println("estado = " + estado);



    }
}
