package main;

import modelo.*;
import excepciones.*;
import servicio.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de GestorAcademico, Estudiantes y Cursos
        GestorAcademico gestor = new GestorAcademico();

        Estudiante estudiante1 = new Estudiante(1L, "Juan", "Pérez", "01-01-2000", "matriculado");
        Estudiante estudiante2 = new Estudiante(2L, "Ana", "García", "02-02-2000", "matriculado");

        Curso curso1 = new Curso(1L, "Matemáticas", "Curso de matemáticas avanzadas", 4, 1);

        gestor.matricularEstudiante(estudiante1);
        gestor.agregarCurso(curso1);

        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getIdCurso());
            gestor.inscribirEstudianteCurso(estudiante2, curso1.getIdCurso());
        } catch (EstudianteYaInscritoException e) {
            e.printStackTrace();
        }
    }
}
