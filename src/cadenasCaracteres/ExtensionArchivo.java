package cadenasCaracteres;

public class ExtensionArchivo {
    public static void mainpularExtension() {
        String archivo = "ej.img.java";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.lastIndexOf(\".\")) = " + archivo.substring(archivo.lastIndexOf(".")));

        String[] Arr = archivo.split("\\.");

        for (int i = 0 ; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
        System.out.println("extension " + (Arr.length-1));
    }
}
