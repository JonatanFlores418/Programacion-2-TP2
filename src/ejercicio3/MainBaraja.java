package ejercicio3;

import java.util.List;

public class MainBaraja {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();

        System.out.println("=== BARAJA ESPANOLA ===");
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        baraja.barajar();
        System.out.println("\nSe barajo el mazo.");

        Carta extraida = baraja.extraerCarta();
        System.out.println("Carta extraida al azar: " + extraida);
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("\n--- Dar 5 cartas ---");
        List<Carta> mano = baraja.darCartas(5);
        if (mano != null) {
            for (Carta carta : mano) {
                System.out.println(carta);
            }
        }

        System.out.println("\nIntento dar 50 cartas:");
        baraja.darCartas(50);

        System.out.println("\n--- Cartas del monton ---");
        baraja.cartasMonton();

        System.out.println("\n--- Cartas que quedan en la baraja ---");
        System.out.println("Disponibles: " + baraja.cartasDisponibles());
        baraja.mostrarBaraja();

        baraja.restablecerBaraja();
        System.out.println("\nBaraja restablecida. Cartas disponibles: " + baraja.cartasDisponibles());
    }
}
