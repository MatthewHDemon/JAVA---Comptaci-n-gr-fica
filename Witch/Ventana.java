package Witch;

import java.awt.GridLayout;
import javax.swing.JFrame;


public class Ventana extends JFrame {
    private static final long serialVersionUID = 1L;

    private Panel panel;

    public Ventana() {

        setTitle("Dibujo bruja - Luis Mariño");
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));
        setLocationRelativeTo(null);

        panel = new Panel();

        add(panel);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
