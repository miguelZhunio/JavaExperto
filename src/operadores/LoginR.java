package operadores;

import java.util.Scanner;

public class LoginR {
    public static void Login() {
        Scanner in = new Scanner(System.in);

        String username = "andres";
        String password = "1234567890";

        System.out.println("Ingrese el nombre de usuario ---> ");
        String auxUser = in.nextLine();
        System.out.println("Ingrese el password ---> ");
        String auxPass = in.nextLine();

        boolean isAutenticado = false;

        if (auxUser.equalsIgnoreCase(username)) {
            if (auxPass.equalsIgnoreCase(password)) {
                System.out.println("Ingresado correctamente ".concat(auxUser));
            } else {
                System.out.println("Password incorrecto");
            }
        } else {
            System.out.println("Nombre de usuario incorrecto");
        }
    }
}
