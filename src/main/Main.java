package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Frame;
import java.awt.Point;

import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;

import statics.Cliente;
import statics.Empleado;
import statics.Material;
import statics.Material_Peligroso;
import statics.Proyecto;
import statics.Trabajo;
import statics.Vehiculo;

import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

import com.toedter.calendar.JDateChooser;

import inoutput.Database;
import inoutput.Usersettings;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
@SuppressWarnings({ "unused", "serial","unchecked","rawtypes" })
public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel fondo;
	private JLabel exit;
	private JLabel contr;
	private JLabel min;
	private JLabel movebar;
	private boolean estado;
	private Point initialClick;
	private Usersettings usr = new Usersettings();
	private JLabel home;
	private JLabel lblListadoProyectos;
	private JLabel lblAnadirProyecto;
	private JLabel lblAnadirUsuario;
	private JLabel lblAnadirParte;
	private JLabel lblModificarParte;
	private JPanel panelAnadirUsuario;
	private JLabel lblUsuario;
	private JTextField textField;
	private JLabel lblContr;
	private JPasswordField passwordField;
	private JButton btnAnadir;
	private JLabel lblAnadirUsuarioInt;
	private JPanel panelAnadirProyecto;
	private JLabel lblAnadirProyectoInt;
	private JLabel lblNombreProyectoAnPr;
	private JLabel lblClienteAnPr;
	private JLabel lblJefeProyectoAnPr;
	private JLabel lblFechaInicioAnPr;
	private JLabel lblMaterialTransportarAnPr;
	private JDateChooser dateChooserFechaInicioAnPr;
	private JLabel lblFechaFinAnPr;
	private JDateChooser dateChooserFechaFinAnPr;
	private JComboBox comboxMaterialTransportarAnPr;
	private JComboBox comboxJefeAnPr;
	private JComboBox comboxClienteAnPr;
	private JTextField textFieldNombreAnPr;
	private JLabel lblPersonalAnPr;
	private JLabel lblVehiculosAnPr;
	private JLabel lblMaterialesAnPr;
	private JLabel lblTrabajosAnPr;
	private JComboBox comboxPersonalAnPr1;
	private JTextField txtCantidadPersonalAnPr1;
	private JTextField txtImportePersonalAnPr1;
	private JComboBox comboxPersonalAnPr2;
	private JTextField txtCantidadPersonalAnPr2;
	private JTextField txtImportePersonalAnPr2;
	private JComboBox comboxPersonalAnPr3;
	private JTextField txtCantidadPersonalAnPr3;
	private JTextField txtImportePersonalAnPr3;
	private JComboBox comboxVehiculosAnPr1;
	private JTextField txtCantidadVehiculosAnPr1;
	private JTextField txtImporteVehiculosAnPr1;
	private JComboBox comboxVehiculosAnPr2;
	private JTextField txtCantidadVehiculosAnPr2;
	private JTextField txtImporteVehiculosAnPr2;
	private JComboBox comboxVehiculosAnPr3;
	private JTextField txtCantidadVehiculosAnPr3;
	private JTextField txtImporteVehiculosAnPr3;
	private JComboBox comboxMaterialesAnPr1;
	private JTextField txtCantidadMaterialesAnPr1;
	private JTextField txtImporteMaterialesAnPr1;
	private JComboBox comboxMaterialesAnPr2;
	private JTextField txtCantidadMaterialesAnPr2;
	private JTextField txtImporteMaterialesAnPr2;
	private JComboBox comboxMaterialesAnPr3;
	private JTextField txtCantidadMaterialesAnPr3;
	private JTextField txtImporteMaterialesAnPr3;
	private JComboBox comboxTrabajosAnPr1;
	private JTextField txtCantidadTrabajosAnPr1;
	private JTextField txtImporteTrabajosAnPr1;
	private JComboBox comboxTrabajosAnPr2;
	private JTextField txtCantidadTrabajosAnPr2;
	private JTextField txtImporteTrabajosAnPr2;
	private JComboBox comboxTrabajosAnPr3;
	private JTextField txtCantidadTrabajosAnPr3;
	private JTextField txtImporteTrabajosAnPr3;
	private JLabel lblAmpliarAnPr1;
	private JLabel lblAmpliarAnPr2;
	private JLabel lblAmpliarAnPr3;
	private JLabel lblAmpliarAnPr4;
	private JLabel lblAmpliarAnPr5;
	private JLabel lblAmpliarAnPr6;
	private JLabel lblAmpliarAnPr7;
	private JLabel lblAmpliarAnPr8;
	private JLabel lblAmpliarAnPr9;
	private JLabel lblAmpliarAnPr10;
	private JLabel lblAmpliarAnPr11;
	private JLabel lblAmpliarAnPr12;
	private boolean amp1AnPr = true, amp2AnPr = true, amp3AnPr = true, amp4AnPr = true, amp5AnPr = true, amp6AnPr = true, amp7AnPr = true, amp8AnPr = true, amp9AnPr = true, amp10AnPr = true, amp11AnPr = true, amp12AnPr = true;
	private boolean amp1AnPa = true, amp2AnPa = true, amp3AnPa = true, amp4AnPa = true, amp5AnPa = true, amp6AnPa = true, amp7AnPa = true, amp8AnPa = true, amp9AnPa = true, amp10AnPa = true, amp11AnPa = true, amp12AnPa = true;
	private boolean amp1MoPa = true, amp2MoPa = true, amp3MoPa = true, amp4MoPa = true, amp5MoPa = true, amp6MoPa = true, amp7MoPa = true, amp8MoPa = true, amp9MoPa = true, amp10MoPa = true, amp11MoPa = true, amp12MoPa = true;
	private JPanel panelListaProyectos;
	private JLabel lblListadoProyectosInt;
	private JLabel lblNombreProyectoLsPr;
	private JLabel lblClienteLsPr;
	private JLabel lblJefeProyectoLsPr;
	private JLabel lblFechaInicioLsPr;
	private JLabel lblMaterialTransportarLsPr;
	private JLabel lblFechaFinLsPr;
	private JTextField txtNombreProyectoLsPr;
	private JTextField txtClienteLsPr;
	private JTextField txtJefeLsPr;
	private JTextField txtFechaIniLsPr;
	private JTextField txtMaterialLsPr;
	private JPanel panelAnadirParte;
	private JLabel lblAnadirParteInt;
	private JLabel lblProyectoAnPa;
	private JLabel lblFechaAnPa;
	private JTextField txtFechaAnPa;
	private JComboBox comboxProyectoAnPa;
	private JComboBox comboxPersonalAnPa1;
	private JTextField txtCantidadPersonalAnPa1;
	private JTextField txtImportePersonalAnPa1;
	private JComboBox comboxPersonalAnPa2;
	private JTextField txtCantidadPersonalAnPa2;
	private JTextField txtImportePersonalAnPa2;
	private JComboBox comboxPersonalAnPa3;
	private JTextField txtCantidadPersonalAnPa3;
	private JTextField txtImportePersonalAnPa3;
	private JComboBox comboxVehiculosAnPa1;
	private JTextField txtCantidadVehiculosAnPa1;
	private JTextField txtImporteVehiculosAnPa1;
	private JComboBox comboxVehiculosAnPa2;
	private JTextField txtCantidadVehiculosAnPa2;
	private JTextField txtImporteVehiculosAnPa2;
	private JComboBox comboxVehiculosAnPa3;
	private JTextField txtCantidadVehiculosAnPa3;
	private JTextField txtImporteVehiculosAnPa3;
	private JComboBox comboxMaterialesAnPa1;
	private JTextField txtCantidadMaterialesAnPa1;
	private JTextField txtImporteMaterialesAnPa1;
	private JComboBox comboxMaterialesAnPa2;
	private JTextField txtCantidadMaterialesAnPa2;
	private JTextField txtImporteMaterialesAnPa2;
	private JComboBox comboxMaterialesAnPa3;
	private JTextField txtCantidadMaterialesAnPa3;
	private JTextField txtImporteMaterialesAnPa3;
	private JComboBox comboxTrabajosAnPa1;
	private JTextField txtCantidadTrabajosAnPa1;
	private JTextField txtImporteTrabajosAnPa1;
	private JComboBox comboxTrabajosAnPa2;
	private JTextField txtCantidadTrabajosAnPa2;
	private JTextField txtImporteTrabajosAnPa2;
	private JComboBox comboxTrabajosAnPa3;
	private JTextField txtCantidadTrabajosAnPa3;
	private JTextField txtImporteTrabajosAnPa3;
	private JLabel lblAmpliarAnPa1;
	private JLabel lblAmpliarAnPa2;
	private JLabel lblAmpliarAnPa3;
	private JLabel lblAmpliarAnPa4;
	private JLabel lblAmpliarAnPa5;
	private JLabel lblAmpliarAnPa6;
	private JLabel lblAmpliarAnPa7;
	private JLabel lblAmpliarAnPa8;
	private JLabel lblAmpliarAnPa9;
	private JLabel lblAmpliarAnPa10;
	private JLabel lblAmpliarAnPa11;
	private JLabel lblAmpliarAnPa12;
	private JPanel panelModificarParte;
	private JComboBox comboxPersonalMoPa1;
	private JTextField txtCantidadPersonalMoPa1;
	private JTextField txtImportePersonalMoPa1;
	private JComboBox comboxPersonalMoPa2;
	private JTextField txtCantidadPersonalMoPa2;
	private JTextField txtImportePersonalMoPa2;
	private JComboBox comboxPersonalMoPa3;
	private JTextField txtCantidadPersonalMoPa3;
	private JTextField txtImportePersonalMoPa3;
	private JComboBox comboxVehiculosMoPa1;
	private JTextField txtCantidadVehiculosMoPa1;
	private JTextField txtImporteVehiculosMoPa1;
	private JComboBox comboxVehiculosMoPa2;
	private JTextField txtCantidadVehiculosMoPa2;
	private JTextField txtImporteVehiculosMoPa2;
	private JComboBox comboxVehiculosMoPa3;
	private JTextField txtCantidadVehiculosMoPa3;
	private JTextField txtImporteVehiculosMoPa3;
	private JComboBox comboxMaterialesMoPa1;
	private JTextField txtCantidadMaterialesMoPa1;
	private JTextField txtImporteMaterialesMoPa1;
	private JComboBox comboxMaterialesMoPa2;
	private JTextField txtCantidadMaterialesMoPa2;
	private JTextField txtImporteMaterialesMoPa2;
	private JComboBox comboxMaterialesMoPa3;
	private JTextField txtCantidadMaterialesMoPa3;
	private JTextField txtImporteMaterialesMoPa3;
	private JComboBox comboxTrabajosMoPa1;
	private JTextField txtCantidadTrabajosMoPa1;
	private JTextField txtImporteTrabajosMoPa1;
	private JComboBox comboxTrabajosMoPa2;
	private JTextField txtCantidadTrabajosMoPa2;
	private JTextField txtImporteTrabajosMoPa2;
	private JComboBox comboxTrabajosMoPa3;
	private JTextField txtCantidadTrabajosMoPa3;
	private JTextField txtImporteTrabajosMoPa3;
	private JLabel lblAmpliarMoPa1;
	private JLabel lblAmpliarMoPa2;
	private JLabel lblAmpliarMoPa3;
	private JLabel lblAmpliarMoPa4;
	private JLabel lblAmpliarMoPa5;
	private JLabel lblAmpliarMoPa6;
	private JLabel lblAmpliarMoPa7;
	private JLabel lblAmpliarMoPa8;
	private JLabel lblAmpliarMoPa9;
	private JLabel lblAmpliarMoPa10;
	private JLabel lblAmpliarMoPa11;
	private JLabel lblAmpliarMoPa12;
	private JTextField txtCantidadPersonalLsPr1;
	private JTextField txtImportePersonalLsPr1;
	private JTextField txtNombrePersonalLsPr1;
	private JTextField txtNombrePersonalLsPr2;
	private JTextField txtImportePersonalLsPr2;
	private JTextField txtCantidadPersonalLsPr2;
	private JTextField txtNombrePersonalLsPr3;
	private JTextField txtImportePersonalLsPr3;
	private JTextField txtCantidadPersonalLsPr3;
	private JTextField txtNombreVehiculosLsPr3;
	private JTextField txtImporteVehiculosLsPr3;
	private JTextField txtCantidadVehiculosLsPr3;
	private JTextField txtImporteVehiculosLsPr2;
	private JTextField txtCantidadVehiculosLsPr2;
	private JTextField txtNombreVehiculosLsPr2;
	private JTextField txtImporteVehiculosLsPr1;
	private JTextField txtCantidadVehiculosLsPr1;
	private JTextField txtNombreVehiculosLsPr1;
	private JTextField txtNombreMaterialesLsPr3;
	private JTextField txtImporteMaterialesLsPr3;
	private JTextField txtCantidadMaterialesLsPr3;
	private JTextField txtImporteMaterialesLsPr2;
	private JTextField txtCantidadMaterialesLsPr2;
	private JTextField txtNombreMaterialesLsPr2;
	private JTextField txtImporteMaterialesLsPr1;
	private JTextField txtCantidadMaterialesLsPr1;
	private JTextField txtNombreMaterialesLsPr1;
	private JTextField txtNombreTrabajosLsPr3;
	private JTextField txtImporteTrabajosLsPr3;
	private JTextField txtCantidadTrabajosLsPr3;
	private JTextField txtImporteTrabajosLsPr2;
	private JTextField txtCantidadTrabajosLsPr2;
	private JTextField txtNombreTrabajosLsPr2;
	private JTextField txtImporteTrabajosLsPr1;
	private JTextField txtCantidadTrabajosLsPr1;
	private JTextField txtNombreTrabajosLsPr1;
	private JLabel lblPersonalLsPr;
	private JLabel lblVehiculosLsPr;
	private JLabel lblMaterialesLsPr;
	private JLabel lblTrabajosLsPr;
	private JLabel lblModificarParteInt;
	private JLabel lblPersonalAnPa;
	private JLabel lblVehiculosAnPa;
	private JLabel lblMaterialesAnPa;
	private JLabel lblTrabajosAnPa;
	private JLabel lblPersonalMoPa;
	private JLabel lblVehiculosMoPa;
	private JLabel lblMaterialesMoPa;
	private JLabel lblTrabajosMoPa;
	private JLabel lblProyectoMoPa;
	private JComboBox comboxProyectoMoPa;
	private JLabel lblFechaMoPa;
	private JTextField txtFechaMoPa;
	private JTable table;
	private JTable table_1;
	private Database db = new Database();
	private Date diaHoy = Calendar.getInstance().getTime();
	private String diaHoyString;
	private JLabel lblProyectoLsPr;
	private JComboBox comboxProyectoLsPr;
	private JTextField txtFechaFinLsPr;
	private ArrayList<Proyecto> vProyectos;
	private ArrayList<Proyecto> vProyectosConParte;
	private ArrayList<Cliente> vClientes;
	private ArrayList<Material_Peligroso> vMateriales;
	private ArrayList<Empleado> vEncargados;
	private ComboBoxModel modeloProyectos;
	private ComboBoxModel modeloProyectosConParte;
	private ComboBoxModel modeloClientes;
	private ComboBoxModel modeloMateriales;
	private ComboBoxModel modeloEncargados;
	private ComboBoxModel modeloPersonal1;
	private ComboBoxModel modeloPersonal2;
	private ComboBoxModel modeloPersonal3;
	private ComboBoxModel modeloTrabajos1;
	private ComboBoxModel modeloTrabajos2;
	private ComboBoxModel modeloTrabajos3;
	private ComboBoxModel modeloArticulos1;
	private ComboBoxModel modeloArticulos2;
	private ComboBoxModel modeloArticulos3;
	private ComboBoxModel modeloVehiculos1;
	private ComboBoxModel modeloVehiculos2;
	private ComboBoxModel modeloVehiculos3;
	private JButton btnEnviarAnPr;
	private JButton btnEnviarAnPr_1;
	private JButton btnEnviarMoPa;
	private JLabel exitAnPr;
	private boolean deshabilitarBoton = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		initApp();
		actualizarProyectos();
	}
	
	
	private void actualizarProyectos() {
		vProyectosConParte = db.devolverProyectosConParte();
		vProyectos = db.devolverProyectos();
		vClientes = db.devolverClientes();
		vMateriales = db.devolverMaterial();
		vEncargados = db.devolverEncargado();
		ArrayList<Trabajo> vTrabajos = db.devolverTrabajos();
		ArrayList<Material> vArticulos = db.devolverMateriales();
		ArrayList<Empleado> vPersonal = db.devolverEmpleados();
		ArrayList<Vehiculo> vVehiculos = db.devolverVehiculos();
		modeloProyectos = new DefaultComboBoxModel(vProyectos.toArray());
		modeloClientes = new DefaultComboBoxModel(vClientes.toArray());
		modeloMateriales = new DefaultComboBoxModel(vMateriales.toArray());
		modeloEncargados = new DefaultComboBoxModel(vEncargados.toArray());
		modeloProyectosConParte = new DefaultComboBoxModel(vProyectosConParte.toArray());
		modeloArticulos1 = new DefaultComboBoxModel(vArticulos.toArray());
		modeloArticulos2 = new DefaultComboBoxModel(vArticulos.toArray());
		modeloArticulos3 = new DefaultComboBoxModel(vArticulos.toArray());
		modeloVehiculos1 = new DefaultComboBoxModel(vVehiculos.toArray());
		modeloVehiculos2 = new DefaultComboBoxModel(vVehiculos.toArray());
		modeloVehiculos3 = new DefaultComboBoxModel(vVehiculos.toArray());
		modeloTrabajos1 = new DefaultComboBoxModel(vTrabajos.toArray());
		modeloTrabajos2 = new DefaultComboBoxModel(vTrabajos.toArray());
		modeloTrabajos3 = new DefaultComboBoxModel(vTrabajos.toArray());
		modeloPersonal1 = new DefaultComboBoxModel(vPersonal.toArray());
		modeloPersonal2 = new DefaultComboBoxModel(vPersonal.toArray());
		modeloPersonal3 = new DefaultComboBoxModel(vPersonal.toArray());
		
		comboxClienteAnPr.setModel(modeloClientes);
		comboxMaterialTransportarAnPr.setModel(modeloMateriales);
		comboxJefeAnPr.setModel(modeloEncargados);
		comboxProyectoLsPr.setModel(modeloProyectos);
		comboxProyectoAnPa.setModel(modeloProyectos);
		//
		comboxProyectoMoPa.setModel(modeloProyectosConParte);
		//Combox Personal
		comboxPersonalAnPa1.setModel(modeloEncargados);
		comboxPersonalAnPa2.setModel(modeloEncargados);
		comboxPersonalAnPa3.setModel(modeloEncargados);
		comboxPersonalAnPr1.setModel(modeloEncargados);
		comboxPersonalAnPr2.setModel(modeloEncargados);
		comboxPersonalAnPr3.setModel(modeloEncargados);
		comboxMaterialesMoPa1.setModel(modeloEncargados);
		comboxMaterialesMoPa2.setModel(modeloEncargados);
		comboxMaterialesMoPa3.setModel(modeloEncargados);
		
		comboxPersonalAnPa1.setModel(modeloPersonal1);
		comboxPersonalAnPa2.setModel(modeloPersonal2);
		comboxPersonalAnPa3.setModel(modeloPersonal3);
		comboxPersonalAnPr1.setModel(modeloPersonal1);
		comboxPersonalAnPr2.setModel(modeloPersonal2);
		comboxPersonalAnPr3.setModel(modeloPersonal3);
		comboxPersonalMoPa1.setModel(modeloPersonal1);
		comboxPersonalMoPa2.setModel(modeloPersonal2);
		comboxPersonalMoPa3.setModel(modeloPersonal3);
		
		comboxMaterialesAnPa1.setModel(modeloArticulos1);
		comboxMaterialesAnPa2.setModel(modeloArticulos2);
		comboxMaterialesAnPa3.setModel(modeloArticulos3);
		comboxMaterialesAnPr1.setModel(modeloArticulos1);
		comboxMaterialesAnPr2.setModel(modeloArticulos2);
		comboxMaterialesAnPr3.setModel(modeloArticulos3);
		comboxMaterialesMoPa1.setModel(modeloArticulos1);
		comboxMaterialesMoPa2.setModel(modeloArticulos2);
		comboxMaterialesMoPa3.setModel(modeloArticulos3);
		
		comboxTrabajosAnPa1.setModel(modeloTrabajos1);
		comboxTrabajosAnPa2.setModel(modeloTrabajos2);
		comboxTrabajosAnPa3.setModel(modeloTrabajos3);
		comboxTrabajosAnPr1.setModel(modeloTrabajos1);
		comboxTrabajosAnPr2.setModel(modeloTrabajos2);
		comboxTrabajosAnPr3.setModel(modeloTrabajos3);
		comboxTrabajosMoPa1.setModel(modeloTrabajos1);
		comboxTrabajosMoPa2.setModel(modeloTrabajos2);
		comboxTrabajosMoPa3.setModel(modeloTrabajos3);
		
		comboxVehiculosAnPa1.setModel(modeloVehiculos1);
		comboxVehiculosAnPa2.setModel(modeloVehiculos2);
		comboxVehiculosAnPa3.setModel(modeloVehiculos3);
		comboxVehiculosAnPr1.setModel(modeloVehiculos1);
		comboxVehiculosAnPr2.setModel(modeloVehiculos2);
		comboxVehiculosAnPr3.setModel(modeloVehiculos3);
		comboxVehiculosMoPa1.setModel(modeloVehiculos1);
		comboxVehiculosMoPa2.setModel(modeloVehiculos2);
		comboxVehiculosMoPa3.setModel(modeloVehiculos3);
		actualizarDatosLsPr();
		actualizarDatosMoPa();
	}
	
	private void actualizarDatosMoPa() {
		lblAmpliarMoPa2.setVisible(false);
		lblAmpliarMoPa3.setVisible(false);
		lblAmpliarMoPa5.setVisible(false);
		lblAmpliarMoPa6.setVisible(false);
		lblAmpliarMoPa8.setVisible(false);
		lblAmpliarMoPa9.setVisible(false);
		lblAmpliarMoPa11.setVisible(false);
		lblAmpliarMoPa12.setVisible(false);
		Proyecto pr = (Proyecto) comboxProyectoMoPa.getSelectedItem();
		amp1MoPa = true; amp2MoPa = true; amp3MoPa = true; amp4MoPa = true; amp5MoPa = true; amp6MoPa = true; amp7MoPa = true; amp8MoPa = true; amp9MoPa = true; amp10MoPa = true; amp11MoPa = true; amp12MoPa = true;
		if (!estado) {
			lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
			lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
			lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
			lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
			lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
			lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
			lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\+.png"));lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		comboxTrabajosMoPa1.setVisible(false);
		txtCantidadTrabajosMoPa1.setVisible(false);
		txtImporteTrabajosMoPa1.setVisible(false);
		
		comboxTrabajosMoPa2.setVisible(false);
		txtCantidadTrabajosMoPa2.setVisible(false);
		txtImporteTrabajosMoPa2.setVisible(false);
		
		comboxTrabajosMoPa3.setVisible(false);
		txtCantidadTrabajosMoPa3.setVisible(false);
		txtImporteTrabajosMoPa3.setVisible(false);
		
		ArrayList<Trabajo> vTrabajos= db.devolverEstimacionTrabajos(pr.getCod_proyecto());
		
		
		for (int i=0;i<vTrabajos.size();i++) {
			switch (i) {
				case 0:
					lblAmpliarMoPa2.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp1MoPa = false;
					comboxTrabajosMoPa1.setVisible(true);
					txtCantidadTrabajosMoPa1.setVisible(true);
					txtImporteTrabajosMoPa1.setVisible(true);
					comboxTrabajosMoPa1.setSelectedItem(vTrabajos.get(i));;
					txtCantidadTrabajosMoPa1.setText(Integer.toString(vTrabajos.get(i).getCantidad()));
					txtImporteTrabajosMoPa1.setText(Double.toString(vTrabajos.get(i).getImporte_ud()));
					break;
				case 1:
					lblAmpliarMoPa3.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp2MoPa = false;
					comboxTrabajosMoPa2.setVisible(true);
					txtCantidadTrabajosMoPa2.setVisible(true);
					txtImporteTrabajosMoPa2.setVisible(true);
					comboxTrabajosMoPa2.setSelectedItem(vTrabajos.get(i));
					txtCantidadTrabajosMoPa2.setText(Integer.toString(vTrabajos.get(i).getCantidad()));
					txtImporteTrabajosMoPa2.setText(Double.toString(vTrabajos.get(i).getImporte_ud()));
					break;
				case 2:
					if (!estado) {
						lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp3MoPa = false;
					comboxTrabajosMoPa3.setVisible(true);
					txtCantidadTrabajosMoPa3.setVisible(true);
					txtImporteTrabajosMoPa3.setVisible(true);
					comboxTrabajosMoPa3.setSelectedItem(vTrabajos.get(i));
					txtCantidadTrabajosMoPa3.setText(Integer.toString(vTrabajos.get(i).getCantidad()));
					txtImporteTrabajosMoPa3.setText(Double.toString(vTrabajos.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
		
		comboxMaterialesMoPa1.setVisible(false);
		txtCantidadMaterialesMoPa1.setVisible(false);
		txtImporteMaterialesMoPa1.setVisible(false);
		
		comboxMaterialesMoPa2.setVisible(false);
		txtCantidadMaterialesMoPa2.setVisible(false);
		txtImporteMaterialesMoPa2.setVisible(false);
		
		comboxMaterialesMoPa3.setVisible(false);
		txtCantidadMaterialesMoPa3.setVisible(false);
		txtImporteMaterialesMoPa3.setVisible(false);
		
		ArrayList<Material> vMateriales = db.devolverEstimacionMateriales(pr.getCod_proyecto());
		
		for (int i=0;i<vMateriales.size();i++) {
			switch (i) {
				case 0:
					lblAmpliarMoPa5.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp4MoPa = false;
					comboxMaterialesMoPa1.setVisible(true);
					txtCantidadMaterialesMoPa1.setVisible(true);
					txtImporteMaterialesMoPa1.setVisible(true);
					comboxMaterialesMoPa1.setSelectedItem(vMateriales.get(i));
					txtCantidadMaterialesMoPa1.setText(Integer.toString(vMateriales.get(i).getCantidad()));
					txtImporteMaterialesMoPa1.setText(Double.toString(vMateriales.get(i).getImporte_ud()));
					break;
				case 1:
					lblAmpliarMoPa6.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp5MoPa = false;
					comboxMaterialesMoPa2.setVisible(true);
					txtCantidadMaterialesMoPa2.setVisible(true);
					txtImporteMaterialesMoPa2.setVisible(true);
					comboxMaterialesMoPa2.setSelectedItem(vMateriales.get(i));
					txtCantidadMaterialesMoPa2.setText(Integer.toString(vMateriales.get(i).getCantidad()));
					txtImporteMaterialesMoPa2.setText(Double.toString(vMateriales.get(i).getImporte_ud()));
					break;
				case 2:
					if (!estado) {
						lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp6MoPa = false;
					comboxMaterialesMoPa3.setVisible(true);
					txtCantidadMaterialesMoPa3.setVisible(true);
					txtImporteMaterialesMoPa3.setVisible(true);
					comboxMaterialesMoPa3.setSelectedItem(vMateriales.get(i));
					txtCantidadMaterialesMoPa3.setText(Integer.toString(vMateriales.get(i).getCantidad()));
					txtImporteMaterialesMoPa3.setText(Double.toString(vMateriales.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
		
		comboxPersonalMoPa1.setVisible(false);
		txtCantidadPersonalMoPa1.setVisible(false);
		txtImportePersonalMoPa1.setVisible(false);
		
		comboxPersonalMoPa2.setVisible(false);
		txtCantidadPersonalMoPa2.setVisible(false);
		txtImportePersonalMoPa2.setVisible(false);
		
		comboxPersonalMoPa3.setVisible(false);
		txtCantidadPersonalMoPa3.setVisible(false);
		txtImportePersonalMoPa3.setVisible(false);
		
		ArrayList<Empleado> vEmpleados = db.devolverEstimacionEmpleados(pr.getCod_proyecto());
		
		for (int i=0;i<vEmpleados.size();i++) {
			switch (i) {
				case 0:
					lblAmpliarMoPa8.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp7MoPa = false;
					comboxPersonalMoPa1.setVisible(true);
					txtCantidadPersonalMoPa1.setVisible(true);
					txtImportePersonalMoPa1.setVisible(true);
					comboxPersonalMoPa1.setSelectedItem(vEmpleados.get(i));
					txtCantidadPersonalMoPa1.setText(Integer.toString(vEmpleados.get(i).getCantidad()));
					txtImportePersonalMoPa1.setText(Double.toString(vEmpleados.get(i).getImporte_ud()));
					break;
				case 1:
					lblAmpliarMoPa9.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp8MoPa = false;
					comboxPersonalMoPa2.setVisible(true);
					txtCantidadPersonalMoPa2.setVisible(true);
					txtImportePersonalMoPa2.setVisible(true);
					comboxPersonalMoPa2.setSelectedItem(vEmpleados.get(i));
					txtCantidadPersonalMoPa2.setText(Integer.toString(vEmpleados.get(i).getCantidad()));
					txtImportePersonalMoPa2.setText(Double.toString(vEmpleados.get(i).getImporte_ud()));
					break;
				case 2:
					if (!estado) {
						lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp9MoPa = false;
					comboxPersonalMoPa3.setVisible(true);
					txtCantidadPersonalMoPa3.setVisible(true);
					txtImportePersonalMoPa3.setVisible(true);
					comboxPersonalMoPa3.setSelectedItem(vEmpleados.get(i));
					txtCantidadPersonalMoPa3.setText(Integer.toString(vEmpleados.get(i).getCantidad()));
					txtImportePersonalMoPa3.setText(Double.toString(vEmpleados.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
		
		comboxVehiculosMoPa1.setVisible(false);
		txtCantidadVehiculosMoPa1.setVisible(false);
		txtImporteVehiculosMoPa1.setVisible(false);
		
		comboxVehiculosMoPa2.setVisible(false);
		txtCantidadVehiculosMoPa2.setVisible(false);
		txtImporteVehiculosMoPa2.setVisible(false);
		
		comboxVehiculosMoPa3.setVisible(false);
		txtCantidadVehiculosMoPa3.setVisible(false);
		txtImporteVehiculosMoPa3.setVisible(false);
		
		ArrayList<Vehiculo> vVehiculos = db.devolverEstimacionVehiculos(pr.getCod_proyecto());
		
		for (int i=0;i<vVehiculos.size();i++) {
			switch (i) {
				case 0:
					lblAmpliarMoPa11.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp10MoPa = false;
					comboxVehiculosMoPa1.setVisible(true);
					txtCantidadVehiculosMoPa1.setVisible(true);
					txtImporteVehiculosMoPa1.setVisible(true);
					comboxVehiculosMoPa1.setSelectedItem(vVehiculos.get(i));
					txtCantidadVehiculosMoPa1.setText(Integer.toString(vVehiculos.get(i).getCantidad()));
					txtImporteVehiculosMoPa1.setText(Double.toString(vVehiculos.get(i).getImporte_ud()));
					break;
				case 1:
					lblAmpliarMoPa12.setVisible(true);
					if (!estado) {
						lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp11MoPa = false;
					comboxVehiculosMoPa2.setVisible(true);
					txtCantidadVehiculosMoPa2.setVisible(true);
					txtImporteVehiculosMoPa2.setVisible(true);
					comboxVehiculosMoPa2.setSelectedItem(vVehiculos.get(i));
					txtCantidadVehiculosMoPa2.setText(Integer.toString(vVehiculos.get(i).getCantidad()));
					txtImporteVehiculosMoPa2.setText(Double.toString(vVehiculos.get(i).getImporte_ud()));
					break;
				case 2:
					if (!estado) {
						lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
					} else {
						lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
					}
					amp12MoPa = false;
					comboxVehiculosMoPa3.setVisible(true);
					txtCantidadVehiculosMoPa3.setVisible(true);
					txtImporteVehiculosMoPa3.setVisible(true);
					comboxVehiculosMoPa3.setSelectedItem(vVehiculos.get(i));
					txtCantidadVehiculosMoPa3.setText(Integer.toString(vVehiculos.get(i).getCantidad()));
					txtImporteVehiculosMoPa3.setText(Double.toString(vVehiculos.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
	}
	
	private void actualizarDatosLsPr() {
		Proyecto pr = (Proyecto) comboxProyectoLsPr.getSelectedItem();
		txtNombreProyectoLsPr.setText(pr.getNombre_proyecto());
		txtJefeLsPr.setText(pr.getNombre_encargado());
		txtClienteLsPr.setText(pr.getNombre_cliente());
		txtFechaIniLsPr.setText(pr.getFecha_inicio());
		txtFechaFinLsPr.setText(pr.getFecha_fin());
		if (pr.getCod_material()==0) {
			txtMaterialLsPr.setText("-");
		} else {
			txtMaterialLsPr.setText(Integer.toString(pr.getCod_material()));
		}
		
		txtNombreTrabajosLsPr1.setVisible(false);
		txtCantidadTrabajosLsPr1.setVisible(false);
		txtImporteTrabajosLsPr1.setVisible(false);
		
		txtNombreTrabajosLsPr2.setVisible(false);
		txtCantidadTrabajosLsPr2.setVisible(false);
		txtImporteTrabajosLsPr2.setVisible(false);
		
		txtNombreTrabajosLsPr3.setVisible(false);
		txtCantidadTrabajosLsPr3.setVisible(false);
		txtImporteTrabajosLsPr3.setVisible(false);
		
		ArrayList<Trabajo> vTrabajos= db.devolverEstimacionTrabajos(pr.getCod_proyecto());
		
		
		for (int i=0;i<vTrabajos.size();i++) {
			switch (i) {
				case 0:
					txtNombreTrabajosLsPr1.setVisible(true);
					txtCantidadTrabajosLsPr1.setVisible(true);
					txtImporteTrabajosLsPr1.setVisible(true);
					txtNombreTrabajosLsPr1.setText(vTrabajos.get(i).getNombre_trabajo());
					txtCantidadTrabajosLsPr1.setText(Integer.toString(vTrabajos.get(i).getCantidad()));
					txtImporteTrabajosLsPr1.setText(Double.toString(vTrabajos.get(i).getImporte_ud()));
					break;
				case 1:
					txtNombreTrabajosLsPr2.setVisible(true);
					txtCantidadTrabajosLsPr2.setVisible(true);
					txtImporteTrabajosLsPr2.setVisible(true);
					txtNombreTrabajosLsPr2.setText(vTrabajos.get(i).getNombre_trabajo());
					txtCantidadTrabajosLsPr2.setText(Integer.toString(vTrabajos.get(i).getCantidad()));
					txtImporteTrabajosLsPr2.setText(Double.toString(vTrabajos.get(i).getImporte_ud()));
					break;
				case 2:
					txtNombreTrabajosLsPr3.setVisible(true);
					txtCantidadTrabajosLsPr3.setVisible(true);
					txtImporteTrabajosLsPr3.setVisible(true);
					txtNombreTrabajosLsPr3.setText(vTrabajos.get(i).getNombre_trabajo());
					txtCantidadTrabajosLsPr3.setText(Integer.toString(vTrabajos.get(i).getCantidad()));
					txtImporteTrabajosLsPr3.setText(Double.toString(vTrabajos.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
		
		txtNombreMaterialesLsPr1.setVisible(false);
		txtCantidadMaterialesLsPr1.setVisible(false);
		txtImporteMaterialesLsPr1.setVisible(false);
		
		txtNombreMaterialesLsPr2.setVisible(false);
		txtCantidadMaterialesLsPr2.setVisible(false);
		txtImporteMaterialesLsPr2.setVisible(false);
		
		txtNombreMaterialesLsPr3.setVisible(false);
		txtCantidadMaterialesLsPr3.setVisible(false);
		txtImporteMaterialesLsPr3.setVisible(false);
		
		ArrayList<Material> vMateriales = db.devolverEstimacionMateriales(pr.getCod_proyecto());
		
		for (int i=0;i<vMateriales.size();i++) {
			switch (i) {
				case 0:
					txtNombreMaterialesLsPr1.setVisible(true);
					txtCantidadMaterialesLsPr1.setVisible(true);
					txtImporteMaterialesLsPr1.setVisible(true);
					txtNombreMaterialesLsPr1.setText(Integer.toString(vMateriales.get(i).getCod_material()));
					txtCantidadMaterialesLsPr1.setText(Integer.toString(vMateriales.get(i).getCantidad()));
					txtImporteMaterialesLsPr1.setText(Double.toString(vMateriales.get(i).getImporte_ud()));
					break;
				case 1:
					txtNombreMaterialesLsPr2.setVisible(true);
					txtCantidadMaterialesLsPr2.setVisible(true);
					txtImporteMaterialesLsPr2.setVisible(true);
					txtNombreMaterialesLsPr2.setText(Integer.toString(vMateriales.get(i).getCod_material()));
					txtCantidadMaterialesLsPr2.setText(Integer.toString(vMateriales.get(i).getCantidad()));
					txtImporteMaterialesLsPr2.setText(Double.toString(vMateriales.get(i).getImporte_ud()));
					break;
				case 2:
					txtNombreMaterialesLsPr3.setVisible(true);
					txtCantidadMaterialesLsPr3.setVisible(true);
					txtImporteMaterialesLsPr3.setVisible(true);
					txtNombreMaterialesLsPr3.setText(Integer.toString(vMateriales.get(i).getCod_material()));
					txtCantidadMaterialesLsPr3.setText(Integer.toString(vMateriales.get(i).getCantidad()));
					txtImporteMaterialesLsPr3.setText(Double.toString(vMateriales.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
		
		txtNombrePersonalLsPr1.setVisible(false);
		txtCantidadPersonalLsPr1.setVisible(false);
		txtImportePersonalLsPr1.setVisible(false);
		
		txtNombrePersonalLsPr2.setVisible(false);
		txtCantidadPersonalLsPr2.setVisible(false);
		txtImportePersonalLsPr2.setVisible(false);
		
		txtNombrePersonalLsPr3.setVisible(false);
		txtCantidadPersonalLsPr3.setVisible(false);
		txtImportePersonalLsPr3.setVisible(false);
		
		ArrayList<Empleado> vEmpleados = db.devolverEstimacionEmpleados(pr.getCod_proyecto());
		
		for (int i=0;i<vEmpleados.size();i++) {
			switch (i) {
				case 0:
					txtNombrePersonalLsPr1.setVisible(true);
					txtCantidadPersonalLsPr1.setVisible(true);
					txtImportePersonalLsPr1.setVisible(true);
					txtNombrePersonalLsPr1.setText(vEmpleados.get(i).getNombre_encargado());
					txtCantidadPersonalLsPr1.setText(Integer.toString(vEmpleados.get(i).getCantidad()));
					txtImportePersonalLsPr1.setText(Double.toString(vEmpleados.get(i).getImporte_ud()));
					break;
				case 1:
					txtNombrePersonalLsPr2.setVisible(true);
					txtCantidadPersonalLsPr2.setVisible(true);
					txtImportePersonalLsPr2.setVisible(true);
					txtNombrePersonalLsPr2.setText(vEmpleados.get(i).getNombre_encargado());
					txtCantidadPersonalLsPr2.setText(Integer.toString(vEmpleados.get(i).getCantidad()));
					txtImportePersonalLsPr2.setText(Double.toString(vEmpleados.get(i).getImporte_ud()));
					break;
				case 2:
					txtNombrePersonalLsPr3.setVisible(true);
					txtCantidadPersonalLsPr3.setVisible(true);
					txtImportePersonalLsPr3.setVisible(true);
					txtNombrePersonalLsPr3.setText(vEmpleados.get(i).getNombre_encargado());
					txtCantidadPersonalLsPr3.setText(Integer.toString(vEmpleados.get(i).getCantidad()));
					txtImportePersonalLsPr3.setText(Double.toString(vEmpleados.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
		
		txtNombreVehiculosLsPr1.setVisible(false);
		txtCantidadVehiculosLsPr1.setVisible(false);
		txtImporteVehiculosLsPr1.setVisible(false);
		
		txtNombreVehiculosLsPr2.setVisible(false);
		txtCantidadVehiculosLsPr2.setVisible(false);
		txtImporteVehiculosLsPr2.setVisible(false);
		
		txtNombreVehiculosLsPr3.setVisible(false);
		txtCantidadVehiculosLsPr3.setVisible(false);
		txtImporteVehiculosLsPr3.setVisible(false);
		
		ArrayList<Vehiculo> vVehiculos = db.devolverEstimacionVehiculos(pr.getCod_proyecto());
		
		for (int i=0;i<vVehiculos.size();i++) {
			switch (i) {
				case 0:
					txtNombreVehiculosLsPr1.setVisible(true);
					txtCantidadVehiculosLsPr1.setVisible(true);
					txtImporteVehiculosLsPr1.setVisible(true);
					txtNombreVehiculosLsPr1.setText(vVehiculos.get(i).getMatricula());
					txtCantidadVehiculosLsPr1.setText(Integer.toString(vVehiculos.get(i).getCantidad()));
					txtImporteVehiculosLsPr1.setText(Double.toString(vVehiculos.get(i).getImporte_ud()));
					break;
				case 1:
					txtNombreVehiculosLsPr2.setVisible(true);
					txtCantidadVehiculosLsPr2.setVisible(true);
					txtImporteVehiculosLsPr2.setVisible(true);
					txtNombreVehiculosLsPr2.setText(vVehiculos.get(i).getMatricula());
					txtCantidadVehiculosLsPr2.setText(Integer.toString(vVehiculos.get(i).getCantidad()));
					txtImporteVehiculosLsPr2.setText(Double.toString(vVehiculos.get(i).getImporte_ud()));
					break;
				case 2:
					txtNombreVehiculosLsPr3.setVisible(true);
					txtCantidadVehiculosLsPr3.setVisible(true);
					txtImporteVehiculosLsPr3.setVisible(true);
					txtNombreVehiculosLsPr3.setText(vVehiculos.get(i).getMatricula());
					txtCantidadVehiculosLsPr3.setText(Integer.toString(vVehiculos.get(i).getCantidad()));
					txtImporteVehiculosLsPr3.setText(Double.toString(vVehiculos.get(i).getImporte_ud()));
					break;
				default:
					break;
			}
		}
		//Arraylist<Empleado>
		//Arraylist<Vehiculo>
		//Arraylist<Material>
	}
	
	private void initApp() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		min = new JLabel("New label");
		min.addMouseListener(new MinMouseListener());
		
		lblAnadirUsuario = new JLabel("Añadir Usuario");
		lblAnadirUsuario.addMouseListener(new LblAnadirUsuarioMouseListener());
		
		panelModificarParte = new JPanel();
		panelModificarParte.setBounds(0, 54, 1280, 666);
		contentPane.add(panelModificarParte);
		panelModificarParte.setLayout(null);
		panelModificarParte.setOpaque(false);
		
		comboxPersonalMoPa1 = new JComboBox();
		comboxPersonalMoPa1.setBounds(220, 409, 175, 30);
		panelModificarParte.add(comboxPersonalMoPa1);
		
		txtCantidadPersonalMoPa1 = new JTextField();
		txtCantidadPersonalMoPa1.setColumns(10);
		txtCantidadPersonalMoPa1.setBounds(220, 450, 77, 30);
		panelModificarParte.add(txtCantidadPersonalMoPa1);
		
		txtImportePersonalMoPa1 = new JTextField();
		txtImportePersonalMoPa1.setColumns(10);
		txtImportePersonalMoPa1.setBounds(318, 450, 77, 30);
		panelModificarParte.add(txtImportePersonalMoPa1);
		
		comboxPersonalMoPa2 = new JComboBox();
		comboxPersonalMoPa2.setBounds(220, 491, 175, 30);
		panelModificarParte.add(comboxPersonalMoPa2);
		
		txtCantidadPersonalMoPa2 = new JTextField();
		txtCantidadPersonalMoPa2.setColumns(10);
		txtCantidadPersonalMoPa2.setBounds(220, 532, 77, 30);
		panelModificarParte.add(txtCantidadPersonalMoPa2);
		
		txtImportePersonalMoPa2 = new JTextField();
		txtImportePersonalMoPa2.setColumns(10);
		txtImportePersonalMoPa2.setBounds(318, 532, 77, 30);
		panelModificarParte.add(txtImportePersonalMoPa2);
		
		comboxPersonalMoPa3 = new JComboBox();
		comboxPersonalMoPa3.setBounds(220, 573, 175, 30);
		panelModificarParte.add(comboxPersonalMoPa3);
		
		txtCantidadPersonalMoPa3 = new JTextField();
		txtCantidadPersonalMoPa3.setColumns(10);
		txtCantidadPersonalMoPa3.setBounds(220, 614, 77, 30);
		panelModificarParte.add(txtCantidadPersonalMoPa3);
		
		txtImportePersonalMoPa3 = new JTextField();
		txtImportePersonalMoPa3.setColumns(10);
		txtImportePersonalMoPa3.setBounds(318, 614, 77, 30);
		panelModificarParte.add(txtImportePersonalMoPa3);
		
		comboxVehiculosMoPa1 = new JComboBox();
		comboxVehiculosMoPa1.setBounds(435, 409, 175, 30);
		panelModificarParte.add(comboxVehiculosMoPa1);
		
		txtCantidadVehiculosMoPa1 = new JTextField();
		txtCantidadVehiculosMoPa1.setColumns(10);
		txtCantidadVehiculosMoPa1.setBounds(435, 450, 77, 30);
		panelModificarParte.add(txtCantidadVehiculosMoPa1);
		
		txtImporteVehiculosMoPa1 = new JTextField();
		txtImporteVehiculosMoPa1.setColumns(10);
		txtImporteVehiculosMoPa1.setBounds(533, 450, 77, 30);
		panelModificarParte.add(txtImporteVehiculosMoPa1);
		
		comboxVehiculosMoPa2 = new JComboBox();
		comboxVehiculosMoPa2.setBounds(435, 491, 175, 30);
		panelModificarParte.add(comboxVehiculosMoPa2);
		
		txtCantidadVehiculosMoPa2 = new JTextField();
		txtCantidadVehiculosMoPa2.setColumns(10);
		txtCantidadVehiculosMoPa2.setBounds(435, 532, 77, 30);
		panelModificarParte.add(txtCantidadVehiculosMoPa2);
		
		txtImporteVehiculosMoPa2 = new JTextField();
		txtImporteVehiculosMoPa2.setColumns(10);
		txtImporteVehiculosMoPa2.setBounds(533, 532, 77, 30);
		panelModificarParte.add(txtImporteVehiculosMoPa2);
		
		comboxVehiculosMoPa3 = new JComboBox();
		comboxVehiculosMoPa3.setBounds(435, 573, 175, 30);
		panelModificarParte.add(comboxVehiculosMoPa3);
		
		txtCantidadVehiculosMoPa3 = new JTextField();
		txtCantidadVehiculosMoPa3.setColumns(10);
		txtCantidadVehiculosMoPa3.setBounds(435, 614, 77, 30);
		panelModificarParte.add(txtCantidadVehiculosMoPa3);
		
		txtImporteVehiculosMoPa3 = new JTextField();
		txtImporteVehiculosMoPa3.setColumns(10);
		txtImporteVehiculosMoPa3.setBounds(533, 614, 77, 30);
		panelModificarParte.add(txtImporteVehiculosMoPa3);
		
		comboxMaterialesMoPa1 = new JComboBox();
		comboxMaterialesMoPa1.setBounds(650, 409, 175, 30);
		panelModificarParte.add(comboxMaterialesMoPa1);
		
		txtCantidadMaterialesMoPa1 = new JTextField();
		txtCantidadMaterialesMoPa1.setColumns(10);
		txtCantidadMaterialesMoPa1.setBounds(650, 450, 77, 30);
		panelModificarParte.add(txtCantidadMaterialesMoPa1);
		
		txtImporteMaterialesMoPa1 = new JTextField();
		txtImporteMaterialesMoPa1.setColumns(10);
		txtImporteMaterialesMoPa1.setBounds(748, 450, 77, 30);
		panelModificarParte.add(txtImporteMaterialesMoPa1);
		
		comboxMaterialesMoPa2 = new JComboBox();
		comboxMaterialesMoPa2.setBounds(650, 491, 175, 30);
		panelModificarParte.add(comboxMaterialesMoPa2);
		
		txtCantidadMaterialesMoPa2 = new JTextField();
		txtCantidadMaterialesMoPa2.setColumns(10);
		txtCantidadMaterialesMoPa2.setBounds(650, 532, 77, 30);
		panelModificarParte.add(txtCantidadMaterialesMoPa2);
		
		txtImporteMaterialesMoPa2 = new JTextField();
		txtImporteMaterialesMoPa2.setColumns(10);
		txtImporteMaterialesMoPa2.setBounds(748, 532, 77, 30);
		panelModificarParte.add(txtImporteMaterialesMoPa2);
		
		comboxMaterialesMoPa3 = new JComboBox();
		comboxMaterialesMoPa3.setBounds(650, 573, 175, 30);
		panelModificarParte.add(comboxMaterialesMoPa3);
		
		txtCantidadMaterialesMoPa3 = new JTextField();
		txtCantidadMaterialesMoPa3.setColumns(10);
		txtCantidadMaterialesMoPa3.setBounds(650, 614, 77, 30);
		panelModificarParte.add(txtCantidadMaterialesMoPa3);
		
		txtImporteMaterialesMoPa3 = new JTextField();
		txtImporteMaterialesMoPa3.setColumns(10);
		txtImporteMaterialesMoPa3.setBounds(748, 614, 77, 30);
		panelModificarParte.add(txtImporteMaterialesMoPa3);
		
		comboxTrabajosMoPa1 = new JComboBox();
		comboxTrabajosMoPa1.setBounds(865, 409, 175, 30);
		panelModificarParte.add(comboxTrabajosMoPa1);
		
		txtCantidadTrabajosMoPa1 = new JTextField();
		txtCantidadTrabajosMoPa1.setColumns(10);
		txtCantidadTrabajosMoPa1.setBounds(865, 450, 77, 30);
		panelModificarParte.add(txtCantidadTrabajosMoPa1);
		
		txtImporteTrabajosMoPa1 = new JTextField();
		txtImporteTrabajosMoPa1.setColumns(10);
		txtImporteTrabajosMoPa1.setBounds(963, 450, 77, 30);
		panelModificarParte.add(txtImporteTrabajosMoPa1);
		
		comboxTrabajosMoPa2 = new JComboBox();
		comboxTrabajosMoPa2.setBounds(865, 491, 175, 30);
		panelModificarParte.add(comboxTrabajosMoPa2);
		
		txtCantidadTrabajosMoPa2 = new JTextField();
		txtCantidadTrabajosMoPa2.setColumns(10);
		txtCantidadTrabajosMoPa2.setBounds(865, 532, 77, 30);
		panelModificarParte.add(txtCantidadTrabajosMoPa2);
		
		txtImporteTrabajosMoPa2 = new JTextField();
		txtImporteTrabajosMoPa2.setColumns(10);
		txtImporteTrabajosMoPa2.setBounds(963, 532, 77, 30);
		panelModificarParte.add(txtImporteTrabajosMoPa2);
		
		comboxTrabajosMoPa3 = new JComboBox();
		comboxTrabajosMoPa3.setBounds(865, 573, 175, 30);
		panelModificarParte.add(comboxTrabajosMoPa3);
		
		txtCantidadTrabajosMoPa3 = new JTextField();
		txtCantidadTrabajosMoPa3.setColumns(10);
		txtCantidadTrabajosMoPa3.setBounds(865, 614, 77, 30);
		panelModificarParte.add(txtCantidadTrabajosMoPa3);
		
		txtImporteTrabajosMoPa3 = new JTextField();
		txtImporteTrabajosMoPa3.setColumns(10);
		txtImporteTrabajosMoPa3.setBounds(963, 614, 77, 30);
		panelModificarParte.add(txtImporteTrabajosMoPa3);
		
		lblAmpliarMoPa1 = new JLabel("New label");
		lblAmpliarMoPa1.addMouseListener(new LblAmpliarMoPa1MouseListener());
		lblAmpliarMoPa1.setBounds(405, 409, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa1);
		
		lblAmpliarMoPa2 = new JLabel("New label");
		lblAmpliarMoPa2.addMouseListener(new LblAmpliarMoPa2MouseListener());
		lblAmpliarMoPa2.setBounds(405, 491, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa2);
		
		lblAmpliarMoPa3 = new JLabel("New label");
		lblAmpliarMoPa3.addMouseListener(new LblAmpliarMoPa3MouseListener());
		lblAmpliarMoPa3.setBounds(405, 573, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa3);
		
		lblAmpliarMoPa4 = new JLabel("New label");
		lblAmpliarMoPa4.addMouseListener(new LblAmpliarMoPa4MouseListener());
		lblAmpliarMoPa4.setBounds(620, 409, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa4);
		
		lblAmpliarMoPa5 = new JLabel("New label");
		lblAmpliarMoPa5.addMouseListener(new LblAmpliarMoPa5MouseListener());
		lblAmpliarMoPa5.setBounds(620, 491, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa5);
		
		lblAmpliarMoPa6 = new JLabel("New label");
		lblAmpliarMoPa6.addMouseListener(new LblAmpliarMoPa6MouseListener());
		lblAmpliarMoPa6.setBounds(620, 573, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa6);
		
		lblAmpliarMoPa7 = new JLabel("New label");
		lblAmpliarMoPa7.addMouseListener(new LblAmpliarMoPa7MouseListener());
		lblAmpliarMoPa7.setBounds(835, 409, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa7);
		
		lblAmpliarMoPa8 = new JLabel("New label");
		lblAmpliarMoPa8.addMouseListener(new LblAmpliarMoPa8MouseListener());
		lblAmpliarMoPa8.setBounds(835, 491, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa8);
		
		lblAmpliarMoPa9 = new JLabel("New label");
		lblAmpliarMoPa9.addMouseListener(new LblAmpliarMoPa9MouseListener());
		lblAmpliarMoPa9.setBounds(835, 573, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa9);
		
		lblAmpliarMoPa10 = new JLabel("New label");
		lblAmpliarMoPa10.addMouseListener(new LblAmpliarMoPa10MouseListener());
		lblAmpliarMoPa10.setBounds(1050, 409, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa10);
		
		lblAmpliarMoPa11 = new JLabel("New label");
		lblAmpliarMoPa11.addMouseListener(new LblAmpliarMoPa11MouseListener());
		lblAmpliarMoPa11.setBounds(1050, 491, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa11);
		
		lblAmpliarMoPa12 = new JLabel("New label");
		lblAmpliarMoPa12.addMouseListener(new LblAmpliarMoPa12MouseListener());
		lblAmpliarMoPa12.setBounds(1050, 573, 20, 20);
		panelModificarParte.add(lblAmpliarMoPa12);
		
		lblModificarParteInt = new JLabel("Modificar Parte");
		lblModificarParteInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarParteInt.setForeground(Color.WHITE);
		lblModificarParteInt.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblModificarParteInt.setBounds(525, 50, 230, 43);
		panelModificarParte.add(lblModificarParteInt);
		
		lblPersonalMoPa = new JLabel("Personal:");
		lblPersonalMoPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalMoPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPersonalMoPa.setBounds(200, 368, 215, 30);
		panelModificarParte.add(lblPersonalMoPa);
		
		lblVehiculosMoPa = new JLabel("Vehiculos:");
		lblVehiculosMoPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehiculosMoPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehiculosMoPa.setBounds(415, 368, 215, 30);
		panelModificarParte.add(lblVehiculosMoPa);
		
		lblMaterialesMoPa = new JLabel("Materiales:");
		lblMaterialesMoPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaterialesMoPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterialesMoPa.setBounds(630, 368, 215, 30);
		panelModificarParte.add(lblMaterialesMoPa);
		
		lblTrabajosMoPa = new JLabel("Trabajos:");
		lblTrabajosMoPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrabajosMoPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTrabajosMoPa.setBounds(845, 368, 215, 30);
		panelModificarParte.add(lblTrabajosMoPa);
		
		lblProyectoMoPa = new JLabel("Proyecto:");
		lblProyectoMoPa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProyectoMoPa.setBounds(200, 180, 150, 30);
		panelModificarParte.add(lblProyectoMoPa);
		
		comboxProyectoMoPa = new JComboBox();
		comboxProyectoMoPa.addActionListener(new ComboxProyectoMoPaActionListener());
		comboxProyectoMoPa.setBounds(360, 180, 150, 30);
		panelModificarParte.add(comboxProyectoMoPa);
		
		lblFechaMoPa = new JLabel("Fecha:");
		lblFechaMoPa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaMoPa.setBounds(750, 180, 150, 30);
		panelModificarParte.add(lblFechaMoPa);
		
		txtFechaMoPa = new JTextField();
		txtFechaMoPa.setEditable(false);
		txtFechaMoPa.setColumns(10);
		txtFechaMoPa.setBounds(910, 180, 150, 30);
		panelModificarParte.add(txtFechaMoPa);
		
		comboxPersonalMoPa1.setVisible(false);
		txtCantidadPersonalMoPa1.setVisible(false);
		txtImportePersonalMoPa1.setVisible(false);
		comboxPersonalMoPa2.setVisible(false);
		txtCantidadPersonalMoPa2.setVisible(false);
		txtImportePersonalMoPa2.setVisible(false);
		comboxPersonalMoPa3.setVisible(false);
		txtCantidadPersonalMoPa3.setVisible(false);
		txtImportePersonalMoPa3.setVisible(false);
		comboxVehiculosMoPa1.setVisible(false);
		txtCantidadVehiculosMoPa1.setVisible(false);
		txtImporteVehiculosMoPa1.setVisible(false);
		comboxVehiculosMoPa2.setVisible(false);
		txtCantidadVehiculosMoPa2.setVisible(false);
		txtImporteVehiculosMoPa2.setVisible(false);
		comboxVehiculosMoPa3.setVisible(false);
		txtCantidadVehiculosMoPa3.setVisible(false);
		txtImporteVehiculosMoPa3.setVisible(false);
		comboxMaterialesMoPa1.setVisible(false);
		txtCantidadMaterialesMoPa1.setVisible(false);
		txtImporteMaterialesMoPa1.setVisible(false);
		comboxMaterialesMoPa2.setVisible(false);
		txtCantidadMaterialesMoPa2.setVisible(false);
		txtImporteMaterialesMoPa2.setVisible(false);
		comboxMaterialesMoPa3.setVisible(false);
		txtCantidadMaterialesMoPa3.setVisible(false);
		txtImporteMaterialesMoPa3.setVisible(false);
		comboxTrabajosMoPa1.setVisible(false);
		txtCantidadTrabajosMoPa1.setVisible(false);
		txtImporteTrabajosMoPa1.setVisible(false);
		comboxTrabajosMoPa2.setVisible(false);
		txtCantidadTrabajosMoPa2.setVisible(false);
		txtImporteTrabajosMoPa2.setVisible(false);
		comboxTrabajosMoPa3.setVisible(false);
		txtCantidadTrabajosMoPa3.setVisible(false);
		txtImporteTrabajosMoPa3.setVisible(false);
		
		lblAmpliarMoPa2.setVisible(false);
		lblAmpliarMoPa3.setVisible(false);
		lblAmpliarMoPa5.setVisible(false);
		lblAmpliarMoPa6.setVisible(false);
		lblAmpliarMoPa8.setVisible(false);
		lblAmpliarMoPa9.setVisible(false);
		lblAmpliarMoPa11.setVisible(false);
		lblAmpliarMoPa12.setVisible(false);
		
		
		btnEnviarMoPa = new JButton("Enviar");
		btnEnviarMoPa.addMouseListener(new BtnEnviarAnPr_2MouseListener());
		btnEnviarMoPa.setBounds(564, 120, 150, 30);
		panelModificarParte.add(btnEnviarMoPa);
		txtFechaMoPa.setText(diaHoyString);
		
		panelAnadirParte = new JPanel();
		panelAnadirParte.setBounds(-12, 54, 1292, 666);
		contentPane.add(panelAnadirParte);
		panelAnadirParte.setLayout(null);
		panelAnadirParte.setOpaque(false);
		
		lblAnadirParteInt = new JLabel("Añadir Parte");
		lblAnadirParteInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirParteInt.setForeground(Color.WHITE);
		lblAnadirParteInt.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAnadirParteInt.setBounds(537, 50, 230, 43);
		panelAnadirParte.add(lblAnadirParteInt);
		
		lblProyectoAnPa = new JLabel("Proyecto:");
		lblProyectoAnPa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProyectoAnPa.setBounds(212, 180, 150, 30);
		panelAnadirParte.add(lblProyectoAnPa);
		
		lblFechaAnPa = new JLabel("Fecha:");
		lblFechaAnPa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaAnPa.setBounds(762, 181, 150, 28);
		panelAnadirParte.add(lblFechaAnPa);
		
		txtFechaAnPa = new JTextField();
		txtFechaAnPa.setEditable(false);
		txtFechaAnPa.setColumns(10);
		txtFechaAnPa.setBounds(922, 180, 150, 30);
		panelAnadirParte.add(txtFechaAnPa);
		
		comboxProyectoAnPa = new JComboBox();
		comboxProyectoAnPa.addActionListener(new ComboxProyectoAnPaActionListener());
		comboxProyectoAnPa.setBounds(372, 180, 150, 30);
		panelAnadirParte.add(comboxProyectoAnPa);
		
		comboxPersonalAnPa1 = new JComboBox();
		comboxPersonalAnPa1.setBounds(232, 409, 175, 30);
		panelAnadirParte.add(comboxPersonalAnPa1);
		
		txtCantidadPersonalAnPa1 = new JTextField();
		txtCantidadPersonalAnPa1.setColumns(10);
		txtCantidadPersonalAnPa1.setBounds(232, 450, 77, 30);
		panelAnadirParte.add(txtCantidadPersonalAnPa1);
		
		txtImportePersonalAnPa1 = new JTextField();
		txtImportePersonalAnPa1.setColumns(10);
		txtImportePersonalAnPa1.setBounds(330, 450, 77, 30);
		panelAnadirParte.add(txtImportePersonalAnPa1);
		
		comboxPersonalAnPa2 = new JComboBox();
		comboxPersonalAnPa2.setBounds(232, 491, 175, 30);
		panelAnadirParte.add(comboxPersonalAnPa2);
		
		txtCantidadPersonalAnPa2 = new JTextField();
		txtCantidadPersonalAnPa2.setColumns(10);
		txtCantidadPersonalAnPa2.setBounds(232, 532, 77, 30);
		panelAnadirParte.add(txtCantidadPersonalAnPa2);
		
		txtImportePersonalAnPa2 = new JTextField();
		txtImportePersonalAnPa2.setColumns(10);
		txtImportePersonalAnPa2.setBounds(330, 532, 77, 30);
		panelAnadirParte.add(txtImportePersonalAnPa2);
		
		comboxPersonalAnPa3 = new JComboBox();
		comboxPersonalAnPa3.setBounds(232, 573, 175, 30);
		panelAnadirParte.add(comboxPersonalAnPa3);
		
		txtCantidadPersonalAnPa3 = new JTextField();
		txtCantidadPersonalAnPa3.setColumns(10);
		txtCantidadPersonalAnPa3.setBounds(232, 614, 77, 30);
		panelAnadirParte.add(txtCantidadPersonalAnPa3);
		
		txtImportePersonalAnPa3 = new JTextField();
		txtImportePersonalAnPa3.setColumns(10);
		txtImportePersonalAnPa3.setBounds(330, 614, 77, 30);
		panelAnadirParte.add(txtImportePersonalAnPa3);
		
		comboxVehiculosAnPa1 = new JComboBox();
		comboxVehiculosAnPa1.setBounds(447, 409, 175, 30);
		panelAnadirParte.add(comboxVehiculosAnPa1);
		
		txtCantidadVehiculosAnPa1 = new JTextField();
		txtCantidadVehiculosAnPa1.setColumns(10);
		txtCantidadVehiculosAnPa1.setBounds(447, 450, 77, 30);
		panelAnadirParte.add(txtCantidadVehiculosAnPa1);
		
		txtImporteVehiculosAnPa1 = new JTextField();
		txtImporteVehiculosAnPa1.setColumns(10);
		txtImporteVehiculosAnPa1.setBounds(545, 450, 77, 30);
		panelAnadirParte.add(txtImporteVehiculosAnPa1);
		
		comboxVehiculosAnPa2 = new JComboBox();
		comboxVehiculosAnPa2.setBounds(447, 491, 175, 30);
		panelAnadirParte.add(comboxVehiculosAnPa2);
		
		txtCantidadVehiculosAnPa2 = new JTextField();
		txtCantidadVehiculosAnPa2.setColumns(10);
		txtCantidadVehiculosAnPa2.setBounds(447, 532, 77, 30);
		panelAnadirParte.add(txtCantidadVehiculosAnPa2);
		
		txtImporteVehiculosAnPa2 = new JTextField();
		txtImporteVehiculosAnPa2.setColumns(10);
		txtImporteVehiculosAnPa2.setBounds(545, 532, 77, 30);
		panelAnadirParte.add(txtImporteVehiculosAnPa2);
		
		comboxVehiculosAnPa3 = new JComboBox();
		comboxVehiculosAnPa3.setBounds(447, 573, 175, 30);
		panelAnadirParte.add(comboxVehiculosAnPa3);
		
		txtCantidadVehiculosAnPa3 = new JTextField();
		txtCantidadVehiculosAnPa3.setColumns(10);
		txtCantidadVehiculosAnPa3.setBounds(447, 614, 77, 30);
		panelAnadirParte.add(txtCantidadVehiculosAnPa3);
		
		txtImporteVehiculosAnPa3 = new JTextField();
		txtImporteVehiculosAnPa3.setColumns(10);
		txtImporteVehiculosAnPa3.setBounds(545, 614, 77, 30);
		panelAnadirParte.add(txtImporteVehiculosAnPa3);
		
		comboxMaterialesAnPa1 = new JComboBox();
		comboxMaterialesAnPa1.setBounds(662, 409, 175, 30);
		panelAnadirParte.add(comboxMaterialesAnPa1);
		
		txtCantidadMaterialesAnPa1 = new JTextField();
		txtCantidadMaterialesAnPa1.setColumns(10);
		txtCantidadMaterialesAnPa1.setBounds(662, 450, 77, 30);
		panelAnadirParte.add(txtCantidadMaterialesAnPa1);
		
		txtImporteMaterialesAnPa1 = new JTextField();
		txtImporteMaterialesAnPa1.setColumns(10);
		txtImporteMaterialesAnPa1.setBounds(760, 450, 77, 30);
		panelAnadirParte.add(txtImporteMaterialesAnPa1);
		
		comboxMaterialesAnPa2 = new JComboBox();
		comboxMaterialesAnPa2.setBounds(662, 491, 175, 30);
		panelAnadirParte.add(comboxMaterialesAnPa2);
		
		txtCantidadMaterialesAnPa2 = new JTextField();
		txtCantidadMaterialesAnPa2.setColumns(10);
		txtCantidadMaterialesAnPa2.setBounds(662, 532, 77, 30);
		panelAnadirParte.add(txtCantidadMaterialesAnPa2);
		
		txtImporteMaterialesAnPa2 = new JTextField();
		txtImporteMaterialesAnPa2.setColumns(10);
		txtImporteMaterialesAnPa2.setBounds(760, 532, 77, 30);
		panelAnadirParte.add(txtImporteMaterialesAnPa2);
		
		comboxMaterialesAnPa3 = new JComboBox();
		comboxMaterialesAnPa3.setBounds(662, 573, 175, 30);
		panelAnadirParte.add(comboxMaterialesAnPa3);
		
		txtCantidadMaterialesAnPa3 = new JTextField();
		txtCantidadMaterialesAnPa3.setColumns(10);
		txtCantidadMaterialesAnPa3.setBounds(662, 614, 77, 30);
		panelAnadirParte.add(txtCantidadMaterialesAnPa3);
		
		txtImporteMaterialesAnPa3 = new JTextField();
		txtImporteMaterialesAnPa3.setColumns(10);
		txtImporteMaterialesAnPa3.setBounds(760, 614, 77, 30);
		panelAnadirParte.add(txtImporteMaterialesAnPa3);
		
		comboxTrabajosAnPa1 = new JComboBox();
		comboxTrabajosAnPa1.setBounds(877, 409, 175, 30);
		panelAnadirParte.add(comboxTrabajosAnPa1);
		
		txtCantidadTrabajosAnPa1 = new JTextField();
		txtCantidadTrabajosAnPa1.setColumns(10);
		txtCantidadTrabajosAnPa1.setBounds(877, 450, 77, 30);
		panelAnadirParte.add(txtCantidadTrabajosAnPa1);
		
		txtImporteTrabajosAnPa1 = new JTextField();
		txtImporteTrabajosAnPa1.setColumns(10);
		txtImporteTrabajosAnPa1.setBounds(975, 450, 77, 30);
		panelAnadirParte.add(txtImporteTrabajosAnPa1);
		
		comboxTrabajosAnPa2 = new JComboBox();
		comboxTrabajosAnPa2.setBounds(877, 491, 175, 30);
		panelAnadirParte.add(comboxTrabajosAnPa2);
		
		txtCantidadTrabajosAnPa2 = new JTextField();
		txtCantidadTrabajosAnPa2.setColumns(10);
		txtCantidadTrabajosAnPa2.setBounds(877, 532, 77, 30);
		panelAnadirParte.add(txtCantidadTrabajosAnPa2);
		
		txtImporteTrabajosAnPa2 = new JTextField();
		txtImporteTrabajosAnPa2.setColumns(10);
		txtImporteTrabajosAnPa2.setBounds(975, 532, 77, 30);
		panelAnadirParte.add(txtImporteTrabajosAnPa2);
		
		comboxTrabajosAnPa3 = new JComboBox();
		comboxTrabajosAnPa3.setBounds(877, 573, 175, 30);
		panelAnadirParte.add(comboxTrabajosAnPa3);
		
		txtCantidadTrabajosAnPa3 = new JTextField();
		txtCantidadTrabajosAnPa3.setColumns(10);
		txtCantidadTrabajosAnPa3.setBounds(877, 614, 77, 30);
		panelAnadirParte.add(txtCantidadTrabajosAnPa3);
		
		txtImporteTrabajosAnPa3 = new JTextField();
		txtImporteTrabajosAnPa3.setColumns(10);
		txtImporteTrabajosAnPa3.setBounds(975, 614, 77, 30);
		panelAnadirParte.add(txtImporteTrabajosAnPa3);
		
		lblAmpliarAnPa1 = new JLabel("New label");
		lblAmpliarAnPa1.addMouseListener(new LblAmpliarAnPa1MouseListener());
		lblAmpliarAnPa1.setBounds(417, 409, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa1);
		
		lblAmpliarAnPa2 = new JLabel("New label");
		lblAmpliarAnPa2.addMouseListener(new LblAmpliarAnPa2MouseListener());
		lblAmpliarAnPa2.setBounds(417, 491, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa2);
		
		lblAmpliarAnPa3 = new JLabel("New label");
		lblAmpliarAnPa3.addMouseListener(new LblAmpliarAnPa3MouseListener());
		lblAmpliarAnPa3.setBounds(417, 573, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa3);
		
		lblAmpliarAnPa4 = new JLabel("New label");
		lblAmpliarAnPa4.addMouseListener(new LblAmpliarAnPa4MouseListener());
		lblAmpliarAnPa4.setBounds(632, 409, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa4);
		
		lblAmpliarAnPa5 = new JLabel("New label");
		lblAmpliarAnPa5.addMouseListener(new LblAmpliarAnPa5MouseListener());
		lblAmpliarAnPa5.setBounds(632, 491, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa5);
		
		lblAmpliarAnPa6 = new JLabel("New label");
		lblAmpliarAnPa6.addMouseListener(new LblAmpliarAnPa6MouseListener());
		lblAmpliarAnPa6.setBounds(632, 573, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa6);
		
		lblAmpliarAnPa7 = new JLabel("New label");
		lblAmpliarAnPa7.addMouseListener(new LblAmpliarAnPa7MouseListener());
		lblAmpliarAnPa7.setBounds(847, 409, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa7);
		
		lblAmpliarAnPa8 = new JLabel("New label");
		lblAmpliarAnPa8.addMouseListener(new LblAmpliarAnPa8MouseListener());
		lblAmpliarAnPa8.setBounds(847, 491, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa8);
		
		lblAmpliarAnPa9 = new JLabel("New label");
		lblAmpliarAnPa9.addMouseListener(new LblAmpliarAnPa9MouseListener());
		lblAmpliarAnPa9.setBounds(847, 573, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa9);
		
		lblAmpliarAnPa10 = new JLabel("New label");
		lblAmpliarAnPa10.addMouseListener(new LblAmpliarAnPa10MouseListener());
		lblAmpliarAnPa10.setBounds(1062, 409, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa10);
		
		lblAmpliarAnPa11 = new JLabel("New label");
		lblAmpliarAnPa11.addMouseListener(new LblAmpliarAnPa11MouseListener());
		lblAmpliarAnPa11.setBounds(1062, 491, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa11);
		
		lblAmpliarAnPa12 = new JLabel("New label");
		lblAmpliarAnPa12.addMouseListener(new LblAmpliarAnPa12MouseListener());
		lblAmpliarAnPa12.setBounds(1062, 573, 20, 20);
		panelAnadirParte.add(lblAmpliarAnPa12);
		
		lblPersonalAnPa = new JLabel("Personal:");
		lblPersonalAnPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalAnPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPersonalAnPa.setBounds(212, 368, 215, 30);
		panelAnadirParte.add(lblPersonalAnPa);
		
		lblVehiculosAnPa = new JLabel("Vehiculos:");
		lblVehiculosAnPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehiculosAnPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehiculosAnPa.setBounds(427, 368, 215, 30);
		panelAnadirParte.add(lblVehiculosAnPa);
		
		lblMaterialesAnPa = new JLabel("Materiales:");
		lblMaterialesAnPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaterialesAnPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterialesAnPa.setBounds(642, 368, 215, 30);
		panelAnadirParte.add(lblMaterialesAnPa);
		
		lblTrabajosAnPa = new JLabel("Trabajos:");
		lblTrabajosAnPa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrabajosAnPa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTrabajosAnPa.setBounds(857, 368, 215, 30);
		panelAnadirParte.add(lblTrabajosAnPa);
		
		
		//
		
		//
		comboxPersonalAnPa1.setVisible(false);
		txtCantidadPersonalAnPa1.setVisible(false);
		txtImportePersonalAnPa1.setVisible(false);
		comboxPersonalAnPa2.setVisible(false);
		txtCantidadPersonalAnPa2.setVisible(false);
		txtImportePersonalAnPa2.setVisible(false);
		comboxPersonalAnPa3.setVisible(false);
		txtCantidadPersonalAnPa3.setVisible(false);
		txtImportePersonalAnPa3.setVisible(false);
		comboxVehiculosAnPa1.setVisible(false);
		txtCantidadVehiculosAnPa1.setVisible(false);
		txtImporteVehiculosAnPa1.setVisible(false);
		comboxVehiculosAnPa2.setVisible(false);
		txtCantidadVehiculosAnPa2.setVisible(false);
		txtImporteVehiculosAnPa2.setVisible(false);
		comboxVehiculosAnPa3.setVisible(false);
		txtCantidadVehiculosAnPa3.setVisible(false);
		txtImporteVehiculosAnPa3.setVisible(false);
		comboxMaterialesAnPa1.setVisible(false);
		txtCantidadMaterialesAnPa1.setVisible(false);
		txtImporteMaterialesAnPa1.setVisible(false);
		comboxMaterialesAnPa2.setVisible(false);
		txtCantidadMaterialesAnPa2.setVisible(false);
		txtImporteMaterialesAnPa2.setVisible(false);
		comboxMaterialesAnPa3.setVisible(false);
		txtCantidadMaterialesAnPa3.setVisible(false);
		txtImporteMaterialesAnPa3.setVisible(false);
		comboxTrabajosAnPa1.setVisible(false);
		txtCantidadTrabajosAnPa1.setVisible(false);
		txtImporteTrabajosAnPa1.setVisible(false);
		comboxTrabajosAnPa2.setVisible(false);
		txtCantidadTrabajosAnPa2.setVisible(false);
		txtImporteTrabajosAnPa2.setVisible(false);
		comboxTrabajosAnPa3.setVisible(false);
		txtCantidadTrabajosAnPa3.setVisible(false);
		txtImporteTrabajosAnPa3.setVisible(false);
		
		lblAmpliarAnPa2.setVisible(false);
		lblAmpliarAnPa3.setVisible(false);
		lblAmpliarAnPa5.setVisible(false);
		lblAmpliarAnPa6.setVisible(false);
		lblAmpliarAnPa8.setVisible(false);
		lblAmpliarAnPa9.setVisible(false);
		lblAmpliarAnPa11.setVisible(false);
		lblAmpliarAnPa12.setVisible(false);
		
		
		
		btnEnviarAnPr_1 = new JButton("Enviar");
		btnEnviarAnPr_1.addMouseListener(new BtnEnviarAnPr_1MouseListener());
		btnEnviarAnPr_1.setBounds(576, 120, 150, 30);
		panelAnadirParte.add(btnEnviarAnPr_1);
		
		panelAnadirProyecto = new JPanel();
		panelAnadirProyecto.setBounds(0, 54, 1280, 666);
		panelAnadirProyecto.setOpaque(false);
		contentPane.add(panelAnadirProyecto);
		panelAnadirProyecto.setLayout(null);
		
		lblAnadirProyectoInt = new JLabel("Añadir Proyecto");
		lblAnadirProyectoInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirProyectoInt.setForeground(Color.WHITE);
		lblAnadirProyectoInt.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAnadirProyectoInt.setBounds(540, 50, 200, 43);
		panelAnadirProyecto.add(lblAnadirProyectoInt);
		
		lblNombreProyectoAnPr = new JLabel("Nombre Proyecto:");
		lblNombreProyectoAnPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreProyectoAnPr.setBounds(200, 180, 150, 30);
		panelAnadirProyecto.add(lblNombreProyectoAnPr);
		
		lblClienteAnPr = new JLabel("Cliente:");
		lblClienteAnPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClienteAnPr.setBounds(200, 221, 150, 30);
		panelAnadirProyecto.add(lblClienteAnPr);
		
		lblJefeProyectoAnPr = new JLabel("Jefe Proyecto:");
		lblJefeProyectoAnPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJefeProyectoAnPr.setBounds(200, 262, 150, 30);
		panelAnadirProyecto.add(lblJefeProyectoAnPr);
		
		lblFechaInicioAnPr = new JLabel("Fecha Inicio:");
		lblFechaInicioAnPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaInicioAnPr.setBounds(750, 180, 150, 30);
		panelAnadirProyecto.add(lblFechaInicioAnPr);
		
		lblMaterialTransportarAnPr = new JLabel("Material a Transportar:");
		lblMaterialTransportarAnPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterialTransportarAnPr.setBounds(750, 262, 150, 30);
		panelAnadirProyecto.add(lblMaterialTransportarAnPr);
		
		dateChooserFechaInicioAnPr = new JDateChooser();
		dateChooserFechaInicioAnPr.addPropertyChangeListener(new DateChooserFechaInicioAnPrPropertyChangeListener());
		
		dateChooserFechaFinAnPr = new JDateChooser();
		dateChooserFechaFinAnPr.setBounds(910, 221, 150, 30);
		panelAnadirProyecto.add(dateChooserFechaFinAnPr);
		dateChooserFechaFinAnPr.setMinSelectableDate(diaHoy);
		dateChooserFechaInicioAnPr.setBounds(910, 180, 150, 30);
		panelAnadirProyecto.add(dateChooserFechaInicioAnPr);
		
		lblFechaFinAnPr = new JLabel("Fecha Fin");
		lblFechaFinAnPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaFinAnPr.setBounds(750, 221, 150, 30);
		panelAnadirProyecto.add(lblFechaFinAnPr);
		
		comboxMaterialTransportarAnPr = new JComboBox();
		comboxMaterialTransportarAnPr.setBounds(910, 262, 150, 30);
		panelAnadirProyecto.add(comboxMaterialTransportarAnPr);
		
		comboxJefeAnPr = new JComboBox();
		comboxJefeAnPr.setBounds(360, 262, 150, 30);
		panelAnadirProyecto.add(comboxJefeAnPr);
		
		comboxClienteAnPr = new JComboBox();
		comboxClienteAnPr.setBounds(360, 221, 150, 30);
		panelAnadirProyecto.add(comboxClienteAnPr);
		
		textFieldNombreAnPr = new JTextField();
		textFieldNombreAnPr.setBounds(360, 180, 150, 30);
		panelAnadirProyecto.add(textFieldNombreAnPr);
		textFieldNombreAnPr.setColumns(10);
		
		lblPersonalAnPr = new JLabel("Personal:");
		lblPersonalAnPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalAnPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPersonalAnPr.setBounds(200, 368, 215, 30);
		panelAnadirProyecto.add(lblPersonalAnPr);
		
		lblVehiculosAnPr = new JLabel("Vehiculos:");
		lblVehiculosAnPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehiculosAnPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehiculosAnPr.setBounds(415, 368, 215, 30);
		panelAnadirProyecto.add(lblVehiculosAnPr);
		
		lblMaterialesAnPr = new JLabel("Materiales:");
		lblMaterialesAnPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaterialesAnPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterialesAnPr.setBounds(630, 368, 215, 30);
		panelAnadirProyecto.add(lblMaterialesAnPr);
		
		lblTrabajosAnPr = new JLabel("Trabajos:");
		lblTrabajosAnPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrabajosAnPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTrabajosAnPr.setBounds(845, 368, 215, 30);
		panelAnadirProyecto.add(lblTrabajosAnPr);
		
		comboxPersonalAnPr1 = new JComboBox();
		comboxPersonalAnPr1.setBounds(220, 409, 175, 30);
		panelAnadirProyecto.add(comboxPersonalAnPr1);
		
		txtCantidadPersonalAnPr1 = new JTextField();
		txtCantidadPersonalAnPr1.setBounds(220, 450, 77, 30);
		panelAnadirProyecto.add(txtCantidadPersonalAnPr1);
		txtCantidadPersonalAnPr1.setColumns(10);
		
		txtImportePersonalAnPr1 = new JTextField();
		txtImportePersonalAnPr1.setColumns(10);
		txtImportePersonalAnPr1.setBounds(318, 450, 77, 30);
		panelAnadirProyecto.add(txtImportePersonalAnPr1);
		
		comboxPersonalAnPr2 = new JComboBox();
		comboxPersonalAnPr2.setBounds(220, 491, 175, 30);
		panelAnadirProyecto.add(comboxPersonalAnPr2);
		
		txtCantidadPersonalAnPr2 = new JTextField();
		txtCantidadPersonalAnPr2.setColumns(10);
		txtCantidadPersonalAnPr2.setBounds(220, 532, 77, 30);
		panelAnadirProyecto.add(txtCantidadPersonalAnPr2);
		
		txtImportePersonalAnPr2 = new JTextField();
		txtImportePersonalAnPr2.setColumns(10);
		txtImportePersonalAnPr2.setBounds(318, 532, 77, 30);
		panelAnadirProyecto.add(txtImportePersonalAnPr2);
		
		comboxPersonalAnPr3 = new JComboBox();
		comboxPersonalAnPr3.setBounds(220, 573, 175, 30);
		panelAnadirProyecto.add(comboxPersonalAnPr3);
		
		txtCantidadPersonalAnPr3 = new JTextField();
		txtCantidadPersonalAnPr3.setColumns(10);
		txtCantidadPersonalAnPr3.setBounds(220, 614, 77, 30);
		panelAnadirProyecto.add(txtCantidadPersonalAnPr3);
		
		txtImportePersonalAnPr3 = new JTextField();
		txtImportePersonalAnPr3.setColumns(10);
		txtImportePersonalAnPr3.setBounds(318, 614, 77, 30);
		panelAnadirProyecto.add(txtImportePersonalAnPr3);
		
		comboxVehiculosAnPr1 = new JComboBox();
		comboxVehiculosAnPr1.setBounds(435, 409, 175, 30);
		panelAnadirProyecto.add(comboxVehiculosAnPr1);
		
		txtCantidadVehiculosAnPr1 = new JTextField();
		txtCantidadVehiculosAnPr1.setColumns(10);
		txtCantidadVehiculosAnPr1.setBounds(435, 450, 77, 30);
		panelAnadirProyecto.add(txtCantidadVehiculosAnPr1);
		
		txtImporteVehiculosAnPr1 = new JTextField();
		txtImporteVehiculosAnPr1.setColumns(10);
		txtImporteVehiculosAnPr1.setBounds(533, 450, 77, 30);
		panelAnadirProyecto.add(txtImporteVehiculosAnPr1);
		
		comboxVehiculosAnPr2 = new JComboBox();
		comboxVehiculosAnPr2.setBounds(435, 491, 175, 30);
		panelAnadirProyecto.add(comboxVehiculosAnPr2);
		
		txtCantidadVehiculosAnPr2 = new JTextField();
		txtCantidadVehiculosAnPr2.setColumns(10);
		txtCantidadVehiculosAnPr2.setBounds(435, 532, 77, 30);
		panelAnadirProyecto.add(txtCantidadVehiculosAnPr2);
		
		txtImporteVehiculosAnPr2 = new JTextField();
		txtImporteVehiculosAnPr2.setColumns(10);
		txtImporteVehiculosAnPr2.setBounds(533, 532, 77, 30);
		panelAnadirProyecto.add(txtImporteVehiculosAnPr2);
		
		comboxVehiculosAnPr3 = new JComboBox();
		comboxVehiculosAnPr3.setBounds(435, 573, 175, 30);
		panelAnadirProyecto.add(comboxVehiculosAnPr3);
		
		txtCantidadVehiculosAnPr3 = new JTextField();
		txtCantidadVehiculosAnPr3.setColumns(10);
		txtCantidadVehiculosAnPr3.setBounds(435, 614, 77, 30);
		panelAnadirProyecto.add(txtCantidadVehiculosAnPr3);
		
		txtImporteVehiculosAnPr3 = new JTextField();
		txtImporteVehiculosAnPr3.setColumns(10);
		txtImporteVehiculosAnPr3.setBounds(533, 614, 77, 30);
		panelAnadirProyecto.add(txtImporteVehiculosAnPr3);
		
		comboxMaterialesAnPr1 = new JComboBox();
		comboxMaterialesAnPr1.setBounds(650, 409, 175, 30);
		panelAnadirProyecto.add(comboxMaterialesAnPr1);
		
		txtCantidadMaterialesAnPr1 = new JTextField();
		txtCantidadMaterialesAnPr1.setColumns(10);
		txtCantidadMaterialesAnPr1.setBounds(650, 450, 77, 30);
		panelAnadirProyecto.add(txtCantidadMaterialesAnPr1);
		
		txtImporteMaterialesAnPr1 = new JTextField();
		txtImporteMaterialesAnPr1.setColumns(10);
		txtImporteMaterialesAnPr1.setBounds(748, 450, 77, 30);
		panelAnadirProyecto.add(txtImporteMaterialesAnPr1);
		
		comboxMaterialesAnPr2 = new JComboBox();
		comboxMaterialesAnPr2.setBounds(650, 491, 175, 30);
		panelAnadirProyecto.add(comboxMaterialesAnPr2);
		
		txtCantidadMaterialesAnPr2 = new JTextField();
		txtCantidadMaterialesAnPr2.setColumns(10);
		txtCantidadMaterialesAnPr2.setBounds(650, 532, 77, 30);
		panelAnadirProyecto.add(txtCantidadMaterialesAnPr2);
		
		txtImporteMaterialesAnPr2 = new JTextField();
		txtImporteMaterialesAnPr2.setColumns(10);
		txtImporteMaterialesAnPr2.setBounds(748, 532, 77, 30);
		panelAnadirProyecto.add(txtImporteMaterialesAnPr2);
		
		comboxMaterialesAnPr3 = new JComboBox();
		comboxMaterialesAnPr3.setBounds(650, 573, 175, 30);
		panelAnadirProyecto.add(comboxMaterialesAnPr3);
		
		txtCantidadMaterialesAnPr3 = new JTextField();
		txtCantidadMaterialesAnPr3.setColumns(10);
		txtCantidadMaterialesAnPr3.setBounds(650, 614, 77, 30);
		panelAnadirProyecto.add(txtCantidadMaterialesAnPr3);
		
		txtImporteMaterialesAnPr3 = new JTextField();
		txtImporteMaterialesAnPr3.setColumns(10);
		txtImporteMaterialesAnPr3.setBounds(748, 614, 77, 30);
		panelAnadirProyecto.add(txtImporteMaterialesAnPr3);
		
		comboxTrabajosAnPr1 = new JComboBox();
		comboxTrabajosAnPr1.setBounds(865, 409, 175, 30);
		panelAnadirProyecto.add(comboxTrabajosAnPr1);
		
		txtCantidadTrabajosAnPr1 = new JTextField();
		txtCantidadTrabajosAnPr1.setColumns(10);
		txtCantidadTrabajosAnPr1.setBounds(865, 450, 77, 30);
		panelAnadirProyecto.add(txtCantidadTrabajosAnPr1);
		
		txtImporteTrabajosAnPr1 = new JTextField();
		txtImporteTrabajosAnPr1.setColumns(10);
		txtImporteTrabajosAnPr1.setBounds(963, 450, 77, 30);
		panelAnadirProyecto.add(txtImporteTrabajosAnPr1);
		
		comboxTrabajosAnPr2 = new JComboBox();
		comboxTrabajosAnPr2.setBounds(865, 491, 175, 30);
		panelAnadirProyecto.add(comboxTrabajosAnPr2);
		
		txtCantidadTrabajosAnPr2 = new JTextField();
		txtCantidadTrabajosAnPr2.setColumns(10);
		txtCantidadTrabajosAnPr2.setBounds(865, 532, 77, 30);
		panelAnadirProyecto.add(txtCantidadTrabajosAnPr2);
		
		txtImporteTrabajosAnPr2 = new JTextField();
		txtImporteTrabajosAnPr2.setColumns(10);
		txtImporteTrabajosAnPr2.setBounds(963, 532, 77, 30);
		panelAnadirProyecto.add(txtImporteTrabajosAnPr2);
		
		comboxTrabajosAnPr3 = new JComboBox();
		comboxTrabajosAnPr3.setBounds(865, 573, 175, 30);
		panelAnadirProyecto.add(comboxTrabajosAnPr3);
		
		txtCantidadTrabajosAnPr3 = new JTextField();
		txtCantidadTrabajosAnPr3.setColumns(10);
		txtCantidadTrabajosAnPr3.setBounds(865, 614, 77, 30);
		panelAnadirProyecto.add(txtCantidadTrabajosAnPr3);
		
		txtImporteTrabajosAnPr3 = new JTextField();
		txtImporteTrabajosAnPr3.setColumns(10);
		txtImporteTrabajosAnPr3.setBounds(963, 614, 77, 30);
		panelAnadirProyecto.add(txtImporteTrabajosAnPr3);
		
		//
		comboxPersonalAnPr1.setVisible(false);
		txtCantidadPersonalAnPr1.setVisible(false);
		txtImportePersonalAnPr1.setVisible(false);
		comboxPersonalAnPr2.setVisible(false);
		txtCantidadPersonalAnPr2.setVisible(false);
		txtImportePersonalAnPr2.setVisible(false);
		comboxPersonalAnPr3.setVisible(false);
		txtCantidadPersonalAnPr3.setVisible(false);
		txtImportePersonalAnPr3.setVisible(false);
		comboxVehiculosAnPr1.setVisible(false);
		txtCantidadVehiculosAnPr1.setVisible(false);
		txtImporteVehiculosAnPr1.setVisible(false);
		comboxVehiculosAnPr2.setVisible(false);
		txtCantidadVehiculosAnPr2.setVisible(false);
		txtImporteVehiculosAnPr2.setVisible(false);
		comboxVehiculosAnPr3.setVisible(false);
		txtCantidadVehiculosAnPr3.setVisible(false);
		txtImporteVehiculosAnPr3.setVisible(false);
		comboxMaterialesAnPr1.setVisible(false);
		txtCantidadMaterialesAnPr1.setVisible(false);
		txtImporteMaterialesAnPr1.setVisible(false);
		comboxMaterialesAnPr2.setVisible(false);
		txtCantidadMaterialesAnPr2.setVisible(false);
		txtImporteMaterialesAnPr2.setVisible(false);
		comboxMaterialesAnPr3.setVisible(false);
		txtCantidadMaterialesAnPr3.setVisible(false);
		txtImporteMaterialesAnPr3.setVisible(false);
		comboxTrabajosAnPr1.setVisible(false);
		txtCantidadTrabajosAnPr1.setVisible(false);
		txtImporteTrabajosAnPr1.setVisible(false);
		comboxTrabajosAnPr2.setVisible(false);
		txtCantidadTrabajosAnPr2.setVisible(false);
		txtImporteTrabajosAnPr2.setVisible(false);
		comboxTrabajosAnPr3.setVisible(false);
		txtCantidadTrabajosAnPr3.setVisible(false);
		txtImporteTrabajosAnPr3.setVisible(false);
		//
		lblAmpliarAnPr1 = new JLabel("New label");
		lblAmpliarAnPr1.addMouseListener(new LblAmpliarAnPr1MouseListener());
		lblAmpliarAnPr1.setBounds(405, 409, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr1);
		
		lblAmpliarAnPr2 = new JLabel("New label");
		lblAmpliarAnPr2.addMouseListener(new LblAmpliarAnPr2MouseListener());
		lblAmpliarAnPr2.setBounds(405, 491, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr2);
		
		lblAmpliarAnPr3 = new JLabel("New label");
		lblAmpliarAnPr3.addMouseListener(new LblAmpliarAnPr3MouseListener());
		lblAmpliarAnPr3.setBounds(405, 573, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr3);
		
		lblAmpliarAnPr4 = new JLabel("New label");
		lblAmpliarAnPr4.addMouseListener(new LblAmpliarAnPr4MouseListener());
		lblAmpliarAnPr4.setBounds(620, 409, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr4);
		
		lblAmpliarAnPr5 = new JLabel("New label");
		lblAmpliarAnPr5.addMouseListener(new LblAmpliarAnPr5MouseListener());
		lblAmpliarAnPr5.setBounds(620, 491, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr5);
		
		lblAmpliarAnPr6 = new JLabel("New label");
		lblAmpliarAnPr6.addMouseListener(new LblAmpliarAnPr6MouseListener());
		lblAmpliarAnPr6.setBounds(620, 573, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr6);
		
		lblAmpliarAnPr7 = new JLabel("New label");
		lblAmpliarAnPr7.addMouseListener(new LblAmpliarAnPr7MouseListener());
		lblAmpliarAnPr7.setBounds(835, 409, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr7);
		
		lblAmpliarAnPr8 = new JLabel("New label");
		lblAmpliarAnPr8.addMouseListener(new LblAmpliarAnPr8MouseListener());
		lblAmpliarAnPr8.setBounds(835, 491, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr8);
		
		lblAmpliarAnPr9 = new JLabel("New label");
		lblAmpliarAnPr9.addMouseListener(new LblAmpliarAnPr9MouseListener());
		lblAmpliarAnPr9.setBounds(835, 573, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr9);
		
		lblAmpliarAnPr10 = new JLabel("New label");
		lblAmpliarAnPr10.addMouseListener(new LblAmpliarAnPr10MouseListener());
		lblAmpliarAnPr10.setBounds(1050, 409, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr10);
		
		lblAmpliarAnPr11 = new JLabel("New label");
		lblAmpliarAnPr11.addMouseListener(new LblAmpliarAnPr11MouseListener());
		lblAmpliarAnPr11.setBounds(1050, 491, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr11);
		
		lblAmpliarAnPr12 = new JLabel("New label");
		lblAmpliarAnPr12.addMouseListener(new LblAmpliarAnPr12MouseListener());
		lblAmpliarAnPr12.setBounds(1050, 573, 20, 20);
		panelAnadirProyecto.add(lblAmpliarAnPr12);
		
		
		lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		
		lblAmpliarAnPr2.setVisible(false);
		lblAmpliarAnPr3.setVisible(false);
		lblAmpliarAnPr5.setVisible(false);
		lblAmpliarAnPr6.setVisible(false);
		lblAmpliarAnPr8.setVisible(false);
		lblAmpliarAnPr9.setVisible(false);
		lblAmpliarAnPr11.setVisible(false);
		lblAmpliarAnPr12.setVisible(false);
		
		dateChooserFechaInicioAnPr.setMinSelectableDate(diaHoy);
		
		btnEnviarAnPr = new JButton("Enviar");
		btnEnviarAnPr.addMouseListener(new BtnEnviarAnPrMouseListener());
		btnEnviarAnPr.setBounds(564, 120, 150, 30);
		panelAnadirProyecto.add(btnEnviarAnPr);
		
		exitAnPr = new JLabel("New label");
		exitAnPr.addMouseListener(new ExitAnPrMouseListener());
		exitAnPr.setBounds(1070, 267, 20, 20);
		panelAnadirProyecto.add(exitAnPr);
		
		panelListaProyectos = new JPanel();
		panelListaProyectos.setBounds(0, 54, 1280, 666);
		contentPane.add(panelListaProyectos);
		panelListaProyectos.setLayout(null);
		panelListaProyectos.setOpaque(false);
		
		lblListadoProyectosInt = new JLabel("Listado Proyectos");
		lblListadoProyectosInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoProyectosInt.setForeground(Color.WHITE);
		lblListadoProyectosInt.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblListadoProyectosInt.setBounds(525, 50, 230, 43);
		panelListaProyectos.add(lblListadoProyectosInt);
		
		lblNombreProyectoLsPr = new JLabel("Nombre Proyecto:");
		lblNombreProyectoLsPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreProyectoLsPr.setBounds(200, 180, 150, 30);
		panelListaProyectos.add(lblNombreProyectoLsPr);
		
		lblClienteLsPr = new JLabel("Cliente:");
		lblClienteLsPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClienteLsPr.setBounds(200, 221, 150, 30);
		panelListaProyectos.add(lblClienteLsPr);
		
		lblJefeProyectoLsPr = new JLabel("Jefe Proyecto:");
		lblJefeProyectoLsPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJefeProyectoLsPr.setBounds(200, 262, 150, 30);
		panelListaProyectos.add(lblJefeProyectoLsPr);
		
		lblFechaInicioLsPr = new JLabel("Fecha Inicio:");
		lblFechaInicioLsPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaInicioLsPr.setBounds(750, 180, 150, 30);
		panelListaProyectos.add(lblFechaInicioLsPr);
		
		lblMaterialTransportarLsPr = new JLabel("Material a Transportar:");
		lblMaterialTransportarLsPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterialTransportarLsPr.setBounds(750, 262, 150, 30);
		panelListaProyectos.add(lblMaterialTransportarLsPr);
		
		lblFechaFinLsPr = new JLabel("Fecha Fin");
		lblFechaFinLsPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaFinLsPr.setBounds(750, 221, 150, 30);
		panelListaProyectos.add(lblFechaFinLsPr);
		
		txtNombreProyectoLsPr = new JTextField();
		txtNombreProyectoLsPr.setEditable(false);
		txtNombreProyectoLsPr.setColumns(10);
		txtNombreProyectoLsPr.setBounds(360, 180, 150, 30);
		panelListaProyectos.add(txtNombreProyectoLsPr);
		
		txtClienteLsPr = new JTextField();
		txtClienteLsPr.setEditable(false);
		txtClienteLsPr.setColumns(10);
		txtClienteLsPr.setBounds(360, 221, 150, 30);
		panelListaProyectos.add(txtClienteLsPr);
		
		txtJefeLsPr = new JTextField();
		txtJefeLsPr.setEditable(false);
		txtJefeLsPr.setColumns(10);
		txtJefeLsPr.setBounds(360, 262, 150, 30);
		panelListaProyectos.add(txtJefeLsPr);
		
		txtFechaIniLsPr = new JTextField();
		txtFechaIniLsPr.setEditable(false);
		txtFechaIniLsPr.setColumns(10);
		txtFechaIniLsPr.setBounds(910, 180, 150, 30);
		panelListaProyectos.add(txtFechaIniLsPr);
		
		txtMaterialLsPr = new JTextField();
		txtMaterialLsPr.setEditable(false);
		txtMaterialLsPr.setColumns(10);
		txtMaterialLsPr.setBounds(910, 262, 150, 30);
		panelListaProyectos.add(txtMaterialLsPr);
		
		txtCantidadPersonalLsPr1 = new JTextField();
		txtCantidadPersonalLsPr1.setEditable(false);
		txtCantidadPersonalLsPr1.setColumns(10);
		txtCantidadPersonalLsPr1.setBounds(220, 450, 77, 30);
		panelListaProyectos.add(txtCantidadPersonalLsPr1);
		
		txtImportePersonalLsPr1 = new JTextField();
		txtImportePersonalLsPr1.setEditable(false);
		txtImportePersonalLsPr1.setColumns(10);
		txtImportePersonalLsPr1.setBounds(318, 450, 77, 30);
		panelListaProyectos.add(txtImportePersonalLsPr1);
		
		txtNombrePersonalLsPr1 = new JTextField();
		txtNombrePersonalLsPr1.setEditable(false);
		txtNombrePersonalLsPr1.setColumns(10);
		txtNombrePersonalLsPr1.setBounds(220, 409, 175, 30);
		panelListaProyectos.add(txtNombrePersonalLsPr1);
		
		txtNombrePersonalLsPr2 = new JTextField();
		txtNombrePersonalLsPr2.setEditable(false);
		txtNombrePersonalLsPr2.setColumns(10);
		txtNombrePersonalLsPr2.setBounds(220, 491, 175, 30);
		panelListaProyectos.add(txtNombrePersonalLsPr2);
		
		txtImportePersonalLsPr2 = new JTextField();
		txtImportePersonalLsPr2.setEditable(false);
		txtImportePersonalLsPr2.setColumns(10);
		txtImportePersonalLsPr2.setBounds(318, 532, 77, 30);
		panelListaProyectos.add(txtImportePersonalLsPr2);
		
		txtCantidadPersonalLsPr2 = new JTextField();
		txtCantidadPersonalLsPr2.setEditable(false);
		txtCantidadPersonalLsPr2.setColumns(10);
		txtCantidadPersonalLsPr2.setBounds(220, 532, 77, 30);
		panelListaProyectos.add(txtCantidadPersonalLsPr2);
		
		txtNombrePersonalLsPr3 = new JTextField();
		txtNombrePersonalLsPr3.setEditable(false);
		txtNombrePersonalLsPr3.setColumns(10);
		txtNombrePersonalLsPr3.setBounds(220, 573, 175, 30);
		panelListaProyectos.add(txtNombrePersonalLsPr3);
		
		txtImportePersonalLsPr3 = new JTextField();
		txtImportePersonalLsPr3.setEditable(false);
		txtImportePersonalLsPr3.setColumns(10);
		txtImportePersonalLsPr3.setBounds(318, 614, 77, 30);
		panelListaProyectos.add(txtImportePersonalLsPr3);
		
		txtCantidadPersonalLsPr3 = new JTextField();
		txtCantidadPersonalLsPr3.setEditable(false);
		txtCantidadPersonalLsPr3.setColumns(10);
		txtCantidadPersonalLsPr3.setBounds(220, 614, 77, 30);
		panelListaProyectos.add(txtCantidadPersonalLsPr3);
		
		txtNombreVehiculosLsPr3 = new JTextField();
		txtNombreVehiculosLsPr3.setEditable(false);
		txtNombreVehiculosLsPr3.setColumns(10);
		txtNombreVehiculosLsPr3.setBounds(435, 573, 175, 30);
		panelListaProyectos.add(txtNombreVehiculosLsPr3);
		
		txtImporteVehiculosLsPr3 = new JTextField();
		txtImporteVehiculosLsPr3.setEditable(false);
		txtImporteVehiculosLsPr3.setColumns(10);
		txtImporteVehiculosLsPr3.setBounds(533, 614, 77, 30);
		panelListaProyectos.add(txtImporteVehiculosLsPr3);
		
		txtCantidadVehiculosLsPr3 = new JTextField();
		txtCantidadVehiculosLsPr3.setEditable(false);
		txtCantidadVehiculosLsPr3.setColumns(10);
		txtCantidadVehiculosLsPr3.setBounds(435, 614, 77, 30);
		panelListaProyectos.add(txtCantidadVehiculosLsPr3);
		
		txtImporteVehiculosLsPr2 = new JTextField();
		txtImporteVehiculosLsPr2.setEditable(false);
		txtImporteVehiculosLsPr2.setColumns(10);
		txtImporteVehiculosLsPr2.setBounds(533, 532, 77, 30);
		panelListaProyectos.add(txtImporteVehiculosLsPr2);
		
		txtCantidadVehiculosLsPr2 = new JTextField();
		txtCantidadVehiculosLsPr2.setEditable(false);
		txtCantidadVehiculosLsPr2.setColumns(10);
		txtCantidadVehiculosLsPr2.setBounds(435, 532, 77, 30);
		panelListaProyectos.add(txtCantidadVehiculosLsPr2);
		
		txtNombreVehiculosLsPr2 = new JTextField();
		txtNombreVehiculosLsPr2.setEditable(false);
		txtNombreVehiculosLsPr2.setColumns(10);
		txtNombreVehiculosLsPr2.setBounds(435, 491, 175, 30);
		panelListaProyectos.add(txtNombreVehiculosLsPr2);
		
		txtImporteVehiculosLsPr1 = new JTextField();
		txtImporteVehiculosLsPr1.setEditable(false);
		txtImporteVehiculosLsPr1.setColumns(10);
		txtImporteVehiculosLsPr1.setBounds(533, 450, 77, 30);
		panelListaProyectos.add(txtImporteVehiculosLsPr1);
		
		txtCantidadVehiculosLsPr1 = new JTextField();
		txtCantidadVehiculosLsPr1.setEditable(false);
		txtCantidadVehiculosLsPr1.setColumns(10);
		txtCantidadVehiculosLsPr1.setBounds(435, 450, 77, 30);
		panelListaProyectos.add(txtCantidadVehiculosLsPr1);
		
		txtNombreVehiculosLsPr1 = new JTextField();
		txtNombreVehiculosLsPr1.setEditable(false);
		txtNombreVehiculosLsPr1.setColumns(10);
		txtNombreVehiculosLsPr1.setBounds(435, 409, 175, 30);
		panelListaProyectos.add(txtNombreVehiculosLsPr1);
		
		txtNombreMaterialesLsPr3 = new JTextField();
		txtNombreMaterialesLsPr3.setEditable(false);
		txtNombreMaterialesLsPr3.setColumns(10);
		txtNombreMaterialesLsPr3.setBounds(650, 573, 175, 30);
		panelListaProyectos.add(txtNombreMaterialesLsPr3);
		
		txtImporteMaterialesLsPr3 = new JTextField();
		txtImporteMaterialesLsPr3.setEditable(false);
		txtImporteMaterialesLsPr3.setColumns(10);
		txtImporteMaterialesLsPr3.setBounds(748, 614, 77, 30);
		panelListaProyectos.add(txtImporteMaterialesLsPr3);
		
		txtCantidadMaterialesLsPr3 = new JTextField();
		txtCantidadMaterialesLsPr3.setEditable(false);
		txtCantidadMaterialesLsPr3.setColumns(10);
		txtCantidadMaterialesLsPr3.setBounds(650, 614, 77, 30);
		panelListaProyectos.add(txtCantidadMaterialesLsPr3);
		
		txtImporteMaterialesLsPr2 = new JTextField();
		txtImporteMaterialesLsPr2.setEditable(false);
		txtImporteMaterialesLsPr2.setColumns(10);
		txtImporteMaterialesLsPr2.setBounds(748, 532, 77, 30);
		panelListaProyectos.add(txtImporteMaterialesLsPr2);
		
		txtCantidadMaterialesLsPr2 = new JTextField();
		txtCantidadMaterialesLsPr2.setEditable(false);
		txtCantidadMaterialesLsPr2.setColumns(10);
		txtCantidadMaterialesLsPr2.setBounds(650, 532, 77, 30);
		panelListaProyectos.add(txtCantidadMaterialesLsPr2);
		
		txtNombreMaterialesLsPr2 = new JTextField();
		txtNombreMaterialesLsPr2.setEditable(false);
		txtNombreMaterialesLsPr2.setColumns(10);
		txtNombreMaterialesLsPr2.setBounds(650, 491, 175, 30);
		panelListaProyectos.add(txtNombreMaterialesLsPr2);
		
		txtImporteMaterialesLsPr1 = new JTextField();
		txtImporteMaterialesLsPr1.setEditable(false);
		txtImporteMaterialesLsPr1.setColumns(10);
		txtImporteMaterialesLsPr1.setBounds(748, 450, 77, 30);
		panelListaProyectos.add(txtImporteMaterialesLsPr1);
		
		txtCantidadMaterialesLsPr1 = new JTextField();
		txtCantidadMaterialesLsPr1.setEditable(false);
		txtCantidadMaterialesLsPr1.setColumns(10);
		txtCantidadMaterialesLsPr1.setBounds(650, 450, 77, 30);
		panelListaProyectos.add(txtCantidadMaterialesLsPr1);
		
		txtNombreMaterialesLsPr1 = new JTextField();
		txtNombreMaterialesLsPr1.setEditable(false);
		txtNombreMaterialesLsPr1.setColumns(10);
		txtNombreMaterialesLsPr1.setBounds(650, 409, 175, 30);
		panelListaProyectos.add(txtNombreMaterialesLsPr1);
		
		txtNombreTrabajosLsPr3 = new JTextField();
		txtNombreTrabajosLsPr3.setEditable(false);
		txtNombreTrabajosLsPr3.setColumns(10);
		txtNombreTrabajosLsPr3.setBounds(865, 573, 175, 30);
		panelListaProyectos.add(txtNombreTrabajosLsPr3);
		
		txtImporteTrabajosLsPr3 = new JTextField();
		txtImporteTrabajosLsPr3.setEditable(false);
		txtImporteTrabajosLsPr3.setColumns(10);
		txtImporteTrabajosLsPr3.setBounds(963, 614, 77, 30);
		panelListaProyectos.add(txtImporteTrabajosLsPr3);
		
		txtCantidadTrabajosLsPr3 = new JTextField();
		txtCantidadTrabajosLsPr3.setEditable(false);
		txtCantidadTrabajosLsPr3.setColumns(10);
		txtCantidadTrabajosLsPr3.setBounds(865, 614, 77, 30);
		panelListaProyectos.add(txtCantidadTrabajosLsPr3);
		
		txtImporteTrabajosLsPr2 = new JTextField();
		txtImporteTrabajosLsPr2.setEditable(false);
		txtImporteTrabajosLsPr2.setColumns(10);
		txtImporteTrabajosLsPr2.setBounds(963, 532, 77, 30);
		panelListaProyectos.add(txtImporteTrabajosLsPr2);
		
		txtCantidadTrabajosLsPr2 = new JTextField();
		txtCantidadTrabajosLsPr2.setEditable(false);
		txtCantidadTrabajosLsPr2.setColumns(10);
		txtCantidadTrabajosLsPr2.setBounds(865, 532, 77, 30);
		panelListaProyectos.add(txtCantidadTrabajosLsPr2);
		
		txtNombreTrabajosLsPr2 = new JTextField();
		txtNombreTrabajosLsPr2.setEditable(false);
		txtNombreTrabajosLsPr2.setColumns(10);
		txtNombreTrabajosLsPr2.setBounds(865, 491, 175, 30);
		panelListaProyectos.add(txtNombreTrabajosLsPr2);
		
		txtImporteTrabajosLsPr1 = new JTextField();
		txtImporteTrabajosLsPr1.setEditable(false);
		txtImporteTrabajosLsPr1.setColumns(10);
		txtImporteTrabajosLsPr1.setBounds(963, 450, 77, 30);
		panelListaProyectos.add(txtImporteTrabajosLsPr1);
		
		txtCantidadTrabajosLsPr1 = new JTextField();
		txtCantidadTrabajosLsPr1.setEditable(false);
		txtCantidadTrabajosLsPr1.setColumns(10);
		txtCantidadTrabajosLsPr1.setBounds(865, 450, 77, 30);
		panelListaProyectos.add(txtCantidadTrabajosLsPr1);
		
		txtNombreTrabajosLsPr1 = new JTextField();
		txtNombreTrabajosLsPr1.setEditable(false);
		txtNombreTrabajosLsPr1.setColumns(10);
		txtNombreTrabajosLsPr1.setBounds(865, 409, 175, 30);
		panelListaProyectos.add(txtNombreTrabajosLsPr1);
		
		lblPersonalLsPr = new JLabel("Personal:");
		lblPersonalLsPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalLsPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPersonalLsPr.setBounds(200, 368, 215, 30);
		panelListaProyectos.add(lblPersonalLsPr);
		
		lblVehiculosLsPr = new JLabel("Vehiculos:");
		lblVehiculosLsPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehiculosLsPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehiculosLsPr.setBounds(415, 368, 215, 30);
		panelListaProyectos.add(lblVehiculosLsPr);
		
		lblMaterialesLsPr = new JLabel("Materiales:");
		lblMaterialesLsPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaterialesLsPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterialesLsPr.setBounds(630, 368, 215, 30);
		panelListaProyectos.add(lblMaterialesLsPr);
		
		lblTrabajosLsPr = new JLabel("Trabajos:");
		lblTrabajosLsPr.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrabajosLsPr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTrabajosLsPr.setBounds(845, 368, 215, 30);
		panelListaProyectos.add(lblTrabajosLsPr);
		//
		//
		txtNombrePersonalLsPr1.setVisible(false);
		txtCantidadPersonalLsPr1.setVisible(false);
		txtImportePersonalLsPr1.setVisible(false);
		txtNombrePersonalLsPr2.setVisible(false);
		txtCantidadPersonalLsPr2.setVisible(false);
		txtImportePersonalLsPr2.setVisible(false);
		txtNombrePersonalLsPr3.setVisible(false);
		txtCantidadPersonalLsPr3.setVisible(false);
		txtImportePersonalLsPr3.setVisible(false);
		txtNombreVehiculosLsPr1.setVisible(false);
		txtCantidadVehiculosLsPr1.setVisible(false);
		txtImporteVehiculosLsPr1.setVisible(false);
		txtNombreVehiculosLsPr2.setVisible(false);
		txtCantidadVehiculosLsPr2.setVisible(false);
		txtImporteVehiculosLsPr2.setVisible(false);
		txtNombreVehiculosLsPr3.setVisible(false);
		txtCantidadVehiculosLsPr3.setVisible(false);
		txtImporteVehiculosLsPr3.setVisible(false);
		txtNombreMaterialesLsPr1.setVisible(false);
		txtCantidadMaterialesLsPr1.setVisible(false);
		txtImporteMaterialesLsPr1.setVisible(false);
		txtNombreMaterialesLsPr2.setVisible(false);
		txtCantidadMaterialesLsPr2.setVisible(false);
		txtImporteMaterialesLsPr2.setVisible(false);
		txtNombreMaterialesLsPr3.setVisible(false);
		txtCantidadMaterialesLsPr3.setVisible(false);
		txtImporteMaterialesLsPr3.setVisible(false);
		txtNombreTrabajosLsPr1.setVisible(false);
		txtCantidadTrabajosLsPr1.setVisible(false);
		txtImporteTrabajosLsPr1.setVisible(false);
		txtNombreTrabajosLsPr2.setVisible(false);
		txtCantidadTrabajosLsPr2.setVisible(false);
		txtImporteTrabajosLsPr2.setVisible(false);
		txtNombreTrabajosLsPr3.setVisible(false);
		txtCantidadTrabajosLsPr3.setVisible(false);
		txtImporteTrabajosLsPr3.setVisible(false);
		txtFechaIniLsPr.setText(diaHoyString);
		
		lblProyectoLsPr = new JLabel("Proyecto:");
		lblProyectoLsPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProyectoLsPr.setBounds(500, 119, 150, 30);
		panelListaProyectos.add(lblProyectoLsPr);
		
		comboxProyectoLsPr = new JComboBox();
		comboxProyectoLsPr.addActionListener(new ComboxProyectoLsPrActionListener());
		comboxProyectoLsPr.setBounds(660, 119, 150, 30);
		panelListaProyectos.add(comboxProyectoLsPr);
		
		txtFechaFinLsPr = new JTextField();
		txtFechaFinLsPr.setText((String) null);
		txtFechaFinLsPr.setEditable(false);
		txtFechaFinLsPr.setColumns(10);
		txtFechaFinLsPr.setBounds(910, 221, 150, 30);
		panelListaProyectos.add(txtFechaFinLsPr);
		
		
		panelAnadirUsuario = new JPanel();
		panelAnadirUsuario.setBounds(0, 54, 1280, 666);
		panelAnadirUsuario.setOpaque(false);
		contentPane.add(panelAnadirUsuario);
		panelAnadirUsuario.setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(540, 199, 80, 20);
		panelAnadirUsuario.add(lblUsuario);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(540, 230, 200, 30);
		panelAnadirUsuario.add(textField);
		
		lblContr = new JLabel("Contraseña");
		lblContr.setForeground(Color.WHITE);
		lblContr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContr.setBounds(540, 290, 120, 20);
		panelAnadirUsuario.add(lblContr);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setEchoChar('●');
		passwordField.setBounds(540, 321, 200, 30);
		panelAnadirUsuario.add(passwordField);
		
		btnAnadir = new JButton("Añadir");
		btnAnadir.addMouseListener(new BtnAnadirMouseListener());
		btnAnadir.setBounds(540, 450, 200, 30);
		panelAnadirUsuario.add(btnAnadir);
		
		lblAnadirUsuarioInt = new JLabel("Añadir Usuario");
		lblAnadirUsuarioInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirUsuarioInt.setForeground(Color.WHITE);
		lblAnadirUsuarioInt.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAnadirUsuarioInt.setBounds(540, 50, 200, 43);
		panelAnadirUsuario.add(lblAnadirUsuarioInt);
		lblAnadirUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnadirUsuario.setBounds(380, 0, 170, 43);
		contentPane.add(lblAnadirUsuario);
		
		lblAnadirParte = new JLabel("Añadir Parte");
		lblAnadirParte.addMouseListener(new LblAnadirParteMouseListener());
		lblAnadirParte.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirParte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnadirParte.setBounds(550, 0, 170, 43);
		contentPane.add(lblAnadirParte);
		
		lblAnadirProyecto = new JLabel("Añadir Proyecto");
		lblAnadirProyecto.addMouseListener(new LblAnadirProyectoMouseListener());
		lblAnadirProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirProyecto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnadirProyecto.setBounds(210, 0, 170, 43);
		contentPane.add(lblAnadirProyecto);
		
		lblListadoProyectos = new JLabel("Listado Proyectos");
		lblListadoProyectos.addMouseListener(new LblListadoProyectosMouseListener());
		lblListadoProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoProyectos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListadoProyectos.setBounds(40, 0, 170, 43);
		contentPane.add(lblListadoProyectos);
		
		lblModificarParte = new JLabel("Modificar Parte");
		lblModificarParte.addMouseListener(new LblModificarParteMouseListener());
		lblModificarParte.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarParte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblModificarParte.setBounds(720, 0, 170, 43);
		contentPane.add(lblModificarParte);
		
		home = new JLabel("");
		home.addMouseListener(new HomeMouseListener());
		home.setBounds(10, 11, 20, 20);
		contentPane.add(home);
		min.setBounds(1150, 11, 20, 20);
		contentPane.add(min);
		
		exit = new JLabel("New label");
		exit.addMouseListener(new ExitMouseListener());
		exit.setBounds(1250, 11, 20, 20);
		contentPane.add(exit);
		
		contr = new JLabel("New label");
		contr.addMouseListener(new ContrMouseListener());
		contr.setBounds(1200, 11, 20, 20);
		contentPane.add(contr);
		
		movebar = new JLabel("");
		movebar.addMouseMotionListener(new MovebarMouseMotionListener());
		movebar.addMouseListener(new MovebarMouseListener());
		movebar.setBounds(0, 0, 1280, 43);
		contentPane.add(movebar);
		
		fondo = new JLabel("");
		fondo.setBounds(0, 0, 1280, 720);
		contentPane.add(fondo);
		
		if (usr.devolverSettings()) {
			estado = true;
			establecerContrasteBri();
		} else {
			estado = false;
			establecerContrasteOcs();
		}
		fondo.setFocusable(true);
		fondo.requestFocus();
		limpiarPanels();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		diaHoyString = sdf.format(diaHoy);
		txtFechaAnPa.setText(diaHoyString);
		txtFechaMoPa.setText(diaHoyString);
	}
	
	private void establecerContrasteOcs() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\night.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x_w.png"));
		exitAnPr.setIcon(new ImageIcon(".\\rsrc\\x_w.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle_w.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline_w.png"));
		home.setIcon(new ImageIcon(".\\rsrc\\home_w.png"));
		
		lblModificarParte.setForeground(Color.WHITE);
		lblAnadirParte.setForeground(Color.WHITE);
		lblAnadirUsuario.setForeground(Color.WHITE);
		lblAnadirProyecto.setForeground(Color.WHITE);
		lblListadoProyectos.setForeground(Color.WHITE);
		lblAnadirUsuarioInt.setForeground(Color.WHITE);
		lblUsuario.setForeground(Color.WHITE);
		lblContr.setForeground(Color.WHITE);
		lblAnadirProyectoInt.setForeground(Color.WHITE);
		lblNombreProyectoAnPr.setForeground(Color.WHITE);
		lblClienteAnPr.setForeground(Color.WHITE);
		lblJefeProyectoAnPr.setForeground(Color.WHITE);
		lblFechaInicioAnPr.setForeground(Color.WHITE);
		lblFechaFinAnPr.setForeground(Color.WHITE);
		lblMaterialTransportarAnPr.setForeground(Color.WHITE);
		lblPersonalAnPr.setForeground(Color.WHITE);
		lblVehiculosAnPr.setForeground(Color.WHITE);
		lblMaterialesAnPr.setForeground(Color.WHITE);
		lblTrabajosAnPr.setForeground(Color.WHITE);

		lblListadoProyectosInt.setForeground(Color.WHITE);
		lblNombreProyectoLsPr.setForeground(Color.WHITE);
		lblClienteLsPr.setForeground(Color.WHITE);
		lblJefeProyectoLsPr.setForeground(Color.WHITE);
		lblFechaInicioLsPr.setForeground(Color.WHITE);
		lblFechaFinLsPr.setForeground(Color.WHITE);
		lblMaterialTransportarLsPr.setForeground(Color.WHITE);
		lblPersonalLsPr.setForeground(Color.WHITE);
		lblVehiculosLsPr.setForeground(Color.WHITE);
		lblMaterialesLsPr.setForeground(Color.WHITE);
		lblTrabajosLsPr.setForeground(Color.WHITE);
		lblProyectoLsPr.setForeground(Color.WHITE);

		lblProyectoAnPa.setForeground(Color.WHITE);
		lblFechaAnPa.setForeground(Color.WHITE);
		lblPersonalAnPa.setForeground(Color.WHITE);
		lblMaterialesAnPa.setForeground(Color.WHITE);
		lblVehiculosAnPa.setForeground(Color.WHITE);
		lblTrabajosAnPa.setForeground(Color.WHITE);
		lblAnadirParteInt.setForeground(Color.WHITE);
		
		lblProyectoMoPa.setForeground(Color.WHITE);
		lblFechaMoPa.setForeground(Color.WHITE);
		lblModificarParteInt.setForeground(Color.WHITE);
		lblPersonalMoPa.setForeground(Color.WHITE);
		lblMaterialesMoPa.setForeground(Color.WHITE);
		lblVehiculosMoPa.setForeground(Color.WHITE);
		lblTrabajosMoPa.setForeground(Color.WHITE);
		
		
		//Parte Añadir Proyecto
		
		if (amp1AnPr)
			lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp2AnPr)
			lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp3AnPr)
			lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp4AnPr)
			lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp5AnPr)
			lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp6AnPr)
			lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp7AnPr)
			lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp8AnPr)
			lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp9AnPr)
			lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp10AnPr)
			lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp11AnPr)
			lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp12AnPr)
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		
		if (amp1AnPa)
			lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp2AnPa)
			lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp3AnPa)
			lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp4AnPa)
			lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp5AnPa)
			lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp6AnPa)
			lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp7AnPa)
			lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp8AnPa)
			lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp9AnPa)
			lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp10AnPa)
			lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp11AnPa)
			lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp12AnPa)
			lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		
		if (amp1MoPa)
			lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp2MoPa)
			lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp3MoPa)
			lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp4MoPa)
			lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp5MoPa)
			lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp6MoPa)
			lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp7MoPa)
			lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp8MoPa)
			lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp9MoPa)
			lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp10MoPa)
			lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp11MoPa)
			lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		if (amp12MoPa)
			lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		else
			lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		
	}
	private void establecerContrasteBri() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\day.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x.png"));
		exitAnPr.setIcon(new ImageIcon(".\\rsrc\\x.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline.png"));
		home.setIcon(new ImageIcon(".\\rsrc\\home.png"));
		
		lblModificarParte.setForeground(Color.BLACK);
		lblAnadirParte.setForeground(Color.BLACK);
		lblAnadirUsuario.setForeground(Color.BLACK);
		lblAnadirProyecto.setForeground(Color.BLACK);
		lblListadoProyectos.setForeground(Color.BLACK);
		lblAnadirUsuarioInt.setForeground(Color.BLACK);
		lblUsuario.setForeground(Color.BLACK);
		lblContr.setForeground(Color.BLACK);
		lblAnadirProyectoInt.setForeground(Color.BLACK);
		lblNombreProyectoAnPr.setForeground(Color.BLACK);
		lblClienteAnPr.setForeground(Color.BLACK);
		lblJefeProyectoAnPr.setForeground(Color.BLACK);
		lblFechaInicioAnPr.setForeground(Color.BLACK);
		lblFechaFinAnPr.setForeground(Color.BLACK);
		lblMaterialTransportarAnPr.setForeground(Color.BLACK);
		lblPersonalAnPr.setForeground(Color.BLACK);
		lblVehiculosAnPr.setForeground(Color.BLACK);
		lblMaterialesAnPr.setForeground(Color.BLACK);
		lblTrabajosAnPr.setForeground(Color.BLACK);
		
		lblListadoProyectosInt.setForeground(Color.BLACK);
		lblNombreProyectoLsPr.setForeground(Color.BLACK);
		lblClienteLsPr.setForeground(Color.BLACK);
		lblJefeProyectoLsPr.setForeground(Color.BLACK);
		lblFechaInicioLsPr.setForeground(Color.BLACK);
		lblFechaFinLsPr.setForeground(Color.BLACK);
		lblMaterialTransportarLsPr.setForeground(Color.BLACK);
		lblPersonalLsPr.setForeground(Color.BLACK);
		lblVehiculosLsPr.setForeground(Color.BLACK);
		lblMaterialesLsPr.setForeground(Color.BLACK);
		lblTrabajosLsPr.setForeground(Color.BLACK);
		lblProyectoLsPr.setForeground(Color.BLACK);
		
		lblProyectoAnPa.setForeground(Color.BLACK);
		lblFechaAnPa.setForeground(Color.BLACK);
		lblPersonalAnPa.setForeground(Color.BLACK);
		lblMaterialesAnPa.setForeground(Color.BLACK);
		lblVehiculosAnPa.setForeground(Color.BLACK);
		lblTrabajosAnPa.setForeground(Color.BLACK);
		lblAnadirParteInt.setForeground(Color.BLACK);
		
		lblProyectoMoPa.setForeground(Color.BLACK);
		lblFechaMoPa.setForeground(Color.BLACK);
		lblModificarParteInt.setForeground(Color.BLACK);
		lblPersonalMoPa.setForeground(Color.BLACK);
		lblMaterialesMoPa.setForeground(Color.BLACK);
		lblVehiculosMoPa.setForeground(Color.BLACK);
		lblTrabajosMoPa.setForeground(Color.BLACK);
		
		//Parte Añadir Proyecto
		
		if (amp1AnPr)
			lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp2AnPr)
			lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp3AnPr)
			lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp4AnPr)
			lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp5AnPr)
			lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp6AnPr)
			lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp7AnPr)
			lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp8AnPr)
			lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp9AnPr)
			lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp10AnPr)
			lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp11AnPr)
			lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp12AnPr)
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		
		if (amp1AnPa)
			lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp2AnPa)
			lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp3AnPa)
			lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp4AnPa)
			lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp5AnPa)
			lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp6AnPa)
			lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp7AnPa)
			lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp8AnPa)
			lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp9AnPa)
			lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp10AnPa)
			lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp11AnPa)
			lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp12AnPa)
			lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		
		if (amp1MoPa)
			lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp2MoPa)
			lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp3MoPa)
			lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp4MoPa)
			lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp5MoPa)
			lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp6MoPa)
			lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp7MoPa)
			lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp8MoPa)
			lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp9MoPa)
			lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp10MoPa)
			lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp11MoPa)
			lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		if (amp12MoPa)
			lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		else
			lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
	}
	
	private void cambiarContraste() {
		if (estado) {
			establecerContrasteOcs();
			estado = false;
		} else {
			establecerContrasteBri();
			estado = true;
		}
	}
	private class ExitMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			usr.guardarCambios(estado);
			System.exit(0);
		}
	}
	private class MinMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			setState(JFrame.ICONIFIED);
		}
	}
	private class ContrMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			cambiarContraste();
		}
	}
	private class MovebarMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			initialClick = e.getPoint();
			getComponentAt(initialClick);
		}
	}
	private class MovebarMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			int thisX = getLocation().x;
			int thisY = getLocation().y;

			// Determine how much the mouse moved since the initial click
			int xMoved = e.getX() - initialClick.x;
			int yMoved = e.getY() - initialClick.y;

			// Move window to this position
			int X = thisX + xMoved;
			int Y = thisY + yMoved;
			setLocation(X, Y);
		}
	}
	private class LblAnadirUsuarioMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			limpiarPanels();
			panelAnadirUsuario.setVisible(true);
		}
	}
	private class HomeMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			limpiarPanels();
		}
	}
	private class LblListadoProyectosMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			limpiarPanels();
			panelListaProyectos.setVisible(true);
		}
	}
	private class LblAnadirProyectoMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			limpiarPanels();
			panelAnadirProyecto.setVisible(true);
		}
	}
	private class LblAnadirParteMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			limpiarPanels();
			panelAnadirParte.setVisible(true);
		}
	}
	private class LblModificarParteMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			limpiarPanels();
			panelModificarParte.setVisible(true);
		}
	}
	
	// Añadir Proyecto
	
	private class LblAmpliarAnPr1MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp1AnPr) {
				comboxPersonalAnPr1.setVisible(false);
				txtCantidadPersonalAnPr1.setVisible(false);
				txtImportePersonalAnPr1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limperanpr2();
				limperanpr3();
				lblAmpliarAnPr2.setVisible(false);
				lblAmpliarAnPr3.setVisible(false);
				amp1AnPr = true;
			} else {
				comboxPersonalAnPr1.setVisible(true);
				txtCantidadPersonalAnPr1.setVisible(true);
				txtImportePersonalAnPr1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr1.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr2.setVisible(true);
				amp1AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr2MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp2AnPr) {
				limperanpr2();
				limperanpr3();
				lblAmpliarAnPr3.setVisible(false);
			} else {
				comboxPersonalAnPr2.setVisible(true);
				txtCantidadPersonalAnPr2.setVisible(true);
				txtImportePersonalAnPr2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr3.setVisible(true);
				amp2AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr3MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp3AnPr) {
				limperanpr3();
			} else {
				comboxPersonalAnPr3.setVisible(true);
				txtCantidadPersonalAnPr3.setVisible(true);
				txtImportePersonalAnPr3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp3AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr4MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp4AnPr) {
				comboxVehiculosAnPr1.setVisible(false);
				txtCantidadVehiculosAnPr1.setVisible(false);
				txtImporteVehiculosAnPr1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limvehanpr2();
				limvehanpr3();
				lblAmpliarAnPr5.setVisible(false);
				lblAmpliarAnPr6.setVisible(false);
				amp4AnPr = true;
			} else {
				comboxVehiculosAnPr1.setVisible(true);
				txtCantidadVehiculosAnPr1.setVisible(true);
				txtImporteVehiculosAnPr1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr4.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr5.setVisible(true);
				amp4AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr5MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp5AnPr) {
				limvehanpr2();
				limvehanpr3();
				lblAmpliarAnPr6.setVisible(false);
			} else {
				comboxVehiculosAnPr2.setVisible(true);
				txtCantidadVehiculosAnPr2.setVisible(true);
				txtImporteVehiculosAnPr2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr6.setVisible(true);
				amp5AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr6MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp6AnPr) {
				limvehanpr3();
			} else {
				comboxVehiculosAnPr3.setVisible(true);
				txtCantidadVehiculosAnPr3.setVisible(true);
				txtImporteVehiculosAnPr3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp6AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr7MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp7AnPr) {
				comboxMaterialesAnPr1.setVisible(false);
				txtCantidadMaterialesAnPr1.setVisible(false);
				txtImporteMaterialesAnPr1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limmatanpr2();
				limmatanpr3();
				lblAmpliarAnPr8.setVisible(false);
				lblAmpliarAnPr9.setVisible(false);
				amp7AnPr = true;
			} else {
				comboxMaterialesAnPr1.setVisible(true);
				txtCantidadMaterialesAnPr1.setVisible(true);
				txtImporteMaterialesAnPr1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr7.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr8.setVisible(true);
				amp7AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr8MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp8AnPr) {
				limmatanpr2();
				limmatanpr3();
				lblAmpliarAnPr9.setVisible(false);
			} else {
				comboxMaterialesAnPr2.setVisible(true);
				txtCantidadMaterialesAnPr2.setVisible(true);
				txtImporteMaterialesAnPr2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr9.setVisible(true);
				amp8AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr9MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp9AnPr) {
				limmatanpr3();
			} else {
				comboxMaterialesAnPr3.setVisible(true);
				txtCantidadMaterialesAnPr3.setVisible(true);
				txtImporteMaterialesAnPr3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp9AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr10MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp10AnPr) {
				comboxTrabajosAnPr1.setVisible(false);
				txtCantidadTrabajosAnPr1.setVisible(false);
				txtImporteTrabajosAnPr1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limtraanpr2();
				limtraanpr3();
				lblAmpliarAnPr11.setVisible(false);
				lblAmpliarAnPr12.setVisible(false);
				amp10AnPr = true;
			} else {
				comboxTrabajosAnPr1.setVisible(true);
				txtCantidadTrabajosAnPr1.setVisible(true);
				txtImporteTrabajosAnPr1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr10.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr11.setVisible(true);
				amp10AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr11MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp11AnPr) {
				limtraanpr2();
				limtraanpr3();
				lblAmpliarAnPr12.setVisible(false);
			} else {
				comboxTrabajosAnPr2.setVisible(true);
				txtCantidadTrabajosAnPr2.setVisible(true);
				txtImporteTrabajosAnPr2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPr12.setVisible(true);
				amp11AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPr12MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp12AnPr) {
				limtraanpr3();
			} else {
				comboxTrabajosAnPr3.setVisible(true);
				txtCantidadTrabajosAnPr3.setVisible(true);
				txtImporteTrabajosAnPr3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp12AnPr = false;
			}
		}
	}
	private class LblAmpliarAnPa1MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp1AnPa) {
				comboxPersonalAnPa1.setVisible(false);
				txtCantidadPersonalAnPa1.setVisible(false);
				txtImportePersonalAnPa1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limperanpa2();
				limperanpa3();
				lblAmpliarAnPa2.setVisible(false);
				lblAmpliarAnPa3.setVisible(false);
				amp1AnPa = true;
			} else {
				comboxPersonalAnPa1.setVisible(true);
				txtCantidadPersonalAnPa1.setVisible(true);
				txtImportePersonalAnPa1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa1.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa2.setVisible(true);
				amp1AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa2MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp2AnPa) {
				limperanpa2();
				limperanpa3();
				lblAmpliarAnPa3.setVisible(false);
			} else {
				comboxPersonalAnPa2.setVisible(true);
				txtCantidadPersonalAnPa2.setVisible(true);
				txtImportePersonalAnPa2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa3.setVisible(true);
				amp2AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa3MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp3AnPa) {
				limperanpa3();
			} else {
				comboxPersonalAnPa3.setVisible(true);
				txtCantidadPersonalAnPa3.setVisible(true);
				txtImportePersonalAnPa3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp3AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa4MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp4AnPa) {
				comboxVehiculosAnPa1.setVisible(false);
				txtCantidadVehiculosAnPa1.setVisible(false);
				txtImporteVehiculosAnPa1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limvehanpa2();
				limvehanpa3();
				lblAmpliarAnPa5.setVisible(false);
				lblAmpliarAnPa6.setVisible(false);
				amp4AnPa = true;
			} else {
				comboxVehiculosAnPa1.setVisible(true);
				txtCantidadVehiculosAnPa1.setVisible(true);
				txtImporteVehiculosAnPa1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa4.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa5.setVisible(true);
				amp4AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa5MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp5AnPa) {
				limvehanpa2();
				limvehanpa3();
				lblAmpliarAnPa6.setVisible(false);
			} else {
				comboxVehiculosAnPa2.setVisible(true);
				txtCantidadVehiculosAnPa2.setVisible(true);
				txtImporteVehiculosAnPa2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa6.setVisible(true);
				amp5AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa6MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp6AnPa) {
				limvehanpa3();
			} else {
				comboxVehiculosAnPa3.setVisible(true);
				txtCantidadVehiculosAnPa3.setVisible(true);
				txtImporteVehiculosAnPa3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp6AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa7MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp7AnPa) {
				comboxMaterialesAnPa1.setVisible(false);
				txtCantidadMaterialesAnPa1.setVisible(false);
				txtImporteMaterialesAnPa1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limmatanpa2();
				limmatanpa3();
				lblAmpliarAnPa8.setVisible(false);
				lblAmpliarAnPa9.setVisible(false);
				amp7AnPa = true;
			} else {
				comboxMaterialesAnPa1.setVisible(true);
				txtCantidadMaterialesAnPa1.setVisible(true);
				txtImporteMaterialesAnPa1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa7.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa8.setVisible(true);
				amp7AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa8MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp8AnPa) {
				limmatanpa2();
				limmatanpa3();
				lblAmpliarAnPa9.setVisible(false);
			} else {
				comboxMaterialesAnPa2.setVisible(true);
				txtCantidadMaterialesAnPa2.setVisible(true);
				txtImporteMaterialesAnPa2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa9.setVisible(true);
				amp8AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa9MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp9AnPa) {
				limmatanpa3();
			} else {
				comboxMaterialesAnPa3.setVisible(true);
				txtCantidadMaterialesAnPa3.setVisible(true);
				txtImporteMaterialesAnPa3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp9AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa10MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp10AnPa) {
				comboxTrabajosAnPa1.setVisible(false);
				txtCantidadTrabajosAnPa1.setVisible(false);
				txtImporteTrabajosAnPa1.setVisible(false);
				if (!estado) {
					lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limtraanpa2();
				limtraanpa3();
				lblAmpliarAnPa11.setVisible(false);
				lblAmpliarAnPa12.setVisible(false);
				amp10AnPa = true;
			} else {
				comboxTrabajosAnPa1.setVisible(true);
				txtCantidadTrabajosAnPa1.setVisible(true);
				txtImporteTrabajosAnPa1.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa10.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa11.setVisible(true);
				amp10AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa11MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp11AnPa) {
				limtraanpa2();
				limtraanpa3();
				lblAmpliarAnPa12.setVisible(false);
			} else {
				comboxTrabajosAnPa2.setVisible(true);
				txtCantidadTrabajosAnPa2.setVisible(true);
				txtImporteTrabajosAnPa2.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarAnPa12.setVisible(true);
				amp11AnPa = false;
			}
		}
	}
	private class LblAmpliarAnPa12MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp12AnPa) {
				limtraanpa3();
			} else {
				comboxTrabajosAnPa3.setVisible(true);
				txtCantidadTrabajosAnPa3.setVisible(true);
				txtImporteTrabajosAnPa3.setVisible(true);
				if (!estado) {
					lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp12AnPa = false;
			}
		}
	}
	private class LblAmpliarMoPa1MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp1MoPa) {
				comboxPersonalMoPa1.setVisible(false);
				txtCantidadPersonalMoPa1.setVisible(false);
				txtImportePersonalMoPa1.setVisible(false);
				if (!estado) {
					lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limpermopa2();
				limpermopa3();
				lblAmpliarMoPa2.setVisible(false);
				lblAmpliarMoPa3.setVisible(false);
				amp1MoPa = true;
			} else {
				comboxPersonalMoPa1.setVisible(true);
				txtCantidadPersonalMoPa1.setVisible(true);
				txtImportePersonalMoPa1.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa1.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa2.setVisible(true);
				amp1MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa2MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp2MoPa) {
				limpermopa2();
				limpermopa3();
				lblAmpliarMoPa3.setVisible(false);
			} else {
				comboxPersonalMoPa2.setVisible(true);
				txtCantidadPersonalMoPa2.setVisible(true);
				txtImportePersonalMoPa2.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa3.setVisible(true);
				amp2MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa3MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp3MoPa) {
				limpermopa3();
			} else {
				comboxPersonalMoPa3.setVisible(true);
				txtCantidadPersonalMoPa3.setVisible(true);
				txtImportePersonalMoPa3.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp3MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa4MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp4MoPa) {
				comboxVehiculosMoPa1.setVisible(false);
				txtCantidadVehiculosMoPa1.setVisible(false);
				txtImporteVehiculosMoPa1.setVisible(false);
				if (!estado) {
					lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limvehmopa2();
				limvehmopa3();
				lblAmpliarMoPa5.setVisible(false);
				lblAmpliarMoPa6.setVisible(false);
				amp4MoPa = true;
			} else {
				comboxVehiculosMoPa1.setVisible(true);
				txtCantidadVehiculosMoPa1.setVisible(true);
				txtImporteVehiculosMoPa1.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa4.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa5.setVisible(true);
				amp4MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa5MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp5MoPa) {
				limvehmopa2();
				limvehmopa3();
				lblAmpliarMoPa6.setVisible(false);
			} else {
				comboxVehiculosMoPa2.setVisible(true);
				txtCantidadVehiculosMoPa2.setVisible(true);
				txtImporteVehiculosMoPa2.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa6.setVisible(true);
				amp5MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa6MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp6MoPa) {
				limvehmopa3();
			} else {
				comboxVehiculosMoPa3.setVisible(true);
				txtCantidadVehiculosMoPa3.setVisible(true);
				txtImporteVehiculosMoPa3.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp6MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa7MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp7MoPa) {
				comboxMaterialesMoPa1.setVisible(false);
				txtCantidadMaterialesMoPa1.setVisible(false);
				txtImporteMaterialesMoPa1.setVisible(false);
				if (!estado) {
					lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limmatmopa2();
				limmatmopa3();
				lblAmpliarMoPa8.setVisible(false);
				lblAmpliarMoPa9.setVisible(false);
				amp7MoPa = true;
			} else {
				comboxMaterialesMoPa1.setVisible(true);
				txtCantidadMaterialesMoPa1.setVisible(true);
				txtImporteMaterialesMoPa1.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa7.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa8.setVisible(true);
				amp7MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa8MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp8MoPa) {
				limmatmopa2();
				limmatmopa3();
				lblAmpliarMoPa9.setVisible(false);
			} else {
				comboxMaterialesMoPa2.setVisible(true);
				txtCantidadMaterialesMoPa2.setVisible(true);
				txtImporteMaterialesMoPa2.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa9.setVisible(true);
				amp8MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa9MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp9MoPa) {
				limmatmopa3();
			} else {
				comboxMaterialesMoPa3.setVisible(true);
				txtCantidadMaterialesMoPa3.setVisible(true);
				txtImporteMaterialesMoPa3.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp9MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa10MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp10MoPa) {
				comboxTrabajosMoPa1.setVisible(false);
				txtCantidadTrabajosMoPa1.setVisible(false);
				txtImporteTrabajosMoPa1.setVisible(false);
				if (!estado) {
					lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
				} else {
					lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\+.png"));
				}
				limtramopa2();
				limtramopa3();
				lblAmpliarMoPa11.setVisible(false);
				lblAmpliarMoPa12.setVisible(false);
				amp10MoPa = true;
			} else {
				comboxTrabajosMoPa1.setVisible(true);
				txtCantidadTrabajosMoPa1.setVisible(true);
				txtImporteTrabajosMoPa1.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa10.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa11.setVisible(true);
				amp10MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa11MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp11MoPa) {
				limtramopa2();
				limtramopa3();
				lblAmpliarMoPa12.setVisible(false);
			} else {
				comboxTrabajosMoPa2.setVisible(true);
				txtCantidadTrabajosMoPa2.setVisible(true);
				txtImporteTrabajosMoPa2.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				lblAmpliarMoPa12.setVisible(true);
				amp11MoPa = false;
			}
		}
	}
	private class LblAmpliarMoPa12MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!amp12MoPa) {
				limtramopa3();
			} else {
				comboxTrabajosMoPa3.setVisible(true);
				txtCantidadTrabajosMoPa3.setVisible(true);
				txtImporteTrabajosMoPa3.setVisible(true);
				if (!estado) {
					lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
				} else {
					lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
				}
				amp12MoPa = false;
			}
		}
	}
	private class BtnAnadirMouseListener extends MouseAdapter {
		@Override
		// Usuario = Admin, Contraseña = Admin1234=
		public void mouseClicked(MouseEvent e) {
			String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
			String passwd = String.valueOf(passwordField.getPassword());
			System.out.println(passwd);
			if (passwd.matches(pattern)) {
				try  {
					db.registrarL(textField.getText(), passwordField.getPassword());
					JOptionPane.showMessageDialog(null, "Usuario añadido correctamente");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error, este usuario ya existe");
				}
			} else {
				JOptionPane.showMessageDialog(null, "La contraseña tiene que ser de mínimo 8 dígitos, una mayúscula, una minúscula, un número y un carácter especial");
			}
		}
	}
	private class DateChooserFechaInicioAnPrPropertyChangeListener implements PropertyChangeListener {
		public void propertyChange(PropertyChangeEvent evt) {
			dateChooserFechaFinAnPr.setMinSelectableDate(dateChooserFechaInicioAnPr.getDate());
		}
	}
	private class ComboxProyectoLsPrActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			actualizarDatosLsPr();
		}
	}
	private class BtnEnviarAnPrMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			SimpleDateFormat sdfEnviar = new SimpleDateFormat("yyyy-MM-dd");
			if (!textFieldNombreAnPr.getText().equals("")) {
				Cliente cl = (Cliente) comboxClienteAnPr.getSelectedItem();
				Material_Peligroso ma = (Material_Peligroso) comboxMaterialTransportarAnPr.getSelectedItem();
				Empleado en = (Empleado) comboxJefeAnPr.getSelectedItem();
				Proyecto pr = null;
				if (comboxMaterialTransportarAnPr.isEnabled()) {
					pr = new Proyecto(textFieldNombreAnPr.getText(), sdfEnviar.format(dateChooserFechaInicioAnPr.getDate()), sdfEnviar.format(dateChooserFechaFinAnPr.getDate()), ma.getCod_material(), en.getCod_encargado(), cl.getCod_cliente());
				} else {
					pr = new Proyecto(textFieldNombreAnPr.getText(), sdfEnviar.format(dateChooserFechaInicioAnPr.getDate()), sdfEnviar.format(dateChooserFechaFinAnPr.getDate()), 0, en.getCod_encargado(), cl.getCod_cliente());
				}
				ArrayList<Trabajo> vTrabajos = new ArrayList<Trabajo>();
				ArrayList<Material> vMateriales = new ArrayList<Material>();
				ArrayList<Empleado> vPersonal = new ArrayList<Empleado>();
				ArrayList<Vehiculo> vVehiculos = new ArrayList<Vehiculo>();
				
				if (!amp1AnPr) {
					Empleado emple = (Empleado) comboxPersonalAnPr1.getSelectedItem();
					try {
						vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalAnPr1.getText()), Double.parseDouble(txtImportePersonalAnPr1.getText())));
					} catch (Exception es) {
						vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
					}
				}
				if (!amp2AnPr) {
					Empleado emple = (Empleado) comboxPersonalAnPr2.getSelectedItem();
					try {
						vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalAnPr2.getText()), Double.parseDouble(txtImportePersonalAnPr2.getText())));
					} catch (Exception es) {
						vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
					}
				}
				if (!amp3AnPr) {
					Empleado emple = (Empleado) comboxPersonalAnPr3.getSelectedItem();
					try {
						vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalAnPr3.getText()), Double.parseDouble(txtImportePersonalAnPr3.getText())));
					} catch (Exception es) {
						vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
					}
				}
				if (!amp4AnPr) {
					Vehiculo vehi = (Vehiculo) comboxVehiculosAnPr1.getSelectedItem();
					try {
						vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosAnPr1.getText()), Double.parseDouble(txtImporteVehiculosAnPr1.getText())));
					} catch (Exception es) {
						vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
					}
				}
				if (!amp5AnPr) {
					Vehiculo vehi = (Vehiculo) comboxVehiculosAnPr2.getSelectedItem();
					try {
						vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosAnPr2.getText()), Double.parseDouble(txtImporteVehiculosAnPr2.getText())));
					} catch (Exception es) {
						vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
					}
				}
				if (!amp6AnPr) {
					Vehiculo vehi = (Vehiculo) comboxVehiculosAnPr3.getSelectedItem();
					try {
						vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosAnPr3.getText()), Double.parseDouble(txtImporteVehiculosAnPr3.getText())));
					} catch (Exception es) {
						vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
					}
				}
				if (!amp7AnPr) {
					Material mate = (Material) comboxMaterialesAnPr1.getSelectedItem();
					try {
						vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesAnPr1.getText()), Double.parseDouble(txtImporteMaterialesAnPr1.getText())));
					} catch (Exception es) {
						vMateriales.add(new Material(mate.getCod_material(), 0, 0));
					}
				}
				if (!amp8AnPr) {
					Material mate = (Material) comboxMaterialesAnPr2.getSelectedItem();
					try {
						vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesAnPr2.getText()), Double.parseDouble(txtImporteMaterialesAnPr2.getText())));
					} catch (Exception es) {
						vMateriales.add(new Material(mate.getCod_material(), 0, 0));
					}
				}
				if (!amp9AnPr) {
					Material mate = (Material) comboxMaterialesAnPr3.getSelectedItem();
					try {
						vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesAnPr3.getText()), Double.parseDouble(txtImporteMaterialesAnPr3.getText())));
					} catch (Exception es) {
						vMateriales.add(new Material(mate.getCod_material(), 0, 0));
					}
				}
				if (!amp10AnPr) {
					Trabajo trab = (Trabajo) comboxTrabajosAnPr1.getSelectedItem();
					try {
						vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosAnPr1.getText()), Double.parseDouble(txtImporteTrabajosAnPr1.getText())));
					} catch (Exception es) {
						vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
					}
				}
				if (!amp11AnPr) {
					Trabajo trab = (Trabajo) comboxTrabajosAnPr2.getSelectedItem();
					try {
						vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosAnPr2.getText()), Double.parseDouble(txtImporteTrabajosAnPr2.getText())));
					} catch (Exception es) {
						vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
					}
				}
				if (!amp12AnPr) {
					Trabajo trab = (Trabajo) comboxTrabajosAnPr3.getSelectedItem();
					try {
						vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosAnPr3.getText()), Double.parseDouble(txtImporteTrabajosAnPr3.getText())));
					} catch (Exception es) {
						vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
					}
				}
				
				db.insertarProyecto(pr);
				int cod_proyecto = db.obtenerCodProyecto();
				db.insertarEstimacionTrabajo(cod_proyecto, vTrabajos);
				db.insertarEstimacionEmpleado(cod_proyecto, vPersonal);
				db.insertarEstimacionMaterial(cod_proyecto, vMateriales);
				db.insertarEstimacionVehiculo(cod_proyecto, vVehiculos);
				JOptionPane.showMessageDialog(null, "Datos insertados con éxito");
				actualizarProyectos();
			} else {
				JOptionPane.showMessageDialog(null, "Error, inserte los datos necesarios");
			}
			
			
			
		}
	}
	private class ExitAnPrMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (deshabilitarBoton) {
				comboxMaterialTransportarAnPr.setEnabled(true);
				deshabilitarBoton = false;
			} else {
				comboxMaterialTransportarAnPr.setEnabled(false);
				deshabilitarBoton = true;
			}
			
		}
	}
	private class BtnEnviarAnPr_1MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			ArrayList<Trabajo> vTrabajos = new ArrayList<Trabajo>();
			ArrayList<Material> vMateriales = new ArrayList<Material>();
			ArrayList<Empleado> vPersonal = new ArrayList<Empleado>();
			ArrayList<Vehiculo> vVehiculos = new ArrayList<Vehiculo>();
			
			if (!amp1AnPa) {
				Empleado emple = (Empleado) comboxPersonalAnPr1.getSelectedItem();
				try {
					vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalAnPa1.getText()), Double.parseDouble(txtImportePersonalAnPa1.getText())));
				} catch (Exception es) {
					vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
				}
			}
			if (!amp2AnPa) {
				Empleado emple = (Empleado) comboxPersonalAnPa2.getSelectedItem();
				try {
					vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalAnPa2.getText()), Double.parseDouble(txtImportePersonalAnPa2.getText())));
				} catch (Exception es) {
					vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
				}
			}
			if (!amp3AnPa) {
				Empleado emple = (Empleado) comboxPersonalAnPa3.getSelectedItem();
				try {
					vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalAnPa3.getText()), Double.parseDouble(txtImportePersonalAnPa3.getText())));
				} catch (Exception es) {
					vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
				}
			}
			if (!amp4AnPa) {
				Vehiculo vehi = (Vehiculo) comboxVehiculosAnPa1.getSelectedItem();
				try {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosAnPa1.getText()), Double.parseDouble(txtImporteVehiculosAnPa1.getText())));
				} catch (Exception es) {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
				}
			}
			if (!amp5AnPa) {
				Vehiculo vehi = (Vehiculo) comboxVehiculosAnPa2.getSelectedItem();
				try {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosAnPa2.getText()), Double.parseDouble(txtImporteVehiculosAnPa2.getText())));
				} catch (Exception es) {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
				}
			}
			if (!amp6AnPa) {
				Vehiculo vehi = (Vehiculo) comboxVehiculosAnPa3.getSelectedItem();
				try {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosAnPa3.getText()), Double.parseDouble(txtImporteVehiculosAnPa3.getText())));
				} catch (Exception es) {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
				}
			}
			if (!amp7AnPa) {
				Material mate = (Material) comboxMaterialesAnPa1.getSelectedItem();
				try {
					vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesAnPa1.getText()), Double.parseDouble(txtImporteMaterialesAnPa1.getText())));
				} catch (Exception es) {
					vMateriales.add(new Material(mate.getCod_material(), 0, 0));
				}
			}
			if (!amp8AnPa) {
				Material mate = (Material) comboxMaterialesAnPa2.getSelectedItem();
				try {
					vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesAnPa2.getText()), Double.parseDouble(txtImporteMaterialesAnPa2.getText())));
				} catch (Exception es) {
					vMateriales.add(new Material(mate.getCod_material(), 0, 0));
				}
			}
			if (!amp9AnPa) {
				Material mate = (Material) comboxMaterialesAnPa3.getSelectedItem();
				try {
					vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesAnPa3.getText()), Double.parseDouble(txtImporteMaterialesAnPa3.getText())));
				} catch (Exception es) {
					vMateriales.add(new Material(mate.getCod_material(), 0, 0));
				}
			}
			if (!amp10AnPa) {
				Trabajo trab = (Trabajo) comboxTrabajosAnPa1.getSelectedItem();
				try {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosAnPa1.getText()), Double.parseDouble(txtImporteTrabajosAnPa1.getText())));
				} catch (Exception es) {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
				}
			}
			if (!amp11AnPa) {
				Trabajo trab = (Trabajo) comboxTrabajosAnPa2.getSelectedItem();
				try {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosAnPa2.getText()), Double.parseDouble(txtImporteTrabajosAnPa2.getText())));
				} catch (Exception es) {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
				}
			}
			if (!amp12AnPa) {
				Trabajo trab = (Trabajo) comboxTrabajosAnPa3.getSelectedItem();
				try {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosAnPa3.getText()), Double.parseDouble(txtImporteTrabajosAnPa3.getText())));
				} catch (Exception es) {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
				}
			}
			Proyecto pr = (Proyecto) comboxProyectoAnPa.getSelectedItem();
			try {
				db.insertarParteProyecto(pr.getCod_proyecto());
				db.insertarParteEmpleado(pr.getCod_proyecto(), vPersonal);
				db.insertarParteMaterial(pr.getCod_proyecto(), vMateriales);
				db.insertarParteTrabajo(pr.getCod_proyecto(), vTrabajos);
				db.insertarParteVehiculo(pr.getCod_proyecto(), vVehiculos);
				JOptionPane.showMessageDialog(null, "Datos insertados con éxito");
			} catch (Exception E) {
				JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
			}
			
		}
	}
	private class ComboxProyectoAnPaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class BtnEnviarAnPr_2MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			ArrayList<Trabajo> vTrabajos = new ArrayList<Trabajo>();
			ArrayList<Material> vMateriales = new ArrayList<Material>();
			ArrayList<Empleado> vPersonal = new ArrayList<Empleado>();
			ArrayList<Vehiculo> vVehiculos = new ArrayList<Vehiculo>();
			
			if (!amp1MoPa) {
				Empleado emple = (Empleado) comboxPersonalMoPa1.getSelectedItem();
				try {
					vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalMoPa1.getText()), Double.parseDouble(txtImportePersonalMoPa1.getText())));
				} catch (Exception es) {
					vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
				}
			}
			if (!amp2MoPa) {
				Empleado emple = (Empleado) comboxPersonalMoPa2.getSelectedItem();
				try {
					vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalMoPa2.getText()), Double.parseDouble(txtImportePersonalMoPa2.getText())));
				} catch (Exception es) {
					vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
				}
			}
			if (!amp3MoPa) {
				Empleado emple = (Empleado) comboxPersonalMoPa3.getSelectedItem();
				try {
					vPersonal.add(new Empleado(emple.getCod_encargado(), Integer.parseInt(txtCantidadPersonalMoPa3.getText()), Double.parseDouble(txtImportePersonalMoPa3.getText())));
				} catch (Exception es) {
					vPersonal.add(new Empleado(emple.getCod_encargado(), 0, 0));
				}
			}
			if (!amp4MoPa) {
				Vehiculo vehi = (Vehiculo) comboxVehiculosMoPa1.getSelectedItem();
				try {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosMoPa1.getText()), Double.parseDouble(txtImporteVehiculosMoPa1.getText())));
				} catch (Exception es) {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
				}
			}
			if (!amp5MoPa) {
				Vehiculo vehi = (Vehiculo) comboxVehiculosMoPa2.getSelectedItem();
				try {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosMoPa2.getText()), Double.parseDouble(txtImporteVehiculosMoPa2.getText())));
				} catch (Exception es) {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
				}
			}
			if (!amp6MoPa) {
				Vehiculo vehi = (Vehiculo) comboxVehiculosMoPa3.getSelectedItem();
				try {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), Integer.parseInt(txtCantidadVehiculosMoPa3.getText()), Double.parseDouble(txtImporteVehiculosMoPa3.getText())));
				} catch (Exception es) {
					vVehiculos.add(new Vehiculo(vehi.getMatricula(), 0, 0));
				}
			}
			if (!amp7MoPa) {
				Material mate = (Material) comboxMaterialesMoPa1.getSelectedItem();
				try {
					vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesMoPa1.getText()), Double.parseDouble(txtImporteMaterialesMoPa1.getText())));
				} catch (Exception es) {
					vMateriales.add(new Material(mate.getCod_material(), 0, 0));
				}
			}
			if (!amp8MoPa) {
				Material mate = (Material) comboxMaterialesMoPa2.getSelectedItem();
				try {
					vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesMoPa2.getText()), Double.parseDouble(txtImporteMaterialesMoPa2.getText())));
				} catch (Exception es) {
					vMateriales.add(new Material(mate.getCod_material(), 0, 0));
				}
			}
			if (!amp9MoPa) {
				Material mate = (Material) comboxMaterialesMoPa3.getSelectedItem();
				try {
					vMateriales.add(new Material(mate.getCod_material(), Integer.parseInt(txtCantidadMaterialesMoPa3.getText()), Double.parseDouble(txtImporteMaterialesMoPa3.getText())));
				} catch (Exception es) {
					vMateriales.add(new Material(mate.getCod_material(), 0, 0));
				}
			}
			if (!amp10MoPa) {
				Trabajo trab = (Trabajo) comboxTrabajosMoPa1.getSelectedItem();
				try {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosMoPa1.getText()), Double.parseDouble(txtImporteTrabajosMoPa1.getText())));
				} catch (Exception es) {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
				}
			}
			if (!amp11MoPa) {
				Trabajo trab = (Trabajo) comboxTrabajosMoPa2.getSelectedItem();
				try {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosMoPa2.getText()), Double.parseDouble(txtImporteTrabajosMoPa2.getText())));
				} catch (Exception es) {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
				}
			}
			if (!amp12MoPa) {
				Trabajo trab = (Trabajo) comboxTrabajosMoPa3.getSelectedItem();
				try {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), Integer.parseInt(txtCantidadTrabajosMoPa3.getText()), Double.parseDouble(txtImporteTrabajosMoPa3.getText())));
				} catch (Exception es) {
					vTrabajos.add(new Trabajo(trab.getCod_trabajo(), 0, 0));
				}
			}
			Proyecto pr = (Proyecto) comboxProyectoAnPa.getSelectedItem();
			try {
				System.out.println(pr.getCod_proyecto());
				db.eliminarPartesEmpleado(pr.getCod_proyecto());
				db.eliminarPartesMaterial(pr.getCod_proyecto());
				db.eliminarPartesTrabajo(pr.getCod_proyecto());
				db.eliminarPartesVehiculo(pr.getCod_proyecto());
				db.insertarParteEmpleado(pr.getCod_proyecto(), vPersonal);
				db.insertarParteMaterial(pr.getCod_proyecto(), vMateriales);
				db.insertarParteTrabajo(pr.getCod_proyecto(), vTrabajos);
				db.insertarParteVehiculo(pr.getCod_proyecto(), vVehiculos);
				JOptionPane.showMessageDialog(null, "Datos insertados con éxito");
			} catch (Exception E) {
				JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
			}
		}
	}
	private class ComboxProyectoMoPaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			actualizarDatosMoPa();
		}
	}
	
	// Añadir Proyecto
	
	private void limperanpr2() {
		comboxPersonalAnPr2.setVisible(false);
		txtCantidadPersonalAnPr2.setVisible(false);
		txtImportePersonalAnPr2.setVisible(false);
		txtCantidadPersonalAnPr2.setText("");
		txtImportePersonalAnPr2.setText("");
		if (!estado) {
			lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr2.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp2AnPr = true;
	}
	
	private void limperanpr3() {
		comboxPersonalAnPr3.setVisible(false);
		txtCantidadPersonalAnPr3.setVisible(false);
		txtImportePersonalAnPr3.setVisible(false);
		txtCantidadPersonalAnPr3.setText("");
		txtImportePersonalAnPr3.setText("");
		if (!estado) {
			lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp3AnPr = true;
	}
	
	private void limvehanpr2() {
		comboxVehiculosAnPr2.setVisible(false);
		txtCantidadVehiculosAnPr2.setVisible(false);
		txtImporteVehiculosAnPr2.setVisible(false);
		txtCantidadVehiculosAnPr2.setText("");
		txtImporteVehiculosAnPr2.setText("");
		if (!estado) {
			lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr5.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp5AnPr = true;
	}
	
	private void limvehanpr3() {
		comboxVehiculosAnPr3.setVisible(false);
		txtCantidadVehiculosAnPr3.setVisible(false);
		txtImporteVehiculosAnPr3.setVisible(false);
		txtCantidadVehiculosAnPr3.setText("");
		txtImporteVehiculosAnPr3.setText("");
		if (!estado) {
			lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp6AnPr = true;
	}
	
	private void limmatanpr2() {
		comboxMaterialesAnPr2.setVisible(false);
		txtCantidadMaterialesAnPr2.setVisible(false);
		txtImporteMaterialesAnPr2.setVisible(false);
		txtCantidadMaterialesAnPr2.setText("");
		txtImporteMaterialesAnPr2.setText("");
		if (!estado) {
			lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr8.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp8AnPr = true;
	}
	
	private void limmatanpr3() {
		comboxMaterialesAnPr3.setVisible(false);
		txtCantidadMaterialesAnPr3.setVisible(false);
		txtImporteMaterialesAnPr3.setVisible(false);
		txtCantidadMaterialesAnPr3.setText("");
		txtImporteMaterialesAnPr3.setText("");
		if (!estado) {
			lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp9AnPr = true;
	}
	
	private void limtraanpr2() {
		comboxTrabajosAnPr2.setVisible(false);
		txtCantidadTrabajosAnPr2.setVisible(false);
		txtImporteTrabajosAnPr2.setVisible(false);
		txtCantidadTrabajosAnPr2.setText("");
		txtImporteTrabajosAnPr2.setText("");
		if (!estado) {
			lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr11.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp11AnPr = true;
	}
	
	private void limtraanpr3() {
		comboxTrabajosAnPr3.setVisible(false);
		txtCantidadTrabajosAnPr3.setVisible(false);
		txtImporteTrabajosAnPr3.setVisible(false);
		txtCantidadTrabajosAnPr3.setText("");
		txtImporteTrabajosAnPr3.setText("");
		if (!estado) {
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp12AnPr = true;
	}
	
	private void limperanpa2() {
		comboxPersonalAnPa2.setVisible(false);
		txtCantidadPersonalAnPa2.setVisible(false);
		txtImportePersonalAnPa2.setVisible(false);
		txtCantidadPersonalAnPa2.setText("");
		txtImportePersonalAnPa2.setText("");
		if (!estado) {
			lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa2.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp2AnPa = true;
	}
	
	private void limperanpa3() {
		comboxPersonalAnPa3.setVisible(false);
		txtCantidadPersonalAnPa3.setVisible(false);
		txtImportePersonalAnPa3.setVisible(false);
		txtCantidadPersonalAnPa3.setText("");
		txtImportePersonalAnPa3.setText("");
		if (!estado) {
			lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp3AnPa = true;
	}
	
	private void limvehanpa2() {
		comboxVehiculosAnPa2.setVisible(false);
		txtCantidadVehiculosAnPa2.setVisible(false);
		txtImporteVehiculosAnPa2.setVisible(false);
		txtCantidadVehiculosAnPa2.setText("");
		txtImporteVehiculosAnPa2.setText("");
		if (!estado) {
			lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa5.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp5AnPa = true;
	}
	
	private void limvehanpa3() {
		comboxVehiculosAnPa3.setVisible(false);
		txtCantidadVehiculosAnPa3.setVisible(false);
		txtImporteVehiculosAnPa3.setVisible(false);
		txtCantidadVehiculosAnPa3.setText("");
		txtImporteVehiculosAnPa3.setText("");
		if (!estado) {
			lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp6AnPa = true;
	}
	
	private void limmatanpa2() {
		comboxMaterialesAnPa2.setVisible(false);
		txtCantidadMaterialesAnPa2.setVisible(false);
		txtImporteMaterialesAnPa2.setVisible(false);
		txtCantidadMaterialesAnPa2.setText("");
		txtImporteMaterialesAnPa2.setText("");
		if (!estado) {
			lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa8.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp8AnPa = true;
	}
	
	private void limmatanpa3() {
		comboxMaterialesAnPa3.setVisible(false);
		txtCantidadMaterialesAnPa3.setVisible(false);
		txtImporteMaterialesAnPa3.setVisible(false);
		txtCantidadMaterialesAnPa3.setText("");
		txtImporteMaterialesAnPa3.setText("");
		if (!estado) {
			lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp9AnPa = true;
	}
	
	private void limtraanpa2() {
		comboxTrabajosAnPa2.setVisible(false);
		txtCantidadTrabajosAnPa2.setVisible(false);
		txtImporteTrabajosAnPa2.setVisible(false);
		txtCantidadTrabajosAnPa2.setText("");
		txtImporteTrabajosAnPa2.setText("");
		if (!estado) {
			lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa11.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp11AnPa = true;
	}
	
	private void limtraanpa3() {
		comboxTrabajosAnPa3.setVisible(false);
		txtCantidadTrabajosAnPa3.setVisible(false);
		txtImporteTrabajosAnPa3.setVisible(false);
		txtCantidadTrabajosAnPa3.setText("");
		txtImporteTrabajosAnPa3.setText("");
		if (!estado) {
			lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPa12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp12AnPa = true;
	}
	
	private void limpermopa2() {
		comboxPersonalMoPa2.setVisible(false);
		txtCantidadPersonalMoPa2.setVisible(false);
		txtImportePersonalMoPa2.setVisible(false);
		txtCantidadPersonalMoPa2.setText("");
		txtImportePersonalMoPa2.setText("");
		if (!estado) {
			lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa2.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp2MoPa = true;
	}
	
	private void limpermopa3() {
		comboxPersonalMoPa3.setVisible(false);
		txtCantidadPersonalMoPa3.setVisible(false);
		txtImportePersonalMoPa3.setVisible(false);
		txtCantidadPersonalMoPa3.setText("");
		txtImportePersonalMoPa3.setText("");
		if (!estado) {
			lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa3.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp3MoPa = true;
	}
	
	private void limvehmopa2() {
		comboxVehiculosMoPa2.setVisible(false);
		txtCantidadVehiculosMoPa2.setVisible(false);
		txtImporteVehiculosMoPa2.setVisible(false);
		txtCantidadVehiculosMoPa2.setText("");
		txtImporteVehiculosMoPa2.setText("");
		if (!estado) {
			lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa5.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp5MoPa = true;
	}
	
	private void limvehmopa3() {
		comboxVehiculosMoPa3.setVisible(false);
		txtCantidadVehiculosMoPa3.setVisible(false);
		txtImporteVehiculosMoPa3.setVisible(false);
		txtCantidadVehiculosMoPa3.setText("");
		txtImporteVehiculosMoPa3.setText("");
		if (!estado) {
			lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa6.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp6MoPa = true;
	}
	
	private void limmatmopa2() {
		comboxMaterialesMoPa2.setVisible(false);
		txtCantidadMaterialesMoPa2.setVisible(false);
		txtImporteMaterialesMoPa2.setVisible(false);
		txtCantidadMaterialesMoPa2.setText("");
		txtImporteMaterialesMoPa2.setText("");
		if (!estado) {
			lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa8.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp8MoPa = true;
	}
	
	private void limmatmopa3() {
		comboxMaterialesMoPa3.setVisible(false);
		txtCantidadMaterialesMoPa3.setVisible(false);
		txtImporteMaterialesMoPa3.setVisible(false);
		txtCantidadMaterialesMoPa3.setText("");
		txtImporteMaterialesMoPa3.setText("");
		if (!estado) {
			lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa9.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp9MoPa = true;
	}
	
	private void limtramopa2() {
		comboxTrabajosMoPa2.setVisible(false);
		txtCantidadTrabajosMoPa2.setVisible(false);
		txtImporteTrabajosMoPa2.setVisible(false);
		txtCantidadTrabajosMoPa2.setText("");
		txtImporteTrabajosMoPa2.setText("");
		if (!estado) {
			lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa11.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp11MoPa = true;
	}
	
	private void limtramopa3() {
		comboxTrabajosMoPa3.setVisible(false);
		txtCantidadTrabajosMoPa3.setVisible(false);
		txtImporteTrabajosMoPa3.setVisible(false);
		txtCantidadTrabajosMoPa3.setText("");
		txtImporteTrabajosMoPa3.setText("");
		if (!estado) {
			lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarMoPa12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp12MoPa = true;
	}
	
	
	private void limpiarPanels() {
		panelAnadirProyecto.setVisible(false);
		panelListaProyectos.setVisible(false);
		panelAnadirParte.setVisible(false);
		panelModificarParte.setVisible(false);
		panelAnadirUsuario.setVisible(false);
	}
}
