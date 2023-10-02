package herencia;

public class AlumnoInternacional extends Alumno {
    private String paisOrigen;
    private double notes_idiomas;

    public AlumnoInternacional() {
        System.out.println("Bienvendos al construtor de ALumno Internacional");
    }

    public AlumnoInternacional(String nombre, String apellido, int edad, String name_institucion, String paisOrigen) {
        super(nombre, apellido, edad,name_institucion);
        this.paisOrigen = paisOrigen;

    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getNotes_idiomas() {
        return notes_idiomas;
    }

    public void setNotes_idiomas(double notes_idiomas) {
        this.notes_idiomas = notes_idiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + "soy un alumno extranjero, mi pais de origen es" + getPaisOrigen() +
                ", mi nombre es " + getNombre() + " " + getApellido();
    }

    @Override
    public double calcularPromedio() {
        // System.out.println("Calcular promedio: " + AlumnoInternacional.class.getCanonicalName());
        return super.calcularPromedio() + (notes_idiomas/ 4);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npaisOrigen='" + paisOrigen + '\'' +
                ", notes_idiomas=" + notes_idiomas;
    }
}
