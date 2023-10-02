package abstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String message = "EL campo %s debe ser numerico";
    @Override
    public void setMensaje(String mensaje) {
        this.message = mensaje;
    }

    @Override
    public String getMensaje() {
        return message ;
    }

    @Override
    public boolean isValido(String valor) {
        try {
           Integer.parseInt(valor);
           return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
