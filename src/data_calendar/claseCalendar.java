package data_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class claseCalendar {
    public static void Calendario() {
        // .getInstance crea la instancia de las clases abstractas
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 23);
        // calendario.set(Calendar.HOUR_OF_DAY, 21); // 24 horas
        calendario.set(Calendar.HOUR, 7); // 12 horas am/pm
        calendario.set(Calendar.AM_PM, Calendar.PM); // Colocar el am o pm
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 23);
        calendario.set(Calendar.MILLISECOND, 345);
        // calendario.set(2023, Calendar.SEPTEMBER, 20, 24, 14, 54);
        Date fecha = calendario.getTime();

        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SSSS");
        String fechaFormateada = formato.format(fecha);
        System.out.println("fechaFormateada = " + fechaFormateada);

    }
}
