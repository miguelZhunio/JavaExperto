package operadores;

import java.util.Locale;
import java.util.Scanner;

public class LoginArr {
    public static void Login() {
        Scanner in = new Scanner(System.in);
        int users = 2;
        String[] userNames = new String[users];
        String[] passwords = new String[users];

        userNames[0] = "andres";
        userNames[1] = "Miguel";

        passwords[0] = "12345";
        passwords[1] = "23456";

        System.out.println("Ingrese el nombre de usuario ---> ");
        String auxUser = in.nextLine();
        System.out.println("Ingrese el password ---> ");
        String auxPass = in.nextLine();

        for (int i = 0; i < userNames.length; i++) {
            if (userNames[i].equalsIgnoreCase(auxUser)) {
                if (passwords[i].equalsIgnoreCase(auxPass)) {
                    System.out.println("BIENVENIDO ".concat(auxUser.toUpperCase()));
                } else {
                    System.out.println("Password incorrecto");
                    break;
                }

            } else if(i == (userNames.length-1)) {
                System.out.println("Usuario no encontrado");
                break;
            }
        }

    }
}
