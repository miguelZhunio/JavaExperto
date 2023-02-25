package clasesystem;

import java.io.IOException;

public class EjecutarProgramaSO {
    public static void Ejecutar() {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

            try {
                if (System.getProperty("os.name").startsWith("Windows")) {
                proceso = rt.exec("notepad");
                } else if (System.getProperty("os.name").toLowerCase().startsWith("linux")){
                    proceso = rt.exec("gedit");
                } else {
                    proceso = rt.exec("textedit");
                }

                proceso.waitFor(); // Espera a que se cierre el program
            } catch (Exception e) {
                // throw new RuntimeException(e);
                System.err.println("El comando es desconocido");
            }

        System.out.println("Se ha cerrado el editor");
            System.exit(0);

    }
}
