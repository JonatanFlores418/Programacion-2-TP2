package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Baraja {
    private List<Carta> cartas;
    private List<Carta> monton;
    private Random random;

    public Baraja() {
        this.random = new Random();
        crearBaraja();
    }

    public void crearBaraja() {
        cartas = new ArrayList<Carta>();
        monton = new ArrayList<Carta>();
        String[] palos = {"oro", "basto", "espada", "copa"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String palo : palos) {
            for (int numero : numeros) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public Carta extraerCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en la baraja.");
            return null;
        }
        int posicion = random.nextInt(cartas.size());
        Carta carta = cartas.remove(posicion);
        monton.add(carta);
        return carta;
    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas. Pedidas: "
                    + cantidad + ", disponibles: " + cartas.size());
            return null;
        }
        List<Carta> dadas = new ArrayList<Carta>();
        for (int i = 0; i < cantidad; i++) {
            dadas.add(extraerCarta());
        }
        return dadas;
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas disponibles en la baraja.");
            return;
        }
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("Todavia no salio ninguna carta.");
            return;
        }
        for (Carta carta : monton) {
            System.out.println(carta);
        }
    }

    public void restablecerBaraja() {
        crearBaraja();
    }
}
