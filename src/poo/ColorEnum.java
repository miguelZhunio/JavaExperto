package poo;

public enum ColorEnum {
    // Solo se coloca el nombre de la constante y el nombre por defecto sera el
    // mismo valor que el nombre
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJA("Naranja"),
    VERDE("Verde");
    private final String color;

    ColorEnum(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
