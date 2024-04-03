package example.polimorfismo;

public class Policia implements Usuario {
	
	private String nombre;
	private String profesion;
	
	public Policia(String nombre, String profesion) {
		this.nombre = nombre;
		this.profesion = profesion;
	}

	@Override
	public void mostrarInformacion() {
		// implementacion
		String mensaje = new StringBuilder("Hola mi nombre es ").append(this.nombre)
				.append(" y soy un ").append(this.profesion).toString();
		System.out.println(mensaje);
	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	
}
