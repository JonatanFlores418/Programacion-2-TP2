package ejercicio2;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion = -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void marcarVisto() {
        this.visto = true;
    }

    public boolean ingresarCalificacion(int valor) {
        if (valor < 1 || valor > 5) {
            System.out.println("Calificacion invalida. Debe ser un valor entre 1 y 5.");
            return false;
        }
        this.visto = true;
        this.calificacion = valor;
        return true;
    }

    @Override
    public String toString() {
        return titulo + " | visto=" + visto + " | calificacion=" + calificacion;
    }
}
