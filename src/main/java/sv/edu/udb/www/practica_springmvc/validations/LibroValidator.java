package sv.edu.udb.www.practica_springmvc.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import sv.edu.udb.www.practica_springmvc.entities.Libros;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LibroValidator implements Validator {
    @Override
    public boolean supports(Class clazz) {
        return Libros.class.equals(clazz); // clase del bean al que da soporte este validador
    }

    @Override
    public void validate(Object target, Errors errors) {
        Libros libro = (Libros) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombreLibro", "field.nombreLibro.required");
        ValidationUtils.rejectIfEmpty(errors, "existencias", "field.existencias.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "precio", "field.precio.required");

    }
}