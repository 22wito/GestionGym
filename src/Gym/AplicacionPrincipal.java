package Gym;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnNewButton = new JButton("Cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(195, 149, 163, 78);
		contentPane.add(btnNewButton);
		
		JButton btnAforo = new JButton("Aforo");
		btnAforo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAforo.setBounds(380, 149, 163, 78);
		contentPane.add(btnAforo);
		
		JButton btnGymcaracteristicas = new JButton("GymCaracteristicas");
		btnGymcaracteristicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGymcaracteristicas.setBounds(195, 238, 163, 78);
		contentPane.add(btnGymcaracteristicas);
		
		JButton btnNewButton_1_1_1 = new JButton("Contacto");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(380, 238, 163, 78);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnCalculosSalud = new JButton("Calculos Salud");
		btnCalculosSalud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculosSalud.setBounds(291, 327, 163, 78);
		contentPane.add(btnCalculosSalud);
	}
}
