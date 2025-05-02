package main;
import model.*;
import vista.*;



public class main {

    public static void main (String [] args){

        Arquero arquero = new Arquero("ermegildo", 5,30,20,15);
        Asesino asesino = new Asesino("Astarion",7,40,45,50);
        Guerrero guerrero= new Guerrero("Tomacho", 8,60,30,35,15);
        Mago mago = new Mago("Aragdor", 6,31,30,40);
        Hechicero hechicero = new Hechicero("Minthara", 9,38,40,35);

        juego.agregarPersonaje(arquero);
        juego.agregarPersonaje(asesino);
        juego.agregarPersonaje(guerrero);
        juego.agregarPersonaje(mago);
        juego.agregarPersonaje(hechicero);

        System.out.println("Bienvenido a D&D estos son los personajes disponibles");
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");

       juego.mostrarAcciones();


        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
    }



}
