package flujosdecontrol.bucles;

public class EjemplosBucles {
    public static void Ejemplos() {

        String frase = "Ecuador en la casa papa!!!Ecuador";
        String palabra = "Ecuador";
        int repeticiones = 0;
        char letra = 'e';

        buscar:for (int i = 0; i <= (frase.length() - palabra.length());) {
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            repeticiones++;
            i += palabra.length();

        }

        System.out.println("La palabra "+ palabra +" esta repetidad " + repeticiones + " veces.");

    }
}
