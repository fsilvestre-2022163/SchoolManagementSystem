package gestorAcademico;

import java.time.LocalDate;

public class Estudiante {
    private Long idEstudiante;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private Estado estado;

    // Constructor por defecto
    public Estudiante() {}

    // Constructor con parámetros
    public Estudiante(Long idEstudiante, String nombre, String apellido, LocalDate fechaDeNacimiento, Estado estado) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    // Getters y Setters
    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // Método toString para una representación en cadena del objeto
    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante=" + idEstudiante +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", estado=" + estado +
                '}';
    }

    // Enumeración para los posibles estados del estudiante
    public enum Estado {
        MATRICULADO,
        INACTIVO,
        GRADUADO
    }
}
