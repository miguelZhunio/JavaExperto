package data_calendar;

import com.sun.tools.javac.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class StringADate {
    private static Scanner in = new Scanner(System.in);

    public static void Convertir() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");

        System.out.print("Ingrese el anio con formato \"yyyy/MM/dd\" ---> ");

        try {
            Date fecha = formatoFecha.parse(in.next());
            System.out.println("fecha = " + fecha);
            System.out.println("formatoFecha.format(fecha) = " + formatoFecha.format(fecha));
            
            Date fecha2  = formatoFecha.parse("2022/02/21");
            if (fecha.after(fecha2)) {
                System.out.println("La fecha ingresada es despues de la fecha " + formatoFecha.format(fecha2));
            } else if(fecha.before(fecha2)) {
                System.out.println("La fecha ingresada es antes de la fecha " + formatoFecha.format(fecha2));
            } else if (fecha.equals(fecha2)){
                System.out.println(formatoFecha.format(fecha) + " == " + formatoFecha.format(fecha2));
            }

            if (fecha.compareTo(fecha2) > 0) { // fecha > fecha2
                System.out.println("La fecha ingresada es despues de la fecha " + formatoFecha.format(fecha2));
            } else if(fecha.compareTo(fecha2) < 0) { // fecha < fecha2
                System.out.println("La fecha ingresada es antes de la fecha " + formatoFecha.format(fecha2));
            } else if (fecha.compareTo(fecha2) == 0){ // fecha > fecha2
                System.out.println(formatoFecha.format(fecha) + " == " + formatoFecha.format(fecha2));
            }


        } catch (ParseException e) {
            // throw new RuntimeException(e);
            System.out.println("La fecha no tiene el fomrato establecido " + e.getMessage());
            System.err.println("Salimos");
            // System.exit(1);
        }
    }
}
