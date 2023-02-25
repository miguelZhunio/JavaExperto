package clasesystem;

import java.util.Map;

public class VariablesEntorno {
    public static void Manipular() {
        // Obtener todas las varibles de entorno del sistema
        Map<String, String> varAmbiente = System.getenv();
        System.out.println("Variables e ambiente = " + varAmbiente);

        // Obtener una variable de entorno en especifico
        String  username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javahome = varAmbiente.get("JAVA_HOME"); // Podemos tambien extraer desde el mapa
        System.out.println("javahome = " + javahome);

        // Iterar el map
        for (String key:varAmbiente.keySet()) {
            System.out.println(key +" = " + varAmbiente.get(key));
        }
    }
}
