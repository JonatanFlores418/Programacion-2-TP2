package ejercicio2;

public class MainSeries {
    public static void main(String[] args) {
        Serie serie = new Serie(
                "Breaking Bad",
                "Un profesor de quimica se convierte en fabricante de metanfetamina.",
                "Vince Gilligan",
                "Drama");

        Temporada t1 = new Temporada(1);
        t1.agregarEpisodio(new Episodio("Piloto", "Walter White recibe un diagnostico."));
        t1.agregarEpisodio(new Episodio("El gato en la bolsa", "Jesse y Walter retienen a Krazy-8."));
        t1.agregarEpisodio(new Episodio("Y la bolsa en el rio", "Walter decide que hacer."));

        Temporada t2 = new Temporada(2);
        t2.agregarEpisodio(new Episodio("Siete treinta y siete", "Las consecuencias aparecen."));
        t2.agregarEpisodio(new Episodio("Grilled", "Tuco retiene a Walter y Jesse."));

        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);

        System.out.println("=== SERIES ===");
        System.out.println(serie);

        serie.ingresarCalificacion(1, "Piloto", 5);
        serie.ingresarCalificacion(1, "El gato en la bolsa", 4);
        serie.ingresarCalificacion(1, "Y la bolsa en el rio", 8);
        serie.ingresarCalificacion(2, "Siete treinta y siete", 5);

        System.out.println("\nEpisodios vistos temporada 1: " + serie.totalEpisodiosVistosTemporada(1));
        System.out.println("Episodios vistos de la serie: " + serie.totalEpisodiosVistos());
        System.out.println("Promedio temporada 1: " + serie.promedioTemporada(1));
        System.out.println("Promedio de la serie: " + serie.promedioSerie());
        System.out.println("Vio todos los episodios? " + (serie.vioTodosLosEpisodios() ? "Si" : "No"));
    }
}
