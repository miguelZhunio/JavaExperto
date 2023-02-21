package operadores;

public class Asignacion {
    public static void Operadores() {
        int j = 10 + 4;
        System.out.println("j = " + j);
        // Operadores compuestos
        j += 3;
        System.out.println("j += 3 ---> " + j);
        j -= 10;
        System.out.println("j -= 10 --->  " + j);

        j *= 3;
        System.out.println("j *= 3 ---> " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombr = 'Miguel'";
        System.out.println("sqlString = " + sqlString);


    }
}
