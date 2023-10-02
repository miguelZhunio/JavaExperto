package abstractas.form.validador;

public class RequeridoValidador extends Validador{
    protected String message = "El campo %s es requerido";
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
        return (valor != null && valor.length() > 8) ;
    }
}
