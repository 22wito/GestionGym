package Gym;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonGrisElegante extends JButton {

	private Color colorBase = new Color(105, 105, 105);     // Gris medio
    private Color colorHover = new Color(130, 130, 130);    // Gris claro al pasar
    private boolean hovering = false;

    public BotonGrisElegante(String texto) {
        super(texto);
        setFont(new Font("Segoe UI", Font.PLAIN, 12));  // Fuente limpia y elegante
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(false);
        setMargin(new Insets(10, 20, 10, 20)); // Padding interno

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                hovering = true;
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                hovering = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Antialiasing (aunque es cuadrado, para bordes suaves del texto y contorno)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fondo cuadrado con color dinámico
        g2.setColor(hovering ? colorHover : colorBase);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Efecto sutil de borde interno (linea clara arriba)
        g2.setColor(new Color(160, 160, 160, 60)); // semitransparente
        g2.drawLine(1, 1, getWidth() - 2, 1);

        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    public void paintBorder(Graphics g) {
        // Opcional: línea gris tenue alrededor para dar definición
        g.setColor(new Color(50, 50, 50, 100));
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
    }
}
