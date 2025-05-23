package Gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VentanaRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtabcd;
	private JTextField txtMedacgmailcom;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtManolito;
	private static boolean modo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRAR");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 10, 245, 57);
		lblNewLabel.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre y apellidos:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(28, 94, 160, 25);
		lblNewLabel_1_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1_1);
		
		txtabcd = new JTextField();
		txtabcd.setText("Manuel López Álvarez");
		txtabcd.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		txtabcd.setColumns(10);
		txtabcd.setBounds(198, 99, 177, 19);
		txtabcd.setForeground(new Color(183, 188, 210));
		contentPane.add(txtabcd);
		
		BotonConEstilo btnIniciar = new BotonConEstilo("INICIAR");

		btnIniciar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        modo = false;
		        
		        String Nombre = txtabcd.getText();
		        String Contra = textField_1.getText();
		        String NombreUS = txtManolito.getText();
		        String email = txtMedacgmailcom.getText();
		        String telefono = textField_2.getText();
		        int telefono2 = Integer.parseInt(telefono);
		        
		        int id = Metodos.agregarUsuario(Nombre, 0, 0, 0, NombreUS, Contra, email, telefono2);
		        
		        if (id == -1) {
		        	System.out.println("REPITE");
		        } else {
		        	dispose();
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
				dispose();
				Inicio V0 = new Inicio();
				V0.setVisible(true);
			}
		});
		btnVolver.setBounds(238, 201, 186, 49);
		contentPane.add(btnVolver);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(28, 118, 160, 25);
		lblNewLabel_1_1_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1_1_1);
		
		txtMedacgmailcom = new JTextField();
		txtMedacgmailcom.setText("medac@gmail.com");
		txtMedacgmailcom.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		txtMedacgmailcom.setColumns(10);
		txtMedacgmailcom.setBounds(198, 123, 177, 19);
		txtMedacgmailcom.setForeground(new Color(183, 188, 210));
		contentPane.add(txtMedacgmailcom);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(28, 142, 160, 25);
		lblNewLabel_1_1_1_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("1234abcd");
		textField_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(198, 147, 177, 19);
		textField_1.setForeground(new Color(183, 188, 210));
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Teléfono:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(28, 165, 160, 25);
		lblNewLabel_1_1_1_1_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText("987654321");
		textField_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(198, 170, 177, 19);
		textField_2.setForeground(new Color(183, 188, 210));
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Nombre Usuario:");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(28, 68, 160, 25);
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		txtManolito = new JTextField();
		txtManolito.setText("manolito3432");
		txtManolito.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		txtManolito.setColumns(10);
		txtManolito.setBounds(198, 73, 177, 19);
		txtManolito.setForeground(new Color(183, 188, 210));
		contentPane.add(txtManolito);
	}
}
