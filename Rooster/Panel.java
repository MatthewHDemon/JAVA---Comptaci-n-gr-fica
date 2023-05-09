package Rooster;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;

public class Panel extends JPanel {

    public void paint(Graphics g) { 
        Graphics2D g2 = (Graphics2D) g;

        int puntosX1[] = { 200, 240, 260, 220, 180 };
        int puntosY1[] = { 170, 170, 215, 250, 215 };
        Polygon polyl = new Polygon(puntosX1, puntosY1, 5);
        g.setColor(new Color(152, 242, 66));
        g.fillPolygon(polyl);

        // Cuello
        int puntosX2[] = { 240, 240, 200 };
        int puntosY2[] = { 105, 168, 168 };
        Polygon poly2 = new Polygon(puntosX2, puntosY2, 3);
        g.setColor(new Color(156, 119, 207));
        g.fillPolygon(poly2);

        // Cabeza
        int puntosX3[] = { 262, 262, 242, 242 };
        int puntosY3[] = { 105, 125, 125, 105 };
        Polygon poly3 = new Polygon(puntosX3, puntosY3, 4);
        g.setColor(new Color(59, 168, 241));
        g.fillPolygon(poly3);

        // Cresta
        int puntosX4[] = { 235, 262, 227 };
        int puntosY4[] = { 75, 103, 103 };
        Polygon poly4 = new Polygon(puntosX4, puntosY4, 3);
        g.setColor(new Color(244, 156, 48));
        g.fillPolygon(poly4);

        // Pico
        int puntosX5[] = { 264, 277, 264 };
        int puntosY5[] = { 110, 125, 125 };
        Polygon poly5 = new Polygon(puntosX5, puntosY5, 3);
        g.setColor(new Color(244, 156, 48));
        g.fillPolygon(poly5);

        // Quijada
        int puntosX6[] = { 252, 262, 242 };
        int puntosY6[] = { 127, 148, 148 };
        Polygon poly6 = new Polygon(puntosX6, puntosY6, 3);
        g.setColor(new Color(227, 73, 122));
        g.fillPolygon(poly6);

        // Cuerpo-cola 1
        int puntosX7[] = { 198, 178, 138 };
        int puntosY7[] = { 170, 215, 170 };
        Polygon poly7 = new Polygon(puntosX7, puntosY7, 3);
        g.setColor(new Color(244, 157, 49));
        g.fillPolygon(poly7);

        // Cuerpo-cola 2
        int puntosX8[] = { 168, 198, 138, 108 };
        int puntosY8[] = { 125, 168, 168, 125 };
        Polygon poly8 = new Polygon(puntosX8, puntosY8, 4);
        g.setColor(new Color(59, 167, 241));
        g.fillPolygon(poly8);

        // Cuerpo-cola 2
        int puntosX9[] = { 106, 136, 102 };
        int puntosY9[] = { 127, 168, 230 };
        Polygon poly9 = new Polygon(puntosX9, puntosY9, 3);
        g.setColor(new Color(152, 242, 66));
        g.fillPolygon(poly9);

        // Cuerpo-cola 2
        int puntosX10[] = { 222, 222, 218, 218 };
        int puntosY10[] = { 252, 300, 300, 252 };
        Polygon poly10 = new Polygon(puntosX10, puntosY10, 4);
        g.setColor(new Color(244, 156, 48));
        g.fillPolygon(poly10);

        // Pie
        Ellipse2D pie = new Ellipse2D.Double(190, 301, 60, 14);
        g2.setColor(new Color(227, 73, 122));
        g2.fill(pie);

    }
}
