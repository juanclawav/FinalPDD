package e1;

public abstract class Component {
    private int habitantes;
    private String nombre;
    private int poa;

    public Component(String nombre, int habitantes, int poa) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.poa = poa;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoa() {
        return poa;
    }

    public void setPoa(int poa) {
        this.poa = poa;
    }

    public abstract void contarPoblacion();

    public abstract void add(Component composite);

    public abstract void remove(Component composite);
}
