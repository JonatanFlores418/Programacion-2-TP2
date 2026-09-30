package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Carrera {
    private double distancia;
    private Atleta ganador;
    private List<Atleta> competidores;

    public Carrera(double distancia) {
        this.distancia = distancia;
        this.competidores = new ArrayList<Atleta>();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Atleta getGanador() {
        return ganador;
    }

    public List<Atleta> getCompetidores() {
        return competidores;
    }

    public void registrarAtleta(Atleta atleta) {
        competidores.add(atleta);
        actualizarGanador();
    }

    public int cantidadAtletas() {
        return competidores.size();
    }

    public void imprimirCompetidores() {
        for (Atleta atleta : competidores) {
            System.out.println(atleta);
        }
    }

    public Atleta determinarGanador() {
        actualizarGanador();
        return ganador;
    }

    public List<Atleta> atletasPorNacionalidad(String nacionalidad) {
        List<Atleta> resultado = new ArrayList<Atleta>();
        for (Atleta atleta : competidores) {
            if (atleta.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                resultado.add(atleta);
            }
        }
        return resultado;
    }

    public void ordenarPorNombre() {
        Collections.sort(competidores, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta a1, Atleta a2) {
                return a1.getNombre().compareToIgnoreCase(a2.getNombre());
            }
        });
    }

    public Atleta primerArgentinoMenor() {
        for (Atleta atleta : competidores) {
            if (atleta.getNacionalidad().equalsIgnoreCase("Argentina")
                    && atleta.esMenorDeEdad()) {
                return atleta;
            }
        }
        return null;
    }

    public Atleta ultimoEnCarrera() {
        if (competidores.isEmpty()) {
            return null;
        }
        Atleta ultimo = competidores.get(0);
        for (Atleta atleta : competidores) {
            if (atleta.getTiempo() > ultimo.getTiempo()) {
                ultimo = atleta;
            }
        }
        return ultimo;
    }

    public boolean existeNacionalidad(String nacionalidad) {
        for (Atleta atleta : competidores) {
            if (atleta.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                return true;
            }
        }
        return false;
    }

    private void actualizarGanador() {
        if (competidores.isEmpty()) {
            ganador = null;
            return;
        }
        ganador = competidores.get(0);
        for (Atleta atleta : competidores) {
            if (atleta.getTiempo() < ganador.getTiempo()) {
                ganador = atleta;
            }
        }
    }
}
