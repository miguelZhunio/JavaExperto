package flujosdecontrol;

public class IfElse {
    public static void Ejercicios() {
        float promedio = 6f;
        if (promedio >= 8.5) { // Si se cumple
            System.out.println("Felictaciones pasastes el anio, con unaexcelente nota");
        } else if(promedio >= 7) { // No se cumple, pero se cumple la 2 condicion
            System.out.println("Bueno, pero esfuerzate mas");
        } else if(promedio >=6) { // No se cumple, pero se cumple la 3 condcion
            System.out.println("Lo lograstes pero arrastrandote ");
        } else{ // No se cumple
            System.out.println("Reprobastes");
        }

        int mes = 2;
        int anio = 2012;
        System.out.println("ANIO");
        if(mes % 2 != 0) {
            System.out.println("El mes " + mes + " tiene 31 dias");
        } else if(mes == 2) {
            if (anio % 400 == 0 || (anio % 4 == 0 && anio % 400 != 0)) { // ANio bisiesto
                System.out.println("El mes es Febrero (mes " + mes + ") tiene 29 dias");
            } else {
                System.out.println("El mes es Febrero (mes " + mes + ") tiene 28 dias");
            }
        } else {
            System.out.println("El mes "+ mes + " tiene 30 dias.");
        }
    }
}
