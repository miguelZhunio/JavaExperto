package herencia;

public class EjemploHerencia {
    public static void init() {

        System.out.println("********** Creando la instancia de Alumno ***********");
        Alumno alumno = new Alumno();
        alumno.setNombre("Mario");
        alumno.setApellido("Perez");
        alumno.setNotes_maths(7.6);
        alumno.setNotes_english(8);

        // ((Alumno) alumno).setName_school("Instituto Americano");

        System.out.println("********** Creando la instancia Internacional ***********");
        AlumnoInternacional alumInternacional = new AlumnoInternacional();
        alumInternacional.setNombre("Angelo");
        alumInternacional.setApellido("Gosling");
        alumInternacional.setPaisOrigen("Australia");
        alumInternacional.setEdad(16);
        alumInternacional.setName_school("Americano");
        alumInternacional.setNotes_maths(8.9);
        alumInternacional.setNotes_english(9.0);
        alumInternacional.setNotes_idiomas(10);

        System.out.println("********** Creando la instancia de Profesor ***********");
        Profesor profesor = new Profesor();
        profesor.setNombre("Pablo");
        profesor.setApellido("Guaman");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());

        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellido() + ", " +profesor.getAsignatura());

        System.out.println("Alumno Internacional " + alumInternacional.getNombre() +
                " " + alumInternacional.getApellido() +
                ", pais de origen: " + alumInternacional.getPaisOrigen() +
                ", institucion: " + alumno.getName_school());

        // Clase que contiene todos los metadatos de la una clase clase hija
        Class clase = alumInternacional.getClass();

        while(clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase= clase.getSuperclass(); // Clase padre
        }
    }
}
