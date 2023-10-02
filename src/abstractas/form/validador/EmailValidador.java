package abstractas.form.validador;

public class EmailValidador extends Validador{
    protected String message = "El campo %s tiene un formato del email es invalido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
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
        return valor.matches(EMAIL_REGEX);
    }
}
