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
    public void Curable() {
        System.out.println("Se curo con exito");
    }

    @Override
    public void LanzarHechizos() {
        System.out.println("lanzo su poderoso hechizo");
    }
}