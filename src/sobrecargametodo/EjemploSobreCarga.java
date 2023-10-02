        package sobrecargametodo;
        import static sobrecargametodo.Calculadora.*;

        public class EjemploSobreCarga {
            public static void init() {

                System.out.println("Sumar int:" + sumar(3,4));
                System.out.println("sumar float: " + sumar(5.6f, 5.7f));
                System.out.println("sumar string:" + sumar("3", "34"));


                System.out.println("Sumar long: " + sumar(10L , 20L));
                System.out.println("Sumar enteros" + sumar(2, '@')); // Esto es debido a la notacion

                System.out.println("Sumar n numeros entros --> " + sumar(45.4f, 3,4,5,6,7,8,9,0,9));

            }
        }
