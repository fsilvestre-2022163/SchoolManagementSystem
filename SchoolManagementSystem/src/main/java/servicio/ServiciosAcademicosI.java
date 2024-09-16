package servicio;

import excepciones.EstudianteNoInscritoEnCursoException;
import excepciones.EstudianteYaInscritoException;
import modelo.Estudiante;
import modelo.Curso;

public interface ServiciosAcademicosI {
    void matricularEstudiante(Estudiante estudiante);
    void agregarCurso(Curso curso);
    void inscribirEstudianteCurso(Estudiante estudiante, Long idCurso) throws EstudianteYaInscritoException;
    void desinscribirEstudianteCurso(Long idEstudiante, Long idCurso) throws EstudianteNoInscritoEnCursoException;
}