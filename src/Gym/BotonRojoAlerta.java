package Gym;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonRojoAlerta extends JButton {

    private Color colorInicio = new Color(220, 20, 60);    // Crimson
    private Color colorFin = new Color(178, 34, 34);       // Firebrick
    private Color colorHover = new Color(139, 0, 0);       // Dark Red
    private boolean hovering = false;

    public BotonRojoAlerta(String texto) {
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

        // Gradiente vertical rojo
        GradientPaint gp = new GradientPaint(0, 0, 
            hovering ? colorHover : colorInicio, 
            0, getHeight(), 
            colorFin);

        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    public void paintBorder(Graphics g) {
        // Sin borde externo
    }
}

