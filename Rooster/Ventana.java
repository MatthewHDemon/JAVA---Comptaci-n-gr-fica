package Rooster;

import javax.swing.JFrame;
import java.awt.Color;

public class Ventana {

    public static void main(String[] args) {

        JFrame pv = new JFrame("Poligonos - Gallo");
        Panel cod = new Panel();

        pv.add(cod);
        pv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pv.setBackground(Color.WHITE);
        pv.setSize(400, 400);
        pv.setLocationRelativeTo(null);
        pv.setVisible(true);
    }
}
