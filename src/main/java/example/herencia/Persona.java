package example.herencia;

import example.constantes.PersonaConst;

public class Persona {
	
	private String nombres;
	private String apellidos;
	private int edad;
	private String identidad;
	
	public Persona(String nombres, String apellidos, int edad, String identidad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.identidad = identidad;
	}

	public Persona() {
	}
	
	public void presentar() {
		boolean definicion = this.esEstudiante(this.identidad);
		
		String definirIdentidad = PersonaConst.IDENTIDAD_DOCENTE;
		
		if(definicion)
			definirIdentidad = PersonaConst.IDENTIDAD_ESTUDIANTE_PRIMARIO;
		
		String presentacion = new StringBuilder("Hola mi nombre es ").append(this.nombres)
				.append(" ").append(this.apellidos).append(" y soy un ")
				.append(definirIdentidad).toString();
		System.out.println(presentacion);
	}
	
	public boolean esEstudiante(String descripcion) {
		if (descripcion == PersonaConst.IDENTIDAD_ESTUDIANTE)
			return true;
		else
			return false;
	}
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}
	
}
