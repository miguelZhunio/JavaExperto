package poo.ejercicio;

import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private static Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;

    private Producto[] productos;
    private int identificadorProducto;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public static Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        if (identificadorProducto < this.productos.length) {
            this.productos[identificadorProducto++] = producto;
        }
    }

    public int sumarProductos() {
        int total = 0;
        for (int i = 0 ; i<productos.length; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        String cadena = "OrdenCompra{" +
                "identificador ='" + getIdentificador() + "\n" +
                "descripcion='" + getDescripcion() + "\n" +
                "fecha=" + getFecha() + "\n" +
                "cliente=" + getCliente().getNombre() + " " + getCliente().getApellido() +
                "\n Productos= " + "\n";
        for (int i = 0; i < productos.length; i++) {
            cadena += productos[i].toString();

        }
        cadena += "\nTotal de compra -> " + sumarProductos() +"";
        return cadena;
    }
}
