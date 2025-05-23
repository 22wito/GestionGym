package Gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalSalud extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEdad;
	private JTextField textAltura;
	private JTextField textPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalSalud frame = new PrincipalSalud(false, 0);
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
	public PrincipalSalud(boolean modo, int idModo) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAforo = new JLabel("Salud:");
		lblAforo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAforo.setFont(new Font("Tw Cen MT", Font.PLAIN, 52));
		lblAforo.setBounds(53, 0, 323, 70);
		lblAforo.setForeground(new Color(183, 188, 210));
		contentPane.add(lblAforo);
		
		JLabel lblNewLabel = new JLabel("Altura:");
		lblNewLabel.setForeground(new Color(183, 188, 210));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblNewLabel.setBounds(53, 81, 63, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(new Color(183, 188, 210));
		lblPeso.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblPeso.setBounds(53, 100, 63, 14);
		contentPane.add(lblPeso);
		
		JLabel lblImc = new JLabel("IMC:");
		lblImc.setForeground(new Color(183, 188, 210));
		lblImc.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblImc.setBounds(53, 118, 63, 14);
		contentPane.add(lblImc);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setForeground(new Color(183, 188, 210));
		lblEdad.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblEdad.setBounds(53, 136, 63, 14);
		contentPane.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setText("20");
		textEdad.setBounds(222, 230, 86, 20);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setText("175");
		textAltura.setColumns(10);
		textAltura.setBounds(30, 230, 86, 20);
		contentPane.add(textAltura);
		
		textPeso = new JTextField();
		textPeso.setText("70");
		textPeso.setColumns(10);
		textPeso.setBounds(126, 230, 86, 20);
		contentPane.add(textPeso);
		
		JLabel lblNewLabel_1 = new JLabel("Altura (cm):");
		lblNewLabel_1.setForeground(new Color(183, 188, 210));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(30, 205, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPeso_1 = new JLabel("Peso (kg):");
		lblPeso_1.setForeground(new Color(183, 188, 210));
		lblPeso_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblPeso_1.setBounds(126, 205, 63, 14);
		contentPane.add(lblPeso_1);
		
		JLabel lblEdad_1 = new JLabel("Edad (años):");
		lblEdad_1.setForeground(new Color(183, 188, 210));
		lblEdad_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblEdad_1.setBounds(222, 206, 86, 14);
		contentPane.add(lblEdad_1);
		
		JLabel lblHacerCambios = new JLabel("Hacer Cambios:");
		lblHacerCambios.setHorizontalAlignment(SwingConstants.CENTER);
		lblHacerCambios.setForeground(new Color(183, 188, 210));
		lblHacerCambios.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblHacerCambios.setBounds(20, 170, 159, 36);
		contentPane.add(lblHacerCambios);
		
		BotonRojoAlerta btnNewButton = new BotonRojoAlerta("CAMBIO");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modo == false) {
					Metodos.setAltura(idModo, Integer.parseInt(textAltura.getText()));
					Metodos.setPeso(idModo, Integer.parseInt(textPeso.getText()));
					Metodos.setEdad(idModo, Integer.parseInt(textEdad.getText()));
					
				} else {
					System.out.println("ERROR DESCONOCIDO"); //HACER VENTANA
		        	ErrorDesconocido V6 = new ErrorDesconocido();
		        	V6.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(335, 170, 89, 80);
		contentPane.add(btnNewButton);
		
		
		
		
		JLabel lblCambioAltura = new JLabel("0");
		lblCambioAltura.setForeground(new Color(183, 188, 210));
		lblCambioAltura.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblCambioAltura.setBounds(97, 81, 180, 14);
		contentPane.add(lblCambioAltura);
		
		
		JLabel lblCambioPeso = new JLabel("0");
		lblCambioPeso.setForeground(new Color(183, 188, 210));
		lblCambioPeso.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblCambioPeso.setBounds(87, 100, 180, 14);
		contentPane.add(lblCambioPeso);
		
		JLabel lblCambioIMC = new JLabel("0");
		lblCambioIMC.setForeground(new Color(183, 188, 210));
		lblCambioIMC.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblCambioIMC.setBounds(87, 118, 180, 14);
		contentPane.add(lblCambioIMC);
		
		JLabel lblCambioEdad = new JLabel("0");
		lblCambioEdad.setForeground(new Color(183, 188, 210));
		lblCambioEdad.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblCambioEdad.setBounds(97, 136, 180, 14);
		contentPane.add(lblCambioEdad);
		
		JLabel lblDesactivado = new JLabel("DESACTIVADO");
		lblDesactivado.setBounds(341, 206, 71, 14);
		lblDesactivado.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		contentPane.add(lblDesactivado);
		
		if (modo == false) {
			lblCambioAltura.setText(Metodos.getAltura(idModo));
			lblCambioPeso.setText(Metodos.getPeso(idModo));	
			lblCambioIMC.setText(Metodos.calcularIMC(idModo));
			lblCambioEdad.setText(Metodos.getEdad(idModo));
			
		} else {
			textAltura.setText("175");
			textPeso.setText("70");
			textEdad.setText("20");
		}
		
		if (modo == true) {
			btnNewButton.setVisible(false);
			lblDesactivado.setVisible(true);
		} else {
			btnNewButton.setVisible(true);
			lblDesactivado.setVisible(false);
		}
		
	}
}
