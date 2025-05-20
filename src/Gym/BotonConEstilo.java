package Gym;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonConEstilo extends JButton {

    private Color colorInicio = new Color(30, 144, 255);
    private Color colorFin = new Color(0, 191, 255);
    private Color colorHover = new Color(0, 120, 215);
    private boolean hovering = false;

    public BotonConEstilo(String texto) {
        super(texto);
        setFont(new Font("Segoe UI", Font.BOLD, 20));
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(false);

        // Hover effect
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

        // Antialiasing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradiente dinámico
        GradientPaint gp = new GradientPaint(0, 0, 
            hovering ? colorHover : colorInicio, 
            0, getHeight(), 
            colorFin);

        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

        super.paintComponent(g);
    }

    @Override
    public void paintBorder(Graphics g) {
        // Sin borde
    }
}
