package ejercicio4;

import java.time.LocalDate;

public class MainClinica {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Clinica San Martin");

        Paciente p1 = new Paciente("40111222", "Maria Lopez", "3884123456",
                LocalDate.of(1995, 4, 10));
        Paciente p2 = new Paciente("38777666", "Diego Torres", "3884987654",
                LocalDate.of(1988, 9, 2));

        clinica.agregarHistoriaClinica(p1);
        clinica.agregarHistoriaClinica(p2);

        System.out.println("=== HISTORIA CLINICA ===");
        System.out.println("Clinica: " + clinica.getNombre());
        System.out.println("Historias cargadas: " + clinica.cantidadHistorias());

        clinica.registrarEnfermedad("40111222",
                new Enfermedad("Gripe", "Fiebre y tos", "Reposo y analgesicos"));
        clinica.registrarEnfermedad("40111222",
                new Enfermedad("Gastritis", "Dolor de estomago", "Dieta blanda"));

        System.out.println("\nHistoria de Maria Lopez:");
        clinica.imprimirHistoria("40111222");

        System.out.println("\nSe elimina la historia de Diego Torres.");
        clinica.eliminarHistoria("38777666");
        System.out.println("Historias restantes: " + clinica.cantidadHistorias());

        System.out.println("\nBusqueda de historia eliminada:");
        clinica.imprimirHistoria("38777666");
    }
}
