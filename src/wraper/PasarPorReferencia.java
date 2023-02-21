package wraper;

public class PasarPorReferencia {
    // Cuando pasamos por referencia, estamos pasando el puntero
    // que direccion a en memoria el lugar donde se encuetra dicho objeto
    public static void Uso() {
        int[] numeros = {12,3,4};
        System.out.println("iniciamos el main");
        for (int n: numeros) {
            System.out.println("numero = " + n);
        }

        test(numeros);

        System.out.println("Finalizamos el main");
        for (int n: numeros) {
            System.out.println("numero = " + n);
        }
    }

    public static void test(int[] arr) {
        System.out.println("iniciamos el metodo test --->  = ");
        for (int n = 0; n < arr.length; n++) {
            arr[n] += 2;
        }
        System.out.println("Finaliza el metodo test = " );
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }
    }
    public static void test(Persona p) {
        System.out.println("inicio test = " + p.getNombre());
        p.setNombre("Angel");
        System.out.println("Fin test = " + p.getNombre());

    }


    public static void ReferenciaPersona() {
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Miguel");
        System.out.println("Inicio main = " + nuevaPersona.getNombre());
        test(nuevaPersona);
        System.out.println("Terminado main = " + nuevaPersona.getNombre());

    }

}
