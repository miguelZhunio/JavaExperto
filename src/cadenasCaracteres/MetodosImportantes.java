package cadenasCaracteres;

public class MetodosImportantes {
    public static void importantes() {
        String name = "Briel";
        System.out.println("\nname = " + name + "\n");
        System.out.println("name.length() = " + name.length()); // El largo del string
        System.out.println("name.toUpperCase() = " + name.toUpperCase()); // Pasa todo a mayuscula
        System.out.println("name.toLowerCase() = " + name.toLowerCase()); // Pasa todo a minuscula
        System.out.println("name.equals(\"miguel\") = " + name.equals("miguel"));
        System.out.println("name.equalsIgnoreCase(\"miguel\") = " + name.equalsIgnoreCase("miguel"));
        System.out.println("name.compareTo(\"briel\") = " + name.compareTo("briel"));
        System.out.println("name.charAt(3) = " + name.charAt(3));
        System.out.println("name.substring(3, 4) = " + name.substring(3, 4));

        String trabalengua = "Trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \"_\") = " + trabalengua.replace("a", "_"));
        System.out.println("trabalengua.indexOf(\"z\") = " + trabalengua.indexOf("z")); // -1 porque no esta
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("a")); // Ultima ocurrencia
        System.out.println("trabalengua.contains(\"r\") = " + trabalengua.contains("r")); // Booleano
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba")); // Comienza con.
        System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
        System.out.println("  trabalenguas  ".trim()); // Eliminar espacios del principio y el final.


    }
}
