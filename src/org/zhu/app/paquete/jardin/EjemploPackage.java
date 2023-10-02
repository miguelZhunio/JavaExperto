package org.zhu.app.paquete.jardin;
import org.zhu.app.paquete.hogar.*;
// import static org.zhu.app.paquete.hogar.Persona.saludar;
import static org.zhu.app.paquete.hogar.Persona.*;
// import static org.zhu.app.paquete.hogar.Persona.GENERO_FEMENINO;
import static org.zhu.app.paquete.hogar.ColorPelo.*;

public class EjemploPackage {
    public static void init() {
        Persona persona = new Persona();
        persona.setNombre("Miguel");
        persona.setColorPelo(NEGRO);
        System.out.println("persona.nombre = " + persona.getNombre());

        // Gato gato = new Gato();

        Perro perro = new Perro();
        perro.nombre = "Blanco";
        perro.raza = "Pastor aleman";

        String masculino = GENERO_MASCULINO;

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        System.out.println(perro.jugar(persona));
    }
}
