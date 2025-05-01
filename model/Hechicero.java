import java.security.Permission;

public class Hechicero extends Personaje {
    
    int mana;
    int concentracion;
    
    public Hechicero(String nombre, int nivel, int salud, int mana, int concentracion) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.concentracion = concentracion;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(int concentracion) {
        this.concentracion = concentracion;
    }

    void invocarEntidad() {
        System.out.println("Has invocado una nueva entidad");
    }

    void defender() {
        System.out.println("Has esquivado el ataque");
    }

    @Override
    public String toString() {
        return "Hechicero [mana=" + mana + ", concentracion=" + concentracion + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + mana;
        result = prime * result + concentracion;
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
        Hechicero other = (Hechicero) obj;
        if (mana != other.mana)
            return false;
        if (concentracion != other.concentracion)
            return false;
        return true;
    }

    
}