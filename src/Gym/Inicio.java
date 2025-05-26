package Gym;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new FondoPanel("src/Imagenes/GymImage.jpg");
		//contentPane.setBackground(new Color(196, 247, 255));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		
		setContentPane(contentPane);

		//setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAcceso = new JLabel("ACCESO");
		lblAcceso.setForeground(new Color(183, 188, 210));
		lblAcceso.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcceso.setFont(new Font("Tw Cen MT", Font.PLAIN, 26));
		lblAcceso.setBounds(30, 45, 376, 37);
		contentPane.add(lblAcceso);
		
		BotonGrisElegante btnIniciarSesion = new BotonGrisElegante("Iniciar Sesión");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //Cierra ventana actual para abrir otra
				VentanaInicioSesion V2 = new VentanaInicioSesion();
				V2.setVisible(true);
			}
		});
		btnIniciarSesion.setBounds(151, 127, 127, 23);
		contentPane.add(btnIniciarSesion);
		
		BotonGrisElegante btnRegistrar = new BotonGrisElegante("Registrarse");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //Cierra ventana actual para abrir otra
				VentanaRegistro V3 = new VentanaRegistro();
				V3.setVisible(true);
			}
		});
		btnRegistrar.setBounds(151, 93, 127, 23);
		contentPane.add(btnRegistrar);
		
		BotonGrisElegante btnModoInvitado = new BotonGrisElegante("Modo Invitado");
		btnModoInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //Cierra ventana actual para abrir otra
				AlertaConfirmacion V1 = new AlertaConfirmacion();
				V1.setVisible(true);
			}
		});
		btnModoInvitado.setBounds(151, 161, 127, 23);
		contentPane.add(btnModoInvitado);
		
		RoundedPanel panel = new RoundedPanel(60); // 30 es el radio del redondeado
		panel.setBackground(new Color(0, 0, 0, 190)); // Color semitransparente
		panel.setBounds(120, 30, 190, 190);
		contentPane.add(panel);
		
		JLabel lblGYMFIT = new JLabel("GYMFIT");
		lblGYMFIT.setFont(new Font("SimSun", Font.PLAIN, 30));
		lblGYMFIT.setBounds(10, 209, 215, 63);
		lblGYMFIT.setForeground(new Color(0, 0, 0));
		contentPane.add(lblGYMFIT);
		
		

	}
}
