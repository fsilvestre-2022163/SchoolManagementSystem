package excepciones;

public class EstudianteNoInscritoEnCursoException extends RuntimeException {
    public EstudianteNoInscritoEnCursoException(String message) {
        super(message);
    }
}