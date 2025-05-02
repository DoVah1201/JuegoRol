package vista;
import model.*;

import java.util.ArrayList;

public class juego {

    public static ArrayList<Personaje> personajes = new ArrayList<>();

    public static void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

    public static void mostrarAcciones() {
        for (Personaje p : personajes) {
            System.out.println("===========================================");
            System.out.println("" + p);
            System.out.println("===========================================");
            p.atacar();

            if (p instanceof interfaces.Curar) ((interfaces.Curar) p).Curable();
            if (p instanceof interfaces.Volar) ((interfaces.Volar) p).VolarAlto();
            if (p instanceof interfaces.Magico) ((interfaces.Magico) p).LanzarHechizos();
            if (p instanceof interfaces.Defender) ((interfaces.Defender) p).Defendible();
            if (p instanceof interfaces.Moverse) ((interfaces.Moverse) p).Movilizable();
        }
    }


}