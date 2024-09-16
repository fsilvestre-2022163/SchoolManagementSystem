package gestorAcademico;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {

    // Lista de estudiantes
    private ArrayList<Estudiante> listaEstudiantes;

    // Lista de cursos
    private ArrayList<Curso> listaCursos;

    // Mapa de estudiantes inscritos en cada curso
    private HashMap<Long, ArrayList<Estudiante>> estudiantesPorCurso;

    // Constructor
    public GestorAcademico() {
        this.listaEstudiantes = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
        this.estudiantesPorCurso = new HashMap<>();
    }

    // Métodos para agregar estudiantes y cursos
    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void agregarCurso(Curso curso) {
        listaCursos.add(curso);
        // Inicializar lista vacía de estudiantes inscritos para el curso
        estudiantesPorCurso.put(curso.getIdCurso(), new ArrayList<>());
    }

    // Método para inscribir un estudiante en un curso
    public void inscribirEstudianteEnCurso(Long idCurso, Estudiante estudiante) {
        ArrayList<Estudiante> inscritos = estudiantesPorCurso.get(idCurso);
        if (inscritos != null) {
            inscritos.add(estudiante);
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    // Obtener lista de estudiantes inscritos en un curso
    public ArrayList<Estudiante> obtenerEstudiantesPorCurso(Long idCurso) {
        return estudiantesPorCurso.get(idCurso);
    }

    // Método para mostrar los estudiantes inscritos en un curso
    public void mostrarEstudiantesInscritos(Long idCurso) {
        ArrayList<Estudiante> inscritos = estudiantesPorCurso.get(idCurso);
        if (inscritos != null) {
            System.out.println("Estudiantes inscritos en el curso con ID: " + idCurso);
            for (Estudiante estudiante : inscritos) {
                System.out.println(estudiante);
            }
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    // Métodos para obtener las listas
    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }
}
