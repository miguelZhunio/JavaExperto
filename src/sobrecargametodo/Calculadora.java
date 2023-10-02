package sobrecargametodo;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static float sumar(float x, float y) {
        return x + y;
    }
    public static float sumar(int i, float j) {
        return i + j;
    }
    public static double sumar(float i, int j) {
        return i + j;
    }
    public static int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException ex) {
            resultado = 0;
        }
        return resultado;
    }

    // Varargs
    public static int sumar(int... argumentos) {
        int total = 0;
        for (int i: argumentos) {
            total += i;
        }
        return total;
    }

    public static float sumar(float a, int... argumentos) {
        int total = 0;
        for (int i: argumentos) {
            total += i;
        }
        return total + a;
    }


}
