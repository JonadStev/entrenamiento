package example;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("** Bienvenido a la adminstracion estudiantes docentes ***");
		
		Docente docente1 = new Docente("Carlos","Gomez",29,"Docente","Ing matemático");
		
		Estudiante estudiante = new Estudiante();
		
		estudiante.setNombres("Steven");
		estudiante.setApellidos("Burgos");
		estudiante.setEdad(15);
		estudiante.setCurso("1A");
		estudiante.setIdentidad(PersonaConst.IDENTIDAD_ESTUDIANTE);
		
		docente1.presentar();
		
		estudiante.presentar();
		
		boolean esDocente = docente1.esEstudiante(PersonaConst.IDENTIDAD_DOCENTE);
		System.out.println(esDocente);
		
	}

}
