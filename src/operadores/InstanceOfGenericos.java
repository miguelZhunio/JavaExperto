package operadores;

public class InstanceOfGenericos {
    public static void Operador() {
        Object text = "Hello World";
        Number num = 10;

        Boolean b1 = text instanceof String;
        System.out.println("b1 = " + b1);

        b1 = text instanceof Integer;
        System.out.println("text es de tipo Integer = " + b1);

        b1 = text instanceof Number;
        System.out.println("text es de tipo Number = " + b1);

        b1 = text instanceof Double;
        System.out.println("num es de tipo Double = " + b1);

        b1 = text instanceof Long;
        System.out.println("num es de tipo Long = " + b1);

        Number real = 5.6f;
        b1 = real instanceof Float;
        System.out.println("real es de tipo Float = " + b1);

        //Instancia numerica;
        num = Integer.valueOf(7); //Forma correcta de crear instancias numericas
        real = Double.valueOf(4.5);


    }
}
