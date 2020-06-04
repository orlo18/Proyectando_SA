package statics;

import java.util.Date;

public class Proyecto {
	private int cod_proyecto;
	private String nombre_proyecto;
	private String fecha_inicio;
	private String fecha_fin;
	private String nombre_cliente;
	private String nombre_encargado;
	private int cod_material;
	private int cod_encargado;
	private int cod_cliente;
	
	public Proyecto(int cod_proyecto, String nombre_proyecto, String fecha_inicio, String fecha_fin, int cod_material,
			int cod_encargado, int cod_cliente) {
		this.cod_proyecto = cod_proyecto;
		this.nombre_proyecto = nombre_proyecto;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.cod_material = cod_material;
		this.cod_encargado = cod_encargado;
		this.cod_cliente = cod_cliente;
	}
	
	public Proyecto(int cod_proyecto, String nombre_proyecto) {
		this.cod_proyecto = cod_proyecto;
		this.nombre_proyecto = nombre_proyecto;
	}
	
	public Proyecto(int cod_proyecto, String nombre_proyecto, String fecha_inicio, String fecha_fin,String nombre_cliente,String nombre_encargado, int cod_material,
			int cod_encargado, int cod_cliente) {
		this.cod_proyecto = cod_proyecto;
		this.nombre_proyecto = nombre_proyecto;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.nombre_cliente = nombre_cliente;
		this.nombre_encargado = nombre_encargado;
		this.cod_material = cod_material;
		this.cod_encargado = cod_encargado;
		this.cod_cliente = cod_cliente;
	}
	
	public Proyecto(String nombre_proyecto, String fecha_inicio, String fecha_fin, int cod_material,
			int cod_encargado, int cod_cliente) {
		this.cod_proyecto = 0;
		this.nombre_proyecto = nombre_proyecto;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.cod_material = cod_material;
		this.cod_encargado = cod_encargado;
		this.cod_cliente = cod_cliente;
	}

	public int getCod_proyecto() {
		return cod_proyecto;
	}

	public void setCod_proyecto(int cod_proyecto) {
		this.cod_proyecto = cod_proyecto;
	}

	public String getNombre_proyecto() {
		return nombre_proyecto;
	}

	public void setNombre_proyecto(String nombre_proyecto) {
		this.nombre_proyecto = nombre_proyecto;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getCod_material() {
		return cod_material;
	}

	public void setCod_material(int cod_material) {
		this.cod_material = cod_material;
	}

	public int getCod_encargado() {
		return cod_encargado;
	}

	public void setCod_encargado(int cod_encargado) {
		this.cod_encargado = cod_encargado;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	
	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getNombre_encargado() {
		return nombre_encargado;
	}

	public void setNombre_encargado(String nombre_encargado) {
		this.nombre_encargado = nombre_encargado;
	}

	@Override
	public String toString() {
		return nombre_proyecto;
	}
	
	
	
}
