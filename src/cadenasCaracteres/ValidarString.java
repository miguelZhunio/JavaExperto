package cadenasCaracteres;

import java.util.Locale;

public class ValidarString {
    
    public static void validar() {
        String curso = null; // Sin referencia
        
        boolean esNulo = curso == null; // Comparar si esta nulo.
        if (esNulo) {
            System.out.println("esNulo = " + esNulo);
            curso = "java";
        }
        String curso2 = "";
        boolean esVacio = curso2.length() == 0;
        boolean esVacio2 = curso2.isEmpty(); //Verificar si tiene un valor nulo.
        if (esVacio2) { System.out.println("esVacio = " + curso2);}
        System.out.println("BIENVENIDO AL CURSO ".concat(curso.toUpperCase()));

        String curso3 = "a"; // Verifica si no tiene caracter,si es null o si solo tiene un espacio en blanco
        boolean esBlanco = curso3.isBlank(); 
        if (esBlanco) {
            System.out.println("esBlanco = " + esBlanco);
        }
    }
}
