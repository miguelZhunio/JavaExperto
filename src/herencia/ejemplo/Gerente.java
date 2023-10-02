package herencia.ejemplo;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente() {
    }

    public Gerente(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Gerente(String remuneracion, int empleadoId, double presupuesto) {
        super(remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, String remuneracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "presupuesto=" + presupuesto +
                "Tipo: GERENTE" +
                '.';
    }
}
