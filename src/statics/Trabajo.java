package statics;

public class Trabajo {
	private String nombre_trabajo;
	private int cod_trabajo;
	
	public Trabajo(String nombre_trabajo, int cod_trabajo) {
		super();
		this.nombre_trabajo = nombre_trabajo;
		this.cod_trabajo = cod_trabajo;
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
	
	public String toString() {
		return nombre_trabajo;
	}
}
