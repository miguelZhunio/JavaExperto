package poo;

import java.sql.SQLOutput;

public class VariableEstatica {
    
    public static void init() {

        Automovil auto = new Automovil();
        auto.setColor(ColorEnum.AMARILLO);
        auto.setTipo(CategoriaCarroEnum.CONVERTIBLE);
        auto.setMotor(new Motor(45, TipoMotorEnum.BENCINA));
        auto.setEstanque(new Estanque(120));
        System.out.println(auto.toString());

        Automovil auto1 = new Automovil();
        auto1.setColor(ColorEnum.ROJO);
        auto1.setTipo(CategoriaCarroEnum.COUPE);
        auto1.setMotor(new Motor(2.4, TipoMotorEnum.DIESEL));
        auto1.setEstanque(new Estanque(40));
        System.out.println(auto1.toString());

        Automovil auto2 = new Automovil();
        auto2.setColor(ColorEnum.GRIS);
        auto2.setTipo(CategoriaCarroEnum.SEDAN);
        auto2.setMotor(new Motor(2.0, TipoMotorEnum.BENCINA));
        auto2.setEstanque(new Estanque(40));
        System.out.println(auto2.toString());


        Automovil auto3 = new Automovil();
        auto3.setColor(ColorEnum.BLANCO);
        auto3.setTipo(CategoriaCarroEnum.MATCHBACK);
        auto3.setMotor(new Motor(2.56, TipoMotorEnum.DIESEL));
        auto3.setEstanque(new Estanque(400));
        System.out.println(auto3.toString());

        System.out.println(Automovil.VELOCIDAD_MAXIMA_CARRETERA);

        CategoriaCarroEnum tipo = auto.getTipo();

        // switch ENUM
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automvil es deportivo y descapotable");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamnete deporitvo");
            case FURGON -> System.out.println("Es automovil utilitario de trasporte de empresas");
            case MATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o cmamioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_NAGON -> System.out.println("Es un automvil, con maleta grande");

        }

        // Iterar categoria carro enum
        CategoriaCarroEnum[] tipos = CategoriaCarroEnum.values();
        for (CategoriaCarroEnum t: tipos) {
            System.out.println(t
                    + " -> " +t.name() + "(nombre originoa)" +
                    " \nnombre " + t.getNombres()+
                    " \nDescripcion " + t.getDescripcion() +
                    " \nNumero de puertas " + t.getNumeroPuerta());
        }
    }
    
}
