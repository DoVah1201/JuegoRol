package model;

abstract class personaje {

    protected String nombre;
    protected int nivel;
    protected int salud;

    abstract void atacar();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }



    @Override
    public String toString() {
        return "personaje: " + nombre + "nivel: " + nivel + "salud: " + salud;
    }

    //falta clases personalizadas equals() y HashCode() ademas de terminar con las clases de los personajes

}

public class clases {

    class fisico {
    
       void accionfis(){
           System.out.println("blande su arma");
       }
        
    }

    class magico {
    
       void accionmagi() {
           System.out.println("prepara su hechizo");
       }
        
    }

    class guerrero extends fisico {
    
        

    }

    class mago extends magico {

        

    }
    
    class asesino extends fisico {



    }



}

