package variables;

public class Conversiones {
    public static void ConvertirString() {
        var cadena = "57";
        // De cadena a entero
        int entero = Integer.parseInt(cadena);
        System.out.println("entero = " + entero);

        // De String a Byte
        String realString = "23456.5e2";
        double realDouble = Double.parseDouble(realString);
        System.out.println("realDouble = " + realDouble);

        String logicString = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicString);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }

    public static void ConvertirPrimitivos() {

        int numeroInt = 100;
        System.out.println("numeroInt = " + numeroInt);
        
        String numeroString = Integer.toString(numeroInt);
        System.out.println("numeroString = " + numeroString);

        numeroInt = 56;
        var numeroString2 = String.valueOf(numeroInt);
        System.out.println("numeroString2 = " + numeroString2);

        double realDouble = 567.56e1;
        var realStr = Double.toString(realDouble);
        System.out.println("realStr = " + realStr);
        realStr = String.valueOf(realStr);
        System.out.println("realStr = " + realStr);
    }

    public static void ConvertirPrimitivosAPrimitivos() {
        int entero = 32768;
        System.out.println("entero = " + entero);
        short corto = (short) entero;
        System.out.println("corto = " + corto); // Error --> Pasa los valores.
        long largo = entero;
        System.out.println("largo = " + largo);

        char caracter = (char) entero;
        System.out.println("caracter = " + caracter);
        float real = (float) entero;
        System.out.println("real = " + real);

    }


}
