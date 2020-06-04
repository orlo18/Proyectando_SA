package statics;

public class Material {
	private int cod_material;
	private int cantidad;
	private double importe_ud;
	public Material(int cod_material) {
		super();
		this.cod_material = cod_material;
	}
	
	public Material(int cod_material, int cantidad, double importe_ud) {
		super();
		this.cod_material = cod_material;
		this.cantidad = cantidad;
		this.importe_ud = importe_ud;
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
	
	
	
}
