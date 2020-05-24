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
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JLabel fondo;
	private JLabel exit;
	private JLabel contr;
	private JLabel min;
	private JLabel movebar;
	private boolean estado;
	private Point initialClick;
	private Usersettings usr = new Usersettings();
	private JPanel panelProyectos;
	private JPanel panelPartes;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel home;
	private JLabel lblListadoProyectos;
	private JLabel lblListadoPartes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
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
		
		lblListadoProyectos = new JLabel("Listado Proyectos");
		lblListadoProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoProyectos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListadoProyectos.setBounds(40, 0, 170, 43);
		contentPane.add(lblListadoProyectos);
		
		lblListadoPartes = new JLabel("Listado Partes");
		lblListadoPartes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoPartes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListadoPartes.setBounds(210, 0, 170, 43);
		contentPane.add(lblListadoPartes);
		
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
		
		panelPartes = new JPanel();
		panelPartes.setBounds(0, 54, 1280, 666);
		panelPartes.setOpaque(false);
		contentPane.add(panelPartes);
		
		lblNewLabel_1 = new JLabel("Panel Partes");
		panelPartes.add(lblNewLabel_1);
		
		panelProyectos = new JPanel();
		panelProyectos.setBounds(0, 54, 1280, 666);
		contentPane.add(panelProyectos);
		panelProyectos.setOpaque(false);
		panelProyectos.setLayout(null);
		
		lblNewLabel = new JLabel("Panel Proyectos");
		lblNewLabel.setBounds(545, 92, 46, 14);
		panelProyectos.add(lblNewLabel);
		
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
		
		panelPartes.setVisible(false);
		panelProyectos.setVisible(false);
	}
	
	private void establecerContrasteOcs() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\night.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x_w.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle_w.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline_w.png"));
		home.setIcon(new ImageIcon(".\\rsrc\\home_w.png"));
		lblListadoProyectos.setForeground(Color.WHITE);
		lblListadoPartes.setForeground(Color.WHITE);
	}
	private void establecerContrasteBri() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\day.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline.png"));
		home.setIcon(new ImageIcon(".\\rsrc\\home.png"));
		lblListadoProyectos.setForeground(Color.BLACK);
		lblListadoPartes.setForeground(Color.BLACK);
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
	private class HomeMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			panelPartes.setVisible(false);
			panelProyectos.setVisible(false);
		}
	}
}
