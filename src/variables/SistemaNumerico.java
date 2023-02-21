package variables;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumerico {
    public static void SistemaNumericos() {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal  = " + numeroDecimal + " a binario = " +Integer.toBinaryString(numeroDecimal));
        int binario = 0b111110100;
        System.out.println("binario = " + binario);

        System.out.println("binario = " + binario + " a octal = " + Integer.toOctalString(binario));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Decimal = " + numeroDecimal + " a hexadecimal = " + Integer.toHexString(numeroDecimal));
        int hexadecimal = 0x1f4;
        System.out.println("hexadecimal = " + hexadecimal);
                
    }

    public static void VentanaIngreso() {
        int decimal = 0;
        try  {
            decimal = Integer.parseInt(JOptionPane.showInputDialog(null , "Ingrese un numero entero: "));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            VentanaIngreso(); // Se vuelve a repetir el metodo.
            System.exit(0);
        }
        String mensaje = "numero decimal  = " + decimal + " a binario = " +Integer.toBinaryString(decimal);
        mensaje += "\nnumero decimal  = " + decimal + " a octal = " + Integer.toOctalString(decimal);
        mensaje += "\nnumero decimal  = " + decimal + " a hexadecimal = " + Integer.toHexString(decimal);
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static void ConsolaIngreso() {
        Scanner in = new Scanner(System.in);
        int numeroDecimal = 0;
        try  {
            System.out.println("Ingrese un numero entero ---> " );
            numeroDecimal = in.nextInt();

        } catch (Exception e) {
            System.out.println("Error debe ingresar un numero entero");
            ConsolaIngreso(); // Se vuelve a repetir el metodo.
            System.exit(0);
        }

        System.out.println("numero decimal  = " + numeroDecimal + " a binario = " +Integer.toBinaryString(numeroDecimal));
        System.out.println("numero decimal  = " + numeroDecimal + " a octal = " + Integer.toOctalString(numeroDecimal));
        System.out.println("numero decimal = " + numeroDecimal + " a hexadecimal = " + Integer.toHexString(numeroDecimal));

    }
    
}


