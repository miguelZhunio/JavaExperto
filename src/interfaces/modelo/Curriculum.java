package interfaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.carrera = carrera;
        this.persona = persona;
        this.experiencia = new ArrayList<>();
    }
    public Curriculum addExperiencia(String exp) {
        experiencia.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre");
        sb.append(persona).append("\n")
                .append("Resumen:").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencia:\n");
        experiencia.forEach(l -> {
            sb.append("\t-").append(l).append("\n");
        });
        return sb.toString();
    }
}
