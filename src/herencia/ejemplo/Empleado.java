package herencia.ejemplo;

public class Empleado extends Persona{
    private String remuneracion;
    private int empleadoId;

    public Empleado() {

    }

    public Empleado(String remuneracion, int empleadoId) {
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, String remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return "Empleado: " +
                super.toString() +
                "remuneracion='" + remuneracion + '\'' +
                ", empleadoId=" + empleadoId +
                '.';
    }
}
