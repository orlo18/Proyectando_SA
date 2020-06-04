package statics;

public class Empleado {
	private String nombre_encargado;
	private int cod_encargado;
	private int cantidad;
	private double importe_ud;
	
	public Empleado(String nombre_encargado, int cod_encargado) {
		super();
		this.nombre_encargado = nombre_encargado;
		this.cod_encargado = cod_encargado;
	}
	
	public Empleado(String nombre_encargado, int cod_encargado, int cantidad, double importe_ud) {
		super();
		this.nombre_encargado = nombre_encargado;
		this.cod_encargado = cod_encargado;
		this.cantidad = cantidad;
		this.importe_ud = importe_ud;
	}
	
	public Empleado(int cod_encargado, int cantidad, double importe_ud) {
		super();
		this.cod_encargado = cod_encargado;
		this.cantidad = cantidad;
		this.importe_ud = importe_ud;
	}
	
	
	public String getNombre_encargado() {
		return nombre_encargado;
	}
	public void setNombre_encargado(String nombre_encargado) {
		this.nombre_encargado = nombre_encargado;
	}
	public int getCod_encargado() {
		return cod_encargado;
	}
	public void setCod_encargado(int cod_encargado) {
		this.cod_encargado = cod_encargado;
	}
	public String toString() {
		return nombre_encargado;
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
