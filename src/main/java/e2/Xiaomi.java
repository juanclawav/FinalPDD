package e2;

public class Xiaomi implements Celular {
    int AndroidVersion;
    int MemoriaRam=8;
    int Store;
    int NumeroChips;
    int BuildVersion;
    int costo;

    public Xiaomi(int costo) {
        this.costo = costo;
    }

    @Override
    public void info() {
        System.out.println("Costo celular:"+this.getCosto());
        System.out.println("Ram celular:"+this.getRam());
    }

    public int getRam() {
        return MemoriaRam;
    }

    @Override
    public void setRam(int ram) {
        this.MemoriaRam=MemoriaRam+ram;
    }

    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }
}
