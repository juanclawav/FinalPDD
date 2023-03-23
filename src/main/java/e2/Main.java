package e2;

public class Main {
}
public interface Celular {

    void info();
}
public class Android implements Celular {
    int AndroidVersion;
    int MemoriaRam;
    int Store;
    int NumeroChips;
    int BuildVersion;
    @Override
    public void info() {
        System.out.println("ConcreteComponent > operation");
    }
}
public class Huawei implements Celular {
    int AndroidVersion;
    int MemoriaRam;
    int Store;
    int NumeroChips;
    int BuildVersion;
    @Override
    public void info() {
        System.out.println("ConcreteComponent > operation");
    }
}
public class Xiaomi implements Celular {
    int AndroidVersion;
    int MemoriaRam;
    int Store;
    int NumeroChips;
    int BuildVersion;
    @Override
    public void info() {
        System.out.println("ConcreteComponent > operation");
    }
}
public class funcionalidad implements Celular{
    Celular celular;
    public funcionalidad(Celular celular){
        this.celular=celular;
    }
    @Override
    public void info(){
        System.out.println("ConcreteComponent > operation");
    }
}
public class Ram extends funcionalidad{
    public Ram (Celular celular){ super(celular);}
}
public class Audifonos extends funcionalidad{
    public Ram (Celular celular){ super(celular);}
}
public class Cargador extends funcionalidad{
    public Ram (Celular celular){ super(celular);}
}