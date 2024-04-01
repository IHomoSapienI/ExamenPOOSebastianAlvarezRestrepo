
public class empleado extends Persona{
	private String departamento;
    private double salario;
    private String fechaContratacion;
	public empleado (String nombre, String direccion, String telefono, String email, String departamento, double salario, String fechaContratacion) {
		super(nombre, direccion, telefono, email);
        if (departamento.equals("Contabilidad") || departamento.equals("Recursos Humanos") || departamento.equals("Compras")) {
            this.departamento = departamento;
        } else {
            this.departamento = "Recursos Humanos";
        }
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento + "\nSalario: " + salario + "\nFecha de contratación: " + fechaContratacion;
    }



}
