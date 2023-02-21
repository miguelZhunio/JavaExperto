package flujosdecontrol.bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void Ejercicio4() {
        Scanner in = new Scanner(System.in);
        int op;


        do {
            System.out.print("Escoge una opcion \n" +
                    "1. Comprar \n" +
                    "2. Vender \n" +
                    "3. Buscar \n" +
                    "4 Salir \n" +
                    "---> ");
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Usted esta en el menu de comprar");
                    break;
                case 2:
                    System.out.println("Usted esta en el menu de vender");
                    break;
                case 3:
                    System.out.println("Usted esta en el menu de buscar");
                    break;
                case 4:
                    System.out.println("Gracias por su visita");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");

            }
            System.out.print("Desea volver al menu principal (SI 1 / NO 2) ---> ");
            op = in.nextInt();
        } while(op == 1);

        System.out.println("GRACIAS POR SU VISITA");



    }
}
