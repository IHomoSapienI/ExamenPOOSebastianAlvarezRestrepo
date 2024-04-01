
public class Estudiante extends Persona {
	 private int estado;

	    public Estudiante (String nombre, String direccion, String telefono, String email, int estado) {
	        super(nombre, direccion, telefono, email);
	        if (estado >= 1 && estado <= 4) {
	            this.estado = estado;
	        } else {
	            this.estado = 1;
	        }
	    }
	    
	    public String toString() {
	        return super.toString() + "\nEstado: " + estado;
	    }
	}


