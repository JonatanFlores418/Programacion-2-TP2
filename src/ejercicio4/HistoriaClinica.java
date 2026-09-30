package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class HistoriaClinica {
    private int numero;
    private Paciente paciente;
    private List<Enfermedad> enfermedades;

    public HistoriaClinica(int numero, Paciente paciente) {
        this.numero = numero;
        this.paciente = paciente;
        this.enfermedades = new ArrayList<Enfermedad>();
    }

    public int getNumero() {
        return numero;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void registrarEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------HISTORIA CLINICA--------------------------------\n");
        sb.append("Nro: ").append(numero).append("\n");
        sb.append(paciente).append("\n");
        if (enfermedades.isEmpty()) {
            sb.append("Sin enfermedades registradas.\n");
        } else {
            sb.append("Enfermedades:\n");
            for (Enfermedad enfermedad : enfermedades) {
                sb.append(enfermedad).append("\n");
            }
        }
        sb.append("---------------------------------------------------------------");
        return sb.toString();
    }
}
