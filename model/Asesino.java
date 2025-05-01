import model.CombateFisico;

public class Asesino extends CombateFisico {
    
    int siglo;
    int critico;
    
    public Asesino(String nombre, int nivel, int salud, int siglo, int critico) {
        super(nombre, nivel, salud);
        this.siglo = siglo;
        this.critico = critico;
    }

    public int getSiglo() {
        return siglo;
    }

    public void setSiglo(int siglo) {
        this.siglo = siglo;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    void atacarPorLaEspalda() {
        System.out.println("Has atacado a alguien que estaba de espaldas");
    }

    void ocultar() {
        System.out.println("Te has escondido");
    }

    @Override
    public String toString() {
        return "Asesino [siglo=" + siglo + ", critico=" + critico + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + siglo;
        result = prime * result + critico;
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
        Asesino other = (Asesino) obj;
        if (siglo != other.siglo)
            return false;
        if (critico != other.critico)
            return false;
        return true;
    }

    
}
