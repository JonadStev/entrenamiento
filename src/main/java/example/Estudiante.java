package example;

public class Estudiante extends Persona {
	
	private String curso;
	
	public Estudiante(String nombres, String apellidos, int edad, String identidad, String curso) {
		super(nombres,apellidos,edad,identidad);
		this.curso = curso;
	}
	
	public Estudiante() {
		super();
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}	
	
}
