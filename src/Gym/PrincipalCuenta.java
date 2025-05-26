package Gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PrincipalCuenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCuenta frame = new PrincipalCuenta(0, false);
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
	public PrincipalCuenta(int id, boolean modo) {
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAforo = new JLabel("Cuenta:");
		lblAforo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAforo.setFont(new Font("Tw Cen MT", Font.PLAIN, 52));
		lblAforo.setBounds(53, 39, 323, 58);
		lblAforo.setForeground(new Color(183, 188, 210));
		contentPane.add(lblAforo);
		
		JLabel lblUsuario = new JLabel("Nombre de Usuario:");
		lblUsuario.setForeground(new Color(183, 188, 210));
		lblUsuario.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblUsuario.setBounds(53, 119, 221, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(183, 188, 210));
		lblEmail.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblEmail.setBounds(53, 144, 221, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setForeground(new Color(183, 188, 210));
		lblTelefono.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblTelefono.setBounds(53, 169, 221, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFecha = new JLabel("Fecha de Registro:");
		lblFecha.setForeground(new Color(183, 188, 210));
		lblFecha.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblFecha.setBounds(53, 194, 221, 14);
		contentPane.add(lblFecha);
		
		JLabel lblcambionombre = new JLabel("nombre");
		lblcambionombre.setForeground(new Color(183, 188, 210));
		lblcambionombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblcambionombre.setBounds(174, 119, 221, 14);
		lblcambionombre.setText("nombre");
		contentPane.add(lblcambionombre);
		
		JLabel lblcambioemail = new JLabel("email");
		lblcambioemail.setForeground(new Color(183, 188, 210));
		lblcambioemail.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblcambioemail.setBounds(97, 144, 221, 14);
		lblcambioemail.setText("email");
		contentPane.add(lblcambioemail);
		
		JLabel lblcambionumero = new JLabel("numero");
		lblcambionumero.setForeground(new Color(183, 188, 210));
		lblcambionumero.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblcambionumero.setBounds(119, 169, 221, 14);
		lblcambionumero.setText("numero");
		contentPane.add(lblcambionumero);
		
		JLabel lblcambioregistro = new JLabel("fecha");
		lblcambioregistro.setForeground(new Color(183, 188, 210));
		lblcambioregistro.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblcambioregistro.setBounds(160, 194, 221, 14);
		lblcambioregistro.setText("fecha");
		contentPane.add(lblcambioregistro);
		
		if (modo == false) {
			lblcambionombre.setText(Metodos.getNombre(id));
			lblcambioemail.setText(Metodos.getEmail(id));
			lblcambionumero.setText(Metodos.getNumero(id));
			lblcambioregistro.setText(Metodos.getRegistro(id));
			//settext 
		} else {
			lblcambionombre.setText("nombre");
			lblcambioemail.setText("email");
			lblcambionumero.setText("numero");
			lblcambioregistro.setText("fecha");
		}
	}
}
