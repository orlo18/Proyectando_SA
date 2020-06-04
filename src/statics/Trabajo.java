package statics;

public class Trabajo {
	private String nombre_trabajo;
	private int cod_trabajo;
	private int cantidad;
	private double importe_ud;
	
	public Trabajo(String nombre_trabajo, int cod_trabajo) {
		super();
		this.nombre_trabajo = nombre_trabajo;
		this.cod_trabajo = cod_trabajo;
	}

	public Trabajo(String nombre_trabajo, int cod_trabajo, int cantidad, double importe_ud) {
		super();
		this.nombre_trabajo = nombre_trabajo;
		this.cod_trabajo = cod_trabajo;
		this.cantidad = cantidad;
		this.importe_ud = importe_ud;
	}
	
	public Trabajo(int cod_trabajo, int cantidad, double importe_ud) {
		super();
		this.cod_trabajo = cod_trabajo;
		this.cantidad = cantidad;
		this.importe_ud = importe_ud;
	}

	public String getNombre_trabajo() {
		return nombre_trabajo;
	}
	public void setNombre_trabajo(String nombre_trabajo) {
		this.nombre_trabajo = nombre_trabajo;
	}
	public int getCod_trabajo() {
		return cod_trabajo;
	}
	public void setCod_trabajo(int cod_trabajo) {
		this.cod_trabajo = cod_trabajo;
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

	public void setImporte_ud(double importe_ud) {
		this.importe_ud = importe_ud;
	}

	public String toString() {
		return nombre_trabajo;
	}
}
