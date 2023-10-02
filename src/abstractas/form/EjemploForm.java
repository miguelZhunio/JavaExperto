package abstractas.form;

import abstractas.form.elementos.*;
import abstractas.form.elementos.select.Opcion;
import abstractas.form.validador.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EjemploForm {
    public static void main(String[] args) {
        InputForm left = new InputForm("username");
        left.addValidador(new LargoValidador(3, 10));
        left.setValor("12");

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
            .addValidador(new LargoValidador(4, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());


        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador(new NotNullValidador());

        lenguaje.addOpcion(new Opcion("1", "Java", true))
            .addOpcion(new Opcion("2", "Python"))
            .addOpcion(new Opcion("3", "JavaScript "))
            .addOpcion(new Opcion("4", "TypeScript"));

        username.setValor("John does");
        password.setValor("abcdeertf");
        email.setValor("john@gmail.com");
        edad.setValor("29");

        // Clase Anonima
        ElementoForm anonimo = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\">";
            }
        };
        anonimo.setValor("Este campo esta deshabilitado");

        experiencia.setValor("Mas de 10 años aprendiedo a programar");

        List<ElementoForm> elementoForms = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                anonimo,
                left
        );

        elementoForms.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });


        elementoForms.forEach(e -> {
            if (!e.isValido()) {
                // Cuando solo tenga un parametro y ese le imoprime solo se puede hacer este atajo System.out::println
                e.getErrores().forEach(System.out::println);
            }
        });





    }
}
