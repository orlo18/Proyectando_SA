package statics;

public class Material_Peligroso {
	private String nombre_material;
	private int cod_material;
	
	public Material_Peligroso(String nombre_material, int cod_material) {
		super();
		this.nombre_material = nombre_material;
		this.cod_material = cod_material;
	}
	
	public String getNombre_material() {
		return nombre_material;
	}
	public void setNombre_material(String nombre_material) {
		this.nombre_material = nombre_material;
	}
	public int getCod_material() {
		return cod_material;
	}
	public void setCod_material(int cod_material) {
		this.cod_material = cod_material;
	}
	public String toString() {
		return nombre_material;
	}
}
