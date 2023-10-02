package herencia;

public class EjemploHerenciaConstructores {
    public static void init() {

        System.out.println("********** Creando la instancia de Alumno ***********");
        Alumno alumno = new Alumno("Mario", "Perez", 21, "Manielito", 7.8, 67);

        // ((Alumno) alumno).setName_school("Instituto Americano");

        System.out.println("********** Creando la instancia Internacional ***********");
        AlumnoInternacional alumInternacional = new AlumnoInternacional("Angelo", "Gosling", 23, "Suiza", "Australia");

        System.out.println("********** Creando la instancia de Profesor ***********");
        Profesor profesor = new Profesor("Pablo", "Guaman", "Matematicas");

        /*imprimir(alumno);
        imprimir(alumInternacional);
        imprimir(profesor);*/

        System.out.println(alumno);
        System.out.println(alumInternacional);
        System.out.println(profesor );


    }

    public static void imprimir(Persona persona) {

        System.out.println("Nombre:" + persona.getNombre() +
                " Apellido:" + persona.getApellido() + ", " +
                 "Edad" + persona.getEdad()
        );

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo datos de un tipo Alumno");
            System.out.println("Institucion: " + ((Alumno)persona).getName_school() +
                    " Notas matematicas: "  + ((Alumno) persona).getNotes_maths() +
                    " Notas de english" + ((Alumno) persona).getNotes_english()
            );
            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo datos de un tipo Alumno internacional");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotes_idiomas() +
                        " Pais de origen: " + ((AlumnoInternacional) persona).getPaisOrigen()
                );
            }

            System.out.println("PROMEDIO DEL ALUMNO");
            System.out.println(((Alumno) persona).calcularPromedio());
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo datos de un tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }


        System.out.println(persona.saludar());
        System.out.println();


    }
}
