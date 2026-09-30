package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<Temporada>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public Temporada getTemporada(int numero) {
        for (Temporada temporada : temporadas) {
            if (temporada.getNumero() == numero) {
                return temporada;
            }
        }
        return null;
    }

    public boolean ingresarCalificacion(int nroTemporada, String tituloEpisodio, int valor) {
        Temporada temporada = getTemporada(nroTemporada);
        if (temporada == null) {
            System.out.println("No existe la temporada " + nroTemporada);
            return false;
        }
        Episodio episodio = temporada.buscarEpisodio(tituloEpisodio);
        if (episodio == null) {
            System.out.println("No existe el episodio: " + tituloEpisodio);
            return false;
        }
        return episodio.ingresarCalificacion(valor);
    }

    public int totalEpisodiosVistosTemporada(int nroTemporada) {
        Temporada temporada = getTemporada(nroTemporada);
        if (temporada == null) {
            return 0;
        }
        return temporada.totalEpisodiosVistos();
    }

    public int totalEpisodiosVistos() {
        int total = 0;
        for (Temporada temporada : temporadas) {
            total += temporada.totalEpisodiosVistos();
        }
        return total;
    }

    public double promedioTemporada(int nroTemporada) {
        Temporada temporada = getTemporada(nroTemporada);
        if (temporada == null) {
            return 0;
        }
        return temporada.promedioCalificaciones();
    }

    public double promedioSerie() {
        int suma = 0;
        int cantidad = 0;
        for (Temporada temporada : temporadas) {
            for (Episodio episodio : temporada.getEpisodios()) {
                if (episodio.isVisto() && episodio.getCalificacion() > 0) {
                    suma += episodio.getCalificacion();
                    cantidad++;
                }
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return (double) suma / cantidad;
    }

    public boolean vioTodosLosEpisodios() {
        if (temporadas.isEmpty()) {
            return false;
        }
        for (Temporada temporada : temporadas) {
            if (!temporada.todosVistos()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ") - Creador: " + creador;
    }
}
