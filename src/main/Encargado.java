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
		lblAnadirParte.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirParte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnadirParte.setBounds(550, 0, 170, 43);
		contentPane.add(lblAnadirParte);
		
		lblAnadirProyecto = new JLabel("Añadir Proyecto");
		lblAnadirProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirProyecto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnadirProyecto.setBounds(210, 0, 170, 43);
		contentPane.add(lblAnadirProyecto);
		
		lblListadoProyectos = new JLabel("Listado Proyectos");
		lblListadoProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoProyectos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListadoProyectos.setBounds(40, 0, 170, 43);
		contentPane.add(lblListadoProyectos);
		
		lblModificarParte = new JLabel("Modificar Parte");
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
		btnAnadir.setBounds(540, 400, 200, 30);
		panelAnadirUsuario.add(btnAnadir);
		
		lblAnadirUsuarioInt = new JLabel("Añadir Usuario");
		lblAnadirUsuarioInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirUsuarioInt.setForeground(Color.WHITE);
		lblAnadirUsuarioInt.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAnadirUsuarioInt.setBounds(540, 70, 200, 43);
		panelAnadirUsuario.add(lblAnadirUsuarioInt);
		
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
		lblAnadirUsuarioInt.setForeground(Color.WHITE);
		lblUsuario.setForeground(Color.WHITE);
		lblContr.setForeground(Color.WHITE);
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
		lblAnadirUsuarioInt.setForeground(Color.BLACK);
		lblUsuario.setForeground(Color.BLACK);
		lblContr.setForeground(Color.BLACK);
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
	
	private void limpiarPanels() {
		panelAnadirUsuario.setVisible(false);
	}
}
