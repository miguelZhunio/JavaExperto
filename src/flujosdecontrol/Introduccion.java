package flujosdecontrol;

/** FLUJO DE CONTROL
 * if() ---> Solo tiene un camino, si es verdadera.
 * if/else() ---> Se ejecuta por dos caminos (verdadero if/ falso else)
 * else if() ---> Son if anidados y evaluan otra condicion si es falsa la condicion princpal
 * switch case (interructor)
    * La sentencia switch se utiliza para realizar sentencia cndicionales basadas en alguna
    * expresion.
    * De acuerdo al valor de la expresion se ejecuta la sentencia case apropiada.
    * Solo la xpresion ser de tipo primitivo o string.
 *
 * SEPARADORES
 * () --> Para contener condiciones en sentencias de control de flujo, paea contener lista de paramentros, o cambiar la precedencia de operadores.
 * {} --> Se usa para definir o crear bloques de codigo, para contener valores definidos en arreglos.
 * [] --> Para declarar matrices o arreglos, para acceder a los elementos
 * ; --> Para separar sentencias
 * , --> Separar identificadores del mismo tipo creadas consecutivamente, o para colocar la lista de parametros
 * . --> Para llamar a un metodo o para importar clases de los paquetes.
 *
 *
 */

public class Introduccion {
    public static void Explicacion() {
        // IfElse.Ejercicios();
        SwitchCase.Ejercicio();
    }

}
