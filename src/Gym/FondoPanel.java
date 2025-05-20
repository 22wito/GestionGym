package Gym;

import javax.swing.*;
import java.awt.*;

public class FondoPanel extends JPanel {

    private Image imagen;

    public FondoPanel(String rutaImagen) {
        // Carga la imagen desde la ruta (puede estar en resources o fuera)
        imagen = new ImageIcon(rutaImagen).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen ajustándola al tamaño del panel
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}
