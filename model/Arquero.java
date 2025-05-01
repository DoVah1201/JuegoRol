package model;

public class Arquero extends CombateFisico implements interfaces.Moverse, interfaces.Volar {
    
    int agilidad;
    int numFlechas;
    
    public Arquero(String nombre, int nivel, int salud, int agilidad, int numFlechas) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    public void setNumFlechas(int numFlechas) {
        this.numFlechas = numFlechas;
    }

    void dispararFlecha() {
        System.out.println("Has lanzado una flecha");
    }

    void reabastecerFlechas() {
        System.out.println("Comprando flechas");
    }

    @Override
    public String toString() {
        return "Arquero [agilidad=" + agilidad + ", numFlechas=" + numFlechas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + agilidad;
        result = prime * result + numFlechas;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Arquero other = (Arquero) obj;
        if (agilidad != other.agilidad)
            return false;
        if (numFlechas != other.numFlechas)
            return false;
        return true;
    }

    @Override
    public void VolarAlto() {
        System.out.println("Alzo el vuelo sin problemas");
    }

    @Override
    public void Movilizable() {
        System.out.println("Se movilizo al punto deseado");
    }
}