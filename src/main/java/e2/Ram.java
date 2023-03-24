package e2;

public class Ram extends funcionalidad {
    int capacidad=2;
    String marca;
    int costo;

    public Ram(Celular celular, int costo) {
        super(celular,costo);
        celular.setRam(this.capacidad+celular.getRam());
        celular.setCosto(celular.getCosto() + this.getCosto());
    }

    @Override
    public void info() {
        celular.info();
    }

    public int getCosto() {
        return costo;
    }
}
