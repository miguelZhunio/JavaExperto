package clasesystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AgregarPropiedadesNuestras {
    public static void AgregarPropiedades() {
        try {
            FileInputStream archivo = new FileInputStream("src/clasesystem/config.properties");
            Properties p = new Properties(System.getProperties()); // Agreger todas las propedades del sistema
            p.load(archivo); // Tner el objeto propierties con los cambios
            // p.setProperty("mi .propiedad", "Esta es mi propiedad"); --> Otra forma
            System.setProperties(p); // Agregar las nevas propiedades

            System.out.println("p.getProperty(....) = " + p.getProperty("config.autor.correo"));
            System.getProperties().list(System.out);
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo" + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
