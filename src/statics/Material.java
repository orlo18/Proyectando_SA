package statics;

public class Material {
	private int cod_material;
	public Material(int cod_material) {
		super();
		this.cod_material = cod_material;
	}
	public int getCod_material() {
		return cod_material;
	}
	public void setCod_material(int cod_material) {
		this.cod_material = cod_material;
	}
	
	public String toString() {
		return Integer.toString(cod_material);
	}
}
