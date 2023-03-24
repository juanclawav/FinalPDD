package e3;

public class Twitter implements RedSocial {
    @Override
    public void integracion(SistControl sistemaControl) {

        System.out.println("Twitter");
        System.out.println("Datos sistema de control: ");
        System.out.println("Nombre: " + sistemaControl.getNombre());
        System.out.println("Capacidad: " + sistemaControl.getCapacidad());
        System.out.print("Estudiantes: ");
        for (Estudiante estudiante : sistemaControl.getEstudiantes()) {

            System.out.print(estudiante.getNombre() + "\n");

        }

        System.out.println();
        System.out.println("Requisitos: " + sistemaControl.getRequisitos());
        System.out.println();

    }
}
