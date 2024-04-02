package example;

public class Docente extends Persona {
	
	private String titulo;
	
	public Docente(String nombres, String apellidos, int edad, String identidad, String titulo) {
		super(nombres,apellidos,edad,identidad);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
}
