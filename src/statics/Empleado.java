package statics;

public class Empleado {
	private String nombre_encargado;
	private int cod_encargado;
	
	public Empleado(String nombre_encargado, int cod_encargado) {
		super();
		this.nombre_encargado = nombre_encargado;
		this.cod_encargado = cod_encargado;
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
}
