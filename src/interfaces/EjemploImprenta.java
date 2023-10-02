package interfaces;

import interfaces.modelo.*;
import static interfaces.modelo.Genero.*;
import static interfaces.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("Pablo", "Guzman"), "Ingeniero en sistemas", "Resumen laboral");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Boot")
                .addExperiencia("Desarrollador Backend")
                .addExperiencia("Angular");
        Informe informe = new Informe(new Persona("Angelo", "Perez"), "James", "Estudios de la tecnologia");

        Libro libro = new Libro(new Persona("Mario","Gama"), "Patrones de diseño", TECNOLOGIA);
        libro.addPaginas(new Pagina("Patron Singleton"))
                .addPaginas(new Pagina("Patron Observer"))
                .addPaginas(new Pagina("Patron Factory"))
                .addPaginas(new Pagina("Patron Composite"))
                .addPaginas(new Pagina("Patron Facade"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);


        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola es un metodo obligaotorio ";
            }
        });
    }

}
