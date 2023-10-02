package abstractas.form.validador;

public class NotNullValidador extends Validador{

    protected String message = "El campo %s no puede ser nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.message = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.message;
    }

    @Override
    public boolean isValido(String valor) {
        return (valor != null);
    }
}
