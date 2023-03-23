package e1;

public class Zona extends Component {
    public Zona(String nombre, int habitantes, int poa) {
        super(nombre, habitantes, poa);
    }

    @Override
    public void contarPoblacion() {
        System.out.println("Poblacion Zona "+this.getNombre()+": " + this.getHabitantes());
    }

    @Override
    public void add(Component composite) {
    }

    @Override
    public void remove(Component composite) {
    }
}
