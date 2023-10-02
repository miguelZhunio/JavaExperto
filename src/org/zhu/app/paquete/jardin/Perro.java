package org.zhu.app.paquete.jardin;

import org.zhu.app.paquete.hogar.Persona;

class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
