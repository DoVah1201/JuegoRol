package model;

public class Arquero extends CombateFisico {
    
    int habilidad;
    int numFlechas;
    
    public Arquero(String nombre, int nivel, int salud, int habilidad, int numFlechas) {
        super(nombre, nivel, salud);
        this.habilidad = habilidad;
        this.numFlechas = numFlechas;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
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
        return "Arquero [habilidad=" + habilidad + ", numFlechas=" + numFlechas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + habilidad;
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
        if (habilidad != other.habilidad)
            return false;
        if (numFlechas != other.numFlechas)
            return false;
        return true;
    }

    
}