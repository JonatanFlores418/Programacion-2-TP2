package ejercicio1;

import java.time.LocalDate;
import java.util.List;

public class MainCarrera {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(100);

        carrera.registrarAtleta(new Atleta("Lucia Perez", 1, "Argentina",
                LocalDate.of(2010, 5, 12), 12.80));
        carrera.registrarAtleta(new Atleta("Juan Gomez", 2, "Uruguay",
                LocalDate.of(1999, 3, 21), 11.20));
        carrera.registrarAtleta(new Atleta("Ana Silva", 3, "Uruguay",
                LocalDate.of(2001, 8, 4), 11.45));
        carrera.registrarAtleta(new Atleta("Pedro Diaz", 4, "Argentina",
                LocalDate.of(1998, 1, 30), 10.95));
        carrera.registrarAtleta(new Atleta("Carlos Ruiz", 5, "Chile",
                LocalDate.of(2000, 11, 9), 13.10));

        System.out.println("=== CARRERA DE VELOCIDAD ===");
        System.out.println("Distancia: " + carrera.getDistancia() + " m");
        System.out.println("Cantidad de atletas: " + carrera.cantidadAtletas());

        System.out.println("\n--- Competidores ---");
        carrera.imprimirCompetidores();

        Atleta ganador = carrera.determinarGanador();
        System.out.println("\n--- Ganador ---");
        System.out.println(ganador);
        System.out.println("Tiempo: " + ganador.getTiempo());

        List<Atleta> uruguayos = carrera.atletasPorNacionalidad("Uruguay");
        System.out.println("\n--- Atletas uruguayos: " + uruguayos.size() + " ---");
        for (Atleta atleta : uruguayos) {
            System.out.println(atleta);
        }

        carrera.ordenarPorNombre();
        System.out.println("\n--- Ordenados por nombre ---");
        carrera.imprimirCompetidores();

        Atleta menorArgentino = carrera.primerArgentinoMenor();
        System.out.println("\n--- Primer atleta argentino menor de edad ---");
        if (menorArgentino != null) {
            System.out.println(menorArgentino);
        } else {
            System.out.println("No hay atletas argentinos menores de edad.");
        }

        Atleta ultimo = carrera.ultimoEnCarrera();
        System.out.println("\n--- Ultimo en la carrera ---");
        System.out.println(ultimo);

        System.out.println("\n--- Existe atleta peruano? ---");
        System.out.println(carrera.existeNacionalidad("Peru") ? "Si" : "No");
    }
}
