package abstractas.form.validador;

import abstractas.form.validador.message.MessageFormatable;

public class LargoValidador extends Validador implements MessageFormatable {

    protected String message = "El campo %s debe tener mino %d y maximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE; // El maximo que ocupa el integer.

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.message = mensaje;
    }

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public boolean isValido(String valor) {
        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return largo >= min & largo <= max;
    }

    @Override
    public String getMessageFormateado(String campo) {
        return this.message = String.format(this.message,  campo ,this.min, this.max); // estrapolar string
    }

    /*public String getMessageFormateado(String campo) {
        return this.message = String.format(this.message,  campo ,this.min, this.max); // estrapolar string

    }*/
}
