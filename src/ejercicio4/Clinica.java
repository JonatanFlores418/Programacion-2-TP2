package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nombre;
    private List<HistoriaClinica> historias;
    private int proximoNumero;

    public Clinica(String nombre) {
        this.nombre = nombre;
        this.historias = new ArrayList<HistoriaClinica>();
        this.proximoNumero = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public HistoriaClinica agregarHistoriaClinica(Paciente paciente) {
        HistoriaClinica historia = new HistoriaClinica(proximoNumero, paciente);
        historias.add(historia);
        proximoNumero++;
        return historia;
    }

    public HistoriaClinica buscarPorDni(String dni) {
        for (HistoriaClinica historia : historias) {
            if (historia.getPaciente().getDni().equals(dni)) {
                return historia;
            }
        }
        return null;
    }

    public boolean registrarEnfermedad(String dni, Enfermedad enfermedad) {
        HistoriaClinica historia = buscarPorDni(dni);
        if (historia == null) {
            System.out.println("No existe historia clinica para el DNI " + dni);
            return false;
        }
        historia.registrarEnfermedad(enfermedad);
        return true;
    }

    public boolean eliminarHistoria(String dni) {
        HistoriaClinica historia = buscarPorDni(dni);
        if (historia == null) {
            System.out.println("No existe historia clinica para el DNI " + dni);
            return false;
        }
        historias.remove(historia);
        return true;
    }

    public void imprimirHistoria(String dni) {
        HistoriaClinica historia = buscarPorDni(dni);
        if (historia == null) {
            System.out.println("No existe historia clinica para el DNI " + dni);
            return;
        }
        System.out.println(historia.toString());
    }

    public int cantidadHistorias() {
        return historias.size();
    }
}
