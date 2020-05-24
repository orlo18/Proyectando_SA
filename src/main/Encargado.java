package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Frame;
import java.awt.Point;

import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;

import statics.Usersettings;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

@SuppressWarnings({ "unused", "serial" })
public class Encargado extends JFrame {

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
	private boolean amp1LsPr = true, amp2LsPr = true, amp3LsPr = true, amp4LsPr = true, amp5LsPr = true, amp6LsPr = true, amp7LsPr = true, amp8LsPr = true, amp9LsPr = true, amp10LsPr = true, amp11LsPr = true, amp12LsPr = true;
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
	private JDateChooser dateChooserFechaFinLsPr;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encargado frame = new Encargado();
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
	public Encargado() {
		initApp();
		
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
		
		dateChooserFechaFinLsPr = new JDateChooser();
		dateChooserFechaFinLsPr.setBounds(910, 221, 150, 30);
		panelListaProyectos.add(dateChooserFechaFinLsPr);
		
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
		dateChooserFechaInicioAnPr.setBounds(910, 180, 150, 30);
		panelAnadirProyecto.add(dateChooserFechaInicioAnPr);
		
		lblFechaFinAnPr = new JLabel("Fecha Fin");
		lblFechaFinAnPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaFinAnPr.setBounds(750, 221, 150, 30);
		panelAnadirProyecto.add(lblFechaFinAnPr);
		
		dateChooserFechaFinAnPr = new JDateChooser();
		dateChooserFechaFinAnPr.setBounds(910, 221, 150, 30);
		panelAnadirProyecto.add(dateChooserFechaFinAnPr);
		
		comboxMaterialTransportarAnPr = new JComboBox();
		comboxMaterialTransportarAnPr.setBounds(910, 264, 150, 30);
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
		
		/**panelAnadirUsuario = new JPanel();
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
		btnAnadir.setBounds(540, 400, 200, 30);
		panelAnadirUsuario.add(btnAnadir);
		
		lblAnadirUsuarioInt = new JLabel("Añadir Usuario");
		lblAnadirUsuarioInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirUsuarioInt.setForeground(Color.WHITE);
		lblAnadirUsuarioInt.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAnadirUsuarioInt.setBounds(540, 50, 200, 43);
		panelAnadirUsuario.add(lblAnadirUsuarioInt);*/
		
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
		
		lblAmpliarAnPr2.setVisible(false);
		lblAmpliarAnPr3.setVisible(false);
		lblAmpliarAnPr5.setVisible(false);
		lblAmpliarAnPr6.setVisible(false);
		lblAmpliarAnPr8.setVisible(false);
		lblAmpliarAnPr9.setVisible(false);
		lblAmpliarAnPr11.setVisible(false);
		lblAmpliarAnPr12.setVisible(false);
		limpiarPanels();
		
	}
	
	private void establecerContrasteOcs() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\night.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x_w.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle_w.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline_w.png"));
		home.setIcon(new ImageIcon(".\\rsrc\\home_w.png"));
		
		lblModificarParte.setForeground(Color.WHITE);
		lblAnadirParte.setForeground(Color.WHITE);
		lblAnadirUsuario.setForeground(Color.WHITE);
		lblAnadirProyecto.setForeground(Color.WHITE);
		lblListadoProyectos.setForeground(Color.WHITE);
		/**lblAnadirUsuarioInt.setForeground(Color.WHITE);
		lblUsuario.setForeground(Color.WHITE);
		lblContr.setForeground(Color.WHITE);*/
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
		
	}
	private void establecerContrasteBri() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\day.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline.png"));
		home.setIcon(new ImageIcon(".\\rsrc\\home.png"));
		
		lblModificarParte.setForeground(Color.BLACK);
		lblAnadirParte.setForeground(Color.BLACK);
		lblAnadirUsuario.setForeground(Color.BLACK);
		lblAnadirProyecto.setForeground(Color.BLACK);
		lblListadoProyectos.setForeground(Color.BLACK);
		/**lblAnadirUsuarioInt.setForeground(Color.BLACK);
		lblUsuario.setForeground(Color.BLACK);
		lblContr.setForeground(Color.BLACK);*/
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
			//panelAnadirUsuario.setVisible(true);
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
		}
	}
	private class LblModificarParteMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			limpiarPanels();
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
	
	// Añadir Proyecto
	
	private void limperanpr2() {
		comboxPersonalAnPr2.setVisible(false);
		txtCantidadPersonalAnPr2.setVisible(false);
		txtImportePersonalAnPr2.setVisible(false);
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
		if (!estado) {
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\+_w.png"));
		} else {
			lblAmpliarAnPr12.setIcon(new ImageIcon(".\\rsrc\\+.png"));
		}
		amp12AnPr = true;
	}
	
	
	private void limpiarPanels() {
		panelAnadirProyecto.setVisible(false);
		panelListaProyectos.setVisible(false);
		//panelAnadirUsuario.setVisible(false);
	}
}
