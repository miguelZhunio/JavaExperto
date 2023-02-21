package operadores;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void Operacion() {
        String[] integrantes = new String[3];
        int mayor = 0;


        for (int i = 0; i < integrantes.length; i++) {
            integrantes[i] = JOptionPane.showInputDialog("Ingrese el nombre completo del " + i + " integrante");

        }

        for (int i = 0; i <integrantes.length; i++) {
            String[] auxArray =integrantes[i].split(" ");
            int aux = 0;
            aux = auxArray[0].length() > aux? auxArray[0].length(): aux;
            mayor = auxArray[0].length() > aux? i: mayor;


        }

        System.out.println(integrantes[mayor] + " tiene el nombre mas largo" );


    }
}
