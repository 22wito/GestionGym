package Gym;

	import javax.swing.*;
	import java.awt.*;

	public class RoundedPanel extends JPanel {
	    private int cornerRadius = 30;

	    public RoundedPanel(int radius) {
	        super();
	        this.cornerRadius = radius;
	        setOpaque(false); // Muy importante para permitir transparencia y bordes redondeados
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
	        Graphics2D g2 = (Graphics2D) g;
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        // Fondo con esquinas redondeadas
	        g2.setColor(getBackground());
	        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);

	        // Borde si lo deseas
	        g2.setColor(getForeground());
	        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);
	    }
	}
