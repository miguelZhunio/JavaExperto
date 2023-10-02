package poo;

public enum CategoriaCarroEnum {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_NAGON("Station nagon", "Auto grande", 4),
    MATCHBACK("Matchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4);
    // Atributos de las categorias
     private final String nombres;
     private final int numeroPuerta;
     private final String descripcion;

    CategoriaCarroEnum(String nombres,String descripcion, int numeroPuerta) {
        this.nombres = nombres;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }
    public String getNombres() {
        return nombres;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
