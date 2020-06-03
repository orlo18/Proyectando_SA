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

import inoutput.Usersettings;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.event.MouseMotionAdapter;

public class Princp extends JFrame {

	private JPanel contentPane;
	private JLabel fondo;
	private JLabel exit;
	private JLabel contr;
	private JLabel min;
	private JLabel movebar;
	private boolean estado;
	private Point initialClick;
	private Usersettings usr = new Usersettings();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Princp frame = new Princp();
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
	public Princp() {
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
	}
	
	private void establecerContrasteOcs() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\night.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash_w.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x_w.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle_w.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline_w.png"));
	}
	private void establecerContrasteBri() {
		fondo.setIcon(new ImageIcon(".\\rsrc\\day.jpg"));
		min.setIcon(new ImageIcon(".\\rsrc\\dash.png"));
		exit.setIcon(new ImageIcon(".\\rsrc\\x.png"));
		contr.setIcon(new ImageIcon(".\\rsrc\\ccircle.png"));
		movebar.setIcon(new ImageIcon(".\\rsrc\\underline.png"));
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
}
