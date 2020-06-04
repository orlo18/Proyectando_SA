package statics;

public class Vehiculo {
	private String matricula;
	private int cantidad;
	private double importe_ud;
	
	public Vehiculo(String matricula, int cantidad, double importe_ud) {
		super();
		this.matricula = matricula;
		this.cantidad = cantidad;
		this.importe_ud = importe_ud;
	}
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String toString() {
		return matricula;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getImporte_ud() {
		return importe_ud;
	}

	public void setImporte_ud(double precio_ud) {
		this.importe_ud = precio_ud;
	}
	
	
}
