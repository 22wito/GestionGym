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
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 247, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAcceso = new JLabel("ACCESO");
		lblAcceso.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAcceso.setBounds(168, 45, 95, 37);
		contentPane.add(lblAcceso);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIniciarSesion.setBounds(151, 127, 127, 23);
		contentPane.add(btnIniciarSesion);
		
		JButton btnRegistrar = new JButton("Registrarse");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setBounds(151, 93, 127, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnModoInvitado = new JButton("Modo Invitado");
		btnModoInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModoInvitado.setBounds(151, 161, 127, 23);
		contentPane.add(btnModoInvitado);
		
		RoundedPanel panel = new RoundedPanel(30); // 30 es el radio del redondeado
		panel.setBackground(new Color(0, 0, 255, 128)); // Color semitransparente
		panel.setBounds(120, 30, 190, 190);
		contentPane.add(panel);

	}
}
