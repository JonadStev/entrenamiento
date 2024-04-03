package example;

import java.util.Iterator;

import example.constantes.PersonaConst;
import example.herencia.Docente;
import example.herencia.Estudiante;
import example.polimorfismo.Animal;
import example.polimorfismo.Circulo;
import example.polimorfismo.Cuadrado;
import example.polimorfismo.Doctor;
import example.polimorfismo.Figura;
import example.polimorfismo.Gato;
import example.polimorfismo.Perro;
import example.polimorfismo.Policia;
import example.polimorfismo.Usuario;

public class MainClass {

	public static void main(String[] args) {
		/*
		System.out.println("*** POLIMORFISMO CON ANIMALES ***");
		
		Animal animalUno = new Perro();
		Animal animalDos = new Gato();
		Animal animalTres = new Gato();
		
		animalDos.hacerRuido();
		animalTres.hacerRuido();
			
		animalTres = animalUno;
		animalTres.hacerRuido();
		
		System.out.println("*** POLIMORFISMO CON FIGURAS ***");
		
		Figura figuraUno = new Cuadrado("rojo", 4);
		Figura figuraDos = new Circulo("verde", 5.6);
		
		figuraUno.mostrarColor();
		figuraDos.mostrarColor();
		System.out.println(new StringBuilder("El area de la figura es: ").append(figuraUno.calcularArea()));
		System.out.println(new StringBuilder("El area de la figura es: ").append(figuraDos.calcularArea()));
		figuraUno = figuraDos;
		System.out.println("*******");
		figuraUno.mostrarColor();
		System.out.println(new StringBuilder("El area de la figura es: ").append(figuraUno.calcularArea()));
		
		
		System.out.println("*** POLIMORFISMO CON INTERFACES ***");
		
		Usuario usuarioUno = new Policia("Steven", "Policia metropolitano");
		Usuario usuarioDos = new Doctor("Jonathan", "Doctor cirujano");
		
		usuarioUno.mostrarInformacion();
		usuarioDos.mostrarInformacion();
		
		usuarioUno = new Doctor("Steven", "Doctor cirujano");
		usuarioUno.mostrarInformacion();
		
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
		System.out.println(esDocente);*/
		
		if(true) {
			System.out.println("SE cumplio la condicion");
		}
		
		int numero = 1;
		
		if (numero == 0) {
			System.out.println("El numero no puede ser cero");
		}else {
			System.out.println("El numero es mayor a cero");
		}
		
		int[] numerosEnteros = {2,1,3,4,1};
		double[] numerosFlotantes = {2,1,3,4,1};
		String[] cadenas = {"Activo","Pendiente","Anulado"};
		
		Docente[] listaDocente = new Docente[5]; 
		
		listaDocente[0] = new Docente("Steven ","Burgos", 29, "Docente", "titulo");
		listaDocente[1] = new Docente("joanthan ","Burgos", 29, "Docente", "titulo");
		listaDocente[2] = new Docente("CArlos ","Burgos", 29, "Docente", "titulo");
		listaDocente[3] = new Docente("juan ","Burgos", 29, "Docente", "titulo");
		listaDocente[4] = new Docente("Jose ","Burgos", 29, "Docente", "titulo");
		
		//llenar la lista de docentes
		/*for (int i = 0; i < listaDocente.length; i++) {
			listaDocente[i] = new Docente("Steven "+i,"Burgos", 29, "Docente", "titulo");
		}*/
		
		//Recorrer array de docentes
		for (int i = 0; i < listaDocente.length; i++) {
			System.out.println(listaDocente[i].getNombres());
		}
		
	}

}

