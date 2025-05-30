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
		
		JLabel lblINICIARSESION = new JLabel("INICIAR SESIÓN");
		lblINICIARSESION.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblINICIARSESION.setHorizontalAlignment(SwingConstants.CENTER);
		lblINICIARSESION.setBounds(97, 10, 245, 57);
		lblINICIARSESION.setForeground(new Color(183, 188, 210));
		contentPane.add(lblINICIARSESION);
		
		JLabel lblUsuario = new JLabel("Nombre Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblUsuario.setBounds(24, 78, 160, 25);
		lblUsuario.setForeground(new Color(183, 188, 210));
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContraseña.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblContraseña.setBounds(24, 108, 160, 25);
		lblContraseña.setForeground(new Color(183, 188, 210));
		contentPane.add(lblContraseña);
		
		txtMedacgmailcom = new JTextField();
		txtMedacgmailcom.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		txtMedacgmailcom.setText("Manolito34");
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
		        
		        modo = false;
		        String NombreUS = txtMedacgmailcom.getText();
		        String Contra = txtabcd.getText();
		        int id = Metodos.inicioSesion(NombreUS, Contra);
		        if (id == -1) {
		        	System.out.println("REPITE");
		        	ErrorDatos V5 = new ErrorDatos();
		        	V5.setVisible(true);
		        } else if (id == 0) {
		        	System.out.println("ERROR DESCONOCIDO"); //HACER VENTANA
		        	ErrorDesconocido V6 = new ErrorDesconocido();
		        	V6.setVisible(true);
		        } else {
		        	dispose(); //Cierra ventana actual para abrir otra
		        	AplicacionPrincipal V4 = new AplicacionPrincipal(modo, id); //meter id
			        V4.setVisible(true);
		        }
		    }
		});

		btnIniciar.setBounds(10, 201, 186, 49); // Puedes ajustar esto o usar layout
		contentPane.add(btnIniciar);
		
		BotonRojoAlerta btnVolver = new BotonRojoAlerta("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //Cierra ventana actual para abrir otra
				Inicio V0 = new Inicio();
				V0.setVisible(true);
			}
		});
		btnVolver.setBounds(238, 201, 186, 49);
		contentPane.add(btnVolver);
	}
}
