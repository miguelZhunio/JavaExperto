package clasesystem;

import java.util.Properties;

public class PropiedadesSystem {
    public static void Propiedades() {
        String username = System.getProperty("user.name"); // llave
        System.out.println("username = " + username);
        
        String pathome = System.getProperty("user.home");
        System.out.println("pathome = " + pathome);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String versionjava = System.getProperty("java.version");
        System.out.println("versionjava = " + versionjava);

        String lineSeparator = System.getProperty("line.separator");
        String lineSpearator2 = System.lineSeparator(); // Atajo
        System.out.println("lineSpearator2 = " + lineSpearator2 + " una nueva linea con atajo");
        System.out.println("lineSeparator = " + lineSeparator + "una linea nueva");

        // Configuracion completa (todas las propiedades)
        Properties p = System.getProperties();
        p.list(System.out); // list: recibe un objeto de tipo print
    }
}
