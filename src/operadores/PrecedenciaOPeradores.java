package operadores;

public class PrecedenciaOPeradores {
    public static void Operacion() {
        int i = 14;
        int j = 7;
        int k = 9;

        double  promedio = (i + j + k)/3d;
        System.out.println("promedio = " + promedio);

        promedio = i + j + k/3d * 10; // 14+7+3*10 = 14+7+30 = 51
        System.out.println("promedio = " + promedio);

        promedio = i++ + j + --k/4d * 10;
        System.out.println("promedio = " + promedio); // 14+7+2*10 = 14+7+20 = 41
        promedio = i + j + k/4d * 10;
        System.out.println("promedio = " + promedio); // 15+7+2*10 = 15+7+20 = 42

    }


}
