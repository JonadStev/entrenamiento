package example.polimorfismo;

public abstract class Figura {
	
	protected String color;

	public Figura(String color) {
		super();
		this.color = color;
	}
	
	public void mostrarColor() {
		System.out.println(new StringBuilder("El color de la figura es ").append(this.color).toString());
	}
	
	public abstract double calcularArea();
	
}
