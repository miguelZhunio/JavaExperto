package cadenasCaracteres;

public class TestConcatenacion {

    public static void Test() {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // Es mutiable

        long inicio = System.currentTimeMillis();

        for (int i =0 ; i < 5000 ; i++) {
            // c = c.concat(a).concat(b).concat("\n"); 500 => 5ms.
            // c += a + b + "\n"; 500 => 51 ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms brutal 10000 => 6ms
        }

        long fin =System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("sb = " + sb);

    }
}
