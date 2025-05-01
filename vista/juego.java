package vista;
import model.*;

import java.util.ArrayList;

public class juego {

    public ArrayList<Personaje> personajes = new ArrayList<>();

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

    public void mostrarAcciones() {
        for (Personaje p : personajes) {
            System.out.println("" + p);
            p.atacar();

            if (p instanceof Curable) ((Curable) p).curar();
            if (p instanceof Volador) ((Volador) p).volar();
            if (p instanceof Magico) ((Magico) p).lanzarHechizo();
            if (p instanceof Defendible) ((Defendible) p).defender();
            if (p instanceof Movilizable) ((Movilizable) p).moverse();
        }
    }
}