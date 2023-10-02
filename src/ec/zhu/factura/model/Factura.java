package ec.zhu.factura.model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {

    private int folio;
    private Date fecha;
    private Cliente cliente;
    private DetalleFactura[] detalleFactura;
    private String descripcion;
    private int indexDetalle;
    private static int ultimoFolio;

    public static final int MAX_ITEMS = 20;

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.detalleFactura = new DetalleFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public DetalleFactura[] getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura[]) {
        this.detalleFactura = detalleFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addDetalleFactura(DetalleFactura item) {
        if (indexDetalle < MAX_ITEMS) {
            this.detalleFactura[indexDetalle++] = item;
        } else {
            System.out.println("SE ALCAZADO EL MAXIMO DE ITEMS");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < indexDetalle; i++) {

            total += this.detalleFactura[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("FACTURA N: ");
        sb.append(this.folio)
                .append("\nCliente: ").append(cliente.getRuc())
                .append("\nNombre cliente: ").append(cliente.getNombre())
                .append("\nDescripcion: ").append(this.descripcion)
                .append("\n");


        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append("Fecha emision: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCantidad\tTotal\n");

        for(int i = 0; i < indexDetalle; i++) {

            sb.append(this.detalleFactura[i].toString())
                    .append("\n");
        }
        sb.append("\nTotal definitivo: ")
                .append(calcularTotal());
        return sb.toString();

    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
