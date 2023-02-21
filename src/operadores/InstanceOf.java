package operadores;

public class InstanceOf {
    public static void Operador(){
        // Validar si una referencia es de una clase.
        String texto = "Creando un objeto";
        Integer num = 8;

        Boolean b1 = texto instanceof String;
        System.out.println("texto Es de tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num Es de tipo Integer = " + b1);

        Double real = 4.5;
        b1 = real instanceof Number;
        System.out.println("real es de tipo Number = " + real);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 Es de tipo boolean = " + b1);






    }
}
