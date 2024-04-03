package example.polimorfismo;

public class Circulo extends Figura{
	
	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		// implementacion del calculo de area de un circulo
		return Math.PI * Math.pow(this.radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
