package flujosdecontrol.bucles;

public class EtiquetasBucles {
    public static void Operaciones() {
        bucle1: // Bucle etiquetado
        for (int i = 0; i < 5; i++) {
            System.out.print("i = " + i + ", ");
            bucle2: for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    System.out.println();
                    continue bucle1;
                }
                System.out.print(" j = " + j);
            }
            System.out.println();

        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        bucle3: // Bucle etiquetado
        for (int i = 0; i < 5; i++) {
            System.out.print("i = " + i + ", ");
            bucle4: for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    System.out.println();
                    break bucle3;
                }
                System.out.print(" j = " + j);
            }
            System.out.println();

        }
    }
}
