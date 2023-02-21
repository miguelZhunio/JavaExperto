package flujosdecontrol;

import java.util.Scanner;

public class SwitchCase {
    public static void Ejercicio() {
        Scanner in = new Scanner(System.in);
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            default:
                System.out.println("Numero fuera del rango 1-4");

        }

        String text = "Eyy";

        switch (text) {
            case "Hello":
                System.out.println("Good morning");
                break;
            case "World":
                System.out.println("Primero Hello!");
                break;
            case "Eyy":
                System.out.println("Que mas!!!");
                break;
            case "Oye":
                System.out.println("Que paso");
                break;
            default:
                System.out.println("Habla pos");

        }

        int numMes = 0;
        System.out.print("Ingrese el mes en numero ---> ");
        numMes = in.nextInt();
        System.out.println("Ingrese el anio ---> ");
        int anio = in.nextInt();

        String nombreMes = "";


        switch (numMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("NUMERO NO VALIDO");

        }

        int diasMes = 0;

        switch (numMes) {
            case 1:
                diasMes = 31;
                break;
            case 2:
                if (anio % 400 == 0 || (anio % 4 == 0 && anio % 400 != 0)) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
            case 3:
                diasMes = 31;
                break;
            case 4:
                diasMes = 30;
                break;
            case 5:
                diasMes = 31;
                break;
            case 6:
                diasMes = 30;
                break;
            case 7:
                diasMes = 31;
                break;
            case 8:
                diasMes = 30;
                break;
            case 9:
                diasMes = 31;
                break;
            case 10:
                diasMes = 30;
                break;
            case 11:
                diasMes = 31;
                break;
            case 12:
                diasMes = 30;
                break;
            default:
                System.out.println("undeline");

        }

        System.out.println("El mes " + nombreMes + " tiene " + diasMes + " dias");


    }
}
