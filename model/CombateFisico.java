package model;

public class CombateFisico extends Personaje {
    
    private String nombre;
    private int nivel;
    private int salud;

    CombateFisico() {
    }

    CombateFisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        System.out.println("");
    }

    public void atacar() {
        System.out.println("El rival recibio daño");
    }

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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + nivel;
        result = prime * result + salud;
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
        CombateFisico other = (CombateFisico) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (nivel != other.nivel)
            return false;
        if (salud != other.salud)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CombateFisico [nombre=" + nombre + ", nivel=" + nivel + ", salud=" + salud + "]";
    }

    
}