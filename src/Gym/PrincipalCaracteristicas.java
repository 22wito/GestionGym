package Gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PrincipalCaracteristicas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCaracteristicas frame = new PrincipalCaracteristicas();
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
	public PrincipalCaracteristicas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAforo = new JLabel("Características");
		lblAforo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAforo.setFont(new Font("Tw Cen MT", Font.PLAIN, 52));
		lblAforo.setBounds(53, 0, 323, 84);
		lblAforo.setForeground(new Color(183, 188, 210));
		contentPane.add(lblAforo);
		
		JLabel lblAforoLimite = new JLabel("Aforo limitado a 50 personas");
		lblAforoLimite.setForeground(new Color(183, 188, 210));
		lblAforoLimite.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblAforoLimite.setBounds(53, 81, 323, 14);
		contentPane.add(lblAforoLimite);
		
		JLabel lblEquiposDeEntrenamiento = new JLabel("Equipos de entrenamiento variados y modernos");
		lblEquiposDeEntrenamiento.setForeground(new Color(183, 188, 210));
		lblEquiposDeEntrenamiento.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblEquiposDeEntrenamiento.setBounds(53, 100, 323, 14);
		contentPane.add(lblEquiposDeEntrenamiento);
		
		JLabel lblAmbienteMotivador = new JLabel("Ambiente motivador");
		lblAmbienteMotivador.setForeground(new Color(183, 188, 210));
		lblAmbienteMotivador.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblAmbienteMotivador.setBounds(53, 119, 323, 14);
		contentPane.add(lblAmbienteMotivador);
		
		JLabel lblZonaDeEntrenamiento = new JLabel("Zona de entrenamiento funcional");
		lblZonaDeEntrenamiento.setForeground(new Color(183, 188, 210));
		lblZonaDeEntrenamiento.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblZonaDeEntrenamiento.setBounds(53, 138, 323, 14);
		contentPane.add(lblZonaDeEntrenamiento);
		
		JLabel lblClasesDeEntrenamiento = new JLabel("Clases de entrenamiento con monitores profesionales");
		lblClasesDeEntrenamiento.setForeground(new Color(183, 188, 210));
		lblClasesDeEntrenamiento.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblClasesDeEntrenamiento.setBounds(53, 157, 323, 14);
		contentPane.add(lblClasesDeEntrenamiento);
		
		JLabel lblAsesoramientoPersonalizadoDe = new JLabel("Asesoramiento personalizado de salud y ejercicio");
		lblAsesoramientoPersonalizadoDe.setForeground(new Color(183, 188, 210));
		lblAsesoramientoPersonalizadoDe.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblAsesoramientoPersonalizadoDe.setBounds(53, 174, 323, 14);
		contentPane.add(lblAsesoramientoPersonalizadoDe);
		
		JLabel lblHorariosExtensosam = new JLabel("Horarios extensos (7am - 11pm todos los dias)");
		lblHorariosExtensosam.setForeground(new Color(183, 188, 210));
		lblHorariosExtensosam.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblHorariosExtensosam.setBounds(53, 192, 323, 14);
		contentPane.add(lblHorariosExtensosam);
	}

}
