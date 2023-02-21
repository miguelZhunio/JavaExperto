package wraper;

/**
 * CLASE WRAPPER (Clase envoltorio) ---> envuelve al primitivo
 * Cada tipo primitivo tiene su equivalente.
 * Dan mayor funcionalidad para operaciones de comprobaciones y conversiones.
 * byte ---> Byte
 * short ---> Short
 * int ---> Integer
 * long ---> Long
 * float ---> Float
 * double ---> Double
 * char ---> Character
 * boolean ----> Boolean
 *
 * CLASS INTEGER
 * Cada tipo numerico tiene su propia clase de objetos.
 * Asi el tipo (int) tiene la clase Integer
 * Se implementan varios metodos utiles dentro de la clase envoltorio Integer
 * Integer i = Integer.valueOf(12);
 *
 * Contantes de integer
 * Integer.MIN_VALUE
 * Integer.MAX_VALUE
 *
 * Metodos estaticos
 * String Integer.toString(int i, int base) / (int i)---> Conviete a un string
 * int Integer.parseInt(String s, int base) / (String s)----> Convierte un string a un int.
 * Integer Integer.valueOf(String s, int base). ---> Crea la referencia de tipo Iteger.
 * Integer Integer.valueOf(String s)
 *
 * Metodos de la instancia
 * int hashCode() ---> Devuelve la posicion en memoria.
 *
 * CLASE LONG
 * El tipo long tiene su clase Long
 * De implementa muchas funcionalidades utiles dentro de los metodos de la clase Long.
 * Long i = Long.valueOf(123456l);
 *
 * Constantes
 * Long.MIN_VALUE
 * Long.MAX.VALUE
 *
 * l.equals();
 *
 * CLASE DOUBLE
 * el tipo double tiene la clase Double
 *
 * Double d = d.valueOf(1234.4556);
 *
 * Constantes
 * Double.POSITIVE_INFINITY
 * Double.NEGATIVE_INFINITIVE
 *
 * CLASE FLOAT
 * // Lo mismo que la clase double
 *
 * CLASE CHARACTER
 *
 *
 */

public class Introduccion {
    public static void Teoria() {
        // ClassInteger.Operaciones();
        // AutoboxingInteger.Empaquetar();
        // WrapperOperadoresRelacionales.Operadores();
        // WrapperBoolean.ClaseBoolean();
        // EjemploGetClass.Uso();
        // PasarPorValor.PorValor();
        // PasarPorReferencia.Uso();
        PasarPorReferencia.ReferenciaPersona();

    }
}
