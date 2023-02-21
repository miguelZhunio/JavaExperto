package variables;

/** DATOS PRIMITIVOS
 * Son tipos de datos escalares que contienen un solo valor.
 *
 * Como todo en java es de tipado estatico, es decir, se definen el tipo de la variable a la hora de definir esta.
 *
 * El tipo de dato se escribe completamente en minuscula.
 * Siempre tienen un valor por defecto, eso si, solo cuando son atributos y no varialbes locales de una clase en particular.
 */
public class Primitivos {
    /**  PRIMITIVO boolean
     * Este es el tipo mas simple de un solo bit de almacenamiento.
     * Un boolean expresa un valor de verdad, es decir puede ser verdadrero o falso.
     * Para especificr un literal boolean, se usan las palabras clases true(verdadero) o false(falso), ambas escritas en minusculas.
     *
     */
    boolean verdadero = true;
    boolean falso = false;

    /** PRIMITIVO char
     * Usa el codigo UNICODE y ocupa cada caracter 16 bits.
     */

    char a = 'a';
    char numero = '1';
    char c = '\u0021'; // codigo UNICODE

    /** PRIMITIVOS numeros enteros
     * Son de 4 tipos: byte, short, int y long.
     * Un entero es un numero del conjunto Z = {....., -3, -2, -1, 0, 1, 2, 3, ......}.
     * Difieren en las precisiones y pueden ser positivos o negativos.
     *
     */

    byte enteroByte = 127;
    short enteroShort = 234;
    int enteroInt = 3456;
    long enteroLong = 34567;

    /** PRIMITIVOS numeros reales
     * Es un tipo de dato para guardar numeros reales en coma flotantes con precision simple y doble.
     * Los numeros de punto flotante (tambien conocidos como "dobles" o "numeros reales").
     *
     */

    float realFloat = 3.1416f;
    double realDouble = 4.56789E3;

    static int varEstatico;

    public static void PrimitvosEnteros() {

        byte numeroByte = 127; // -128 a 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte ---> " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits ---> " + Byte.SIZE);
        System.out.println("Valor maximo de un byte ---> " + Byte.MAX_VALUE);
        System.out.println("Vallor minimo de un byte ---> " + Byte.MIN_VALUE);

        short numeroShort  = 30000;
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte ---> " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits ---> " + Short.SIZE);
        System.out.println("Valor maximo de un short ---> " + Short.MAX_VALUE);
        System.out.println("Vallor minimo de un short ---> " + Short.MIN_VALUE);

        int numeroInt = 45678;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes --->" + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits ---> " + Integer.SIZE);
        System.out.println("Valor maximo de un int ---> " + Integer.MAX_VALUE);
        System.out.println("Vallor minimo de un int ---> " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; // Se coloca L para convertir la literal (valor por defecto quees int) en long.
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en bytes --->" + Long.BYTES);
        System.out.println("Tipo long corresponde en bits ---> " + Long.SIZE);
        System.out.println("Valor maximo de un long ---> " + Long.MAX_VALUE);
        System.out.println("Vallor minimo de un long ---> " + Long.MIN_VALUE);

        var variableDinamica = 2147483648L;

    }

    public static void PrimitivosFlotantes() {
        float numeroFloat = 2.12e3f; // == 2120f
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo float corresponde en byte a ---> " + Float.BYTES);
        System.out.println("Tipo float le corresponde en bits a ---> " + Float.SIZE);
        System.out.println("El valor maximo de un float es --> " + Float.MAX_VALUE);
        System.out.println("El valor minmo de un float es ---> " + Float.MIN_VALUE);

        double numeroDouble = 3.4028235E39;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo double corresponde en byte a ---> " + Double.BYTES);
        System.out.println("Tipo double le corresponde en bits a ---> " + Double.SIZE);
        System.out.println("El valor maximo de un double es --> " + Double.MAX_VALUE);
        System.out.println("El valor minmo de un double es ---> " + Double.MIN_VALUE);

        System.out.println("variableDinamica = " + varEstatico);

        // valores por defecto.
    }

    public static void caracter() {
        char varCaracter = 64;   //'\u0040' o @ // Cada S.O con ssu tabla de caracteres.
        System.out.println("varCaracter = " + varCaracter);
        System.out.println("Tipo char corresponde en byte a ---> " + Character.BYTES);
        System.out.println("Tipo char le corresponde en bits a ---> " + Character.SIZE);
        System.out.println("El valor maximo de un char es --> " + Character.MAX_VALUE); // Un null
        System.out.println("El valor minimo de un char es ---> " + Character.MIN_VALUE); // ￿

        var caracter = 65;
        System.out.println("caracter = " + caracter);
        char espacio = '\u0020';
        System.out.println("espacio = " + espacio);
        char backEspace = '\b';
        System.out.println("El ultimo caracter sera eliminado por bckEspace" + backEspace);
        char tabular = '\t';
        System.out.println(tabular + "Tabulacion\t" + "Otra tabulacion." );
        char newLine = '\n';
        System.out.println("newLine  = " + newLine + " New Line");
        char retrocesoCarro = '\r';
        System.out.println("retrocesoCarro = " + retrocesoCarro + "Retroceso de carro" + retrocesoCarro + "Elimina");

        // Si no sabemos cual de los ultimos utilizar hacemos lo siguiente
        System.out.println("retrocesoCarro = " + System.getProperty("line.separator") + "retrocesoCarro = ");
        System.out.println("retrocesoCarro = " + System.lineSeparator() + "retrocesoCarro = ");

    }

    public static void PrimitivoBooleano() {
        // true o false
        boolean logicTrue = true;
        System.out.println("logic = " + logicTrue);
        boolean ConstBoolean = Boolean.TRUE;
        System.out.println("ConstBoolean = " + ConstBoolean);

        double d = 987634.56e-4;
       float f = 1.23456e2f;
        System.out.println(logicTrue = d > f);
        if (d > f) {
            System.out.println("El valor double es mayor\n" + d + " > " + f);
        } else {
            System.out.println("El valor double es menor\n" + d + " < " + f);
        }
    }


}
