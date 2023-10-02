package interfaces.modelo;

public interface Imprimible {
    String TEXTO_DEFECTO = "Texto por defecto";
    String imprimir();

    default String metodoDefault() {
        return "Este es un metodo por default";
    }

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }


}
