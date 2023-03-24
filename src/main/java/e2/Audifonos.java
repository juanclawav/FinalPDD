package e2;

public class Audifonos extends funcionalidad {
    int costo;
    String marca;

    public Audifonos(Celular celular, int costo) {
        super(celular,costo);
    }

    @Override
    public void info() {
        celular.setCosto(celular.getCosto() + this.getCosto());
        celular.info();
    }

    public int getCosto() {
        return costo;
    }
}
