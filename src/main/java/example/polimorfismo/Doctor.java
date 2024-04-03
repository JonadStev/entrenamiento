package example.polimorfismo;

public class Doctor implements Usuario {
	
	private String nombre;
	private String profesion;
	
	public Doctor(String nombre, String profesion) {
		this.nombre = nombre;
		this.profesion = profesion;
	}
	
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		String mensaje = new StringBuilder("Hola mi nombre es ").append(this.nombre)
				.append(" y soy un ").append(this.profesion).toString();
		System.out.println(mensaje);
	}
	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
