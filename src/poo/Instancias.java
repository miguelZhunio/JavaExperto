package poo;

import java.util.Date;

public class Instancias {
    public static void init() {
        Automovil auto = new Automovil();
        auto.setFabricante("Mazda");

        System.out.println("auto.getFabricante() = " + auto.getFabricante());
        
        // Metodo equals
        Automovil auto2 = new Automovil();
        auto2.setFabricante("Mazda");

        System.out.println("auto2.equals(auto) = " + auto2.equals(auto));
    
        Automovil auto3 = new Automovil();
        System.out.println("auto.equals(auto3) = " + auto.equals(auto3));

        Date fecha = new Date();


        System.out.println("auto.toString() = " + auto.toString());
    }
}
