package data_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Introduccion {
    public static void Fechas() {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        // dd ---> Muestra el dia
        // MM ---> Muestra el numero del mes
        // MMM ---> Muestra una parte del nombre del mes
        // MMMM ---> Muestra el nombre del mes completo
        // YYYY ---> Muestra el anio
        // / ---> Separador
        SimpleDateFormat df = new SimpleDateFormat("'Fecha: 'dd/MM/YYYY"); //No pwrmite insertar un fomrato en la fechas

        String fechaStri = df.format(fecha);

        System.out.println("fechaStri = " + fechaStri);

        
        long j = 0;
        for (int i = 0; i < 10000000 ; i++) {
            j += i;
        }
        Date Fechatiempo = new Date();
        long tiempoTomado = Fechatiempo.getTime() - fecha.getTime();
        System.out.println("tiempoTomado = " + tiempoTomado);
        System.out.println("j = " + j);


    }

}
