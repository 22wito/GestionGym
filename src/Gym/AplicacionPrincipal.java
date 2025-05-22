package Gym;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AplicacionPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int idModo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionPrincipal frame = new AplicacionPrincipal(false, 0); //asignar ,0 para la id
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param modo 
	 */
	public AplicacionPrincipal(boolean modo, int id) { //asignar ,int id para la id
		System.out.println(modo);
		
		if (modo == false) {
			idModo = id;
		} else {
			id = 0;
		}
		System.out.println(id);
		System.out.println(modo);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BotonGrisElegante btnNewButton = new BotonGrisElegante("Cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalCuenta V4 = new PrincipalCuenta(idModo,modo); //asignar ,0 para la id
				V4.setVisible(true);
			}
		});
		btnNewButton.setBounds(195, 149, 163, 78);
		contentPane.add(btnNewButton);
		
		BotonGrisElegante btnAforo = new BotonGrisElegante("Aforo");
		btnAforo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalAforo V4 = new PrincipalAforo(); //asignar ,0 para la id
				V4.setVisible(true);
			}
		});
		btnAforo.setBounds(380, 149, 163, 78);
		contentPane.add(btnAforo);
		
		BotonGrisElegante btnGymcaracteristicas = new BotonGrisElegante("Características");
		btnGymcaracteristicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalCaracteristicas V4 = new PrincipalCaracteristicas(); //asignar ,0 para la id
				V4.setVisible(true);
			}
		});
		btnGymcaracteristicas.setBounds(195, 238, 163, 78);
		contentPane.add(btnGymcaracteristicas);
		
		BotonGrisElegante btnNewButton_1_1_1 = new BotonGrisElegante("Contacto");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalContacto V4 = new PrincipalContacto(); //asignar ,0 para la id
				V4.setVisible(true);
			}
		});
		btnNewButton_1_1_1.setBounds(380, 238, 163, 78);
		contentPane.add(btnNewButton_1_1_1);
		
		BotonGrisElegante btnCalculosSalud = new BotonGrisElegante("Salud");
		btnCalculosSalud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalSalud V4 = new PrincipalSalud(); //asignar ,0 para la id
				V4.setVisible(true);
			}
		});
		btnCalculosSalud.setBounds(291, 327, 163, 78);
		contentPane.add(btnCalculosSalud);
		
		JLabel lblNewLabel = new JLabel("Bienvenido,");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel.setBounds(133, 52, 275, 63);
		lblNewLabel.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel);
		
		JLabel lblNombrePers = new JLabel("Usuario");
		lblNombrePers.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNombrePers.setBounds(380, 52, 275, 63);
		lblNombrePers.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNombrePers);
		
		JLabel lblNewLabel_1 = new JLabel("ENTRENANDO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(490, 484, 203, 56);
		lblNewLabel_1.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_1);
		
		
		
		
		BotonConEstilo btnSI = new BotonConEstilo("SI");
		BotonRojoAlerta btnNO = new BotonRojoAlerta("NO");
		boolean entrena = false;
		
		if (Metodos.getEntrenando(idModo) == false) {
			btnNO.setVisible(true);
			btnSI.setVisible(false);
			
		} else {
			btnNO.setVisible(false);
			btnSI.setVisible(true);
		}
		
		if (modo==true) {
			btnNO.setVisible(false);
			btnSI.setVisible(false);
		}
		
		btnNO.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNO.setBounds(703, 479, 71, 71);
		contentPane.add(btnNO);
		
		btnSI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSI.setBounds(703, 479, 71, 71);
		contentPane.add(btnSI);
		
		JLabel lblNewLabel_2 = new JLabel("?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(716, 490, 46, 46);
		lblNewLabel_2.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GYMFIT");
		lblNewLabel_3.setFont(new Font("SimSun", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(10, 481, 215, 63);
		lblNewLabel_3.setForeground(new Color(183, 188, 210));
		contentPane.add(lblNewLabel_3);
		
		btnNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNO.setVisible(false);
				btnSI.setVisible(true);
				Metodos.setEntrenando(idModo);
			}
		});
		
		btnSI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNO.setVisible(true);
				btnSI.setVisible(false);
				Metodos.setEntrenando(idModo);
			}
		});

		
		if (modo == false) {
			lblNombrePers.setText(Metodos.getNombre(idModo));
		} else {
			lblNombrePers.setText("Usuario");
		}
	}
}
