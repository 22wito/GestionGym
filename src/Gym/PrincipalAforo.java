package Gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PrincipalAforo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalAforo frame = new PrincipalAforo();
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
	public PrincipalAforo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAforo = new JLabel("Aforo actual:");
		lblAforo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAforo.setFont(new Font("Tw Cen MT", Font.PLAIN, 52));
		lblAforo.setBounds(53, 0, 323, 118);
		lblAforo.setForeground(new Color(183, 188, 210));
		contentPane.add(lblAforo);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(86, 127, 261, 95);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(Metodos.Aforo());
	}
}
