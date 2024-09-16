package modelo;

import java.time.LocalDate;

public class Estudiante extends Persona {
    private String estado;  // matriculado, inactivo, graduado

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        super(id, nombre, apellido, fechaDeNacimiento);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}