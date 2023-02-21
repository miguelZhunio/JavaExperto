package operadores;


/* OPERADORES
 * OPERADORES ARITMETICOS
 * Se utilizan para realizar opereraciones aritmeticas simples en tipos de datos primitivos.
 * Multiplicacion *
 * Division /
 * Modulo o resto % (el residuo de una division).
 * Suma +
 * Resta -
 * Incremento ++
 * Decremento --
 * Menos unario - (cambiar el signo)
 *
 * OPERADORES COMBINADOS O COMPUESTOS: Sirve para abreviar las operaciones aritmeticas
 * -=
 * +=
 * /=
 * *=
 * %=
 *
 * OPERADOR INCREMENTO Y DECREMENTO
 * Utilizado para incrementar o decrementar el valor en 1
 * Hay dos variedades de estos operadores el pre y post
 * ++a Pre-incremento ---> Incrementa en 1, y luego devuelve a
 * a++ Post- incremento ---> Devuelve a, y luego incrementa a en 1.
 * --a Pre-decremento ---> Decrementa a en 1, y luego devuelve a
 * a-- Post- decremento ---> Devuelve a, y luego decrementa a en 1.
 *
 * OPERADOR TERNARIO O CONDICIONAL (?)
 * El operador ternario es una version abreviada de la sentencia if-else.
 * Tiene tres operandos y de hay viene su nombre ternario:
 * (condicion)? valorSi: valorNo;
 * int a = a > 2 ? 2: 3;
 *
 * OPERADORES RELACIONALES
 * Se utilizan para comprobar relaciones de igualdad, mayor que, menor que, etc
 * Devuelve un resultado booleano despues de la comparacion, true su la comparacion
 * fue exitosa y false en caso contrario.
 * Se usa ampliamente en las sentencias if/else, asi como bucles.
 * > mayor que
 * >= mayor o igual que
 * < menor
 * <= menor o igual que
 * == igual
 * != Diferente
 *
 * OPERADORES LOGICOS
 * Los operadores logicos permiten evaluar expresiones logicas y trabajan con
 * operadores booleanos
 * Realizan las operaciones logicas de conjuncion(AND), disyuncion(OR) y negacion (NOT).
 * AND (&&) (&) --> Se evaluan las dos condiciones(&)
 * OR (||) o (|) --> Se evaluan las dos condiciones (|)
 * NOT (!)
 * XOr (^)
 *
 * PRECEDENCIA DE LOS OPERADORES
 *
 *
 */
public class Teoria {

    public static void TodasOperaciones() {

        // Aritmeticos.Operaciones();
        // Asignacion.Operadores();
        // Unarios.Operadores();
        // IncrementoDecremento.Operadores();
        // Relacionales.Operadores();
        // Logicos.Operadores();
        // LoginArr.Login();
        // Ternario.Operadores();
        // LoginTernario.Login();
        // TernarioNumeroMayor.Ejercicio();
        // InstanceOf.Operador();
        // InstanceOfGenericos.Operador();
        PrecedenciaOPeradores.Operacion();
    }

}
