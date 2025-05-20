package Gym;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlertaConfirmacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblPoderAcceder = new JLabel("No podrás acceder a:");
	public static boolean modo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlertaConfirmacion frame = new AlertaConfirmacion();
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
	public AlertaConfirmacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlerta = new JLabel("ALERTA!");
		lblAlerta.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlerta.setFont(new Font("Tw Cen MT", Font.PLAIN, 52));
		lblAlerta.setBounds(101, 0, 230, 118);
		lblAlerta.setForeground(new Color(183, 188, 210));
		contentPane.add(lblAlerta);
		lblPoderAcceder.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblPoderAcceder.setBounds(48, 112, 198, 31);
		lblPoderAcceder.setForeground(new Color(183, 188, 210));
		contentPane.add(lblPoderAcceder);
		
		JLabel lblProhibiciones = new JLabel("- Información o funciones de usuario.");
		lblProhibiciones.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblProhibiciones.setBounds(48, 153, 339, 14);
		lblProhibiciones.setForeground(new Color(183, 188, 210));
		contentPane.add(lblProhibiciones);
		
		BotonConEstilo btnAceptar = new BotonConEstilo("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				modo=true;
				AplicacionPrincipal V4 = new AplicacionPrincipal(modo);
				V4.setVisible(true);
			}
		});
		btnAceptar.setBounds(10, 201, 186, 49);
		contentPane.add(btnAceptar);
		
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
