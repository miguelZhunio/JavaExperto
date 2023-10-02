package abstractas.form.elementos;

import abstractas.form.validador.LargoValidador;
import abstractas.form.validador.Validador;
import abstractas.form.validador.message.MessageFormatable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;
    private List<Validador> validadorList;
    private List<String> errores;


    public ElementoForm() {
        this.validadorList = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadorList.add(validador);
        return this;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public boolean isValido() {
        for (Validador v : validadorList) {
            if (!v.isValido(this.valor)) {
                if (v instanceof MessageFormatable) {
                    this.errores.add(((MessageFormatable) v).getMessageFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

}
