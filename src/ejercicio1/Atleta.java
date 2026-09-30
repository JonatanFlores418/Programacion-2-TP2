package ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Atleta {
    private String nombre;
    private int numero;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private double tiempo;

    public Atleta(String nombre, int numero, String nacionalidad,
                  LocalDate fechaNacimiento, double tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esMenorDeEdad() {
        return getEdad() < 18;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + getEdad() +
                ", tiempo=" + tiempo +
                '}';
    }
}
