package modelo;

import servicio.ServiciosAcademicosI;
import excepciones.EstudianteYaInscritoException;
import excepciones.EstudianteNoInscritoEnCursoException;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Long, ArrayList<Long>> inscripciones; // ID del curso y lista de IDs de estudiantes

    public GestorAcademico() {
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        inscripciones = new HashMap<>();
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, Long idCurso) throws EstudianteYaInscritoException {
        if (!inscripciones.containsKey(idCurso)) {
            inscripciones.put(idCurso, new ArrayList<>());
        }
        ArrayList<Long> estudiantesInscritos = inscripciones.get(idCurso);
        if (estudiantesInscritos.contains(estudiante.getId())) {
            throw new EstudianteYaInscritoException("El estudiante ya está inscrito en el curso.");
        }
        estudiantesInscritos.add(estudiante.getId());
    }

    @Override
    public void desinscribirEstudianteCurso(Long idEstudiante, Long idCurso) throws EstudianteNoInscritoEnCursoException {
        ArrayList<Long> estudiantesInscritos = inscripciones.get(idCurso);
        if (estudiantesInscritos == null || !estudiantesInscritos.contains(idEstudiante)) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante no está inscrito en el curso.");
        }
        estudiantesInscritos.remove(idEstudiante);
    }
}
