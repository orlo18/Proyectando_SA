package inoutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import statics.Cliente;
import statics.Empleado;
import statics.Material_Peligroso;
import statics.Proyecto;
import statics.Usuario;

public class Database {
	private Connection connection;
	
	private void conectar() {
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://hotel-stefan.cciptjamgvdf.us-east-1.rds.amazonaws.com:3306/proyectandosa?useSSL=false",
					"eclipse", "Hotel2020!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void desconectar() {
		try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void registrarL(String usuario, char[] password) {
		conectar();
		
		PreparedStatement ps = null;

		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream(bos);
	        oos.writeObject(password);
	        oos.flush();
	        oos.close();
	        byte[] data = bos.toByteArray();
			ps = connection.prepareStatement("INSERT INTO usuario VALUES (?,?);");
			ps.setString(1, usuario);
			ps.setObject(2, data);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		desconectar();
	}
	
	public ArrayList<Usuario> devolverUsuarios() {
    	conectar();
    	String usuario;char[] password;
    	ArrayList<Usuario> usus = new ArrayList<Usuario>();
    	
		PreparedStatement pt = null;
		ResultSet rs = null;
		Usuario usu = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM usuario");
			
			rs = pt.executeQuery();
			while (rs.next()){
				ByteArrayInputStream bais;
	            ObjectInputStream ins;
				usuario = rs.getString("id");
				bais = new ByteArrayInputStream(rs.getBytes("contrasena"));
				ins = new ObjectInputStream(bais);
				password = (char[]) ins.readObject();
				usu = new Usuario(usuario, password);
				usus.add(usu);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		desconectar();
		return usus;
    }
	
	public ArrayList<Proyecto> devolverProyectos() {
    	conectar();
    	ArrayList<Proyecto> proy = new ArrayList<Proyecto>();
    	int cod_proyecto, cod_material, cod_encargado, cod_cliente;
    	String nombre_proyecto, fecha_inicio, fecha_fin, nombre_cliente, nombre_encargado;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Proyecto pro = null;
		
		try {
			pt = connection.prepareStatement("SELECT p.*, c.nombre_cliente, e.nombre_empleado FROM Proyecto p, Cliente c, Empleado e WHERE p.cod_encargado = e.cod_empleado AND p.cod_cliente = c.cod_cliente");
			
			rs = pt.executeQuery();
			while (rs.next()){
				cod_proyecto = rs.getInt("p.cod_proyecto");
				nombre_proyecto = rs.getString("p.nombre_proyecto");
				fecha_inicio = rs.getString("p.fecha_inicio");
				fecha_fin = rs.getString("p.fecha_fin");
				cod_material = rs.getInt("p.cod_material");
				if (rs.wasNull()) {
					cod_material = 0;
				}
				cod_encargado = rs.getInt("p.cod_encargado");
				cod_cliente = rs.getInt("p.cod_cliente");
				nombre_cliente = rs.getString("c.nombre_cliente");
				nombre_encargado = rs.getString("e.nombre_empleado");
				pro = new Proyecto(cod_proyecto, nombre_proyecto, fecha_inicio, fecha_fin, nombre_cliente, nombre_encargado, cod_material, cod_encargado,cod_cliente);
				proy.add(pro);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		desconectar();
		return proy;
    }
	
	public ArrayList<Cliente> devolverClientes() {
    	conectar();
    	ArrayList<Cliente> client = new ArrayList<Cliente>();
    	int cod_cliente;
    	String nombre_cliente;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Cliente clien = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Cliente");
			
			rs = pt.executeQuery();
			while (rs.next()){
				cod_cliente = rs.getInt("cod_cliente");
				nombre_cliente = rs.getString("nombre_cliente");
				clien = new Cliente(nombre_cliente, cod_cliente);
				client.add(clien);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		desconectar();
		return client;
    }
	
	public ArrayList<Material_Peligroso> devolverMaterial() {
    	conectar();
    	ArrayList<Material_Peligroso> mate = new ArrayList<Material_Peligroso>();
    	int cod_material;
    	String nombre_material;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Material_Peligroso mat = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Material_Peligroso");
			
			rs = pt.executeQuery();
			while (rs.next()){
				cod_material = rs.getInt("cod_material");
				nombre_material = rs.getString("nombre_material");
				mat = new Material_Peligroso(nombre_material, cod_material);
				mate.add(mat);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		desconectar();
		return mate;
    }
	
	public ArrayList<Empleado> devolverEncargado() {
    	conectar();
    	ArrayList<Empleado> enca = new ArrayList<Empleado>();
    	int cod_encargado;
    	String nombre_encargado;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Empleado enc = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Empleado");
			
			rs = pt.executeQuery();
			while (rs.next()){
				cod_encargado = rs.getInt("cod_empleado");
				nombre_encargado = rs.getString("nombre_empleado");
				enc = new Empleado(nombre_encargado, cod_encargado);
				enca.add(enc);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		desconectar();
		return enca;
    }
	
	public void insertarProyecto(Proyecto pr) {
		conectar();
		
		PreparedStatement ps = null;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha_inicio = Date.valueOf(pr.getFecha_inicio());
		Date fecha_fin = Date.valueOf(pr.getFecha_fin());
		try {
			
			ps = connection.prepareStatement("INSERT INTO Proyecto VALUES (0,?,?,?,0,?,?,?,?);");
			ps.setString(1, pr.getNombre_proyecto());
			ps.setDate(2, fecha_inicio);
			ps.setDate(3, fecha_fin);
			if (pr.getCod_material()==0) {
				ps.setNull(4, Types.INTEGER);
				ps.setInt(5, 3);
			} else {
				ps.setInt(4, pr.getCod_material());
				ps.setInt(5, 2);
			}
			ps.setInt(6, pr.getCod_encargado());
			ps.setInt(7, pr.getCod_cliente());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		desconectar();
	}
	
}
