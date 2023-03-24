package e2;

public class Cargador extends funcionalidad {

    int costo;
    String marca;
    String tamano;

    public Cargador(Celular celular, int costo) {
        super(celular,costo);
        celular.setCosto(celular.getCosto() + this.getCosto());
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
