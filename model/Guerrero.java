package model;

public class Guerrero extends CombateFisico implements interfaces.Defender {
    
    private int fuerza;
    private int armadura;
    private int escudo;
    
    public Guerrero(String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    void cargarAtaque() {
        System.out.println("Estas cargando el ataque");
    }
    
    void defender() {
        System.out.println("Has esquivado el ataque");
    }

    @Override
    public String toString() {
        return "Guerrero [fuerza=" + fuerza + ", armadura=" + armadura + ", escudo=" + escudo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + fuerza;
        result = prime * result + armadura;
        result = prime * result + escudo;
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
        Guerrero other = (Guerrero) obj;
        if (fuerza != other.fuerza)
            return false;
        if (armadura != other.armadura)
            return false;
        if (escudo != other.escudo)
            return false;
        return true;
    }

    public void Defendible() {
        System.out.println("Se defendio con exito!!");
    }

}