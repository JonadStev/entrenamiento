package example.polimorfismo;

public class Gato extends Animal {
	
	@Override
	public void hacerRuido() {
		// logica de hacer ruido del perro
		System.out.println("MIAU MIAU MIAU...");
	}
}
