package LadyBug;

import javax.swing.JFrame;
import java.awt.Color;

public class Ventana {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Circulos - Mariquita");
        Panel cod = new Panel();

        // Propiedades ventana
        ventana.add(cod);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(400, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
