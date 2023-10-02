package poo.ejercicio;

import java.util.Date;

public class EjemploOrdenes {
    public static void ejemploMain(String[] args) {
        Cliente cliente1 = new Cliente("Miguel", "Ramon");
        Cliente cliente2 = new Cliente("Antonio", "Villavicencio");
        Cliente cliente3 = new Cliente("Pablo", "Ramos");

        OrdenCompra compra1 = new OrdenCompra("Orden 1");
        compra1.addProducto(new Producto("Marisol", "Mayonesa",22));
        compra1.addProducto(new Producto("Margarina", "Mantequilla",12));
        compra1.addProducto(new Producto("Gatorade", "Fuisty",34));
        compra1.addProducto(new Producto("Puma", "Zapato",122));
        compra1.setCliente(cliente1);
        compra1.setFecha(new Date());

        OrdenCompra compra2 = new OrdenCompra("Orden 2");
        compra2.addProducto(new Producto("Toni", "Manjar",12));
        compra2.addProducto(new Producto("Vizca", "Fideos",32));
        compra2.addProducto(new Producto("Toni", "Yogurt",56));
        compra2.addProducto(new Producto("Nike", "Sandalias",42));
        compra2.setCliente(cliente2);
        compra2.setFecha(new Date());

        OrdenCompra compra3 = new OrdenCompra("Orden 3");
        compra3.addProducto(new Producto("Caribello", "Arroz",42));
        compra3.addProducto(new Producto("Osito", "Arrocillo",12));
        compra3.addProducto(new Producto("Universal", "Gelatina",34));
        compra3.addProducto(new Producto("Soni", "PS5",1022));
        compra3.setCliente(cliente3);
        compra3.setFecha(new Date());

        System.out.println(compra1.toString());
        System.out.println(compra2.toString());
        System.out.println(compra3.toString());
    }
}
