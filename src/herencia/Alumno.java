package herencia;

public class Alumno extends Persona{
    private String name_school;
    private double notes_maths;
    private double notes_english;
    public Alumno() {
        super(); // Debe ir siempre en la primera linea del constructor del hijo
        System.out.println("Bienvendos al construtor de ALumno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String name_school) {
        this(nombre, apellido, edad);
        this.name_school = name_school;
    }

    public Alumno(String name_school, double notes_maths, double notes_english) {
        this.name_school = name_school;
        this.notes_maths = notes_maths;
        this.notes_english = notes_english;
    }

    public Alumno(String nombre, String apellido, String name_school, double notes_maths, double notes_english) {
        super(nombre, apellido);
        this.name_school = name_school;
        this.notes_maths = notes_maths;
        this.notes_english = notes_english;
    }

    public Alumno(String nombre, String apellido, int edad, String name_school, double notes_maths, double notes_english) {
        super(nombre, apellido, edad);
        this.name_school = name_school;
        this.notes_maths = notes_maths;
        this.notes_english = notes_english;
    }

    public String getName_school() {
        return name_school;
    }

    public void setName_school(String name_school) {
        this.name_school = name_school;
    }

    public double getNotes_maths() {
        return notes_maths;
    }

    public void setNotes_maths(double notes_maths) {
        this.notes_maths = notes_maths;
    }

    public double getNotes_english() {
        return notes_english;
    }

    public void setNotes_english(double notes_english) {
        this.notes_english = notes_english;
    }

    @Override
    public String saludar() {
        return super.saludar() + "soy un Alumno y mi nombre es " + getNombre() + " " + getApellido();
    }
    public double calcularPromedio() {
        // System.out.println("Calcular promedio: " + Alumno.class.getCanonicalName());
        return (getNotes_maths() + getNotes_english()) / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nname_school='" + name_school + '\'' +
                ", notes_maths=" + notes_maths +
                ", notes_english=" + notes_english +
                ", promedio =" + calcularPromedio();
    }
}
