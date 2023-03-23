package e1;


public class Main {

    public static void main(String []args){
        Zona z1 = new Zona("zona 1",69,1200);
        Zona z2 = new Zona("zona 2",423,13555);
        Zona z3 = new Zona("zona 3",234,100000);
        Zona z4 = new Zona("zona 4",987,0);
        Zona z5 = new Zona("zona 5",1234,8640);
        Zona z6 = new Zona("zona 6",2355,66500);

        Urbanizacion u1 = new Urbanizacion("Urb 1",9000000);
        u1.add(z1);
        u1.add(z2);
        Urbanizacion u2 = new Urbanizacion("Urb 2",67564000);
        u2.add(z3);
        u2.add(z4);
        Urbanizacion u3 = new Urbanizacion("Urb 3",34556650);
        u3.add(z5);
        u3.add(z6);
        Urbanizacion ciudad1 = new Urbanizacion("ciudad 1",876545676);
        ciudad1.add(u1);
        ciudad1.add(u2);
        z1.contarPoblacion();
        u1.contarPoblacion();
        ciudad1.contarPoblacion();

    }
}

