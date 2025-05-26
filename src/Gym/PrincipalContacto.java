package Gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PrincipalContacto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalContacto frame = new PrincipalContacto();
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
	public PrincipalContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAforo = new JLabel("Contacto:");
		lblAforo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAforo.setFont(new Font("Tw Cen MT", Font.PLAIN, 52));
		lblAforo.setBounds(53, 11, 323, 67);
		lblAforo.setForeground(new Color(183, 188, 210));
		contentPane.add(lblAforo);
		
		JLabel lblSugerencias = new JLabel("Si desea proporcionar sugerencias escriba a:");
		lblSugerencias.setForeground(new Color(183, 188, 210));
		lblSugerencias.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblSugerencias.setBounds(53, 81, 323, 14);
		contentPane.add(lblSugerencias);
		
		JLabel lblSiNecesitaAyuda = new JLabel("Si necesita ayuda sobre cualquier tema escriba a:");
		lblSiNecesitaAyuda.setForeground(new Color(183, 188, 210));
		lblSiNecesitaAyuda.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblSiNecesitaAyuda.setBounds(53, 129, 323, 14);
		contentPane.add(lblSiNecesitaAyuda);
		
		JLabel lblMotivosLaborales = new JLabel("Si los motivos son laborales escriba a:");
		lblMotivosLaborales.setForeground(new Color(183, 188, 210));
		lblMotivosLaborales.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblMotivosLaborales.setBounds(53, 178, 323, 14);
		contentPane.add(lblMotivosLaborales);
		
		JLabel lblGymfitsuggmailcom = new JLabel("gymfit.suggestions@gmail.com");
		lblGymfitsuggmailcom.setForeground(new Color(183, 188, 210));
		lblGymfitsuggmailcom.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblGymfitsuggmailcom.setBounds(75, 106, 323, 14);
		contentPane.add(lblGymfitsuggmailcom);
		
		JLabel lblGymfitsupportgmailcom = new JLabel("gymfit.support@gmail.com");
		lblGymfitsupportgmailcom.setForeground(new Color(183, 188, 210));
		lblGymfitsupportgmailcom.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblGymfitsupportgmailcom.setBounds(75, 153, 323, 14);
		contentPane.add(lblGymfitsupportgmailcom);
		
		JLabel lblGymfitlabgmailcom = new JLabel("gymfit.laboral@gmail.com");
		lblGymfitlabgmailcom.setForeground(new Color(183, 188, 210));
		lblGymfitlabgmailcom.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblGymfitlabgmailcom.setBounds(75, 203, 323, 14);
		contentPane.add(lblGymfitlabgmailcom);
	}

}
