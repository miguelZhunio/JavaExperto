package wraper;

public class AutoboxingInteger {
    public static void Empaquetar() {
        Integer[] enteros = {2,4,5,6,6,4,3};

        int suma =  0;

        for (Integer i: enteros) {
            if (i.intValue() % 2 == 0) {
                suma+= i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        for (Integer i: enteros) {
            if (i % 2 == 0) {
                suma+= i;
            }
        }
    }
}
