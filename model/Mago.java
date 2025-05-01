package model;

public class Mago extends HabilidadesMagicas implements interfaces.Magico, interfaces.Curar {
    
    private int mana;
    private int sabiduria;

    public Mago(String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    void lanzarHechizo() {
        System.out.println("Haz lanzado un hechizo");
    }

    void regenerarMana() {
        System.out.println("Regenerando");
    }

    @Override
    public String toString() {
        return "Mago [mana=" + mana + ", sabiduria=" + sabiduria + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + mana;
        result = prime * result + sabiduria;
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
        Mago other = (Mago) obj;
        if (mana != other.mana)
            return false;
        if (sabiduria != other.sabiduria)
            return false;
        return true;
    }

    @Override
    public void Curable() {
        System.out.println("Se curo con exito");
    }

    @Override
    public void LanzarHechizos() {
        System.out.println("lanzo su poderoso hechizo");
    }
}