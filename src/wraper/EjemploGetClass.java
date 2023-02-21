package wraper;

import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void Uso() {
        String texto = "Hello Wolrd!";
        // Reflexion o metadata del objeto
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.getPackage() = " + strClass.getPackage());
        System.out.println("strClass.getTypeName() = " + strClass.getTypeName());
        // System.out.println("strClass.getMethods() = " + strClass.getMethods());

        // Mostrar metodos
        for(Method m: strClass.getMethods()) {
            System.out.println("metodo = " + m.getName());
        }

        Integer num = 123;
        Class intClase = num.getClass();
        System.out.println("intClase.getSuperclass() = " + intClase.getSuperclass());
        System.out.println("intClase.getSuperclass().getSuperclass() = " + intClase.getSuperclass().getSuperclass());

        Class objClass = intClase.getSuperclass().getSuperclass();
        for (Method m: objClass.getClass().getMethods()) {
            System.out.println("m.getName() = " + m.getName());
        }
        





        // control + d
    }
}
