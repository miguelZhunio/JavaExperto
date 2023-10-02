package poo;

public class Automovil implements Comparable<Automovil>{
    private int id;
    private String fabricante;
    private String modelo;
    private ColorEnum color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRueda;

    // Variable estatica
    private static String colorEstatico = "Naranja";
    private CategoriaCarroEnum tipo;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;


    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }
    public Automovil(String fabricante) {
        this();
        this.fabricante = fabricante;
    }

    public Automovil(String fabricante, String modelo) {
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // Obtener los valores de los atributos
    public String getFabricante() {
        return this.fabricante;
    }
    public String getModelo() {
        return this.modelo;
    }
    public ColorEnum getColor() {
        return this.color;
    }
    public Motor getCilindraje() {
        return this.motor;
    }

    // Modificar el valor de los atributos
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(ColorEnum color) {
        this.color = color;
    }
    public void setCilindraje(Motor motor) {
        this.motor = motor;
    }
    public static String getColorEstatico() {
        return colorEstatico;
    }
    public static void setColorEstatico(String colorEstatico) {
        Automovil.colorEstatico = colorEstatico;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public CategoriaCarroEnum getTipo() {return tipo;}
    public void setTipo(CategoriaCarroEnum tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }

    public String verDetalle() {
        return "Automovil.colorEstatico" + colorEstatico;
    }

    public Automovil addRuedas(Rueda rueda) {
        if (indiceRueda < this.ruedas.length) {
            this.ruedas[indiceRueda++] = rueda;
        }
        return this;
    }
    // POJO
    // Plain Old Java Object

    // Equals sobrescribiendo
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil auto = (Automovil) obj;
        return (auto.fabricante != null
                && this.fabricante.equals(auto.getFabricante()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", cilindraje=" + motor.getCilindrada() +
                ", tipo=" + tipo.getNombres() +
                '}';
    }

    @Override
    public int compareTo(Automovil o) {
        return this.fabricante.compareTo(o.getFabricante());
    }
}
