package cadenasCaracteres;

public class Inmutable {
    /**
     * EL STRING ES INMUTABLES, al momento de utilizar metodos de "cambio" en realida esta creando otro nueva instancia
     */

    public static void Inmutable() {
        String curso = "Programacion en JAVA";
        String materia = "POOa";

        // funciones lambda
        String string2 = curso.transform(c -> {
            return c + " " + materia;
        });

        System.out.println("string2 = " + string2);
        String resultadoReplace = string2.replace("a", "A");
        System.out.println("resultadoReplace = " + resultadoReplace);

    }
}
