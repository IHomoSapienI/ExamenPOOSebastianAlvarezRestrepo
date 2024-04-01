import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionEstudiante = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEstudiante = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String emailEstudiante = scanner.nextLine();
        System.out.print("Estado (1, 2, 3 o 4): ");
        int estadoEstudiante = scanner.nextInt();

        System.out.println("\nIngrese los datos del empleado:");
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionEmpleado = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEmpleado = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String emailEmpleado = scanner.nextLine();
        System.out.print("Departamento (Contabilidad, Recursos Humanos o Compras): ");
        String departamentoEmpleado = scanner.nextLine();
        System.out.print("Salario: ");
        double salarioEmpleado = scanner.nextDouble();
        System.out.print("Fecha de contratación: ");
        String fechaContratacionEmpleado = scanner.next();

        Estudiante estudiante = new Estudiante(nombreEstudiante, direccionEstudiante, telefonoEstudiante, emailEstudiante, estadoEstudiante);
        empleado empleado = new empleado(nombreEmpleado, direccionEmpleado, telefonoEmpleado, emailEmpleado, departamentoEmpleado, salarioEmpleado, fechaContratacionEmpleado);

        System.out.println("\nDatos del estudiante:");
        System.out.println(estudiante.toString());

        System.out.println("\nDatos del empleado:");
        System.out.println(empleado.toString());

        scanner.close();

	}

}
