package poo;

import java.util.Arrays;

public class Rleaciones {
    
    public static void init() {
        Persona conductor1 = new Persona("Miguel", "Tumac");
        Persona conductor2 = new Persona("Pablo", "Vera");
        Persona conductor3 = new Persona("Elba", "Marioz");

        Rueda[] ruedas_1 = {new Rueda("Road", 18, 5.5),
                new Rueda("Road", 18, 5.5),
                new Rueda("Road", 18, 5.5),
                new Rueda("Road", 18, 5.5)
        };

        Rueda[] ruedas_2 = {new Rueda("Yahoma", 7, 4.5),
                new Rueda("Yohama", 7, 4.5),
                new Rueda("Yohama", 7, 4.5),
                new Rueda("Yohama", 7, 4.5)
        };

        Rueda[] ruedas_3 = {new Rueda("Michelin", 11, 34.5),
                new Rueda("Michelin", 11, 34.5),
                new Rueda("Michelin", 11, 34.5),
                new Rueda("Michelin", 11, 34.5)
        };

        Rueda[] ruedas_4 = new Rueda[4];


        Automovil auto = new Automovil("Mazda");
        auto.setColor(ColorEnum.AMARILLO);
        auto.setTipo(CategoriaCarroEnum.CONVERTIBLE);
        auto.setMotor(new Motor(45, TipoMotorEnum.BENCINA));
        auto.setEstanque(new Estanque(120));
        auto.setConductor(conductor1);
        auto.setRuedas(ruedas_1);
        System.out.println(auto.toString());

        Automovil auto1 = new Automovil("Vitara");
        auto1.setColor(ColorEnum.ROJO);
        auto1.setTipo(CategoriaCarroEnum.COUPE);
        auto1.setMotor(new Motor(2.4, TipoMotorEnum.DIESEL));
        auto1.setEstanque(new Estanque(40));
        auto1.setConductor(conductor2);
        auto1.setRuedas(ruedas_2);
        System.out.println(auto1.toString());

        Automovil auto2 = new Automovil("Chevrolet");
        auto2.setColor(ColorEnum.GRIS);
        auto2.setTipo(CategoriaCarroEnum.SEDAN);
        auto2.setMotor(new Motor(2.0, TipoMotorEnum.BENCINA));
        auto2.setEstanque(new Estanque(40));
        auto2.setConductor(conductor3);
        auto2.setRuedas(ruedas_3);
        System.out.println(auto2.toString());


        Automovil auto3 = new Automovil("Suzuki");
        auto3.setColor(ColorEnum.BLANCO);
        auto3.setTipo(CategoriaCarroEnum.MATCHBACK);
        auto3.setMotor(new Motor(2.56, TipoMotorEnum.DIESEL));
        auto3.setEstanque(new Estanque(400));
        auto3.setConductor(conductor1);
        for (int i = 0; i < ruedas_4.length; i++){auto3.addRuedas(new Rueda("Marqua", 21, 5.5));}
        System.out.println(auto3.toString());

        System.out.println("RUEDAS AUTO ");
        for (Rueda r: auto.getRuedas()) {
            System.out.println(r.getFabricante() + " aro: "+ r.getAro()+ " ancho: "+ r.getAncho());
        }

        Automovil[] autos = {auto, auto1, auto2, auto3};

        for (Automovil a: autos) {System.out.println(a);}

        Arrays.sort(autos);

        System.out.println();
        for (Automovil a: autos) {System.out.println(a);}


    }
}
