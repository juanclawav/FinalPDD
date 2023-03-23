package e1;


public class Main {

    public static void main(String []args){
        Zona z1 = new Zona("zona 1",69,1200);
        Zona z2 = new Zona("zona 2",423,13555);
        Zona z3 = new Zona("zona 3",234,100000);
        Zona z4 = new Zona("zona 4",987,0);
        Zona z5 = new Zona("zona 5",1234,8640);
        Zona z6 = new Zona("zona 6",2355,66500);

       Urbanizacion u1 = new Urbanizacion("Urb 1",)

    }
}

public abstract class Component {
    private int habitantes;
    private String nombre;
    private int poa;

    public Component(String nombre, int habitantes, int poa) {
        this.nombre=nombre;
        this.habitantes=habitantes;
        this.poa=poa;
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

    public int getPoa(){ return poa;}
    public void setPoa(int poa){ this.poa=poa;}

    public abstract void contarPoblacion();
    public abstract void add(Component composite);
    public abstract void remove(Component composite);
}

public class Zona extends Component{
    public Zona (String nombre, int habitantes, int poa) {
        super(nombre,habitantes,poa);
    }

    @Override
    public void contarPoblacion() {
        System.out.println("Poblacion: "+this.getHabitantes());
    }
    @Override
    public void add(Component composite) {
    }

    @Override
    public void remove(Component composite) {
    }
}
public class Urbanizacion extends Component{

    private List<Component> componentList = new ArrayList<>();

    public Urbanizacion(String nombre,int poa) {
        super(nombre,0,poa);
    }
    @Override
    public void contarPoblacion() {

        for (Component component:componentList) {
            this.setHabitantes(this.getHabitantes()+component.getHabitantes());
            component.contarPoblacion();
        }
        System.out.println("Poblacion total: "+this.getHabitantes());
    }

    @Override
    public void add(Component composite) {
        componentList.add(composite);
    }

    @Override
    public void remove(Component composite) {
        componentList.remove(composite);
    }

}
