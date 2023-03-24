package e2;

public class funcionalidad implements Celular {
    Celular celular;
    int costo;

    public funcionalidad(Celular celular, int costo) {
        this.celular = celular;
        this.costo = costo;
        celular.setCosto(this.getCosto()+celular.getCosto());
    }

    @Override
    public void info() {
        System.out.println("ConcreteComponent > operation");
    }

    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public int getRam() {
        return 0;
    }

    @Override
    public void setRam(int ram) {

    }
}
