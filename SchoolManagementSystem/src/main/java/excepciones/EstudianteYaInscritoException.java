package excepciones;

public class EstudianteYaInscritoException extends RuntimeException {
    public EstudianteYaInscritoException(String message) {
        super(message);
    }
}