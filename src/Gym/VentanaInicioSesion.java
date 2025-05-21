package Gym;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class VentanaInicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMedacgmailcom;
	private JTextField txtabcd;
	private static boolean modo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicioSesion frame = new VentanaInicioSesion();
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
	public VentanaInicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIAR SESIÓN");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 10, 245, 57);
		lblNewLabel.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 78, 160, 25);
		lblNewLabel_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(24, 108, 160, 25);
		lblNewLabel_1_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1_1);
		
		txtMedacgmailcom = new JTextField();
		txtMedacgmailcom.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		txtMedacgmailcom.setText("medac@gmail.com");
		txtMedacgmailcom.setBounds(194, 79, 177, 25);
		txtMedacgmailcom.setForeground(new Color(183, 188, 210));
		contentPane.add(txtMedacgmailcom);
		txtMedacgmailcom.setColumns(10);
		
		txtabcd = new JTextField();
		txtabcd.setText("1234abcd");
		txtabcd.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		txtabcd.setColumns(10);
		txtabcd.setBounds(194, 108, 177, 25);
		txtabcd.setForeground(new Color(183, 188, 210));
		contentPane.add(txtabcd);
		
		/* JButton btnNewButton = new JButton("INICIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				modo = false;
				AplicacionPrincipal V4 = new AplicacionPrincipal(modo);
				V4.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(10, 201, 186, 49);
		contentPane.add(btnNewButton); */
		
		BotonConEstilo btnIniciar = new BotonConEstilo("INICIAR");

		btnIniciar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose();
		        modo = false;
		        // metodo iniciar sesion id
		        AplicacionPrincipal V4 = new AplicacionPrincipal(modo); //meter id
		        V4.setVisible(true);
		    }
		});

		btnIniciar.setBounds(10, 201, 186, 49); // Puedes ajustar esto o usar layout
		contentPane.add(btnIniciar);
		
		BotonRojoAlerta btnVolver = new BotonRojoAlerta("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Inicio V0 = new Inicio();
				V0.setVisible(true);
			}
		});
		btnVolver.setBounds(238, 201, 186, 49);
		contentPane.add(btnVolver);
	}
}
