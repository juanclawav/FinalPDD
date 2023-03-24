package e2;

public class Main {
    public static void main(String [] args){
        Celular celuXiaomi = new Xiaomi(300);
        celuXiaomi= new Cargador(celuXiaomi,60);
        celuXiaomi= new Ram(celuXiaomi,60);
        celuXiaomi.info();
    }
}

