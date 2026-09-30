package ejercicio4;

import java.time.LocalDate;

public class Paciente {
    private String dni;
    private String nombre;
    private String telefono;
    private LocalDate fechaNacimiento;

    public Paciente(String dni, String nombre, String telefono, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre
                + " | DNI: " + dni
                + " | Telefono: " + telefono
                + " | Nacimiento: " + fechaNacimiento;
    }
}
