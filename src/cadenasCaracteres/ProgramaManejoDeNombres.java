package cadenasCaracteres;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void Ingreso() {
        Scanner in= new Scanner(System.in);
        Scanner in2= new Scanner(System.in);
        String int1, int2, int3;

        System.out.println("INGRESO DE NOMBRES DE FAMILIARES");

        System.out.print("Ingrese el nombre del primer integrantes ---> ");
        int1 = in.next();
        System.out.print("Ingrese el nombre del segundo integrantes ---> ");
        int2 = in2.next();
        System.out.print("Ingrese el nombre del tercer integrantes ---> ");
        int3 = in.next();
        System.out.println();

        String[] arrayNombre = {int1, int2, int3};

        for (int i = 0 ; i < arrayNombre.length; i++) {
            String aux  = String.valueOf(arrayNombre[i].charAt(0)).toUpperCase() + "." + arrayNombre[i].substring(arrayNombre[i].length()-2);
            if (i == arrayNombre.length-1) {
                System.out.print(aux);
            } else {
                System.out.print(aux + "_");
            }


        }

    }
}
