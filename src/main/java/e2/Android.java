package e2;

public class Android implements Celular {
    int AndroidVersion;
    int MemoriaRam;
    int Store;
    int NumeroChips;
    int BuildVersion;
    int costo;

    public Android(int costo) {
        this.costo = costo;
    }

    @Override
    public void info() {
        System.out.println("Informacion del celular:");

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
