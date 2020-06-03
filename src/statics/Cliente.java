package statics;

public class Cliente {
	private String nombre_cliente;
	private int cod_cliente;
	public Cliente(String nombre_cliente, int cod_cliente) {
		super();
		this.nombre_cliente = nombre_cliente;
		this.cod_cliente = cod_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String toString() {
		return nombre_cliente;
	}
}
