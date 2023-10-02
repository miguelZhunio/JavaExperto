package ec.zhu.factura;

import ec.zhu.factura.model.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main() {
        Scanner in = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.setRuc("12345");
        cliente.setNombre("Thomas");

        System.out.print("Ingrese la descripcion de la factura:");
        Factura factura = new Factura(cliente,in.nextLine());

        Producto producto;

        int i = 1;
        do {
            producto = new Producto();
            System.out.print("Ingrese producto N " + producto.getCodigo() + ": ");
            producto.setNombre(in.next());

            System.out.print("Ingrese el precio:");
            producto.setPrecio(in.nextDouble());

            System.out.print("Ingrese la cantidad: ");

            factura.addDetalleFactura(new DetalleFactura(in.nextInt(),producto));

            System.out.print("DESEA VOLVER A INGRESAR OTRO PRODUCTO: (1. SI / 2. NO   )-->");
            ++i;
        } while(i <= Factura.MAX_ITEMS && "1".equals(in.next()));

        System.out.println(factura.generarDetalle());
    }



}
