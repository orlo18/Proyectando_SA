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

import javax.swing.JOptionPane;

import statics.Cliente;
import statics.Empleado;
import statics.Material;
import statics.Material_Peligroso;
import statics.Proyecto;
import statics.Trabajo;
import statics.Usuario;
import statics.Vehiculo;

public class Database {
	private Connection connection;
	
	private void conectar() {
		try {
			/**connection = DriverManager.getConnection(
					"jdbc:mysql://hotel-stefan.cciptjamgvdf.us-east-1.rds.amazonaws.com:3306/proyectandosa?useSSL=false",
					"eclipse", "Hotel2020!");*/
			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/proyectandosa?useSSL=false",
					"root", "Admin1234");
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
			JOptionPane.showMessageDialog(null, "Error, este usuario ya existe");
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
	
	public ArrayList<Proyecto> devolverProyectosConParte() {
    	conectar();
    	ArrayList<Proyecto> proy = new ArrayList<Proyecto>();
    	int cod_proyecto, cod_material, cod_encargado, cod_cliente;
    	String nombre_proyecto, fecha_inicio, fecha_fin, nombre_cliente, nombre_encargado;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Proyecto pro = null;
		
		try {
			pt = connection.prepareStatement("SELECT p.cod_proyecto, pr.nombre_proyecto FROM Parte_Proyecto p, Proyecto pr WHERE p.cod_proyecto = pr.cod_proyecto AND p.fecha = current_date();");
			
			rs = pt.executeQuery();
			while (rs.next()){
				cod_proyecto = rs.getInt("p.cod_proyecto");
				nombre_proyecto = rs.getString("pr.nombre_proyecto");
				pro = new Proyecto(cod_proyecto, nombre_proyecto);
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
	
	public ArrayList<Proyecto> devolverProyectosSinParte() {
    	conectar();
    	ArrayList<Proyecto> proy = new ArrayList<Proyecto>();
    	int cod_proyecto;
    	String nombre_proyecto;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Proyecto pro = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Proyecto WHERE cod_proyecto NOT IN (SELECT cod_proyecto FROM Parte_Proyecto WHERE fecha = current_date());");
			
			rs = pt.executeQuery();
			while (rs.next()){
				cod_proyecto = rs.getInt("cod_proyecto");
				nombre_proyecto = rs.getString("nombre_proyecto");
				pro = new Proyecto(cod_proyecto, nombre_proyecto);
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

	public ArrayList<Trabajo> devolverEstimacionTrabajos(int cod_proyecto) {
    	conectar();
    	ArrayList<Trabajo> trab = new ArrayList<Trabajo>();
    	String nombre_trabajo;
    	int cod_trabajo, cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Trabajo tra = null;
		
		try {
			pt = connection.prepareStatement("SELECT e.*, t.descripcion_trabajo FROM Estimacion_Trabajo e, Trabajo t  WHERE e.cod_trabajo = t.cod_trabajo AND cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				cod_trabajo = rs.getInt("cod_trabajo");
				nombre_trabajo = rs.getString("descripcion_trabajo");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				tra = new Trabajo(nombre_trabajo, cod_trabajo, cantidad, importe_ud);
				trab.add(tra);
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
		return trab;
    }
	
	public ArrayList<Material> devolverEstimacionMateriales(int cod_proyecto) {
    	conectar();
    	ArrayList<Material> mate = new ArrayList<Material>();
    	int cod_material, cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Material mat = null;
		
		try {
			pt = connection.prepareStatement("SELECT *FROM Estimacion_Material WHERE cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				cod_material = rs.getInt("cod_articulo");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				mat = new Material(cod_material, cantidad, importe_ud);
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
	
	public ArrayList<Empleado> devolverEstimacionEmpleados(int cod_proyecto) {
    	conectar();
    	ArrayList<Empleado> empl = new ArrayList<Empleado>();
    	String nombre_empleado;
    	int cod_empleado, cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Empleado emp = null;
		
		try {
			pt = connection.prepareStatement("SELECT et.*, e.nombre_empleado FROM Estimacion_Empleado et, Empleado e  WHERE et.cod_empleado = e.cod_empleado AND cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				cod_empleado = rs.getInt("cod_empleado");
				nombre_empleado = rs.getString("nombre_empleado");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				emp = new Empleado(nombre_empleado, cod_empleado, cantidad, importe_ud);
				empl.add(emp);
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
		return empl;
    }
	
	public ArrayList<Vehiculo> devolverEstimacionVehiculos(int cod_proyecto) {
    	conectar();
    	ArrayList<Vehiculo> vehi = new ArrayList<Vehiculo>();
    	String matricula;
    	int cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Vehiculo veh = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Estimacion_Vehiculo WHERE cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				matricula = rs.getString("matricula");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				veh = new Vehiculo(matricula, cantidad, importe_ud);
				vehi.add(veh);
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
		return vehi;
    }
	
	public ArrayList<Trabajo> devolverTrabajos() {
    	conectar();
    	ArrayList<Trabajo> trab = new ArrayList<Trabajo>();
    	String nombre_trabajo;
    	int cod_trabajo;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Trabajo tra = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Trabajo");
			rs = pt.executeQuery();
			while (rs.next()){
				cod_trabajo = rs.getInt("cod_trabajo");
				nombre_trabajo = rs.getString("descripcion_trabajo");
				tra = new Trabajo(nombre_trabajo, cod_trabajo);
				trab.add(tra);
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
		return trab;
    }
	
	public ArrayList<Material> devolverMateriales() {
    	conectar();
    	ArrayList<Material> mate = new ArrayList<Material>();
    	int cod_material;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Material mat = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Material");
			rs = pt.executeQuery();
			while (rs.next()){
				cod_material = rs.getInt("cod_articulo");
				mat = new Material(cod_material);
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
	
	public ArrayList<Empleado> devolverEmpleados() {
    	conectar();
    	ArrayList<Empleado> empl = new ArrayList<Empleado>();
    	String nombre_empleado;
    	int cod_empleado;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Empleado emp = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Empleado");
			rs = pt.executeQuery();
			while (rs.next()){
				cod_empleado = rs.getInt("cod_empleado");
				nombre_empleado = rs.getString("nombre_empleado");
				emp = new Empleado(nombre_empleado, cod_empleado);
				empl.add(emp);
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
		return empl;
    }
	
	public ArrayList<Vehiculo> devolverVehiculos() {
    	conectar();
    	ArrayList<Vehiculo> vehi = new ArrayList<Vehiculo>();
    	String matricula;
    	int cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Vehiculo veh = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Vehiculo");
			rs = pt.executeQuery();
			while (rs.next()){
				matricula = rs.getString("matricula");
				veh = new Vehiculo(matricula);
				vehi.add(veh);
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
		return vehi;
    }
	
	public void insertarEstimacionTrabajo(int cod_proyecto, ArrayList<Trabajo> vTrabajos) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Trabajo trabajo : vTrabajos) {
				ps = connection.prepareStatement("INSERT INTO Estimacion_Trabajo VALUES (?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setInt(2, trabajo.getCod_trabajo());
				ps.setInt(3, trabajo.getCantidad());
				ps.setDouble(4, trabajo.getImporte_ud());
				ps.setDouble(5, (trabajo.getImporte_ud() * trabajo.getCantidad()));
				ps.executeUpdate();
			}
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
	
	public void insertarEstimacionMaterial(int cod_proyecto, ArrayList<Material> vMateriales) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Material material : vMateriales) {
				ps = connection.prepareStatement("INSERT INTO Estimacion_Material VALUES (?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setInt(2, material.getCod_material());
				ps.setInt(3, material.getCantidad());
				ps.setDouble(4, material.getImporte_ud());
				ps.setDouble(5, (material.getImporte_ud() * material.getCantidad()));
				ps.executeUpdate();
			}
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
	
	public void insertarEstimacionEmpleado(int cod_proyecto, ArrayList<Empleado> vEmpleados) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Empleado empleado : vEmpleados) {
				ps = connection.prepareStatement("INSERT INTO Estimacion_Empleado VALUES (?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setInt(2, empleado.getCod_encargado());
				ps.setInt(3, empleado.getCantidad());
				ps.setDouble(4, empleado.getImporte_ud());
				ps.setDouble(5, (empleado.getImporte_ud() * empleado.getCantidad()));
				ps.executeUpdate();
			}
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
	public void insertarEstimacionVehiculo(int cod_proyecto, ArrayList<Vehiculo> vVehiculos) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Vehiculo vehiculo : vVehiculos) {
				ps = connection.prepareStatement("INSERT INTO Estimacion_Vehiculo VALUES (?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setString(2, vehiculo.getMatricula());
				ps.setInt(3, vehiculo.getCantidad());
				ps.setDouble(4, vehiculo.getImporte_ud());
				ps.setDouble(5, (vehiculo.getImporte_ud() * vehiculo.getCantidad()));
				ps.executeUpdate();
			}
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
	
	public void insertarParteTrabajo(int cod_proyecto, ArrayList<Trabajo> vTrabajos) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Trabajo trabajo : vTrabajos) {
				System.out.println(cod_proyecto);
				ps = connection.prepareStatement("INSERT INTO Parte_Trabajo VALUES (current_date(),?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setInt(2, trabajo.getCod_trabajo());
				ps.setInt(3, trabajo.getCantidad());
				ps.setDouble(4, trabajo.getImporte_ud());
				ps.setDouble(5, (trabajo.getImporte_ud() * trabajo.getCantidad()));
				ps.executeUpdate();
			}
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
	
	public void insertarParteMaterial(int cod_proyecto, ArrayList<Material> vMateriales) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Material material : vMateriales) {
				ps = connection.prepareStatement("INSERT INTO Parte_Material VALUES (current_date(),?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setInt(2, material.getCod_material());
				ps.setInt(3, material.getCantidad());
				ps.setDouble(4, material.getImporte_ud());
				ps.setDouble(5, (material.getImporte_ud() * material.getCantidad()));
				ps.executeUpdate();
			}
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
	
	public void insertarParteEmpleado(int cod_proyecto, ArrayList<Empleado> vEmpleados) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Empleado empleado : vEmpleados) {
				ps = connection.prepareStatement("INSERT INTO Parte_Empleado VALUES (current_date(),?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setInt(2, empleado.getCod_encargado());
				ps.setInt(3, empleado.getCantidad());
				ps.setDouble(4, empleado.getImporte_ud());
				ps.setDouble(5, (empleado.getImporte_ud() * empleado.getCantidad()));
				ps.executeUpdate();
			}
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
	public void insertarParteVehiculo(int cod_proyecto, ArrayList<Vehiculo> vVehiculos) {
		conectar();
		PreparedStatement ps = null;
		try {
			for (Vehiculo vehiculo : vVehiculos) {
				ps = connection.prepareStatement("INSERT INTO Parte_Vehiculo VALUES (current_date(),?,?,?,?,?);");
				ps.setInt(1, cod_proyecto);
				ps.setString(2, vehiculo.getMatricula());
				ps.setInt(3, vehiculo.getCantidad());
				ps.setDouble(4, vehiculo.getImporte_ud());
				ps.setDouble(5, (vehiculo.getImporte_ud() * vehiculo.getCantidad()));
				ps.executeUpdate();
			}
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
	
	public void insertarParteProyecto(int cod_proyecto) {
		conectar();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("INSERT INTO Parte_Proyecto VALUES (current_date(),?,?);");
			ps.setInt(1, cod_proyecto);
			ps.setString(2, "");
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ya existe un parte en esa fecha");
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		desconectar();
	}
	
	public int obtenerCodProyecto() {
		conectar();
		int cod_proyecto = 0;
		PreparedStatement pt = null;
		ResultSet rs = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Proyecto ORDER BY cod_proyecto DESC LIMIT 1");
			rs = pt.executeQuery();
			while (rs.next()){
				cod_proyecto = rs.getInt("cod_proyecto");
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
		return cod_proyecto;
	}

	public void eliminarPartesTrabajo(int cod_proyecto) {
		conectar();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("DELETE From Parte_Trabajo WHERE cod_proyecto = ? AND fecha = current_date()");
			System.out.println("eliminando..."
					+ "");
			ps.setInt(1, cod_proyecto);
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
	
	public void eliminarPartesMaterial(int cod_proyecto) {
		conectar();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("DELETE From Parte_Material WHERE cod_proyecto = ? AND fecha = current_date()");
			ps.setInt(1, cod_proyecto);
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
	
	public void eliminarPartesEmpleado(int cod_proyecto) {
		conectar();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("DELETE From Parte_Empleado WHERE cod_proyecto = ? AND fecha = current_date()");
			ps.setInt(1, cod_proyecto);
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
	public void eliminarPartesVehiculo(int cod_proyecto) {
		conectar();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("DELETE From Parte_Vehiculo WHERE cod_proyecto = ? AND fecha = current_date()");
			ps.setInt(1, cod_proyecto);
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
	
	public ArrayList<Trabajo> devolverParteTrabajos(int cod_proyecto) {
    	conectar();
    	ArrayList<Trabajo> trab = new ArrayList<Trabajo>();
    	String nombre_trabajo;
    	int cod_trabajo, cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Trabajo tra = null;
		
		try {
			pt = connection.prepareStatement("SELECT e.*, t.descripcion_trabajo FROM Parte_Trabajo e, Trabajo t  WHERE e.cod_trabajo = t.cod_trabajo AND cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				cod_trabajo = rs.getInt("cod_trabajo");
				nombre_trabajo = rs.getString("descripcion_trabajo");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				tra = new Trabajo(nombre_trabajo, cod_trabajo, cantidad, importe_ud);
				trab.add(tra);
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
		return trab;
    }
	
	public ArrayList<Material> devolverParteMateriales(int cod_proyecto) {
    	conectar();
    	ArrayList<Material> mate = new ArrayList<Material>();
    	int cod_material, cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Material mat = null;
		
		try {
			pt = connection.prepareStatement("SELECT *FROM Parte_Material WHERE cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				cod_material = rs.getInt("cod_articulo");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				mat = new Material(cod_material, cantidad, importe_ud);
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
	
	public ArrayList<Empleado> devolverParteEmpleados(int cod_proyecto) {
    	conectar();
    	ArrayList<Empleado> empl = new ArrayList<Empleado>();
    	String nombre_empleado;
    	int cod_empleado, cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Empleado emp = null;
		
		try {
			pt = connection.prepareStatement("SELECT et.*, e.nombre_empleado FROM Parte_Empleado et, Empleado e  WHERE et.cod_empleado = e.cod_empleado AND cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				cod_empleado = rs.getInt("cod_empleado");
				nombre_empleado = rs.getString("nombre_empleado");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				emp = new Empleado(nombre_empleado, cod_empleado, cantidad, importe_ud);
				empl.add(emp);
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
		return empl;
    }
	
	public ArrayList<Vehiculo> devolverParteVehiculos(int cod_proyecto) {
    	conectar();
    	ArrayList<Vehiculo> vehi = new ArrayList<Vehiculo>();
    	String matricula;
    	int cantidad;
    	double importe_ud;
		PreparedStatement pt = null;
		ResultSet rs = null;
		Vehiculo veh = null;
		
		try {
			pt = connection.prepareStatement("SELECT * FROM Parte_Vehiculo WHERE cod_proyecto = ?");
			pt.setInt(1, cod_proyecto);
			rs = pt.executeQuery();
			while (rs.next()){
				matricula = rs.getString("matricula");
				cantidad = rs.getInt("cantidad");
				importe_ud = rs.getDouble("importe_ud");
				veh = new Vehiculo(matricula, cantidad, importe_ud);
				vehi.add(veh);
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
		return vehi;
    }
}
