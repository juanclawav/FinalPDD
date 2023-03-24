package e3;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Jose", "765432");
        Estudiante e2 = new Estudiante("Paul", "5364276");
        Estudiante e3 = new Estudiante("Samuel", "23252352");
        Estudiante e4 = new Estudiante("Juan", "5665643");
        Estudiante e5 = new Estudiante("Adrian", "555233");

        SistemaEscuela sistemaEscuela = new SistemaEscuela("Aleman", 500,
                new Estudiante[]{e1, e2}, "Promedio mayor a 50");

        SistemaColegio sistemaColegio = new SistemaColegio("SAS", 200,
                new Estudiante[]{e4, e3}, "Minimo promedio 70");

        SistemaUniversidad sistemaUniversidad = new SistemaUniversidad("UPB", 1000,
                new Estudiante[]{e5}, "Plata");


        sistemaEscuela.setRedSocial(new Twitter());
        sistemaColegio.setRedSocial(new Facebook());
        sistemaUniversidad.setRedSocial(new WhatsApp());

        sistemaEscuela.integrarRedSocial();
        sistemaColegio.integrarRedSocial();
        sistemaUniversidad.integrarRedSocial();
    }
}

