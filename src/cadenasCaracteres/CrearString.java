package cadenasCaracteres;

public class CrearString {

    public static void CreacionString() {
        String curso = "Programacion en Java";
        String curso2 = new String("Programacion en java");
        String curso3 = curso;
        System.out.println(curso == curso3); // true, compara la referencia.

        System.out.println(curso.equals(curso2));
        System.out.println(curso.equalsIgnoreCase(curso2));

    }

    public static void concatenar() {
        String curso = "Programacion en Java";
        String profesor = "Andres Guzman";
        System.out.println(curso + " " + profesor); // Forma causal
        System.out.println(curso.concat(" ".concat(profesor))); // Es mas eficiente que es la opcion de mas.
    }


}
