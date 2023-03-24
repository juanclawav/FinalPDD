package e3;

public class WhatsApp implements RedSocial {
    @Override
    public void integracion(SistControl sistemaControl) {

        System.out.println(" WhatsApp");
        System.out.println("Datos: ");
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
