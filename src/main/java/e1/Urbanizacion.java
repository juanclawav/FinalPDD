package e1;

import java.util.ArrayList;
import java.util.List;

public class Urbanizacion extends Component {

    private
    List<Component> componentList = new ArrayList<>();

    public Urbanizacion(String nombre, int poa) {
        super(nombre, 0, poa);
    }

    @Override
    public void contarPoblacion() {
        System.out.println(this.getNombre() + " poblacion: ");
        for (Component component : componentList) {
            component.contarPoblacion();
        }
        System.out.println("Poblacion total: " + this.getHabitantes());
    }

    @Override
    public void add(Component composite) {
        componentList.add(composite);
        this.setHabitantes(this.getHabitantes() + composite.getHabitantes());
    }

    @Override
    public void remove(Component composite) {
        componentList.remove(composite);
    }

}
