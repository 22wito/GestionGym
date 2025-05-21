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
			}
		});
		btnNewButton.setBounds(195, 149, 163, 78);
		contentPane.add(btnNewButton);
		
		BotonGrisElegante btnAforo = new BotonGrisElegante("Aforo");
		btnAforo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAforo.setBounds(380, 149, 163, 78);
		contentPane.add(btnAforo);
		
		BotonGrisElegante btnGymcaracteristicas = new BotonGrisElegante("Características");
		btnGymcaracteristicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGymcaracteristicas.setBounds(195, 238, 163, 78);
		contentPane.add(btnGymcaracteristicas);
		
		BotonGrisElegante btnNewButton_1_1_1 = new BotonGrisElegante("Contacto");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(380, 238, 163, 78);
		contentPane.add(btnNewButton_1_1_1);
		
		BotonGrisElegante btnCalculosSalud = new BotonGrisElegante("Salud");
		btnCalculosSalud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculosSalud.setBounds(291, 327, 163, 78);
		contentPane.add(btnCalculosSalud);
		
		JLabel lblNewLabel = new JLabel("Bienvenido,");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel.setBounds(133, 52, 275, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombrePers = new JLabel("Usuario");
		lblNombrePers.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNombrePers.setBounds(380, 52, 275, 63);
		contentPane.add(lblNombrePers);
		
		if (modo == false) {
			lblNombrePers.setText(Metodos.getNombre(idModo));
		} else {
			lblNombrePers.setText("Usuario");
		}
	}
}
