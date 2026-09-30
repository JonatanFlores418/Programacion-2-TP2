package ejercicio4;

public class Enfermedad {
    private String nombre;
    private String sintomas;
    private String tratamientos;

    public Enfermedad(String nombre, String sintomas, String tratamientos) {
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.tratamientos = tratamientos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    @Override
    public String toString() {
        return "Enfermedad: " + nombre
                + "\n  Sintomas: " + sintomas
                + "\n  Tratamientos: " + tratamientos;
    }
}
