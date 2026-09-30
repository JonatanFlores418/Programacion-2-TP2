package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    private List<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<Episodio>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public Episodio buscarEpisodio(String titulo) {
        for (Episodio episodio : episodios) {
            if (episodio.getTitulo().equalsIgnoreCase(titulo)) {
                return episodio;
            }
        }
        return null;
    }

    public int totalEpisodiosVistos() {
        int total = 0;
        for (Episodio episodio : episodios) {
            if (episodio.isVisto()) {
                total++;
            }
        }
        return total;
    }

    public double promedioCalificaciones() {
        int suma = 0;
        int cantidad = 0;
        for (Episodio episodio : episodios) {
            if (episodio.isVisto() && episodio.getCalificacion() > 0) {
                suma += episodio.getCalificacion();
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return (double) suma / cantidad;
    }

    public boolean todosVistos() {
        if (episodios.isEmpty()) {
            return false;
        }
        for (Episodio episodio : episodios) {
            if (!episodio.isVisto()) {
                return false;
            }
        }
        return true;
    }

    public int cantidadEpisodios() {
        return episodios.size();
    }
}
