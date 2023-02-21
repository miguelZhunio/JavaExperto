package wraper;

public class ClassInteger {
    public static void Operaciones() {
        Integer intObj = Integer.valueOf(21); // Creacion de la clase ---> Unboxing
        Integer i = 34; // AutoUnboxing

        // De una instancia de la clase Integer a un valor primitivo
        int num = i;
        num = intObj.intValue();

        String valor = "1234";
        Integer val = Integer.valueOf(valor);




    }
}
