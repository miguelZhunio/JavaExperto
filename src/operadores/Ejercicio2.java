package operadores;

import java.util.Scanner;

public class Ejercicio2 {
    public static void Operacion() {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese la capacidad en litro del tanque de gasolina ---> ");
        double capacidad = in.nextDouble();
        
        String message = capacidad >= 70? "Tanque lleno": (capacidad >=60 && capacidad < 70?"Tanque casi lleno":(capacidad >=40 && capacidad < 60? "Medio 3/4":(capacidad >=35 && capacidad < 40?"Medio Tanque": (capacidad >=20 && capacidad < 35?"Suficiente":(capacidad >=1 && capacidad < 20?"Insuficiente": "Entrada no valida")))));
        System.out.println(message);
    }
}
