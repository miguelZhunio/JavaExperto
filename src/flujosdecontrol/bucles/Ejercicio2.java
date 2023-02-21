package flujosdecontrol.bucles;

import java.util.Scanner;

public class Ejercicio2 {
    public static void Ejercicio2(String[] args) {
        Scanner in = new Scanner(System.in);
        Double notasfinales[] = new Double[20];
        int ocurrencias = 0;
        double promedioMayor5 = 0;
        double promedioMenor4 = 0;
        double promedio1 = 0;

        for (int i = 0 ; i < notasfinales.length; i++) {
            System.out.print("Ingrese la nota numero " + (i+1) + " ---> ");
            notasfinales[i] = in.nextDouble();
        }

        // promedio de las notas mayores a 5
        for (int i = 0; i < notasfinales.length; i++) {
            if (notasfinales[i] > 5) {
                promedioMayor5 += notasfinales[i];
                ocurrencias++;
            }
            if (i == notasfinales.length -1) {
                promedioMayor5 /= ocurrencias;
                System.out.println("El promedio de las notas de los " + ocurrencias + " alumnos con notas " +
                        "mayores a 5 es ---> " + promedioMayor5);
            }
        }

        for (int i = 0; i < notasfinales.length; i++) {
            if (notasfinales[i] <= 5 && notasfinales[i] >=2) {
                promedioMenor4 += notasfinales[i];
                ocurrencias++;
            }
            if (i == notasfinales.length -1) {
                promedioMenor4 /= ocurrencias;
                System.out.println("El promedio de las notas de los " + ocurrencias + " alumnos con notas " +
                        "menores a 4 es ---> " + promedioMenor4);
            }
        }
        for (int i = 0; i < notasfinales.length; i++) {
            if (notasfinales[i] < 2) {
                promedio1 += notasfinales[i];
                ocurrencias++;
            }
            if (i == notasfinales.length -1) {
                promedio1 /= ocurrencias;
                System.out.println("El promedio de las notas de los " + ocurrencias + " alumnos con notas " +
                        "a 1 es ---> " + promedio1);
            }
        }
    }
}
